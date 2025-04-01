package Day13.Ex02_Stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<>();
		m.put("키5", 10);
		m.put("키3", 40);
		m.put("키4", 30);
		m.put("키2", 50);
		m.put("키1", 20);
		
		Map<String, Integer> m2 = new TreeMap<>();
		m2.put("키5", 10);
		m2.put("키3", 40);
		m2.put("키4", 30);
		m2.put("키2", 50);
		m2.put("키1", 20);
		
		Set<Map.Entry<String, Integer>> entry0 = m2.entrySet();
		Set<Map.Entry<String,Integer>> entry = m.entrySet();
		List<Map.Entry<String, Integer>> entryList = new ArrayList<>(m.entrySet());;
		
		System.out.println(entry0);
		entry0.stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		
	}
}
