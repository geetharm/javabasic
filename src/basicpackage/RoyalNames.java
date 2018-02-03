package basicpackage;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RoyalNames {

	static private Map<Character, Integer> pair = new HashMap<Character, Integer>(){{
		put('L', 50);
		put('X', 10);
		put('V', 5);
		put('I', 1);
	}};

	static class RoyalNameComparator implements Comparator<String> {

		int toInt(String romanNumber) {
			int number = 0;
			int prev = 0;
			for (int j = romanNumber.length()-1; j >= 0; j--) {
				try {
					int curr = pair.get(romanNumber.charAt(j));
					if(curr < prev)
						number -= curr;
					else
						number += curr;
					prev = curr;
				} catch (Exception e) {
					System.out.println("Exception caught" + e.getMessage());
				}
			}
			System.out.println(number + " " + romanNumber);
			return number;
		}

		@Override
		public int compare(String arg0, String arg1) {

			String[] splitNames = arg0.split(" ");
			String[] splitNames1 = arg1.split(" ");

			if((splitNames.length != 2) || (splitNames1.length != 2)) {
				return arg0.compareTo(arg1);
			}
			
			if(splitNames[0].equals(splitNames1[0])) {
				int firstSuffix = toInt(splitNames[1]);
				int secondSuffix = toInt(splitNames1[1]);
				
				return firstSuffix-secondSuffix;
			} else {
				return arg0.compareTo(arg1);
			}
		}
	}
	
	
	static String[] getSortedList(String[] names) {
		Arrays.sort(names, new RoyalNameComparator());
		return names;
	}

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		String[] res;
		int names_size = 0;
		names_size = Integer.parseInt(in.nextLine().trim());

		String[] names = new String[names_size];
		for (int i = 0; i < names_size; i++) {
			String names_item;
			try {
				names_item = in.nextLine();
			} catch (Exception e) {
				names_item = null;
			}
			names[i] = names_item;
		}
		res = getSortedList(names);
		for (int res_i = 0; res_i < res.length; res_i++) {
			System.out.println(res[res_i]);
		}
	}
}
