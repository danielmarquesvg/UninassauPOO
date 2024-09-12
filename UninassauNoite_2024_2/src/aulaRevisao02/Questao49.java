package aulaRevisao02;

public class Questao49 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 101; i = i + 2) {
			if(i % 7 == 0 || i % 10 == 7) {
				System.out.println("*");
			} else {
				System.out.println(i);
			}
			
			//System.out.println(i);
		}
	}
}
