package aula02;

public class Divisivel {
	
	public static void main(String[] args) {
		
		for(int i = 10; i >= -10 ; i--) {
			if(i % 3 == 0) {
				System.out.println("O número "+i+" é divisível por 3");
			} else {
				System.out.println("O número "+i+" não é divisível por 3");
			}
		}
	}

}
