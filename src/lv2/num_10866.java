package lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class num_10866 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		Deque<Integer> d = new LinkedList<Integer>();
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String str = st.nextToken();
			
			if(str.equals("push_front")) {
				d.addFirst(Integer.parseInt(st.nextToken()));
			}else if(str.equals("push_back")) {
				d.addLast(Integer.parseInt(st.nextToken()));
			}else if(str.equals("pop_front")) {
				
				if(d.isEmpty()) {
					sb.append("-1\n");
				}else {
					sb.append(d.pollFirst() + "\n");
				}
				
			}else if(str.equals("pop_back")) {
				
				if(d.isEmpty()) {
					sb.append("-1\n");
				}else {
					sb.append(d.pollLast() + "\n");
				}
				
			}else if(str.equals("size")) {
				sb.append(d.size() + "\n");
			}else if(str.equals("empty")) {
				
				if(d.isEmpty()) {
					sb.append("1\n");
				}else {
					sb.append("0\n");
				}
				
			}else if(str.equals("front")) {
				if(d.isEmpty()) {
					sb.append("-1\n");
				}else {
					sb.append(d.peekFirst() + "\n");
				}
				
			}else if(str.equals("back")) {
				if(d.isEmpty()) {
					sb.append("-1\n");
				}else {
					sb.append(d.peekLast() + "\n");
				}
				
			}
			
		}
		System.out.println(sb);

	}

}
