package executorFrameworkDemo;

import java.util.concurrent.BlockingQueue;
@SuppressWarnings("rawtypes")
public class Producer implements Runnable{
    
	protected BlockingQueue queue = null;

    public Producer(BlockingQueue queue) {
        this.queue = queue;
    }

    @SuppressWarnings("unchecked")
	public void run() {
        try {
        	System.out.println("Putting in Queue");
            queue.put("1");
            Thread.sleep(1000);
            queue.put("2");
            Thread.sleep(1000);
            queue.put("3");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finished Putting in queue");
    }
}