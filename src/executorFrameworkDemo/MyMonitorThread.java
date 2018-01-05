package executorFrameworkDemo;

import java.util.concurrent.ThreadPoolExecutor;

public class MyMonitorThread implements Runnable {

	private ThreadPoolExecutor tpe;
	private String cmd;
	private boolean run = true;

	public MyMonitorThread(ThreadPoolExecutor tpe, String cmd) {
		super();
		this.tpe = tpe;
		this.cmd = cmd;
	}

	@Override
	public void run() {

		while (run) {

			System.out.println("Running monitor Thread, current state of Thread pool is \n"
					+ "Active Count in Thread Pool : " + tpe.getActiveCount() +"\n" 
					+"Pool size in Thread Pool : "+ tpe.getPoolSize() +"\n"
					+ "Max Pool size in Thread Pool : " + tpe.getMaximumPoolSize()+"\n"
					+ "Completed Task Count in Thread Pool : " + tpe.getCompletedTaskCount()+"\n"
					+ "Core Pool size in Thread Pool : " + tpe.getCorePoolSize()+"\n"
					+ "Task count in Thread Pool : "+ tpe.getTaskCount()+"\n");

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void shutdown() {
		this.run = false;
	}
}
