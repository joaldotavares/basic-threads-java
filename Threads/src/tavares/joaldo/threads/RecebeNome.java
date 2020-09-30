package tavares.joaldo.threads;

public class RecebeNome implements Runnable{
	private String nome;
	private Long intervalo;
	
	public RecebeNome() {
		
	}
	
	public RecebeNome(String nome, Long intervalo) {
		super();
		this.nome = nome;
		this.intervalo = intervalo;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(nome);
			try {
				Thread.sleep(intervalo);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}

}
