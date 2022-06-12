package aulas.estrutura_dados.pilhas;

import aulas.estrutura_dados.base.staticStructure;

public class Pilha<T> extends staticStructure<T> {
	
	public Pilha (int capacidade) {
		super(capacidade);
	}
	
	public void push(T elemento) {
		super.adicionar(elemento);
	}
	
	public T geTop() {
		if(this.estaVazia()) return null;
		return super.get(tamanho-1);
	}
	
	public T pop() {
		if(this.estaVazia()) return null;
		return this.itens[--tamanho];
	}
}
