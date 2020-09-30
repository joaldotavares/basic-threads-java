package tavares.joaldo.threads.concorrencia;

public class Objeto {

	private int value;

	public synchronized int getValue() {
		return value;
	}

	public synchronized void setValue(int value) {
		this.value = value;
	}

//	public synchronized void soma(int valor) {
//		System.out.println("Valor = " + valor);
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		valor++;
//		this.value = valor;
//		System.out.println(this.value);
//	}
	
	public  void soma(int valor) {
		
		synchronized (this) {
				
			System.out.println("Valor = " + valor);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			valor++;
			this.value = valor;
			System.out.println(this.value);
		}
	}
}
