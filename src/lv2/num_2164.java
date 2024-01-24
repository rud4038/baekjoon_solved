package lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;


public class num_2164 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Queue<Integer> nums = new LinkedList<Integer>();
		
		for(int i = 1; i < n + 1; i++) {
			nums.offer(i);
		}
		
		while(nums.size() > 1) {
			nums.poll();
			nums.offer(nums.poll());
		}
		System.out.println(nums.peek());
		

	}

}
