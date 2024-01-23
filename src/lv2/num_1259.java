package lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num_1259 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String num = br.readLine();
			String num2 = "";
			if(Integer.parseInt(num) == 0) {
				break;
			}
			
			for(int i = 0; i < num.length(); i++) {
				num2 += num.charAt(num.length() - 1 - i);
			}
			
			if(num.equals(num2)) {
				sb.append("YES\n");
			}else {
				sb.append("NO\n");
			}
		}
		System.out.println(sb);

	}

}
