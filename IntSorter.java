import java.util.Arrays;

public class IntSorter {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(1,"Gagana Sindhu", "KM");
		Employee e2 = new Employee(2,"Darshan", "KM");
		Employee e3 = new Employee(3,"Md", "Javid");
		Employee e4 = new Employee(4,"Honnura", "Swamy");
		
		Employee[] employees = {e1,e2,e3,e4};
		
		System.out.println("employees before sorting " + Arrays.toString(employees));
		Arrays.sort(employees);
		System.out.println("employees aftr sorting " + Arrays.toString(employees));
		
		
		
		
		
		
		
		
		
		
		
		
		
		int[] a = { 5, 3, 4, 8, 1 };

		System.out.println("a before sorting " + Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("a aftr sorting " + Arrays.toString(a));

		String[] names = { "Nanda", "Darshan", "Gagana", "Usha", "Javid" };

		System.out.println("a before sorting " + Arrays.toString(names));
		Arrays.sort(names);
		System.out.println("a aftr sorting " + Arrays.toString(names));
		
		
		

	}
}
