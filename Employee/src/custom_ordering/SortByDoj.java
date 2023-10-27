package custom_ordering;

import java.util.Comparator;

import com.app.core.Employees;

public class SortByDoj implements Comparator<Employees> {

	@Override
	public int compare(Employees o1, Employees o2) {

		return o1.getDoj().compareTo(o2.getDoj());
	}

}
