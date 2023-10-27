package custom_ordering;

import java.util.Comparator;

import com.app.core.TaskManger;

public class CompareByDate implements Comparator<TaskManger>{

	@Override
	public int compare(TaskManger o1, TaskManger o2) {

		return o1.getTaskDate().compareTo(o2.getTaskDate());
	}

}
