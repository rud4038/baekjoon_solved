package lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num_2609 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n1 = Integer.parseInt(st.nextToken());
		int n2 = Integer.parseInt(st.nextToken());
		int answer1 = gcd(n1, n2);
		System.out.println(answer1 + "\n" + (n1 * n2) / answer1);
	}
	
	public static int gcd(int a, int b) {
		
		while(b != 0) {
			int r = a % b;
			
			a = b;
			b = r;
		}
		return a;
	}
}
