package custom_exceptions;

import java.util.Comparator;

import com.app.core.TaskManger;

public class CompareByName implements Comparator<TaskManger>{

	@Override
	public int compare(TaskManger o1, TaskManger o2) {
		
		return o1.getTaskName().compareTo(o2.getTaskName());
	}
	
}
