package day13;

import java.util.Random;

class Reserve implements Runnable {

	static int available = 50;
	int wanted;

	public Reserve(int wanted) {
		this.wanted = wanted;
	}

	@Override
	public void run() {

		// Randomize sleep time 
		Random rand = new Random();
		try {
			Thread.sleep(rand.nextInt(1000) + 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		synchronized (this) {
			System.out.println("Available seats: " + available);
			reserveSeat();
		}

	}

	public synchronized void reserveSeat() {
		
		if (available >= wanted) {
			String name = Thread.currentThread().getName();
			System.out.println(wanted + " seats booked for " + name);

			try {
				Thread.sleep(1000);
				available -= wanted;
			} catch (Exception e) {

			}

		} else {
			System.out.println("Sorry.. insufficient seats");
		}
	}
}

public class SynchronizedDemo01 {

	public static void main(String[] args) {

		Reserve r1 = new Reserve(20);
//		Reserve r2 = new Reserve(2);
//		Reserve r3 = new Reserve(3);

		Thread t1 = new Thread(r1); // Razli
		Thread t2 = new Thread(r1); // Sulianto
		Thread t3 = new Thread(r1); // Kar

		t1.setName("Razli");
		t2.setName("Sulianto");
		t3.setName("Kar");

		t1.start();
		t2.start();
		t3.start();

	}

}
