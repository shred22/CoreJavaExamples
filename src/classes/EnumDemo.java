package classes;

interface Cmd {
	public void commandMe();
}

enum Commands implements Cmd{
	LEFT { 
		@Override
		public void commandMe() {
				System.out.println("Go LEFT");
		}
	},
	RIGHT { 
		@Override
		public void commandMe() {
				System.out.println("Go RIGHT");
		}
	},
	CENTER { 
		@Override
		public void commandMe() {
				System.out.println("Go CENTER");
		}
	};

	private Cmd command;

	private Commands() {
		// TODO Auto-generated constructor stub
	}

	Commands(Cmd cmd) {
		cmd = command;
	}
}

public class EnumDemo {

	public static void main(String args[]) {

		Commands.LEFT.commandMe();
		Commands.RIGHT.commandMe();
		Commands.CENTER.commandMe();
		
		Cmd command = () -> System.out.println("HEllo");
		
		command.commandMe();
	}
	
		
		
		
	
	

}
