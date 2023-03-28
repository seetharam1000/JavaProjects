package e1_j8_map;

import java.util.*;

public class MapLamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Map<String, String> mapVal = new HashMap<>();
		mapVal.put("id", "1");
		mapVal.put("name", "Vinoth");
		mapVal.put("Designation", "Manager");
		
		mapVal.forEach((k, v) -> System.out.println("Key " + k
	            + " and Values is: " + v));
		
		mapVal.forEach((i,j) -> {
			System.out.println("key ==> "+i+"  -  " +"value  -==>"+ j);
		});
		
	}
}
