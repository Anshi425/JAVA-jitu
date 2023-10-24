package tester;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.app.core.TaskManger;

import static utils.TaskManagerValidationRules.*;

public class TaskTest {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			boolean flag = false;
			Map<Integer, TaskManger> taskMap = new HashMap<>();

			while (!flag) {
				System.out.println("1. Add new Task \n" + "2. Delete a Task \n" + "3. Update a Task's Status \n"
						+ "4. Display All Pending Tasks \n" + "5. Display All Pending Tasks in a Day \n"
						+ "6. Display All Pending Tasks Sorted by taskDate \n" + "0. Exit");

				try {

					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter taskName, desc, taskDate");
						TaskManger ref = validAllInputs(sc.next(), sc.next(), sc.next(), "pending", true, taskMap);
						taskMap.put(ref.getTaskID(), ref);
						System.out.print("Successfully added task !! \n"
								+ "TaskID of this task is: " + ref.getTaskID() + "\n\n");
						break;

					case 2:

						if (taskMap.size() != 0) {
							System.out.print("Enter TaskID: ");
							removeTask(sc.nextInt(), taskMap);
							System.out.println("Successfully removed Task !! \n");
						} else
							System.out.println("Empty HashMap !! \n");

						break;

					case 3:

						System.out.print("Enter taskID and new status(PENDING, IN_PROGRESS, COMPLETED): ");
						updateStatus(sc.nextInt(), sc.next(), taskMap);
						

						break;

					case 4:

						if (taskMap.size() != 0)
							getAllPendingTasks(taskMap);
						else
							System.out.println("Empty HashMap !!");

						break;

					case 5:
//						
						if (taskMap.size() != 0)
							getAllPendingTasksForToday(taskMap);
						else
							System.out.println("Empty HashMap !!");
						
						break;

					case 6:
						break;

					case 0:
						System.out.println("Exiting ...");
						flag = true;
						break;

					default:
						System.out.println("You have Entered wrong Choice, try again.");
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
