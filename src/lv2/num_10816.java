package lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class num_10816 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int[] nums = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(nums);
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < m; i++) {
			int key = Integer.parseInt(st.nextToken());
			
			sb.append((hi(nums, key) - low(nums,key)) + " ");
		}
		
		System.out.println(sb);
	}
	
	public static int low(int[] nums, int key) {
		int lo = 0;
		int hi = nums.length;
		
		
		
		while(lo < hi) {
			
			int mid = (lo + hi) / 2 ;
			
			if(key <= nums[mid]) {
				hi = mid;
			}else {
				lo = mid + 1;
			}
		}
		
		return lo;
		
	}
	
	public static int hi(int[] nums, int key) {
		int lo = 0;
		int hi = nums.length;
		
		
		
		while(lo < hi) {
			
			int mid = (lo + hi) / 2 ;
			
			if(key < nums[mid]) {
				hi = mid;
			}else {
				lo = mid + 1;
			}
		}
		
		return lo;
		
	}
		

}
