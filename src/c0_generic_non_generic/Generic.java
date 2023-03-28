package c0_generic_non_generic;

import java.util.*;

public class Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> countries = new ArrayList<>();
		countries.add("Canada");
		countries.add("Newsland");
		countries.add("Singapore");
		countries.add("Australia");

		for (int i = 0; i < countries.size(); i++) {
			System.out.println("Country "+i+" ==> "+countries.get(i));
		}
	}

}
