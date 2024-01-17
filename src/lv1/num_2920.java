package lv1;

import java.util.Scanner;

public class num_2920 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] nums = new int[8];
		String answer = "";
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = scanner.nextInt();
		}
		
		if(nums[0] == 1) {
			answer = "ascending";
			for(int i = 0; i < nums.length-1; i++) {
				
				if(nums[i + 1] == nums[i] + 1) {
					continue;
				}else {
					answer = "mixed";
					break;
				}
				
			}
		}else if(nums[0] == 8) {
			answer = "descending";
			
			for(int i = 0; i < nums.length-1; i++) {
				
				if(nums[i + 1] == nums[i] - 1) {
					continue;
				}else {
					answer = "mixed";
					break;
				}
				
			}
		}else {
			answer = "mixed";
		}
		
		System.out.println(answer);
	}
}
