package tavares.joaldo.threads;

public class ExMain {

	public static void main(String[] args) {

		new Thread(new RecebeNome("nome1", 1000l)).start();
		new Thread(new RecebeNome("nome2", 700l)).start();
		new Thread(new RecebeNome("nome3", 1500l)).start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Eleven");
					try {
						Thread.sleep(80l);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}	
				System.out.println("Fim Da SEGUNDA?");
			}
		}).start();

	}

}
