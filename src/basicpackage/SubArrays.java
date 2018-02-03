package basicpackage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SubArrays {

	static int segment(int x, int[] arr) {
		int size = arr.length;
		int maximum = 0;

		if (x >= size) {
			int minimum = arr[0];
			for (int i = 1; i < size; ++i) {
				if (minimum > arr[i]) {
					minimum = arr[i];
				}
			}
			return minimum;
		} else {
			int number = 0;
			while (number + x <= size) {
				int minimum = arr[number];
				for (int i = number; i < number + x; ++i) {
					if (minimum > arr[i])
						minimum = arr[i];
				}
				if(maximum < minimum)
					maximum = minimum;
				++number;
			}
			return maximum;
		}
	}

	static int segment1(int x, int[] arr) {
		int size = arr.length;
		Arrays.sort(arr);

		if (x >= size) {
			return arr[0];
		} else {
			return arr[size - x];
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		final String fileName = null;
		BufferedWriter bw = null;
		if (fileName != null) {
			bw = new BufferedWriter(new FileWriter(fileName));
		} else {
			bw = new BufferedWriter(new OutputStreamWriter(System.out));
		}

		int res;
		int x;
		x = Integer.parseInt(in.nextLine().trim());

		int arr_size = 0;
		arr_size = Integer.parseInt(in.nextLine().trim());

		int[] arr = new int[arr_size];
		for (int i = 0; i < arr_size; i++) {
			int arr_item;
			arr_item = Integer.parseInt(in.nextLine().trim());
			arr[i] = arr_item;
		}

		res = segment1(x, arr);
		bw.write(String.valueOf(res));
		bw.newLine();

		bw.close();
	}
}
