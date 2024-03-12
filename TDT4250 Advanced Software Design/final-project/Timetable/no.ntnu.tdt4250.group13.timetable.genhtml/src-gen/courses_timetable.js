// script for courses timetable

// columns matches
const columns = new Map();
let ct = 1;
for (let day of ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday"]) {
    columns.set(day, ct);
    ct += 1;
}

// lignes matches
const lignes = new Map();
ct = 1;
for (let hour of ["7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19"]) {
    lignes.set(hour, ct);
    ct += 1;
}

// event when something change
document.getElementsByTagName('select')[0].addEventListener('change', changeTimetable);
for (let cb of document.getElementsByTagName("input")) {
    cb.addEventListener('change', changeTimetable);
}

function changeTimetable() {
    // clean the timetable
    cleanTimetable();
    // for each course
    for (let cb of document.getElementsByTagName('input')) {
        // if it is selected
        if (cb.checked) {
            // we search for the week chosen by the user
            for (let week of document.getElementById(`${cb.attributes.name.value}`).children) {
                if (week.attributes.name.value == `${document.getElementsByTagName('select')[0].value}`) {
                    // we display the slots in the timetable
                    for (let slot of week.children) {
                        let column = columns.get(slot.attributes.day.value);
                        let line = lignes.get(`${slot.attributes.startTime.value}`);
                        let lastLine = lignes.get(`${slot.attributes.endTime.value}`);
                        let timetableSlot = document.getElementsByTagName('tbody')[0].children[line].children[column];
                        timetableSlot.innerHTML += `${slot.attributes.startTime.value}-${slot.attributes.endTime.value}: ${cb.attributes.name.value} - ${slot.attributes.activity.value} (${slot.attributes.room.value})<br>`;
                        while (line != lastLine) {
                            document.getElementsByTagName('tbody')[0]
                                .children[line]
                                .children[column]
                                .setAttribute("style", `background-color: lightblue; border-style: none;`);
                            line += 1;
                        }
                    }
                }
            }
        }
    }
}

function cleanTimetable() {
    let table = document.getElementsByTagName('tbody')[0];
    for (let line = 1; line < 14; line++) {
        for (let column = 1; column < 6; column++) {
            table.children[line].children[column].textContent = '';
            table.children[line].children[column]
                .setAttribute("style", "background-color: white; border-style: solid;");
        }
    }
}
