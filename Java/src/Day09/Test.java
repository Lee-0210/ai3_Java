package Day09;

import java.util.Scanner;
public class Test {

	public static String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        char[] chArray = my_string.toCharArray();
        for(int i = 0; i < overwrite_string.length(); i++) {
        	chArray[s+i] = overwrite_string.charAt(i);
        }
        
        for(int i = 0; i < chArray.length; i++) {
        	answer += chArray[i];
        }
        
        return answer;
    }
	
	public static String solution2(String my_string, String overwrite_string, int s) {
        String answer = "";
        String before = my_string.substring(0, s);
        System.out.println(before);
        String after = my_string.substring(overwrite_string.length() + s);
        System.out.println(after);
        answer = before + overwrite_string + after;
        
        return answer;
    }
	
	public static void main(String[] args) {
		String a = solution("abcde", "cd", 3);
		String b = solution2("abcde", "cd", 3);
		System.out.println(a);
		System.out.println(b);
	}
}
