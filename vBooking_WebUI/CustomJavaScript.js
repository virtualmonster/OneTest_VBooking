function getCurrentDate(){
	var today = new Date();
	var day = today.getDate();
	if(day<10){
		day = '0'+day;
	}
	var month = today.getMonth() +1;
	if(month<10){
		month = '0'+month;
	}
	var date = day+'/'+month+'/'+today.getFullYear();
	return date;
}

function getEndDate(days){ // add number of days from current date
	var today = new Date();
	today.setDate(today.getDate() + Number(days));
	var day = today.getDate();
	if(day<10){
		day = '0'+day;
	}
	var month = today.getMonth() +1;
	if(month<10){
		month = '0'+month;
	}
	var date = day+'/'+month+'/'+today.getFullYear();
    return date;
}



