package tavares.joaldo.threads.concorrencia.ex03;

public class FilaMain {
	public static void main(String[] args) {
		FilaBanco fila = new FilaBanco();
		new Thread(new CaixaThread(fila), "CAIXA").start();
		new Thread(new ClienteThread(fila), "CLIENTE").start();
	}
}
