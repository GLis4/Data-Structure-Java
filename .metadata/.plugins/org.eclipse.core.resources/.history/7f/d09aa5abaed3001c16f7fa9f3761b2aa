package aulas.estrutura_dados.base;

public class staticStructure<T> {

	public T[] itens;
	public int tamanho;

	@SuppressWarnings("unchecked")
	public staticStructure(int capacidade){
		itens = (T[]) new Object[capacidade];
		tamanho = 0;
	}

	protected int tamanho() {
		return this.tamanho;
	}

	protected void adicionar(T elemento){
		this.aumentaCapacidade();
		if(this.tamanho < this.itens.length) {
			this.itens[this.tamanho] = elemento;
			this.tamanho++;	
		}
	}

	protected void remove(int posicao){
		if (!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalArgumentException("Posicao inválida");
		}
		for (int i = posicao; i<tamanho-1; i++){
			itens[i] = itens[i+1];
		}
		tamanho--;
	}

	public boolean estaVazia(){
		return this.tamanho == 0;
	}

	private void aumentaCapacidade() {
		if(this.tamanho == this.itens.length) {
			@SuppressWarnings("unchecked")
			T[] newItens = (T[]) new Object[this.itens.length*2];
			for(int i = 0; i< this.itens.length;i++) {
				newItens[i] = this.itens[i];
			}
			this.itens = newItens;
		}
	}

	protected T get(int index) {
		return this.itens[index];
	}

	public String show() {
		String a = "";
		for(int i = 0; i< tamanho; i++) {
			a += itens[i] + "\n";
		}
		return a;
		
	}


}
