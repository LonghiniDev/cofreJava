package aulaJava.cofre;

public class App {

	public static void main(String[] args) {
		Cofre ap1021 = new Cofre();		
		System.out.println("Cofre AP: 1021: " + ap1021.isAberto());
		
		ap1021.fechar(1234);
		System.out.println("Cofre AP: 1021: " + ap1021.isAberto());
		
		ap1021.fechar(1234);
		System.out.println("Cofre AP: 1021: " + ap1021.isAberto());
		
		ap1021.abrir(1234);
		System.out.println("Cofre AP: 1021: " + ap1021.isAberto());
	}

}
