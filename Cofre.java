package aulaJava.cofre;

public class Cofre {
	private final int SEM_SENHA = -1;
	private boolean aberto = true;
	private int senha = SEM_SENHA;

	public void fechar(int senha) {
		if (!this.aberto) {
			throw new RuntimeException("Cofre Fechado!");
		}
		aberto = false;		
		this.senha = senha;
	}
	
	public void abrir(int senha) {
		if (this.aberto) {
			throw new RuntimeException("Cofre Aberto!");
		}
		if (this.senha == senha) {
			aberto = true;
			this.senha = SEM_SENHA;
		} else {
			RuntimeException exceção = new RuntimeException("Senha incorreta!");
			throw exceção;			
		}
	}
	
	public boolean isAberto() {
		return aberto;
	}
}
