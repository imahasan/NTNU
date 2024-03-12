package no.ntnu.tdt4250.group13.scheduling_algorithm;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Building;
import no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Campus;
import no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Room;
import no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SchedulingRequirementsPackage;
import no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.SlotRequirement;
import no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Teacher;
import no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.University;
import no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.schedulingRequirements;
import no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.impl.SchedulingRequirementsPackageImpl;
import no.ntnu.tdt4250.group13.scheduling_requirements.schedulingRequirements.Week;
import no.ntnu.tdt4250.group13.timetable.*;
import no.ntnu.tdt4250.group13.timetable.impl.*;

public class SchedulingAlgorithm {

	private static final int DAYSTART = 8;
	private static final int DAYEND = 18;

	public static void main(String[] args) {

		ArrayList<String> path_to_requirements = new ArrayList<>();
		String path_to_timetable = null;
		String path_to_new_timetable = null;
		Boolean new_timetable = null;

		// Parse Args
		if (args.length < 2) {
			System.err.println("> Use: [--extend path_to_timetable][path_to_requirements]+ path_to_new_timetable");
			System.exit(-1);

		} else if (args[0].equals("--extend")) {
			path_to_timetable = args[1];
			new_timetable = false;
			path_to_requirements.addAll(Arrays.asList(args).subList(2, (args.length - 1)));
			path_to_new_timetable = args[(args.length - 1)];

		} else {
			new_timetable = true;
			path_to_requirements.addAll(Arrays.asList(args).subList(0, (args.length - 1)));
			path_to_new_timetable = args[(args.length - 1)];
		}

		TimetablePackage ttPackage = TimetablePackageImpl.eINSTANCE;
		TimetableFactory ttFactory = ttPackage.getTimetableFactory();
		SchedulingRequirementsPackage srPackage = SchedulingRequirementsPackageImpl.eINSTANCE;

		EPackage.Registry.INSTANCE.put(ttPackage.getNsURI(), ttPackage);
		EPackage.Registry.INSTANCE.put(srPackage.getNsURI(), srPackage);

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("timetable", new XMIResourceFactoryImpl());
		m.put("schedulingrequirements", new XMIResourceFactoryImpl());

		// Read Scheduling Requirements
		ArrayList<University> srs = read_requerements(path_to_requirements);

		// Create or Read Timetable
		no.ntnu.tdt4250.group13.timetable.University tt = create_or_load_timetable(path_to_timetable, new_timetable,
				ttFactory);

		// Fill timetable
		fill_timetable(tt, srs, new_timetable, ttFactory);

		// Save the generated TimeTable
		if (!save(path_to_new_timetable, tt)) {
			System.exit(-1);
		}
	}

	private static void fill_timetable(no.ntnu.tdt4250.group13.timetable.University tt, ArrayList<University> srs,
			Boolean new_timetable, TimetableFactory ttFactory) {

		if (new_timetable) {
			tt.setName(srs.get(0).getName());
			tt.setYear(srs.get(0).getYear());
		}

		for (University sr : srs) {
			if (!(tt.getName().equals(sr.getName()) && tt.getYear() == sr.getYear())) {
				tt = ttFactory.createUniversity();
				System.err.println("> Aborting because incompatible year or university were detected.");
				return;
			}

			for (Campus c : sr.getCampi()) {
				List<no.ntnu.tdt4250.group13.timetable.Campus> campi = tt.getCampus().stream()
						.filter(cs -> cs.getName().equals(c.getName())).toList();
				no.ntnu.tdt4250.group13.timetable.Campus campus = null;
				if (campi.size() == 0) {
					campus = ttFactory.createCampus();
					campus.setName(c.getName());
					tt.getCampus().add(campus);

				} else if (campi.size() == 1) {
					campus = campi.get(0);

				} else {
					tt = ttFactory.createUniversity();
					System.err.println("> Aborting because duplicated campi were detected.");
					return;
				}

				for (Building b : c.getBuildings()) {
					List<no.ntnu.tdt4250.group13.timetable.Building> builds = campus.getBuilding().stream()
							.filter(bs -> bs.getName().equals(b.getName())).toList();
					no.ntnu.tdt4250.group13.timetable.Building build = null;
					if (builds.size() == 0) {
						build = ttFactory.createBuilding();
						build.setName(b.getName());
						campus.getBuilding().add(build);

					} else if (builds.size() == 1) {
						build = builds.get(0);

					} else {
						tt = ttFactory.createUniversity();
						System.err.println("> Aborting because duplicated buildings were detected.");
						return;
					}

					for (Room r : b.getRooms()) {
						List<no.ntnu.tdt4250.group13.timetable.Room> rooms = build.getRoom().stream()
								.filter(rs -> rs.getName().equals(r.getName())).toList();
						no.ntnu.tdt4250.group13.timetable.Room room = null;

						if (rooms.size() == 0) {
							room = ttFactory.createRoom();
							room.setName(r.getName());
							room.setMazemapLink(r.getMazemapLink());
							build.getRoom().add(room);

						} else if (rooms.size() == 1 && rooms.get(0).getMazemapLink().equals(r.getMazemapLink())) {
							room = rooms.get(0);

						} else {
							System.err.println(rooms.size());
							System.err.println(r.getMazemapLink());
							System.err.println(r.getName());
							System.err.println(rooms.get(0).getMazemapLink());
							System.err.println(rooms.get(0).getName());
							tt = ttFactory.createUniversity();
							System.err.println("> Aborting because duplicated rooms or rooms with missmatching mazemap links were detected.");
							return;
						}
					}
				}
			}

			for (Teacher t : sr.getTeachers()) {
				long t_count = tt.getTeacher().stream().filter(ts -> ts.getName().equals(t.getName())).count();
				if (t_count == 0) {
					no.ntnu.tdt4250.group13.timetable.Teacher teacher = ttFactory.createTeacher();
					teacher.setName(t.getName());
					tt.getTeacher().add(teacher);

				} else if (t_count > 1) {
					System.err.println("> Aborting because duplicated teachers were detected.");
				}
			}

			List<no.ntnu.tdt4250.group13.timetable.Course> courses = tt.getCourse().stream()
					.filter(cs -> cs.getCode().equals(sr.getCourse().getCode())).toList();
			no.ntnu.tdt4250.group13.timetable.Course course = null;

			if (courses.size() == 0) {
				course = ttFactory.createCourse();
				course.setCode(sr.getCourse().getCode());
				course.setName(sr.getCourse().getName());
				course.setCoursetimetable(ttFactory.createCourseTimetable());
				course.setCoordinator(tt.getTeacher().stream()
						.filter(ts -> ts.getName().equals(sr.getCourse().getCoordinator().getName())).findFirst()
						.get());
				tt.getCourse().add(course);

			} else if (courses.size() == 1 && courses.get(0).getName().equals(sr.getCourse().getName())
					&& courses.get(0).getCoordinator().getName().equals(sr.getCourse().getCoordinator().getName())) {
				course = courses.get(0);

			} else {
				tt = ttFactory.createUniversity();
				System.err.println("> Aborting because duplicated or incompatible courses were detected.");
				return;
			}

			schedulingRequirements reqs = sr.getCourse().getSchedulingrequirements();
			CourseTimetable ct = course.getCoursetimetable();

			for (Week w : reqs.getWeeks()) {
				List<no.ntnu.tdt4250.group13.timetable.Week> weeks = ct.getWeek().stream()
						.filter(ws -> ws.getNumber() == w.getWeekNumber()).toList();
				no.ntnu.tdt4250.group13.timetable.Week week = null;

				if (weeks.size() == 0) {
					week = ttFactory.createWeek();
					week.setNumber(w.getWeekNumber());
					ct.getWeek().add(week);

				} else if (weeks.size() == 1) {
					week = weeks.get(0);

				} else {
					tt = ttFactory.createUniversity();
					System.err.println("> Aborting because duplicated weeks were detected.");
					return;
				}

				// room_avail = Map<Room, DayMap>
				// RoomMap = <Day, day_slots>

				HashMap<no.ntnu.tdt4250.group13.timetable.Room, HashMap<Integer, int[]>> rooms_avail = new HashMap<>();

				for (no.ntnu.tdt4250.group13.timetable.Room room : tt.getCampus().stream()
						.flatMap(cs -> cs.getBuilding().stream()).flatMap(bs -> bs.getRoom().stream()).toList()) {

					HashMap<Integer, int[]> day_map = new HashMap<Integer, int[]>();

					for (int day = 0; day < 5; day += 1) {
						int[] room_avail = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
						assert room_avail.length == (DAYEND - DAYSTART - 1);

						final int day_final = day;
						for (no.ntnu.tdt4250.group13.timetable.Slot slot : room.getSlot().stream()
								.filter(ss -> ss.getWeek() == w.getWeekNumber() && ss.getDay().getValue() == day_final)
								.toList()) {
							if (!update_avail(room_avail, slot.getStartTime(), slot.getEndTime())) {
								tt = ttFactory.createUniversity();
								System.err.println(
										"> Aborting because overlaping room ocupation or invalid slot time was detected.");
								return;
							}
						}
						day_map.put(day, room_avail);
					}
					rooms_avail.put(room, day_map);
				}

				// teacher_avail = Map<Teacher, DayMap>
				// DayMap = <day, day_slots>

				HashMap<no.ntnu.tdt4250.group13.timetable.Teacher, HashMap<Integer, int[]>> teachers_avail = new HashMap<>();

				for (no.ntnu.tdt4250.group13.timetable.Teacher teacher : tt.getTeacher()) {
					HashMap<Integer, int[]> day_map = new HashMap<Integer, int[]>();

					for (int day = 0; day < 5; day += 1) {
						int[] teacher_avail = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
						assert teacher_avail.length == (DAYEND - DAYSTART - 1);

						final int day_final = day;
						for (no.ntnu.tdt4250.group13.timetable.Slot slot : teacher.getSlot().stream()
								.filter(ss -> ss.getWeek() == w.getWeekNumber() && ss.getDay().getValue() == day_final)
								.toList()) {
							if (!update_avail(teacher_avail, slot.getStartTime(), slot.getEndTime())) {
								tt = ttFactory.createUniversity();
								System.err.println(
										"> Aborting because overlaping teacher ocupation or invalid slot time was detected.");
								return;
							}
						}
						day_map.put(day, teacher_avail);
					}
					teachers_avail.put(teacher, day_map);
				}

				HashSet<SlotRequirement> already_processed = new HashSet<>();

				// first handle those with same day requirements
				for (SlotRequirement req : w.getSlotRequirements().stream()
						.filter(rs -> rs.getRequiredSameDaySlots().size() > 0).toList()) {
					if (!already_processed.contains(req)) {
						if (!create_slot(req, already_processed, course, teachers_avail, rooms_avail, ttFactory, tt,
								new int[] { 0, 1, 2, 3, 4 }, week)) {
							tt = ttFactory.createUniversity();
							System.err.println("> Aborting because could not create slot.");
							return;
						}
					}
				}

				// then those with teacher and room requirements
				for (SlotRequirement req : w.getSlotRequirements().stream()
						.filter(rs -> rs.getRequiredPersonal().size() > 0 && rs.getRequiredRoom() != null
								&& rs.getRequiredSameDaySlots().size() == 0)
						.toList()) {
					if (!already_processed.contains(req)) {
						if (!create_slot(req, already_processed, course, teachers_avail, rooms_avail, ttFactory, tt,
								new int[] { 0, 1, 2, 3, 4 }, week)) {
							tt = ttFactory.createUniversity();
							System.err.println("> Aborting because could not create slot.");
							return;
						}
					}
				}

				// then those with teacher or room requirements
				for (SlotRequirement req : w.getSlotRequirements().stream()
						.filter(rs -> (rs.getRequiredPersonal().size() > 0 ^ rs.getRequiredRoom() != null)
								&& rs.getRequiredSameDaySlots().size() == 0)
						.toList()) {
					if (!already_processed.contains(req)) {
						if (!create_slot(req, already_processed, course, teachers_avail, rooms_avail, ttFactory, tt,
								new int[] { 0, 1, 2, 3, 4 }, week)) {
							tt = ttFactory.createUniversity();
							System.err.println("> Aborting because could not create slot.");
							return;
						}
					}
				}

				// lastly, whatever is left
				for (SlotRequirement req : w.getSlotRequirements().stream()
						.filter(rs -> rs.getRequiredPersonal().size() == 0 && rs.getRequiredRoom() == null
								&& rs.getRequiredSameDaySlots().size() == 0)
						.toList()) {
					if (!already_processed.contains(req)) {
						if (!create_slot(req, already_processed, course, teachers_avail, rooms_avail, ttFactory, tt,
								new int[] { 0, 1, 2, 3, 4 }, week)) {
							tt = ttFactory.createUniversity();
							System.err.println("> Aborting because could not create slot.");
							return;
						}
					}
				}
			}
		}
	}

	private static Boolean create_slot(SlotRequirement req, HashSet<SlotRequirement> already_processed,
			no.ntnu.tdt4250.group13.timetable.Course course,
			HashMap<no.ntnu.tdt4250.group13.timetable.Teacher, HashMap<Integer, int[]>> teachers_avail,
			HashMap<no.ntnu.tdt4250.group13.timetable.Room, HashMap<Integer, int[]>> rooms_avail,
			no.ntnu.tdt4250.group13.timetable.TimetableFactory ttFactory,
			no.ntnu.tdt4250.group13.timetable.University tt, int[] possible_days,
			no.ntnu.tdt4250.group13.timetable.Week week) {

		already_processed.add(req);

		// There is a chain in same day slot which is not supported
		if (req.getRequiredSameDaySlots().stream().anyMatch(aps -> already_processed.contains(aps))) {
			System.err.println("> There is a chain in same day slot which is not supported");
			return false;
		}

		// Get possible rooms or get specific room
		HashSet<no.ntnu.tdt4250.group13.timetable.Room> possible_rooms = new HashSet<>();
		if (req.getRequiredRoom() == null) {
			possible_rooms.addAll(rooms_avail.keySet());

		} else {
			possible_rooms.add(rooms_avail.keySet().stream()
					.filter(rs -> rs.getMazemapLink().equals(req.getRequiredRoom().getMazemapLink())).findFirst()
					.get());
		}

		// Get Required teachers or use coordinator
		HashSet<no.ntnu.tdt4250.group13.timetable.Teacher> lecturers = new HashSet<>();
		HashMap<Integer, int[]> lecturers_avail = null;

		if (req.getRequiredPersonal().size() > 0) {
			lecturers_avail = new HashMap<>();
			for (int day = 0; day < 5; day += 1) {
				lecturers_avail.put(day, new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 });
			}
			for (Teacher t : req.getRequiredPersonal()) {
				no.ntnu.tdt4250.group13.timetable.Teacher teacher = teachers_avail.keySet().stream()
						.filter(ts -> ts.getName().equals(t.getName())).findFirst().get();
				lecturers.add(teacher);
				for (int day = 0; day < 5; day += 1) {
					lecturers_avail.put(day,
							merge_avail(lecturers_avail.get(day), teachers_avail.get(teacher).get(day)));
				}
			}
		} else {
			no.ntnu.tdt4250.group13.timetable.Teacher coordinator = course.getCoordinator();
			lecturers.add(coordinator);
			lecturers_avail = teachers_avail.get(coordinator);
		}

		int start_time = -1;
		int end_time = -1;
		int day = -1;
		no.ntnu.tdt4250.group13.timetable.Room room = null;

		b: for (int day_tmp : possible_days) {
			for (no.ntnu.tdt4250.group13.timetable.Room room_tmp : possible_rooms) {
				int[] avail = merge_avail(rooms_avail.get(room_tmp).get(day_tmp), lecturers_avail.get(day_tmp));

				a: for (int i = 0; i < avail.length; i += 1) {
					for (int j = i; j < i + req.getDuration(); j++) {			
						if (j == avail.length || avail[j] != 0) {
							continue a;
						}
					}

					start_time = i + DAYSTART;
					end_time = start_time + req.getDuration();
					day = day_tmp;
					room = room_tmp;
					break b;
				}
			}
		}

		if (room == null) {
			System.err.println("> Could find any room-lecturer(s) combination that had availability.");
			return false;
		}

		Activity act = ttFactory.createActivity();
		act.setType(ActivityEnum.get(req.getActivityType().ordinal()));

		Slot slot = ttFactory.createSlot();
		slot.setDay(DayEnum.get(day));
		slot.setStartTime(start_time);
		slot.setEndTime(end_time);
		slot.setRoom(room);
		slot.getLecturer().addAll(lecturers);
		slot.setActivity(act);

		week.getSlot().add(slot);

		for (no.ntnu.tdt4250.group13.timetable.Teacher lecturer : lecturers) {
			update_avail(teachers_avail.get(lecturer).get(day), start_time, end_time);
			lecturer.getSlot().add(slot);
			if (!course.getLecturer().contains(lecturer)) {
				course.getLecturer().add(lecturer);				
			}
		}

		update_avail(rooms_avail.get(room).get(day), start_time, end_time);
		room.getSlot().add(slot);

		for (SlotRequirement same_day_req : req.getRequiredSameDaySlots()) {
			if (!create_slot(same_day_req, already_processed, course, teachers_avail, rooms_avail, ttFactory, tt,
					new int[] { day }, week)) {
				System.err.println("> Could not create same day slot.");
				return false;
			}
		}

		return true;
	}

	private static boolean update_avail(int[] avail, int start_time, int end_time) {
		if (start_time < DAYSTART || end_time > DAYEND) {
			System.err.println("> Invalid slot time was detected.");
			return false;
		}

		int start_pos = start_time - DAYSTART;
		int end_pos = end_time - DAYSTART - 1;

		for (int i = start_pos; i <= end_pos; i += 1) {
			if (avail[i] == 0) {
				avail[i] = 1;
			} else {
				return false;
			}
		}
		return true;
	}

	private static int[] merge_avail(int[] avail_1, int[] avail_2) {
		int[] res = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		assert avail_1.length == avail_2.length;
		assert avail_1.length == res.length;
		assert res.length == (DAYEND - DAYSTART - 1);

		for (int i = 0; i < res.length; i += 1) {
			res[i] = avail_1[i] + avail_2[i];
		}

		return res;
	}

	private static no.ntnu.tdt4250.group13.timetable.University create_or_load_timetable(String path_to_timetable,
			Boolean new_timetable, TimetableFactory ttFactory) {
		no.ntnu.tdt4250.group13.timetable.University tt;
		if (new_timetable) {
			tt = ttFactory.createUniversity();

		} else {
			ResourceSet resSet = new ResourceSetImpl();
			URI uri = URI.createURI(path_to_timetable);

			System.out.println("> Loading: " + uri);
			Resource resource = resSet.getResource(uri, true);
			System.out.println("> Loaded.");

			tt = (no.ntnu.tdt4250.group13.timetable.University) resource.getContents().get(0);
		}
		return tt;
	}

	private static ArrayList<University> read_requerements(ArrayList<String> path_to_requirements) {
		ArrayList<University> srs = new ArrayList<>();
		ResourceSet resSet = new ResourceSetImpl();
		URI uri = null;
		Resource resource = null;

		for (String path : path_to_requirements) {
			uri = URI.createURI(path);
			System.out.println("> Loading: " + uri);
			resource = resSet.getResource(uri, true);
			System.out.println("> Loaded.");

			srs.add((University) resource.getContents().get(0));
		}
		return srs;
	}

	private static Boolean save(String path_to_new_timetable, no.ntnu.tdt4250.group13.timetable.University tt) {

		ResourceSet resSet = new ResourceSetImpl();
		Resource resource_2 = resSet.createResource(URI.createURI(path_to_new_timetable));
		resource_2.getContents().add(tt);

		try {
			System.out.println("> Saving: " + resource_2.getURI());
			resource_2.save(null);
			System.out.println("> Saved.");

		} catch (IOException e) {
			System.err.println("> Save failed because " + e.getMessage());
			return false;
		}

		return true;
	}

}
