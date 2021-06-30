const startDateTime = new Date(); // start
const startStamp = startDateTime.getTime();

let newDate = new Date();
let newStamp = newDate.getTime();

let timer;

function updateClock() {
    newDate = new Date();
    newStamp = newDate.getTime();
    let diff = Math.round((newStamp-startStamp)/1000);
    
    let h = Math.floor(diff/(60*60));
    diff = diff-(h*60*60);
    let m = Math.floor(diff/(60));
    diff = diff-(m*60);
    let s = diff;

document.getElementById("time-elapsed").innerHTML = h+" Stunden, "+m+" Minuten, "+s+" Sekunden";

}


timer = setInterval(updateClock, 1000);