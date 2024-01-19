package lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num_1018 {
	
	public static boolean[][] check;
	public static int min = 64;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		check = new boolean[n][m];
		
		for(int i = 0; i < n; i++) {
			String str = br.readLine();
			for(int j = 0; j < m; j++) {
				
				if(str.charAt(j) == 'W') {
					check[i][j] = true;
				}else {
					check[i][j] = false;
				}
				
			}
		}
		
		int n_start = n - 7;
		int m_start = m - 7;
		
		for(int i = 0; i < n_start; i++) {
			for(int j = 0; j < m_start; j++) {
				find(i,j);
			}
		}
		System.out.println(min);

	}
	
	public static void find(int n, int m) {
		
		int n_end = n + 8;
		int m_end = m + 8;
		int count = 0;
		
		boolean t = check[n][m];
		
		for(int i = n; i < n_end; i++) {
			for(int j = m; j < m_end; j++) {
				
				if(t != check[i][j]) {
					count ++ ;
				}
				
				t = !t;
				
			}
			t = !t;
		}
		
		count = Math.min(count, 64 - count);
		
		min = Math.min(min, count);
		
	}

}
