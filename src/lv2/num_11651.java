package lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class num_11651 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int n = Integer.parseInt(br.readLine());
		int [][] nums = new int[n][2];
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			nums[i][0] = Integer.parseInt(st.nextToken());
			nums[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(nums, (e1, e2) ->{
			if(e1[1] == e2[1]) {
				return e1[0] - e2[0];
			}else {
				return e1[1] - e2[1];
			}
		});
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			sb.append(nums[i][0] + " " + nums[i][1] + "\n");
		}
		System.out.println(sb);
	}

}
