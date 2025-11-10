package aula13_ClasseAbstrata;

public class Main {
	
	public static void main(String[] args) {
		//Não posso instaciar objetos de uma classe abstrata
		//FormaDeBolo forma = new FormaDeBolo(20, "redonda");
		
		BoloCasamento boloDoCasorio = new BoloCasamento(200, "redondo e com andares", 2000);
		BoloCaseiro boloCaseiro = new BoloCaseiro(5, "redondo", 15, "12/11/2025");
	}

}
