function checkForm(){
	if(document.getElementById('terms').checked==false){
		alert("Please make sure that you agree terms and conditions!!!");
		event.preventDefault();
		return false; 
	}
	return true;
}

function certicheck(){
	if(document.getElementById('gen').checked==true){
		document.getElementById('fees').value='300';
		document.getElementById('certi1').style.visibility='hidden';
		document.getElementById('certi2').style.visibility='hidden';
	}
	else {
		document.getElementById('fees').value='0';
		document.getElementById('certi1').style.visibility='visible';
		document.getElementById('certi2').style.visibility='visible';
	}
}

function validate() {
	
	var x1=document.getElementById("fname").value;
	if(x1==""||x1==null){
		alert("First name must be filled out!!!");
		fname.focus();
		return false;
	}
	
	var x8=document.getElementById("lname").value;
	if(x8==""||x8==null){
		alert("Last name must be filled out!!!");
		lname.focus();
		return false;
	}
	
	var x2=document.forms["myForm"]["dob"].value;
	if(x2==""||x2==null){
		alert("Date of Birth must be entered!!!");
		dob.focus();
		return false;
	}
	
	var x3=document.forms["myForm"]["country"].value;
	if(x3==""||x3==null){
		alert("Country name must be entered!!!");
		country.focus();
		return false;
	}

	var x4=document.forms["myForm"]["email1"].value;
	if(x4==""||x4==null){
		alert("E-Mail must be entered in specified format!!!");
		email1.focus();
		return false;
	}
		
	var x7=document.forms["myForm"]["email2"].value;
	if(x7==""||x7==null){
		alert("Re-Enter the E-Mail Id!!!");
		email2.focus();
		return false;
	} 

	if(x4!=x7){
		alert("E-Mails do not match!!! Re-Enter the E-Mail correctly.");
		event.preventDefault();
		return false;
	}
	
	if(document.getElementById('gen').checked==false){
		var x5=document.forms["myForm"]["certificate"].value;
		if(x5==""||x5==null){
			alert("Certificate Number must be entered!!!");
			certificate.focus();
			return false;
		}
		
		var x6=document.forms["myForm"]["certidate"].value;
		if(x6==""||x6==null){
			alert("Issuing date of the caste certificate is to be entered!!!");
			certidate.focus();
			return false;
		}
	}
	
	var res = confirm("Do you want to continue...?");
	if ( res == true)
		alert("Step 1 is completed.");
	else if(res== false){
	alert("Step-1 is incomplete!!!");
		event.preventDefault();
		return false;
	}
	return true;
}

function validate1() {
	
	var x1=document.forms["myForm"]["fatname"].value;
	if(x1==""||x1==null){
		alert("Enter your Father name!!!");
		fatname.focus();
		return false;
	}
	
	var x2=document.forms["myForm"]["address1"].value;
	if(x2==""||x2==null){
		alert("Enter your address line 1!!!");
		address1.focus();
		return false;
	}
	
	var x3=document.forms["myForm"]["address2"].value;
	if(x3==""||x3==null){
		alert("Enter your address line 2!!!");
		address2.focus();
		return false;
	}
	
	var x4=document.forms["myForm"]["address3"].value;
	if(x4==""||x4==null){
		alert("Enter your address line 3!!!");
		address3.focus();
		return false;
	}
	
	var x5=document.forms["myForm"]["city"].value;
	if(x5==""||x5==null){
		alert("Enter your City/Mandal!!!");
		city.focus();
		return false;
	}
	
	var x6=document.forms["myForm"]["district"].value;
	if(x6==""||x6==null){
		alert("Enter your District!!!");
		district.focus();
		return false;
	}
	
	var x7=document.forms["myForm"]["pincode"].value;
	if(x7==""||x7==null){
		alert("Enter your city ZIP code!!!");
		pincode.focus();
		return false;
	}
	
	var x13=document.forms["myForm"]["state"].value;
	if(x13=='0'){
		alert("Select your state!!!");
		state.focus();
		return false;
	}
	
	var x8=document.forms["myForm"]["mobile"].value;
	var x9=x8.toString().length;
	if(x9<'10' || x9>'10'){
		alert("Enter your Mobile number in the prescribed format!!!");
		mobile.focus();
		return false;
	}
	
	var x10=document.forms["myForm"]["std"].value;
	if(x10==""||x10==null){
		alert("Enter your STD code!!!");
		std.focus();
		return false;
	}
	
	var x11=document.forms["myForm"]["phone"].value;
	if(x11==""||x11==null){
		alert("Enter your phone number!!!");
		phone.focus();
		return false;
	}
	
	var x14=document.forms["myForm"]["examcenter"].value;
	if(x14=='0'){
		alert("Select an examination center!!!");
		examcenter.focus();
		return false;
	}
	
	var x12=document.forms["myForm"]["exam1"].value;
	if(x12=='0'){
		alert("Select a qualifying exam -1!!!");
		exam1.focus();
		return false;
	}
	
	var x15=document.forms["myForm"]["exam2"].value;
	if(x15=='0'){
		alert("Select a qualifying exam -2!!!");
		exam2.focus();
		return false;
	}
	
	var x16=document.forms["myForm"]["discipline"].value;
	if(x16=='0'){
		alert("Select your discipline!!!");
		discipline.focus();
		return false;
	}
	
	var x17=document.forms["myForm"]["subdiscipline"].value;
	if(x17=='0'){
		alert("Select your sub-discipline!!!");
		subdiscipline.focus();
		return false;
	}
	
	var x18=document.forms["myForm"]["institute"].value;
	if(x18==""||x18==null){
		alert("Enter the institute name!!!");
		institute.focus();
		return false;
	}
	
	var x19=document.forms["myForm"]["university"].value;
	if(x19==""||x19==null){
		alert("Enter the university name!!!");
		university.focus();
		return false;
	}
	
	var x20=document.forms["myForm"]["course"].value;
	if(x20=='0'){
		alert("Select the type of course!!!");
		course.focus();
		return false;
	}
	
	var x21=document.forms["myForm"]["monthyear"].value;
	if(x21==""||x21==null){
		alert("Enter the month and year of course completion!!!");
		monthyear.focus();
		return false;
	}
	
	var x22=document.forms["myForm"]["marks"].value;
	if(x22==""||x22==null){
		alert("Enter the percentage of qualifying exam -2!!!");
		marks.focus();
		return false;
	}
	
	var x23=document.forms["myForm"]["company"].value;
	if(x23==""||x23==null){
		alert("Enter the previous/current company name!!!");
		company.focus();
		return false;
	}
	
	x24=document.forms["myForm"]["companytype"].value;
	if(x24=='0'){
		alert("Select the type of company!!!");
		companytype.focus();
		return false;
	}
	
	
	var res = confirm("Do you want to continue...?");
	if ( res == true)
		alert("Step 2 is completed.");
	else if(res== false){
	alert("Step-2 is incomplete!!!");
		event.preventDefault();
		return false;
	}
	return true;
}

