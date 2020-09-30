package tavares.joaldo.threads.concorrencia.ex02;

public class PaiThread implements Runnable {

	private Balde balde;

	public PaiThread(Balde balde) {
		this.balde = balde;
	}

	@Override
	public void run() {
		for (int i = 0; i < 6; i++) {
			try {
				if(balde.encherBalde()) {
					break;
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
