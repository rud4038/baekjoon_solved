package lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class num_10773 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> nums = new ArrayList<>();
		
		int k = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < k; i++) {
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0) {
				nums.remove(nums.size()-1);
			}else {
				nums.add(n);
			}
			
		}
		int sum = 0;
		for(int n : nums) {
			sum += n;
		}
		System.out.println(sum);
		
	}
}
