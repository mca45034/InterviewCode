package String;

public class CompareMethods {

	public static void main(String[] args) {

		String name1 = "Neeraj";
		String name2 = "Neeraj";
		String name3 = "Rathore";
		String name4 = new String("Neeraj");
		String name5 = new String("Neeraj");
		String name6 = new String("Rathore");

		System.out.println(name1 == name2);
		System.out.println(name1 == name3);
		System.out.println(name1 == name4);
		System.out.println(name1 == name6);

		System.out.println(name1.equals(name2));
		System.out.println(name1.equals(name3));
		System.out.println(name1.equals(name4));
		System.out.println(name1.equals(name6));

	}

}
