package c0_generic_non_generic;


import java.util.ArrayList;
import java.util.List;

public class Non_Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List countries = new ArrayList<>();
		countries.add(1);
		countries.add("Newsland");
		countries.add(2.0);
		countries.add("Australia");

		for (int i = 0; i < countries.size(); i++) {
			System.out.println("Country "+i+" ==> "+countries.get(i));
		}
	}

}
