package herancaSimples;

public class Main {
	
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente("Gerente Daniel", 1234567890, "email@email.com");
		Secretario s1 = new Secretario("Secretario Daniel", 987654321, "08h - 17h");
		
		g1.verInformacao();
		s1.verInformacao();
		
	}

}
