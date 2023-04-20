package com.infinira.sms.utils;

public enum GenderEnum{
	M,
	F;
}

/**
public void validateGender(String gender,String msg){
		validate(gender,msg);
		try{
			//this method is used to return an enum constant of the specified string value if it exists.
			GenderEnum.valueOf(gender.toUpperCase());
		}
		catch(Exception excep){
			throw new RuntimeException(msg+" : "+gender);
		}
}
**/
