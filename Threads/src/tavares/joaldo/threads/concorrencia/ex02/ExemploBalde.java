package tavares.joaldo.threads.concorrencia.ex02;

public class ExemploBalde {

	public static void main(String[] args) {
		
		Balde balde = new Balde();
		PaiThread pai1 = new PaiThread(balde); 
		PaiThread pai2 = new PaiThread(balde); 
		
		FilhoThread filho1 = new FilhoThread(balde);
		FilhoThread filho2 = new FilhoThread(balde);
		FilhoThread filha1 = new FilhoThread(balde);
		FilhoThread filha2 = new FilhoThread(balde);
		
		Thread t1 = new Thread(pai1, "PAI 1 - ");
		Thread t2 = new Thread(pai2, "PAI 2 - ");
		
		Thread t3 = new Thread(filho1, "FILHO 1 - ");
		Thread t4 = new Thread(filha1, "FILHA 1 - ");
		Thread t5 = new Thread(filho2, "FILHA 2 - ");
		Thread t6 = new Thread(filha2, "FILHA 2 - ");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
	}

}
