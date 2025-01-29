import java.util.Scanner;

public class StringsDemo {

	public static void main(String[] args) {

		// string pool
		// immutable

		String s = new String();
		String s1 = new String("abc");
		String s3 = "abc";

		System.out.println(s); // abc
		System.out.println(s1); // abc
		System.out.println(s3.length());// 3

		String s4 = s3.concat(s1);

		// String builder
		StringBuilder sb = new StringBuilder("123");
		sb.append(s1);
		System.out.println(sb); // 123abc

		Employee e = new Employee();
		e.setFirstName("Nanda");
		e.setId(1);
		e.setLastName("Kumar");
		System.out.println(e);

		Scanner scanner = new Scanner(System.in);
//		System.out.println(scanner);

		int[] a = new int[5];
		System.out.println(a); // [I@15db9742
	}

}
