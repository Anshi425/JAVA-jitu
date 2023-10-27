package utils;

import java.time.LocalDate;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.app.core.EmpType;
import com.app.core.Employees;

import custom_exceptions.EmployeeHandlingException;

public class EmployeeValidationRules {

	public static void validateAadharNo(String aadharNo) throws EmployeeHandlingException {

		String regex = "^[2-9]{1}[0-9]{3}\\s[0-9]{4}\\s[0-9]{4}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(aadharNo);
		if (!m.matches())
			throw new EmployeeHandlingException("Aadhar No is NOT Valid !!");
	}

	public static void validatePhone(String phone) throws EmployeeHandlingException {

		Pattern p2 = Pattern.compile("^[1-9][0-9]{9}$");
		Matcher m2 = p2.matcher(phone);
		if (!m2.matches())
			throw new EmployeeHandlingException("Phone number is NOT Valid !!");

	}

	public static LocalDate parseDoj(String doj) {
		return LocalDate.parse(doj);
	}

	public static void checkForDupAadharNo(String aadharNo, Map<Integer, Employees> eMap)
			throws EmployeeHandlingException {

		for (Employees e : eMap.values()) {

			if (e.getAadharNo().equals(aadharNo))
				throw new EmployeeHandlingException("Aadhar No is a duplicate !!");
		}

	}

	public static void checkForDupPhoneNo(String phone, Map<Integer, Employees> eMap) throws EmployeeHandlingException {
		for (Employees e : eMap.values()) {

			if (e.getPhone().equals(phone))
				throw new EmployeeHandlingException("Phone number is a Duplicate !!");
		}
	}

	public static Employees removeEmp(Integer empID, Map<Integer, Employees> eMap) throws EmployeeHandlingException {

		Employees ref = eMap.remove(empID);
		if (ref == null)
			throw new EmployeeHandlingException("No Entry Set for Given EmpID !!");
		else
			return ref;

	}

	public static Employees searchByAadharNo(String aadharNo, Map<Integer, Employees> eMap)
			throws EmployeeHandlingException {

		validateAadharNo(aadharNo);
		for (Employees e : eMap.values()) {
			if (e.getAadharNo().equals(aadharNo))
				return e;
		}
		return null;
	}

	public static Employees validateAllInputs(EmpType empType, String name, String doj, String phone, String aadharNo,
			Map<Integer, Employees> eMap) throws EmployeeHandlingException {

		LocalDate parsedDoj = parseDoj(doj);
		validateAadharNo(aadharNo);
		validatePhone(phone);
		checkForDupPhoneNo(phone, eMap);
		checkForDupAadharNo(aadharNo, eMap);

		return new Employees(empType, name, parsedDoj, phone, aadharNo);
	}

}
