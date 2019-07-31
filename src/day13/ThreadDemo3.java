package day13;

class Sample implements Runnable {

	// This method is automatically called when Thread is started
	@Override
	public void run() {
		
		System.out.println("Task 3");
		play();
		
	}

	void play() {
		
		System.out.println("Cricket");
		
	}
}

public class ThreadDemo3 {

	public static void main(String[] args) {

		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				System.out.println("Task 1");

			}
		};

		Runnable r2 = new Runnable() {

			@Override
			public void run() {
				System.out.println("Task 2");

			}
		};

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);

		Sample s = new Sample();
		Thread t3 = new Thread(s);

		t1.start();
		t2.start();
		t3.start();
	}

}
