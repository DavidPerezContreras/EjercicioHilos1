
public class Main {

	public Main() {

	}

	public static void main(String[] args) {
		Hilo hiloTIC = new Hilo("TIC");
		Hilo hiloTAC = new Hilo("TAC");
		
		hiloTIC.start();
		hiloTAC.start();
		
	}

}
