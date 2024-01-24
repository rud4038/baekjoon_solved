package lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class num_10845 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Queue<Integer> nums = new LinkedList<Integer>();
		
		int n = Integer.parseInt(br.readLine());
		
		int a = 0;
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			
			if(str.equals("push")) {
				a = Integer.parseInt(st.nextToken());
				nums.offer(a);
			}else if(str.equals("pop")) {
				
				if(nums.isEmpty()) {
					sb.append("-1\n");
				}else {
					sb.append(nums.poll() + "\n");					
				}
				
			}else if(str.equals("size")) {
				sb.append(nums.size() + "\n");
			}else if(str.equals("empty")) {
				
				if(nums.isEmpty()) {
					sb.append("1\n");
				}else {
					sb.append("0\n");
				}
				
			}else if(str.equals("front")) {
				
				if(nums.isEmpty()) {
					sb.append("-1\n");
				}else {
					sb.append(nums.peek() + "\n");
				}
				
			}else if(str.equals("back")) {
				
				if(nums.isEmpty()) {
					sb.append("-1\n");
				}else {
					sb.append(a + "\n");
				}
				
			}
			
		}
		
		System.out.println(sb);
		

	}

}
