package lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class num_10814 {


	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb =new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		List<Member> members = new ArrayList<Member>();
		
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			members.add(new Member(i, age , name));
		}
		Collections.sort(members, (e1,e2) -> {
			if(e1.age == e2.age) {
				return e1.number - e2.number;
			}else {
				return e1.age - e2.age;
			}
		});
		
		for(Member m : members) {
			sb.append(m.age + " " + m.name + "\n");
		}
		System.out.println(sb);

	}

}

	class Member {
	public int number;
	public int age;
	public String name;
	
	public Member(int number, int age, String name) {
		this.number = number;
		this.age = age;
		this.name = name;
	}
}
