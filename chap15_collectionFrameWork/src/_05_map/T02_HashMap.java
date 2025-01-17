package _05_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class T02_HashMap {

	public static void main(String[] args) {
		// 키 = id, 값 = pw (3개를 hashMap 넣기) : map or hashmap
		HashMap<String, String> map = new HashMap<>();
		map.put("myId", "pw123");
		map.put("idZang", "password7");
		map.put("youId", "678910");
		
		// 사용자로부터 id와 pw를 받아서
		Scanner sc = new Scanner(System.in);
		// id가 map에 있나 확인, 없으면 "존재하지 않는 id입니다."
		// id가 있으면, pw를 확인
		// pw일치하며 "로그인 되었습니다."
		// pw가 일치하지 않으면 "비밀번호가 일치하지 않습니다."
		System.out.println("ID와 pass를 입력해주십시오.");

		String id = sc.next();
		String passwd = sc.next();
		System.out.println("입력하신 id : " + id);
		System.out.println("입력하신 pw : " + passwd); 
		if(map.containsKey(id)) {
			System.out.println("해당 id의 비번 : " + map.get(id));
			if(passwd.equals(map.get(id))) // 값 비교는 .equals 사용을 잊지 말자
				System.out.println("로그인 되었습니다.");
			else
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		else
			System.out.println("존재하지 않는 id입니다.");
	}

}
