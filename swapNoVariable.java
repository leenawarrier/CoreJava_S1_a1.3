import java.util.Scanner;

class swapNoVariable {
	public static void main(String arg[]) {
		int a, b;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the two Integer numbers to swap :");
		a = s.nextInt();
		b = s.nextInt();
		System.out.println("\nThe two number before swap a="+a+" and b="+b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("The two numbers after swap a="+a + " and b="+b);
	}
}
