package c1_arraylist;

import java.util.*;

public class ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("<---------------  List of String  --------------->");
		List<String> liststr = new ArrayList<String>();
		liststr.add("Mango");
		liststr.add("Apple");
		liststr.add("Banana");
		liststr.add(null);
		liststr.add("Grapes");
		liststr.add("Apple");
		liststr.add("Banana");
		liststr.add(null);

		for (int i = 0; i < liststr.size(); i++) {
			System.out.println(liststr.get(i));
		}
		
		for (String fruit : liststr) {
			System.out.println("String  ==>  " + fruit);
		}

		System.out.println("<---------------  List of Integer  --------------->");
		List<Integer> listNum = new ArrayList<Integer>();
		listNum.add(10);
		listNum.add(40);
		listNum.add(60);
		listNum.add(1000);
		
		for (int i = 0; i < listNum.size(); i++) {
			System.out.println(listNum.get(i));
		}
		
		for (Integer numbers : listNum) {
			System.out.println("Integer  ==>  " + numbers);
		}

		System.out.println("<---------------  List of Double  --------------->");
		List<Double> listDouble = new ArrayList<Double>();
		listDouble.add(10.01);
		listDouble.add(110.406);
		listDouble.add(64.22);
		listDouble.add(102.65);
		
		for (int i = 0; i < listDouble.size(); i++) {
			System.out.println(listDouble.get(i));
		}
		
		for (Double numbers : listDouble) {
			System.out.println("Double  ==>  " + numbers);
		}

	}

}
