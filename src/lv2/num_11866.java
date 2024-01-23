package lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class num_11866 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int num = k - 1;
		List<Integer> nums = new ArrayList<Integer>();
		for(int i = 1; i <= n; i++) {
			nums.add(i);
		}
		
		sb.append("<");
		
		while(!nums.isEmpty()) {
			sb.append(nums.get(num));
			nums.remove(num);
			num --;
			if(nums.isEmpty()) {
				sb.append(">");
				break;
			}else {
				sb.append(", ");
			}
			for(int i = 0; i < k; i++) {
				num ++;
				if(num > nums.size() - 1) {
					num -= nums.size();
				}
			}
			
		}
		System.out.println(sb);
	}

}
