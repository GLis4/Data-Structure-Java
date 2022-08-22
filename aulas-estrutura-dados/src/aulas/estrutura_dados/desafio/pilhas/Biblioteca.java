package aulas.estrutura_dados.desafio.pilhas;

import java.util.Scanner;
import estrutura_dados.pilhas.Pilha;

public class Biblioteca {
	public static Pilha<Livro> livros = new Pilha<Livro>(20);
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int op = -1;
		while(op!= 0) {
			System.out.println("Selecione a opção... \n 1. Adicionar livro \n 2. Mostrar livro no topo \n 3. Desempilhar livro (remover)");
			op = Integer.parseInt(sc.nextLine());
			switch (op) {
			case 1:
				empilhar();
				break;
			case 2: 
				System.out.println(mostrar());
				break;
			case 3:
				desempilhar();
				break;
			}
		}
	}

	public static void empilhar() {
		try {
			if(livros.tamanho <= 20) {
				Livro livro = new Livro();
				System.out.println("Nome");
				livro.nome = sc.nextLine();
				System.out.println("isbn");
				livro.isbn = Integer.parseInt(sc.nextLine());
				System.out.println("ano de lancamento");
				livro.lancamento = Integer.parseInt(sc.nextLine());
				System.out.println("autor");
				livro.autor = sc.nextLine();
				livros.push(livro);
			} else System.out.println("Capacidade da pilha excedida.");

		} catch (Exception e) {
			System.out.println("Houve um erro, favor tentar novamente...");
		}
	}


	public static String mostrar() {
		try {
			Livro liv = livros.geTop();
			String livroTopo = "";
			livroTopo += "\n"+	liv.nome;
			livroTopo += "\n"+	liv.isbn;
			livroTopo += "\n"+	liv.lancamento;
			livroTopo += "\n"+	liv.autor;

			return livroTopo;

		} catch (Exception e) {
			if(livros.estaVazia()) {
				System.out.println("Lista está vazia. Selecione a opção '1' para inserir um livro na biblioteca.");
			}else System.out.println(e);
		}
		return "";
	}

	public static void desempilhar() {
		try {
			System.out.println("Desempilhando Livro: " + livros.pop().nome);

		} catch (Exception e) {
			if(livros.estaVazia()) {
				System.out.println("Lista está vazia. Selecione a opção '1' para inserir um livro na biblioteca.");
			}else System.out.println(e);}
	}
}

