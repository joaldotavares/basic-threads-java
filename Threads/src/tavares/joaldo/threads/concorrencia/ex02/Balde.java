package tavares.joaldo.threads.concorrencia.ex02;

import java.util.Random;

public class Balde {

	private volatile boolean vazio = true;
	
	public synchronized boolean encherBalde() throws InterruptedException {
	
		while(!vazio) {
			wait();
		}
		
		Thread.sleep(2000);
		System.out.println(Thread.currentThread().getName() + ": CHEIO");
		vazio = false;
		notifyAll();
		return vazio;
	}
	
	
	public synchronized boolean esvaziarBalde() throws InterruptedException {
		
		while(vazio) {
			wait();
		}
		
		Thread.sleep(new Random().nextInt(1000));
		System.out.println(Thread.currentThread().getName() + ": VAZIO");
		vazio = true;
		notifyAll();
		return vazio;
	}

	

//	public void soma(int valor) {
//
//		synchronized (this) {
//
//			System.out.println("Valor = " + valor);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			valor++;
//			this.value = valor;
//			System.out.println(this.value);
//		}
//	}
}
