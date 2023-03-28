package c7_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> hm = new HashMap<>();
		hm.put("id", "1");
		hm.put("name", "Suresh");
		hm.put("designation", "Software engg");
		System.out.println(hm.get("id"));

		for (Map.Entry<String, String> mapVal : hm.entrySet()) {
			System.out.println("Key   ==> " + mapVal.getKey() +
					"  Value   ==> " + mapVal.getValue());
		}

		// using keySet() for iteration over keys
		for (String name : hm.keySet()) {
			String value = hm.get(name);
			System.out.println("key: " + name + " Value: " + value);
		}

		// using values() for iteration over values
		for (String url : hm.values()) {
			System.out.println("value: " + url);
		}

		// Using while loop
		Iterator<Map.Entry<String, String>> itr = hm.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<String, String> entry = itr.next();
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
	}
}
