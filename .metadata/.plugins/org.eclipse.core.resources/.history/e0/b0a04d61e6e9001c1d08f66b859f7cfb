package aulas.estrutura_dados.desafio.pilhas;

import java.util.Random;
import java.util.Stack;

public class Desafio1ParOuImpar {

	public static Stack<Integer> inteiros = new Stack<Integer>();
	public static Stack<Integer> test = new Stack<Integer>();

	public static void main(String[] args) {
		automaticInsert();
		showAll();
	}

	public static void automaticInsert() {
		Random r = new Random();
		inteiros.add(2); 
		for(int i = 0; i < 5; i++ ) {
			int j = r.nextInt(100);
			validacao(j);
		}
	}

	public static void validacao(int x) {
		test.add(x);
		try {
			if(x%2 == 0) {
				System.out.println("PAR:" + x);
				inteiros.add(x);
			} else if (x%2 == 1) {
				System.out.println("IMPAR:" + x);
				System.out.println("POP:" + inteiros.pop());
				
			} 
		} catch (Exception e) {
			if(inteiros.isEmpty()) {
				System.out.println("Numero Atual:"+ x +"\nPilha Vazia");
			} else System.out.println(e);
		}
		

	}

	public static void showAll() {
		System.out.println("Todos:" + test);
		System.out.println(inteiros);
	}
}
