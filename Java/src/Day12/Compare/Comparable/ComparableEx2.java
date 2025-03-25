package Day12.Compare.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
class Movie implements Comparable<Movie> {

	String title;
	String director;
	int price;
	
	@Override
	public int compareTo(Movie o) {
		String thisTitle = this.getTitle();
		String comTitle = o.getTitle();
		int result = thisTitle.compareTo(comTitle);
		
		return result;
	}
}

public class ComparableEx2 {

	public static void main(String[] args) {
		List<Movie> movieList = new ArrayList<>();
		movieList.add(new Movie("미키17", "봉준호", 25000));
		movieList.add(new Movie("서브스턴스", "코랄리 파르쟈", 20000));
		movieList.add(new Movie("백설공주", "디즈니", 15000));
		movieList.add(new Movie("타짜", "최동훈", 18000));
		movieList.add(new Movie("포레스트 검프", "로버트 지메키스", 19000));
		
		// 정렬 전
		System.out.println("정렬 전");
		for(Movie movie : movieList) {
			System.out.println(movie);
		}
		System.out.println();
		
		// 정렬
		Collections.sort(movieList);
		
		// 정렬 후
		System.out.println("정렬 후");
		for(Movie movie : movieList) {
			System.out.println(movie);
		}
		System.out.println();
	}
}
