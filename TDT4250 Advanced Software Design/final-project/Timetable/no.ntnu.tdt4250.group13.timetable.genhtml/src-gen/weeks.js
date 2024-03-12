// script for week selector
const select = document.getElementsByTagName('select')[0];
const tables = document.getElementsByTagName('table');
select.addEventListener('click', () => {
    for (table of tables) {
        if (table.attributes.class.value == `${select.value}`) {
            table.hidden = false;
        } else {
            table.hidden = true;
        }
    }
})
