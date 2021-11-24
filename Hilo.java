
public class Hilo extends Thread {

	String palabra;
	
	
	
	Hilo(String palabra){
		super(palabra);
	}
	
	public void run() {
		while(true) {
			System.out.println(getName());
		}
	}


}
