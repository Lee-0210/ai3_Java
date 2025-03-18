package Day06.Test;

import java.util.Arrays;
import java.util.StringTokenizer;

public class D {

	public static void main(String[] args) {
		String str = "a, b, c";
		StringTokenizer tok = new StringTokenizer(str, ",");
		
		while(tok.hasMoreTokens()) {
			String token = tok.nextToken();
			System.out.println(token.trim());
		}
		String[] spl = str.split(",");
		System.out.println(Arrays.toString(spl));
	}
}
