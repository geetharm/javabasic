package basicpackage;

import java.io.IOException;
import java.util.Scanner;

public class NumberComplement {

	static char flip(char number) {
		return (number == '0') ? '1' : '0';
	}

	static int getIntegerComplement(int n) {
		Integer number = n;
		String str = Integer.toBinaryString(number);
		StringBuilder complement = new StringBuilder(str.length());

		for(int i = 0; i < str.length(); ++i) {
			complement.append(flip(str.charAt(i)));	
		}
		return Integer.parseInt(complement.toString(), 2);
	}

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int res;
		int n;
		n = Integer.parseInt(in.nextLine().trim());
		res = getIntegerComplement(n);
		System.out.println(res);
	}
}
