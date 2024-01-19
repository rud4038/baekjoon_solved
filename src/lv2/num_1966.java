package lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

import java.util.StringTokenizer;

public class num_1966 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int count = 0;
			st = new StringTokenizer(br.readLine());
			
			LinkedList <int[]> q = new LinkedList<>();
			for(int j = 0; j < n; j++) {	
				q.offer(new int[] {j, Integer.parseInt(st.nextToken())});
			}
			
			while(!q.isEmpty()) {
				int [] documunt = q.poll();
				boolean check = true;
				
				for(int k = 0; k < q.size(); k++) {
					if(documunt[1] < q.get(k)[1]) {
						check = false;
						q.offer(documunt);
						break;
					}
				}
				
				if(check) {
					count ++;
					if(documunt[0] == m) break;
				}
				
			}
			
			sb.append(count + "\n");
			
		}
		
		System.out.println(sb);
		
	}
	
}
