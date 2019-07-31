package day13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable {

	public WorkerThread(String message) {
		System.out.println(message);
	}

	@Override
	public void run() {
		
	}
	
}

/*
 * Java thread pool represents a group of worker threads that are waiting for
 * tasks and can be used repeatedly
 * 
 * In the case of thread pool, a group of fixed size is created A thread from
 * the thread pool is pulled out and assigned a job by the service provider After
 * completion of the job, thread is contained in the thread pool again
 * 
 * This offers better performance as there is no need to create new threads
 */

public class ThreadPoolDemo {

	public static void main(String[] args) {

		// Create a pool of 5 threads
		ExecutorService executor = Executors.newFixedThreadPool(5);

		for (int i = 0; i < 5; i++) {
			Runnable worker = new WorkerThread(" " + i);
			executor.execute(worker);
		}

		executor.shutdown();
		while (!executor.isTerminated()) {

		}

	}

}
