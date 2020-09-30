package tavares.joaldo.threads.concorrencia.ex02;

public class FilhoThread implements Runnable {

	private Balde balde;

	public FilhoThread(Balde balde) {
		this.balde = balde;
	}

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			try {
				if (!balde.esvaziarBalde()) {
					break;
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
