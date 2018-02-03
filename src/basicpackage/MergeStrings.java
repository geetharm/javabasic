package basicpackage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MergeStrings {

	static String mergeStrings(String a, String b) {

	       if(a == null || a.isEmpty())
	            return b;
	        if(b == null || b.isEmpty())
	            return a;
	        
		StringBuilder sb = new StringBuilder();
		int size = (a.length() > b.length() ? a.length() : b.length());
		for (int index = 0; index < size; ++index) {
			if (index < a.length()) {
				sb.append(a.charAt(index));
			}
			if (index < b.length()) {
				sb.append(b.charAt(index));
			}
		}

		return sb.toString();

	}

	public static void main(String[] args) {

		System.out.println(mergeStrings("abc", "defgh"));
	}

}
