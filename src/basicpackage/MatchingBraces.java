package basicpackage;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
import java.util.Stack;

public class MatchingBraces {

	static String[] braces(String[] values) {
		String[] result = new String[values.length];
		Map<String, String> pair = new HashMap<String, String>();
		boolean match = true;

		pair.put("{", "}");
		pair.put("(", ")");
		pair.put("[", "]");

		for (int i = 0; i < values.length; ++i) {
			Stack<String> stack = new Stack<String>();
			for (int j = 0; j < values[i].length(); ++j) {
				Character key = values[i].charAt(j);
				String val = pair.get(key.toString());
				if (val == null) {
					try {
						String res = stack.pop();
						if (!res.equals(key.toString())) {
							match = false;
							break;
						}
					} catch (Exception EmptyStackException) {
						match = false;
						break;
					}
				} else {
					stack.push(val);
				}
			}
			if (stack.isEmpty() && match) {
				result[i] = "YES";
			} else {
				result[i] = "NO";
			}
		}
		return result;
	}

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		String[] res;
		int values_size = 0;
		values_size = Integer.parseInt(in.nextLine().trim());

		String[] values = new String[values_size];
		for (int i = 0; i < values_size; i++) {
			String values_item;
			try {
				values_item = in.nextLine();
			} catch (Exception e) {
				values_item = null;
			}
			values[i] = values_item;
		}

		res = braces(values);
		for (int res_i = 0; res_i < res.length; res_i++) {
			System.out.println(res[res_i]);
		}
	}
}
