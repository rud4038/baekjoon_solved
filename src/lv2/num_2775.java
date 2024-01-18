package lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num_2775 {

	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		int[][] nums = new int[15][15];
		
		for(int i = 0; i < 15; i++) {
			nums[i][1] = 1;
			nums[0][i] = i;
		}
		
		for(int i = 1; i < 15; i++) {
			for(int j = 2; j < 15; j++) {
				nums[i][j] = nums[i][j - 1] + nums[i - 1][j];
			}
		}
		for(int i = 0; i < t; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			sb.append(nums[k][n] + "\n");	
		}
		System.out.println(sb);
		
	}

}
