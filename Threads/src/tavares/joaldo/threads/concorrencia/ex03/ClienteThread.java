package tavares.joaldo.threads.concorrencia.ex03;

public class ClienteThread implements Runnable{

	private FilaBanco fila;
	
	public ClienteThread(FilaBanco fila) {
		this.fila = fila;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 200; i++) {
			try {
				if(fila.entrarFila());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
