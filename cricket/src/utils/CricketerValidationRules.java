package utils;

import java.util.Map;

import com.app.core.Cricketer;

import custom_exceptions.CricketerHandlingException;

public class CricketerValidationRules {
	
	
	public static String checkForDups(String email, Map<String, Cricketer> cmap) throws CricketerHandlingException {

		if(cmap.containsKey(email))
			throw new CricketerHandlingException("Email ID already registered !!");
		return email;
	}
	
	public static String checkForPhoneDups(String phone, Map<String, Cricketer> cmap) throws CricketerHandlingException {
		
		for(Cricketer index : cmap.values()) {
			if(index.getPhone().equals(phone))
				throw new CricketerHandlingException("Phone Number is a Duplicate !!");
		}
		return phone;
	}
	
	public static void modifyCricketerRating(String key, int newRating, Map<String, Cricketer> cmap) throws CricketerHandlingException{
		
		if(cmap.containsKey(key))
			cmap.get(key).setRating(newRating);
		else
			throw new CricketerHandlingException("Player with given email does NOT exist !!");
	}
	
	public static Cricketer searchByName(String name, Map<String, Cricketer> cmap) throws CricketerHandlingException{
		
		for(Cricketer c : cmap.values()) {
			if(c.getName().equals(name))
				return c;
		}
		throw new CricketerHandlingException("Cricketer Name does NOT exist !!");
	}
	
	public static Cricketer validateAllInputs(String name, int age, String email, String phone, int rating, Map<String , Cricketer> cmap) throws CricketerHandlingException {
		
		String checkedEmail = checkForDups(email,cmap);
		String checkedPhone = checkForPhoneDups(phone,cmap);
		
		return new Cricketer(name, age, checkedEmail, checkedPhone, rating);
	}


}
