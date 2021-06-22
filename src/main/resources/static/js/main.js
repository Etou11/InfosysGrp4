
$(document).ready(function(){
	$('.acc h2').click(function(){
		$(this).next('.content').slideToggle();
		$(this).parent().toggleClass('active');
		$(this).parent().siblings().children('.content').slideUp();
		$(this).parent().siblings().removeClass('active');
	});
});

const startDateTime = new Date('June 21, 2021 , 11:18:00'); // start
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
