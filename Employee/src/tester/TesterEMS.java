package tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.app.core.EmpType;
import com.app.core.Employees;

import custom_ordering.SortByDoj;

import static utils.EmployeeValidationRules.*;

public class TesterEMS {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in); Scanner scLine = new Scanner(System.in).useDelimiter("\\n")) {
			Map<Integer, Employees> eMap = new HashMap<>();
			boolean flag = false;

			while (!flag) {

				System.out.println("1. Add full time employee\n" + "2. Add part time employee\n"
						+ "3. Delete an employee by Emp Id\n" + "4. Search employee details by Aadhaar number\n"
						+ "5. Display all employee details\n"
						+ "6. Display all employee details sorted by date of joining\n" + "0. Exit");

				try {
					switch (sc.nextInt()) {

					case 1:
//						sc.useDelimiter("\\n");
						System.out.println("Enter Name, Date Of Joining(yyyy-mm-dd), Phone, AadharNo(XXXX XXXX XXXX):");
						Employees ref = validateAllInputs(EmpType.FTE, sc.next(), sc.next(), sc.next(),
								scLine.next().trim(), eMap);
						eMap.put(ref.getEmpID(), ref);
						System.out.println("Successfully added Full Time Employee !! \n");

						break;

					case 2:

						System.out.println("Enter Name, Date Of Joining(yyyy-mm-dd), Phone, AadharNo(XXXX-XXXX-XXXX):");
						Employees ref2 = validateAllInputs(EmpType.PTE, sc.next(), sc.next(), sc.next(),
								scLine.next().trim(), eMap);
						eMap.put(ref2.getEmpID(), ref2);
						System.out.println("Successfully added Part Time Employee !! \n");

						break;

					case 3:

						System.out.println("Enter EmpID:");
						Employees removedRef = removeEmp(sc.nextInt(), eMap);
						if (removedRef == null)
							System.out.println("no such EmpID exists.");
						else
							System.out.println("successfully removed the entry-set: " + removedRef + "\n");

						break;

					case 4:

						System.out.println("Enter Aadhar Number(XXXX XXXX XXXX):");
						Employees searchedAadharNo = searchByAadharNo(scLine.next().trim(), eMap);
						System.out.println(searchedAadharNo);

						break;

					case 5:
						if (eMap.size() != 0) {

							for (Employees e : eMap.values()) {
								System.out.println(e);
							}
						} else
							System.out.println("empty hashmap !!");

						break;
					case 6:

						ArrayList<Employees> eList = new ArrayList<>(eMap.values());
						Collections.sort(eList, new SortByDoj());
						for (Employees e : eList) {
							System.out.println(e);
						}

						break;

					case 7:

						validateAadharNo("2023 1223 3435");

						break;

					case 0:
						System.out.println("Exiting ...");
						flag = true;
						break;

					default:
						break;

					}

				} catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}

			}

		}

	}

}
