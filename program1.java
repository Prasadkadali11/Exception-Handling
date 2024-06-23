package excepetionHandling;

public class program1 {
	public static void main(String[] args) {
		System.out.println("Program excution start");
		int f = 100;
		int s = 0;
		int result = 0;
		try {
			result = f/s; 
		}
		catch (ArithmeticException ae) {
			System.out.println(ae.toString());
		}
		finally {
			System.out.println("finally block");
		}
		System.out.println("output is :-"+result);
		System.out.println("program execution end");

	}
}

