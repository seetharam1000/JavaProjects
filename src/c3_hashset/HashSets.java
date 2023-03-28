package c3_hashset;

import java.util.*;

public class HashSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("<---------------  String  --------------->");
		Set<String> hash_Set = new HashSet<String>();
        hash_Set.add("Java");
        hash_Set.add("C");
        hash_Set.add("C++");
        hash_Set.add("Java");
        hash_Set.add("C++");
        
       Iterator<String> iterate = hash_Set.iterator();
       while(iterate.hasNext()) {
    	   System.out.println(iterate.next());
       }
        
		System.out.println("<---------------  Integer  --------------->"); 
		Set<Integer> listNum = new HashSet<Integer>();
		listNum.add(10);
		listNum.add(40);
		listNum.add(60);
		listNum.add(40);
		listNum.add(1000);
		for (Integer numbers : listNum) {
			System.out.println("Integer  ==>  " + numbers);
		}
		
		System.out.println("<---------------  Double  --------------->"); 
		Set<Double> listDouble = new HashSet<Double>();
		listDouble.add(10.01);
		listDouble.add(110.406);
		listDouble.add(64.22);
		listDouble.add(110.406);
		listDouble.add(64.22);
		listDouble.add(102.65);
		for (Double numbers : listDouble) {
			System.out.println("Double  ==>  " + numbers);
		}

	}

}
