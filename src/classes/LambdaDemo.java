package classes;

@FunctionalInterface
interface LambdaDemoInterface {
	public void lambdaMethod();
}


public class LambdaDemo {

	public static void lambdaMethodPerformer(LambdaDemoInterface obj) {
		obj.lambdaMethod();
	}
	
	public static void main(String args[]) {
		
		//Creating a lambda expression on the go
		LambdaDemoInterface lambda = () -> {System.out.println("In Lambda Method");};
		
		lambdaMethodPerformer(lambda);
		
	}
	

	
}
