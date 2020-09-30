package tavares.joaldo.threads.concorrencia;

public class ExemploSoma {

	public static void main(String[] args) throws InterruptedException {
		Objeto o = new Objeto();
		o.setValue(0);
		new SomaThread(o).start();
		new SomaThread(o).start(); 
		new SomaThread(o).start();
//		Thread.sleep(500);
//		o.setValue(1);
		
	}
}
