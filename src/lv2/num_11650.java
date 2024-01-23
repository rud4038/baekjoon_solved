package lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class num_11650 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int[][] dot = new int[n][2];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			dot[i][0] = Integer.parseInt(st.nextToken());
			dot[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(dot, (e1,e2) -> {
			if(e1[0] == e2[0]) {
				return e1[1] - e2[1];
			}else {
				return e1[0] - e2[0];
			}
		});
		
		for(int i = 0; i < n; i++) {
			sb.append(dot[i][0] + " " + dot[i][1] + "\n");
		}
		System.out.println(sb);

	}

}
