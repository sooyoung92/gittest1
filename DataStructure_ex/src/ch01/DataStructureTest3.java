package ch01;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class DataStructureTest3 {

	public static void main(String[] args) {

		Map map0;

		// key 와 value 구조로 데이터를 저장한다. null값도 허용
		HashMap<String, String> map1 = new HashMap<String, String>();

		// null 값을 허용하지 않는다.
		Hashtable<String, String> map2 = new Hashtable<>();

		// 값을 추가 하는 방법
		map1.put("A01", "김포공항 정문");
		map1.put("A02", "김포공항 후문");
		map1.put("A03", "김포공항 로비");
		map1.put("B01", "인천공항 정문");
		map1.put("B02", "인천공항 후문");
		map1.put("B03", "인천공항 로비");
		map1.put("C01", null);
		System.out.println(map1);

//		map2.put("D01", null);
		System.out.println(map2);
		System.out.println("---------------------------------------------");

		// 값을 출력 방법
		System.out.println(map1.get("A01"));
		System.out.println(map1.get("A02"));
		System.out.println(map1.get("A03"));
		System.out.println("---------------------------------------------");

		// 삭제 방법
		System.out.println(map1.remove("C01"));
		System.out.println(map1);
//		map1.clear();
//		System.out.println(map1);

		// 사이즈 확인 방법
		System.out.println(map1.size());

		// for 문 사용방법
		// java.util.Map.Entry 키와 값을 동시에 접근하여 사용가능
		for (Entry<String, String> entry : map1.entrySet()) {
			System.out.println("key : " + entry.getKey() + "value : " + entry.getValue());
		}
		System.out.println("---------------------------------------------");

		for (String key : map1.keySet()) {
			System.out.println(key + " : " + map1.get(key));
		}

	}

}
