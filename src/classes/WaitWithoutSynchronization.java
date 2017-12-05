package classes;

public class WaitWithoutSynchronization {

	public static void main(String[] args) throws InterruptedException {

		WaitWithoutSynchronization c = new WaitWithoutSynchronization();
		
		c.wait();

	}

}
