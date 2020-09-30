package tavares.joaldo.threads.concorrencia;


import tavares.joaldo.threads.RecebeNome;

public class ExMain {

	public static void main(String[] args) {
		new Thread(new RecebeNome("Joaldo", 1000l)).start();
		new Thread(new RecebeNome("Renato", 700l)).start();
		new Thread(new RecebeNome("Victor", 1500l)).start();
		
		
	}

}
