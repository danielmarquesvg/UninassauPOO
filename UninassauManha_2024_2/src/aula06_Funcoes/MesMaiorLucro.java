package aula06_Funcoes;

public class MesMaiorLucro {
	
	public static void main(String[] args) {
		int bolsa = 500;
		//array de despesas
		int [] despesas = {200,300,300,900,800,100,200,500,200,300,500,600};
		String mes = mesLucro(despesas, bolsa);
		System.out.println(mes);
	}
	
	public static String mesLucro(int [] lista, int bolsa) {
		int lucroParcial = 0;
		int [] listaLucro = new int[lista.length];
		for(int i = 0; i < lista.length; i++) {
			lucroParcial = bolsa - lista[i] + lucroParcial;
			listaLucro[i] = lucroParcial;
		}
		
		int indiceDoMes = 0;
		int maiorLucro = 0;
		for(int i = 1; i < listaLucro.length; i++) {
			if(listaLucro[i] >= maiorLucro) {
				maiorLucro = listaLucro[i];
				indiceDoMes = i;
			}
		}
		
		indiceDoMes = indiceDoMes + 1;
		
		if(indiceDoMes == 1) {
			return "jan";
		} else if(indiceDoMes == 2) {
			return "fev";
		}  else if(indiceDoMes == 3) {
			return "mar";
		}  else if(indiceDoMes == 4) {
			return "abr";
		}  else if(indiceDoMes == 5) {
			return "mai";
		}  else if(indiceDoMes == 6) {
			return "jun";
		}  else if(indiceDoMes == 7) {
			return "jul";
		}  else if(indiceDoMes == 8) {
			return "ago";
		}  else if(indiceDoMes == 9) {
			return "set";
		}  else if(indiceDoMes == 10) {
			return "out";
		}  else if(indiceDoMes == 11) {
			return "nov";
		} else {
			return "dez";
		}
	}

}
