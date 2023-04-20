package com.infinira.sms.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import com.infinira.sms.utils.GenderEnum;
import com.infinira.sms.utils.MaritalStatusEnum;
import com.infinira.sms.utils.BloodTypeEnum;
import com.infinira.sms.utils.CategoryEnum;
import com.infinira.sms.utils.PwdEnum;

public class Student{
	private int studentId;
	private String firstName;
	private String lastName;
	private String dob;
	private String gender;
	private String maritalStatus;
	private String course;
	private String branch;
	private String bloodGroup;
	private String emailId;
	private String phoneNumber;
	private String fatherName;
	private String motherName;
	private String parentsPhoneNumber;
	private String category;
	private String pwd;
	private String previousStudy;
	private double percentage;
	private String identityNumber;
	private String identityType;
	private String nationality;
	private String joiningDate;
	private String passedDate;
	
	public Student(){}
	public Student(String firstName,String dob,String gender,String phoneNumber,String identityType,String identityNumber ){
		firstName=validateSize(firstName,1,32,"Invalid first name ");
		//validateName(firstName,"first Name cannot contains numbers."); 
		this.firstName=firstName;
		validateDate(dob,"Invalid DOB.Date format should be in DD/MM/YYYY");
		this.dob=dob;
		gender=validateGender(gender,"Invalid gender ");
		this.gender=gender;
		phoneNumber=validateSize(phoneNumber,5,15,"Invalid Phone Number ");
		//validatePhoneNumber(phoneNumber,"Invalid phone Number.contains only nymbers.");
		this.phoneNumber=phoneNumber;
		identityType=validateSize(identityType,2,16,"Invalid Identity type ");
		this.identityType=identityType;
		identityNumber = validateSize(identityNumber,7,16,"Invalid Identity Number ");
		this.identityNumber=identityNumber;
	}
	
	public void setStudentId(int studentId){
		validateNumber(studentId,"Inavlid Student ID");
		this.studentId=studentId;
	}
	
	public int getStudentId(){
		return studentId;
	}
	
	//setting first name of a student
	public void setFirstName(String firstName){
		firstName=validateSize(firstName,1,32,"Invalid first name ");
		////validateName(firstName,"first Name cannot contains numbers."); 
		this.firstName =firstName;
	}
	
	//Getting the first name of a Student
	public String getFirstName(){
		return firstName;
	}
	
	//Setting the last name of a Student
	public void setLastName(String lastName){
		if(lastName!=null){
			lastName=validateSize(lastName,1,32,"Invalid last name size.");
			//validateName(lastName,"last Name cannot contains numbers."); 
			this.lastName =lastName;
		}
		this.lastName=lastName;
	}
	
	//Getting the last name of a student
	public String getLastName(){
		return lastName;
	}
	
	//Setting the date of birth of the Student
	public void setDob(String dob){
		validateDate(dob,"Invalid DOB.Date format should be in DD/MM/YYYY");
		this.dob=dob;
	}
	
	//Getting the date of birth of the Student
	public String getDob(){
		return dob;
	}
	
	//Setting the Gender of the Student
	public void setGender(String gender){
		gender=validateGender(gender,"Invalid gender ");
		this.gender=gender;
	}
	
	//Getting the Gender of the Student
	public String getGender(){
		return gender;
	}
	
	//setting the marital Status of a Student.
	public void setMaritalStatus(String maritalStatus){
		maritalStatus=validateMaritalStatus(maritalStatus,"Invalid marital Status.");
		this.maritalStatus=maritalStatus;
	}
	
	//Getting the marital status of a Student.
	public String getMaritalStatus(){
		return maritalStatus;
	}
		
	//Setting the course of a student
	public void setCourse(String course){
		course = validateSize(course,2,32,"Invalid course name ");
		this.course=course;
	}
	
	//Getting the course of a Student.
	public String getCourse(){
		return course;
	}
	
	//Setting the course of a Student.
	public void setBranch(String branch){
		branch = validateSize(branch,2,32,"Invalid branch name size.");
		this.branch= branch;
	}
	
	//Getting the course of a Student.
	public String getBranch(){
		return branch;
	}
	
	//Setting the blood group of a student
	public void setBloodGroup(String bloodGroup){
		bloodGroup=validateBloodType(bloodGroup,"Invalid blood group");
		this.bloodGroup=bloodGroup;
	}
	
	//Getting the blood group of a student.
	public String getBloodGroup(){
		return bloodGroup;
	}
	
	//Setting the email id of a student.
	public void setEmailId(String emailId){
		if(emailId!=null){
			emailId=validateSize(emailId,10,256,"Invalid Email Id ");
			this.emailId =emailId;
		}
		this.emailId=emailId;
	}
	
	//Getting the email id of a Student.
	public String getEmailId(){
		return emailId;
	}
	
	//Setting the phone number of a Student
	public void setPhoneNumber(String phoneNumber){
		phoneNumber=validateSize(phoneNumber,5,15,"Invalid Phone Number size.");
		//validatePhoneNumber(phoneNumber,"Invalid phone Number.contains only nymbers.");
		this.phoneNumber=phoneNumber;
	}
	
	//Getting the phone number of a Student
	public String getPhoneNumber(){
		return phoneNumber;
	}
	
	//Setting the Father Name for a Student
	public void setFatherName(String fatherName){
		fatherName=validateSize(fatherName,1,64,"Invalid last name ");
		//validateName(lastName,"Father Name cannot contains numbers."); 
		this.fatherName =fatherName;
	}
	
	//Getting the father name of a Student
	public String getFatherName(){
		return fatherName;
	}
	
	//Setting the Mother Name of a Student
	public void setMotherName(String motherName){
		if(motherName!=null){
			motherName=validateSize(motherName,1,64,"Invalid mother name ");
			this.motherName =motherName;
		}
		this.motherName=motherName;
	}	
	
	//Getting the Mother Name of a Student
	public String getMotherName(){
		return motherName;
	}
	
	//Setting the parents Phone number 
	public void setParentsPhoneNumber(String parentsPhoneNumber){
		if(parentsPhoneNumber!=null){
			parentsPhoneNumber=validateSize(parentsPhoneNumber,5,15,"Invalid parents Phone Number ");
			//validatePhoneNumber(parentsPhoneNumber,"Invalid phone Number.contains only nymbers.");
			this.parentsPhoneNumber=parentsPhoneNumber;
		}
		this.parentsPhoneNumber=parentsPhoneNumber;
	}
	
	//Getting the parents Phone Number
	public String getParentsPhoneNumber(){
		return parentsPhoneNumber;
	}
	
	//Setting the category of the student
	public void setCategory(String category){
		category=validateCategory(category,"Invalid Category.");
		this.category=category;
	}
	
	//Getting the category of the student
	public String getCategory(){
		return category;
	}
	
	//Setting the pwd of the Student
	public void setPwd(String pwd){
		pwd=validatePwd(pwd,"Invalid pwd value.It can be either 'yes' or 'no'");
		this.pwd=pwd;
	}
	
	//Getting the pwd details of a student.
	public String getPwd(){
		return pwd;
	}
	
	//Setting the previous study details of a Student
	public void setPreviousStudy(String previousStudy){
		previousStudy=validateSize(previousStudy,2,32,"Invalid previous study name ");
		this.previousStudy=previousStudy;
	}
	
	//Getting the previous study details of a student.
	public String getPreviousStudy(){
		return previousStudy;
	}
	
	//Setting the percentage of the previous study of a student.
	public void setPercentage(double percentage){
		validateDouble(percentage,"Invalid percentage.");
		this.percentage=percentage;
	}
	
	//Getting the percentage of the previous study of a student.
	public double getPercentage(){
		return percentage;
	}
	
	//Setting the Nationality of a student
	public void setNationality(String nationality){
		nationality=validateSize(nationality,4,35,"Invalid nationality ");
		this.nationality=nationality;
	}
	
	//Getting the nationality of a student.
	public String getNationality(){
		return nationality;
	}
	
	//Setting the Identity Number of the Student
	public void setIdentityNumber(String identityNumber){
		identityNumber =validateSize(identityNumber,7,16,"Invalid Identity Number ");
		this.identityNumber=identityNumber;
	}
	
	//Getting the identity Number of a Student
	public String getIdentityNumber(){
		return identityNumber;
	}
		
	//Setting the Identity Type of a Student
	public void setIdentityType(String identityType){
		identityType=validateSize(identityType,2,16,"Invalid Identity type ");
		this.identityType=identityType;
	}
	
	//Getting the Identity type of a Student
	public String getIdentityType(){
		return identityType;
	}
	
	//Setting joining date of a student.
	public void setJoiningDate(String joiningDate){
		//validateJoiningDate(joiningDate,"Invalid Joining date.");
		this.joiningDate=joiningDate;
	}
	
	//Getting joining date of a student.
	public String getJoiningDate(){
		return joiningDate;
	}
	
	//setting passing date of a student
	public void setPassedDate(String passedDate){
		//validatePassingDate(passingDate,"Invalid passing Date.");
		this.passedDate=passedDate;
	}
	
	//Getting passing date of a student.
	public String getPassedDate(){
		return passedDate;
	}
		
	//validating a number 
	public void validateNumber(int number,String msg){
		if(number<=0){
			throw new RuntimeException(msg+" Must be greater than 0.");
		}
	}
	
	//Validating whether the String empty or NULL
	public String validate(String str, String msg){
		if(str==null){
			throw new RuntimeException(msg+"\nField cannot be null.");
		}
		str=str.trim();
		if(str.isEmpty()){
			throw new RuntimeException(msg+"\nField cannot be empty.");
		}
		return str;
	}
	
	//Validating the Size of a String object
	public String validateSize(String str,int minSize, int maxSize,String msg){
		str=validate(str,msg);
		if(str.length()<minSize){
			throw new RuntimeException(msg+"size. Size must be greater than : "+minSize+" characters.But given size is: "+str.length());
		}
		else if(str.length()>maxSize){
			throw new RuntimeException(msg+"size. Size must be less than : "+maxSize+" characters.But given size is: "+str.length());
		}
		return str;
		
	}
	
	//Validating the Date by taking the string as a parameter.
	public boolean validateDate(String dob,String msg){
		dob=validate(dob,msg);
		SimpleDateFormat format = new SimpleDateFormat("yyyy/mm/dd");
		format.setLenient(false); 
		Date date;
        try {
			date=format.parse(dob);
        }catch(ParseException parseException){
			throw new RuntimeException(msg+" Date format should be in 'YYYY/MM/DD': "+dob);
		}
		if(!date.before(new Date())){
			throw new RuntimeException(msg+" Date exceeds current date");
		}
		return true;
    }
	
	//validating the floating value
	public void validateDouble(double percentage,String msg){
		if (percentage < 35.0){
			throw new RuntimeException(msg+" : "+percentage);
		}
	}
	
	public String validateMaritalStatus(String maritalStatus,String msg){
		maritalStatus=validate(maritalStatus,msg);
		try{
			//this method is used to return an enum constant of the specified string value if it exists.
			MaritalStatusEnum.valueOf(maritalStatus.toUpperCase());
		}catch(Exception excep){
			throw new RuntimeException(msg+" : "+maritalStatus);
		}
		return maritalStatus;
	}
	
	public String validateBloodType(String bloodGroup,String msg){
		bloodGroup=validate(bloodGroup,msg);
		String bloodType;
		try{
			//this method is used to return an enum constant of the specified string value if it exists.
			BloodTypeEnum blood =BloodTypeEnum.valueOf(bloodGroup.toUpperCase());
			bloodType = blood.getBloodGroup();
		}catch(Exception excep){
			throw new RuntimeException(msg+" : "+bloodGroup);
		}
		return bloodType;
	}
	
	public String validateGender(String gender,String msg){
		gender=validate(gender,msg);
		try{
			//this method is used to return an enum constant of the specified string value if it exists.
			GenderEnum.valueOf(gender.toUpperCase());
		}catch(Exception excep){
			throw new RuntimeException(msg+" : "+gender);
		}
		return gender;
	}
	
	public String validateCategory(String category,String msg){
		category=validate(category,msg);
		try{
			//this method is used to return an enum constant of the specified string value if it exists.
			CategoryEnum.valueOf(category.toUpperCase());
		}catch(Exception excep){
			throw new RuntimeException(msg+" : "+category);
		}
		return category;
	}
	
	public String validatePwd(String pwd,String msg){
		pwd=validate(pwd,msg);
		try{
			//this method is used to return an enum constant of the specified string value if it exists.
			PwdEnum.valueOf(pwd.toUpperCase());
		}catch(Exception excep){
			throw new RuntimeException(msg+" : "+pwd);
		}
		return pwd;
	}
	
	//Name validating
	/**public boolean validateName(String name,String msg){
		String invalidCharacters="[^0-9]+";
		Pattern pattern = Pattern.compile(invalidCharacters);
		Matcher match =pattern.matcher(name);
		if (!match.matches()){
			throw new RuntimeException(msg);
		}
		return true;
			
	}
	
	public boolean validatePhoneNumber(String phoneNumber,String msg){
		String validCharacters="[0-9]+";
		Pattern pattern = Pattern.compile(validCharacters);
		Matcher match =pattern.matcher(phoneNumber);
		if (!match.matches()){
			throw new RuntimeException(msg);
		}
		return true;
			
	}
	**/
}
