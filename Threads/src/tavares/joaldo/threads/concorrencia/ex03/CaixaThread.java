package tavares.joaldo.threads.concorrencia.ex03;

public class CaixaThread implements Runnable {

	private FilaBanco fila;

	public CaixaThread(FilaBanco fila) {
		this.fila = fila;
	}

	@Override
	public void run() {
		while(true) {
			try {
				if(fila.atender()) {
					
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
