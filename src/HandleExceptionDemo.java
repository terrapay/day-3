
public class HandleExceptionDemo {
	public static void main(String[] args) {
		try {
//			int a = 1/0;
			System.out.println("in try block");
//			throw new StackOverflowError();// can't recover even with try-catch
		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("always called");
		}
		System.out.println("this is a line");
	}
	
}
