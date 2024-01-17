package lv2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class num_2798 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int answer= 0;
		Integer[] nums = new Integer[n];
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = scanner.nextInt();
		}
		Arrays.sort(nums,Collections.reverseOrder());
		for(int i = 0; i < nums.length-2; i++) {
			for(int j = i + 1; j < nums.length-1;j++) {
				for(int k = j + 1; k < nums.length; k++) {
					int sum = nums[i] + nums[j] + nums[k];
					if(m >= sum) {
						if(answer <= sum) {
							answer = sum;
						}
					}
				}
			}
		}
		System.out.println(answer);			
		
	}
}
