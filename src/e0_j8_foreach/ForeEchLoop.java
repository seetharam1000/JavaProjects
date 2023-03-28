package e0_j8_foreach;

import java.util.*;
public class ForeEchLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> lst = new ArrayList<>();
		lst.add("Apple");
		lst.add("Mango");
		lst.add("Orange");
		lst.add("Pineapple");
		
		//without lamda
		lst.forEach(System.out::println);
		
		//with lamda
		lst.forEach(i -> System.out.println(i));
		
		//For more logics
		lst.forEach(i -> {
			String name = "Fruit";
			System.out.println(name+"  ==> "+i);	
		});
		
	}

}
