package c2_linkedlist;

import java.util.*;

public class LinkedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("<---------------  List of String  --------------->");
		List<String> liststr = new LinkedList<String>();
		liststr.add("Mango");
		liststr.add("Apple");
		liststr.add("Banana");
		liststr.add("Grapes");
		for (String fruit : liststr) {
			System.out.println("String  ==>  " + fruit);
		}

		System.out.println("<---------------  List of Integer  --------------->"); 
		List<Integer> listNum = new LinkedList<Integer>();
		listNum.add(10);
		listNum.add(40);
		listNum.add(60);
		listNum.add(1000);
		for (Integer numbers : listNum) {
			System.out.println("Integer  ==>  " + numbers);
		}
		
		System.out.println("<---------------  List of Double  --------------->"); 
		List<Double> listDouble = new LinkedList<Double>();
		listDouble.add(10.01);
		listDouble.add(110.406);
		listDouble.add(64.22);
		listDouble.add(102.65);
		for (Double numbers : listDouble) {
			System.out.println("Double  ==>  " + numbers);
		}

	}

}
