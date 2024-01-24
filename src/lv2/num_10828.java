package lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class num_10828 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		Stack<Integer> s = new Stack<Integer>();
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			
			if(str.equals("push")) {
				s.add(Integer.parseInt(st.nextToken()));
			}else if (str.equals("pop")) {
				
				if(s.isEmpty()) {
					sb.append("-1\n");
				}else {
					sb.append(s.pop() + "\n");
				}
				
			}else if (str.equals("size")) {
				sb.append(s.size() + "\n");
			}else if (str.equals("empty")) {
				
				if(s.isEmpty()) {
					sb.append("1\n");
				}else {
					sb.append("0\n");
				}
				
			}else if (str.equals("top")) {
				if(s.isEmpty()) {
					sb.append("-1\n");
				}else {
					sb.append(s.peek() +"\n");
				}
			}
			
		}
		System.out.println(sb);
		
		
	}

}
