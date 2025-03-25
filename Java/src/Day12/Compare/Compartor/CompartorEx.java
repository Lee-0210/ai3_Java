package Day12.Compare.Compartor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 1. Comparator 인터페이스 구현
 * 2. compare() 메서드 오버라이딩
 * 		- 정렬 기준1 : 나이순 내림차순
 * 		- 정렬 기준2 : 이름순 오름차순
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
class User implements Comparator<User>{
	
	String id;
	String name;
	int age;
	
	@Override
	public int compare(User o1, User o2) {
		// 나이순 내림차순
		int age1 = o1.getAge();
		int age2 = o2.getAge();
		
		// 이름순 오름차순
		String name1 = o1.getName();
		String name2 = o2.getName();
		
		// 방법1
//		if(age1 > age2) return -1;
//		if(age1 < age2) return 1;
//		if(age1 == age2) {
//			return name1.compareTo(name2);
//		}
		
		// 방법2
		int result1 = age2 - age1;
		int result2 = name1.compareTo(name2);
		return result1 == 0 ? result2 : result1;
	}
}

public class CompartorEx {
	
	public static void main(String[] args) {
		List<User> list = new ArrayList<>();
		list.add(new User("아이디1", "가나다", 45));
		list.add(new User("아이디2", "라나다", 27));
		list.add(new User("아이디3", "마나다", 30));
		list.add(new User("아이디4", "나나다", 30));
		list.add(new User("아이디5", "다나다", 50));
		
		System.out.println("정렬 전");
		for(User user : list) {
			System.out.println(user);
		}
		System.out.println();
		
		// Collections.sort(컬렉션, 정렬기준 객체)
		Collections.sort(list, new User());
		
		System.out.println("정렬 후");
		for(User user : list) {
			System.out.println(user);
		}
		System.out.println();
		
		// * 익명구현객체를 사용하여, 정렬
		List<User> list2 = new ArrayList<>();
		list2.add(new User("abc", "가나다", 45));
		list2.add(new User("cde", "라나다", 27));
		list2.add(new User("bef", "마나다", 30));
		list2.add(new User("gde", "나나다", 30));
		list2.add(new User("ddd", "다나다", 50));
		
		Collections.sort(list2, new Comparator<User>() {
			@Override
			public int compare(User o1, User o2) {
				String thisId = o1.getId();
				String comId = o2.getId();
				return thisId.compareTo(comId);
			}
		});

		System.out.println("아이디기준 오름차순");
		for(User user : list2) {
			System.out.println(user);
		}
		System.out.println();
	}
}
