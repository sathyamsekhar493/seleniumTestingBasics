package Javapractise;

public class Swapping {

	public static void main(String[] args) {
		int a = 2, b = 20;
		a = a + b;
		System.out.println(a);
		b = a - b;																											
		System.out.println(b);
		a = a - b;
		System.out.println("After swapping a =" + a + " b=" + b);
	}

	public void method() {
		int a = 2, b = 20, temp = 0;
		temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping a =" + a + " b=" + b);

	}

}
