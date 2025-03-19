package 단축키;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;
public class Today {

	public static void main(String[] args) {
		
		int[] arr = {5, 6, 7, 1, 2, 3};
		HashSet<Integer> arr2 = Arrays.stream(arr)
						.filter(n -> n > 3)
						.boxed()
						.collect(Collectors.toCollection(HashSet::new));
		
		arr2.forEach((element) -> System.out.println(element));
		System.out.println(arr2 instanceof HashSet);
		arr2.add(125);
		arr2.add(25);
		arr2.add(35);
		
		arr2.forEach((element) -> System.out.println(element));
							
	}				
}
