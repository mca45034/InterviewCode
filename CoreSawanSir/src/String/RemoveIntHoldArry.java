package String;

import java.util.Arrays;

public class RemoveIntHoldArry {

	public static void main(String[] args) {
		String name = "rays1234";
		String result = "";

		char[] ch = name.toCharArray();
		for (int i = 0; i < name.length(); i++) {
			if (Character.isDigit(ch[i])) {
				result = result + (ch[i]);

			}
		}
		char[] x = result.toCharArray();
		System.out.println(Arrays.toString(x));

	}

}
