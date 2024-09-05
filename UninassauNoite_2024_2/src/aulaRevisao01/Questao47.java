package aulaRevisao01;

public class Questao47 {
	
	public static void main(String[] args) {
		int x = 1;
		int y = 30;
		
		if(x < y) {
			for(int i = x; i <= y; i++) {
				System.out.println(i+" "+(i*i));
			}
		} else if(x > y) {
			System.out.println("---");
		} else {
			System.out.println(x+" "+(x*x));
		}
	}

}
