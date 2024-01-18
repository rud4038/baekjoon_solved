package lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num_9012 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			String str = br.readLine();
			int count = 0;
			for(int j = 0; j < str.length(); j++) {
				if(str.charAt(j) == '(') {
					count ++;
				}else {
					count --;
				}
				
				if(count < 0) {
					break;
				}
				
			}
			if(count == 0) {
				sb.append("YES\n");
			}else {
				sb.append("NO\n");
			}
		}
		System.out.println(sb);

	}

}
