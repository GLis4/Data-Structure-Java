package aulas.estrutura_dados.desafio.pilhas;

public class Palindromo {

	public static void main(String[] args) {
		
		
		
	}
	
	public static void comparar(String palavra) {
	
		String reverted = new StringBuffer(palavra).reverse().toString();
	
		if(palavra.equals(reverted)) System.out.println("� palindromo");
		else System.out.println("n�o � palindromo");
	
	}
}
