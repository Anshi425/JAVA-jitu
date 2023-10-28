package Q2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test2 {

	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(1,3,4,6,7,9);
		List<Integer> list2 = Arrays.asList(1,2,4,5,9,10);
		List<Integer> list3 = new ArrayList<>();
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(Integer i : list1) {
			if(!map.containsKey(i))
				map.put(i, 1);
			else
				map.put(i, map.get(i)+1);
		}
		
		for(Integer i : list2) {
			if(!map.containsKey(i))
				map.put(i, 1);
			else
				map.put(i, map.get(i)+1);
		}

		for(Map.Entry<Integer, Integer> i : map.entrySet()) {
			if(i.getValue()>1)
				list3.add(i.getKey());
		}
		
		System.out.println("Common elements are: " + list3);
		

	}

}
