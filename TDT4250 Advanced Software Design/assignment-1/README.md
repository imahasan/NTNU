# Assignment 1
## Goal of the project
IT was mentioned in the assignment that a good metamodel should contain only the essential part of the domain. My model is designed to generate the course structure of the MSIT of NTNU and the Ecore model is specifically designed to do that. In this model I tried to derive the course structure model of the [MSIT](https://www.ntnu.edu/studies/msit) at NTNU. The `model` folder contains the Ecore model nad corresponding generator. The generated codes and the unit test codes are present in the `src` and `test` folder. 

## Description
I assume that a study programme website mainly contains `academicYears`. An `AcademicYear` entry should be created for every year new students starts on the programme. Further, an `AcademicYear` contains `courseCombinations`. A `CourseCombination` represents a node in a tree structure of the study programme. For example, one might create a `CourseCombination` for each year. A `CourseCombination` may contain other `CourseCombinations`. Hence, these "nodes" plays a vital part in the organization of a programme. A `CourseCombination` can also contain a reference to a `Specialisation`, acting as a specialisation step.

A `CourseCombination` "leaf node" should contain `courseGroups` (constraints are implemented). A `CourseGroup` effectively provide a collection of one or more courses. These groups may be marked as mandatory or elective. Which courses that are available in a course group is determined by a **filter**. This makes it possible to provide course requirements in a modular and extendible way. It is implemented with a abstract `Criterion` class. Any class extending this `Criterion` class, can provide it's own filtering method. For example, that a course must be at a certain level.

The `test` contains the unit test for all the classes that are implementable in the required scenerio. By default they are generated to fail all of them are kept in that status for now.

## Constraints
The constraints that has been used are `programmesMustHaveUniqueCode` to ensure that the program codes are unique, `containsEitherCourseCombinationsOrCourseGroups` ensures the combination of differnt courses offered and `minimumOneCoursePresent` ensures that at least one course is present.


