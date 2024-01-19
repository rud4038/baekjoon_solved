package lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class num_1181 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		Set<String> str_set = new HashSet<String>();
		for(int i = 0; i < t; i++) {
			str_set.add(br.readLine());
		}
		String[] strs = str_set.toArray(new String[0]);
		
		Arrays.sort(strs,(e1 , e2) -> {
			if(e1.length() == e2.length()) {
				return e1.compareTo(e2);
			}else {
				return e1.length() - e2.length();
			}
		});
		
		for(int i = 0; i < strs.length; i++) {
			sb.append(strs[i] + "\n");
		}
		System.out.println(sb);
		
	}
	

}

