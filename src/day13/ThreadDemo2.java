package day13;

class ThreadB extends Thread{
	
	@Override
	public void run() {
		System.out.println(currentThread().getName() + 
				" is running using Runnable interface!");
		
		for(int i = 0; i < 3; i++) {
			try {
				Thread.sleep(1000);
			} catch(Exception e) {
				System.out.println(e);
			}
			System.out.println(currentThread().getName() + ": " + i);
		}
	}
}

public class ThreadDemo2 {

	public static void main(String[] args) {
		
		ThreadB t1 = new ThreadB();
		ThreadB t2 = new ThreadB();
		ThreadB t3 = new ThreadB();
		ThreadB t4 = new ThreadB();
		ThreadB t5 = new ThreadB();
		t1.setName("thread t1");
		t2.setName("thread t2");
		t3.setName("thread t3");
		t4.setName("thread t4");
		t5.setName("thread t5");
		
		t1.start();
		t2.start();
		t3.start();
		try {
			// This ensures t3 thread finishes executing 
			// before other threads start
			t1.join();
			t3.join();	
		} catch (Exception e) {
			System.out.println(e);
		}
		t4.start();
		t5.start();

	}

}
