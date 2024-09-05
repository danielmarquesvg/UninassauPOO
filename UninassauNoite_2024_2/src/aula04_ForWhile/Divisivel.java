package aula04_ForWhile;

public class Divisivel {
	
	public static void main(String[] args) {
		
		for(int i = 10; i >= -10; i = i - 1) {
			if(i % 3 == 0) {
				System.out.println(i+ " é divisível por 3");
			} else {
				System.out.println(i+ " não é divisível por 3");
			}
		}
	}

}
