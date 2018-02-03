package basicpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ReverseString {
	
	public void convertStringToNum(String input) {
		int number = 0;
	}

	public void removeDupWithoutSet(int[] array) {
		
		int j = 0;
		int i = 1;
		while(i < array.length) {
			if(array[i] == array[j]) {
				i++;
			} else {
				array[++j] = array[i++];
			}
		}

		int[] output = new int[j+1];

		for(int k = 0; k < output.length; ++k) {
			output[k] = array[k];
			System.out.println(output[k]);
		}
	}
	
	public void removeDuplicate(int[] array) {
		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < array.length; ++i) {
			set.add(array[i]);
		}
		System.out.println(set);
	}

	public String reverse(String input) {
		StringBuilder sb = new StringBuilder();
		for (int i = input.length() - 1; i >= 0; i--) {
			sb.append(input.charAt(i));
		}
		System.out.println(input);
		System.out.println(sb.toString());
		return sb.toString();
	}

	public void swapNumbers(int a, int b) {
		System.out.println("Numbers before swap:" + a + " " + b);

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Numbers after swap:" + a + " " + b);
	}

	public void sortMap() {
		Map<String, String> pair = new HashMap<String, String>();

		pair.put("abcd", "one");
		pair.put("efgh", "two");
		pair.put("ijkl", "three");
		pair.put("mnop", "four");
		pair.put("qrst", "five");

		List<Map.Entry<String, String>> list = new ArrayList<>();
		list.addAll(pair.entrySet());

		Set<String> set = pair.keySet();
		set.addAll(pair.keySet());
		Collections.sort(list, new MapComparator());
		System.out.println(list);
	}

	static class MapComparator implements Comparator<Map.Entry<String, String>> {

		@Override
		public int compare(Map.Entry<String, String> arg0, Map.Entry<String, String> arg1) {

			return arg0.getValue().compareTo(arg1.getValue());
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ReverseString rString = new ReverseString();

		// String input = sc.nextLine();
		// String output = rString.reverse(input);
		// int a = Integer.parseInt(sc.nextLine());
		// int b = Integer.parseInt(sc.nextLine());
		// rString.swapNumbers(a, b);

		// rString.sortMap();

//		int n = Integer.parseInt(sc.nextLine());
//		int[] array = new int[n];
//
//		for (int i = 0; i < n; ++i) {
//			array[i] = Integer.parseInt(sc.nextLine());
//		}
//		
//		rString.removeDupWithoutSet(array);

		rString.convertStringToNum("200");
		sc.close();
	}
}
