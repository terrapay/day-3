class A extends RuntimeException {

}

class B extends A {

}

public class Hierarchy {
	public static void main(String[] args) {
		try {
			method1();
		} catch (B e) {//first child exception class
			System.out.println("B was handled");
		} catch (A e) {
			System.out.println("A was handled");
		}
	}

	private static void method1() {
		throw new A();
	}
}
