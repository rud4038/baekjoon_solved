package lv2;

import java.util.Arrays;
import java.util.Scanner;

public class num_4153 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] nums = new int[3];
		while(true) {
			
			int count = 0;
			
			for(int i = 0; i < nums.length; i++) {
				nums[i] = scanner.nextInt();
				
				if(nums[i] == 0) count ++;
			}
			if(count == 3) break;
			
			Arrays.sort(nums);
			
			if(Math.pow(nums[0], 2) + Math.pow(nums[1], 2) == Math.pow(nums[2], 2)) {
				System.out.println("right");
			}else {
				System.out.println("wrong");
			}			
		}
	}
}
