package executorFrameworkDemo;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueDemo {

	public static void main(String args[]) {
		
		BlockingQueue queue = new ArrayBlockingQueue<>(1024);
		
		Producer p = new Producer(queue);
		Consumer c = new Consumer(queue);
		
		new Thread(p).start();
		new Thread(c).start();
		
		
	}
	
	
}
