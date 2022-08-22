package aulas.estrutura_dados.desafio.pilhas;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Coloque uma palavra:");
		comparar(sc.next());
		sc.close();
		
	}
	
	public static void comparar(String palavra) {
	
		String palavraCaps  = palavra.toUpperCase();
		String reverted = new StringBuffer(palavraCaps).reverse().toString();
	
		if(palavraCaps.equals(reverted)) System.out.println("� palindromo");
		else System.out.println("n�o � palindromo");
	
	}
}
