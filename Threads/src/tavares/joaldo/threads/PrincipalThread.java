package tavares.joaldo.threads;

public class PrincipalThread {

	public static void main(String[] args) {
		Thread main = Thread.currentThread();
		System.out.println(main.getName());
		System.out.println(main);
		//OlaMundo runnable = new OlaMundo();
		new Thread(new OlaMundo()).start();
		new Thread(new Runnable(){

			@Override
			public void run() {
				System.out.println("Anonima Runnable");
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
				System.out.println("FIM ANONIMA");
			}
			
		}).start();
		
		new Thread(() -> System.out.println(Thread.currentThread())).start();
		
		System.out.println("FIM MAIN");
	}

}
