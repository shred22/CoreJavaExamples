package executorFrameworkDemo;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class WorkerPool {

	public static void main(String arsg[]) throws InterruptedException {
		
		RejectedExecutionHandlerImpl rejectionHandler = new RejectedExecutionHandlerImpl();
		ThreadFactory factory = Executors.defaultThreadFactory();
		
		ThreadPoolExecutor tpe = new ThreadPoolExecutor(2, //corePoolSize - the number of threads to keep in the pool, even if they are idle, unless allowCoreThreadTimeOut is set
				4,//maximumPoolSize - the maximum number of threads to allow in the pool
				1, //when the number of threads is greater than the core, this is the maximum time that excess idle threads will wait for new tasks before terminating.
				TimeUnit.MILLISECONDS, //unit - the time unit for the keepAliveTime argument
				new ArrayBlockingQueue<>(2),//workQueue - the queue to use for holding tasks before they are executed. This queue will hold only the Runnable tasks submitted by the execute method.
				factory, //threadFactory - the factory to use when the executor creates a new thread
				rejectionHandler ); // handler - the handler to use when execution is blocked because the thread bounds and queue capacities are reached
		
		MyMonitorThread monitorThread = new MyMonitorThread(tpe, "");
		new Thread(monitorThread).start();
		
		for (int i = 0; i < 8; i++) {
			tpe.execute(new WorkerThread("Command "+i));
		}
			Thread.sleep(30000);
	        //shut down the pool
	        tpe.shutdown();
	        //shut down the monitor thread
	        Thread.sleep(5000);
	        monitorThread.shutdown();
	}
}
