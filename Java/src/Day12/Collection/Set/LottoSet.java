package Day12.Collection.Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class LottoSet {
	// 1 ~ 45 로또 번호를 6개 뽑는다.
	// 중복된 랜덤 수가 나온 경우 다시 뽑는다.
	public static void main(String[] args) {
		// 중복 제거
		Set<Integer> lottoSet = new HashSet<>();
		Random rd = new Random();
		
		while(lottoSet.size() < 6) {
			int num = rd.nextInt(45) + 1;
			boolean check = lottoSet.add(num);
			if(!check) {
				System.out.println(num + "번이 중복되어서 다시 뽑습니다.");
			}
		}
		System.out.println("로또 번호 : " + lottoSet);
		
		// 정렬
		// Set 컬렉션 자체는 순서가 없으므로,
		// 순서가 있는 List 컬렉션으로 변환하여 정렬할 수 있다.
		
		List<Integer> lottoList = new ArrayList<Integer>(lottoSet);
		
		// 오름차순 정렬
		Collections.sort(lottoList);
		System.out.println("오름차순 로또 번호 : " + lottoList);
		
		// 내림차순 정렬
		Collections.sort(lottoList, (a, b) -> b - a);
		System.out.println("내림차순 로또 번호 : " + lottoList);
	}
}
