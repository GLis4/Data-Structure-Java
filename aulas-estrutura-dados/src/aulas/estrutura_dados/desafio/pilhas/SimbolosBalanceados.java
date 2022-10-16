package aulas.estrutura_dados.desafio.pilhas;

import java.util.Scanner;

public class SimbolosBalanceados {

	static	int o = 0;
	static	int c = 0;

	public static void main(String[] args) {

		checarSeBalanceados();
	} public static String[] separarParenteses( String expression){

		String[] splitted = expression.split("()");

		return splitted;

	} public static void contarParenteses(String expression, String[] splitted) {
		for(int i = 0; i < expression.length(); i++) {

			if (splitted[i].equals("(")) {
				o++; 
			}else if(splitted[i].equals(")")) {
				c++;
			}
		}
	} public static void checarSeBalanceados() {

		String spli = resgatarExpressao();
		String[] splitted = separarParenteses(spli);

		contarParenteses(spli, splitted);

		if(o == c && splitted[0].contains("(") && splitted[spli.length()-1].contains(")") ) {
			System.out.println("balanceado.");
		}else if(o==0 && c==0) {
			System.out.println("n�o e uma expressao com parenteses.");
		} else {
			System.out.println("N�o balanceado.");
		}

	} public static String resgatarExpressao() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Express�o para ver se os parenteses est�o balanceados:");
		String expressao = sc.nextLine();
		sc.close();
		return expressao;
	}  

}

