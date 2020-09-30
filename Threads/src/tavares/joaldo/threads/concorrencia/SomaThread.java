package tavares.joaldo.threads.concorrencia;

public class SomaThread extends Thread{
	
	private Objeto o;
	
	public SomaThread(Objeto o){
		this.o = o;
	}
	
	@Override
	public void run() {
		o.soma(o.getValue());
	}
	
	

}
