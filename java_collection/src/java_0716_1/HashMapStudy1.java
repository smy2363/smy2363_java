package java_0716_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapStudy1 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("�̼���",19990405);
		map.put("������",19990101);
		map.put("�念��",20110718);
		map.put("�̵�", 20051103);
		map.put("������",20091010); //�ߺ� �ȵ��� value���� ������
		map.put("�̼���",19990405);
		
		map.putIfAbsent("�念��",1222); // map�� Ű�� �����Ѵٸ� ���� ����
		
		System.out.println(map);
		
		// key�� ��Ī�Ǵ� value ���
		System.out.println(map.get("�̵�"));
		
		// ����
		map.replace("�̼���", 19760505);
		
		System.out.println(map);
		
		// Ȯ��
		
		System.out.println(map.containsKey("����ȣ"));
		System.out.println(map.containsValue(1222));
		System.out.println(map.isEmpty());
		System.out.println(map.size());
		
		// set �Ǵ� collection ��ȯ
		
		Set<String> keys = map.keySet();
		
		System.out.println(keys);
		for(String name:keys) {
			System.out.println(map.get(name));
		}
		
		List<Integer> birth = new ArrayList<>(map.values());
		System.out.println(birth);
		
		Set<Map.Entry<String, Integer>> entry = map.entrySet();
		System.out.println(entry);
		
		map.forEach((k,v) -> System.out.println(k+"  "+v) );
		
	}

}


/*
	
	HashMap
	- ���������� ��������ʴ´�.
	- key : value 
	- key �ߺ� ��� ���� �ʴ´�.
	- value �ߺ� ���
	- Map�� ���� �˻��� Ưȭ �Ǿ��ִ�.
	- �޸� ������ ���� �Һ��Ѵ�.
	- 
	
	
*/