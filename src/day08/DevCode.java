package day08;

public class DevCode {

	static void logic(int number) {

		try {
//			int temp = number / 0;
//			System.out.println(temp);
//
//			int[] array = { 10, 20, 30, 40, 50 };
//			array[50] = 10;
//			System.out.println(array[50]);

			Integer i = null;
			System.out.println(i.toString());

		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by 0");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Handled arrayindexoutofboundsexception");
		} catch (Exception e) {
			System.out.println("Exception is the superclass of all exceptions");
		} finally {
			System.out.println("Closing file...");
		}

	}
}
