package custom_ordering;

import java.util.Comparator;

import com.app.core.Cricketer;

public class SortByRating implements Comparator<Cricketer> {

	@Override
	public int compare(Cricketer o1, Cricketer o2) {
		
		Integer c1 = o1.getRating();
		Integer c2 = o2.getRating();
		
		return c1.compareTo(c2);
	}
	

	
	
}
