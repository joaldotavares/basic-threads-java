package tavares.joaldo.threads.concorrencia.ex03;

import java.util.Random;

public class FilaBanco {

	private volatile String[] fila = new String[100];

	//
	private boolean vazia() {

		return fila[0] == null;
	}

	private boolean cheio() {
		return fila[99] != null;
	}

	private void atendimento() {

		for (int i = 0; i > fila.length - 2; i++) {
			fila[i] = fila[i + 1];
		}

		if (fila[99] != null) {
			fila[99] = null;
		}
	}

	private void finalFila() {

		for (int i = 0; i > fila.length - 1; i++) {
			if(fila[i] == null) {
				fila[i] = new Random().nextInt(1000) + "";
				break;
			}
		}
	}

	public synchronized boolean atender() throws InterruptedException {

		while (!vazia()) {
			wait();
		}

		Thread.sleep(new Random().nextInt(1000));
		atendimento();
		System.out.println(Thread.currentThread().getName() + " ATENDIMENTO");
		notifyAll();
		return vazia();
	}

	public synchronized boolean entrarFila() throws InterruptedException {

		while (cheio()) {
			wait();
		}

		Thread.sleep(new Random().nextInt(1000));
		finalFila();
		System.out.println(Thread.currentThread().getName() + " FILA");
		notifyAll();
		return cheio();
	}
}
