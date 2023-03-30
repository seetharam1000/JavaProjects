package e2_logics;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateCharacters {

    public static void main(String[] args) {
        // TODO Auto-generated method stub


		/**-----------------------  Method 1  -----------------**/
		String input;

		input = "google rocks";
		System.out.println("\nInput string is:"+input);
		duplicateChars(input);

		/**-----------------------  Method 2  -----------------**/
        input = "JavaJavaEE";

        // convert string into stream
        Map<Character, Long> result = input
                .chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        result.forEach((k, v) -> {
            if (v > 1) {
                System.out.println(k + " : " + v);
            }
        });

		/**-----------------------  Method 3  -----------------**/
		Stream<Integer> stream
				= Stream.of(5, 13, 4,
				21, 13, 27,
				2, 59, 59, 34);

		// Print the found duplicate elements
		System.out.println(
				findDuplicateInStream(stream));
    }

	public static final void duplicateChars(String input) {

		char []chInput = input.toCharArray();
		Set setDuplicated = new HashSet<>();
		Set distinctChars = new HashSet<>();

		for(char ch: chInput) {
			if(distinctChars.add(ch) == false)
				setDuplicated.add(ch);
		}

		setDuplicated.forEach(ch -> System.out.print("Duplicate characters are: " +ch));
	}

	public static <T> Set<T>
	findDuplicateInStream(Stream<T> stream)
	{

		// Set to store the duplicate elements
		Set<T> items = new HashSet<>();

		// Return the set of duplicate elements
		return stream

				// Set.add() returns false
				// if the element was
				// already present in the set.
				// Hence filter such elements
				.filter(n -> !items.add(n))

				// Collect duplicate elements
				// in the set
				.collect(Collectors.toSet());
	}

}
