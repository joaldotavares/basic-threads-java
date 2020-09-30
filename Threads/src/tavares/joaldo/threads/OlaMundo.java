package tavares.joaldo.threads;

public class OlaMundo implements Runnable{

	@Override
	public void run() {
		System.out.println("Ola Mundo Runnable");
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread());
		for (int i = 0; i < 1000; i++) {
			try {
				Thread.sleep(10l);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("FIM DO ALO MUNDO");
	}

}
