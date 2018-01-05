package executorFrameworkDemo;

public class WorkerThread implements Runnable {

	private String command;
	

	public WorkerThread(String command) {
		super();
		this.command = command;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" Executing Command : "+this.command);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" Finished Execution ");
	}

	@Override
	public String toString() {
		
		return command;
	}
	
	
}
