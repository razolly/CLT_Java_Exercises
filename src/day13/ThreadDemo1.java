package day13;

class ThreadA extends Thread {
	
	@Override
	public void run() {
		System.out.println("Thread is running!");;
	}
	
}

public class ThreadDemo1 {

	public static void main(String[] args) {

		ThreadA ta = new ThreadA();
		Thread t = new Thread(ta);
		
		// Once we call start(), run() is invoked automatically
		t.start();
		
		//ta.start();	// Bad practice
		//ta.run();		// Bad practice as there is no thread
		//t.run();		// Bad practice
	}

}
