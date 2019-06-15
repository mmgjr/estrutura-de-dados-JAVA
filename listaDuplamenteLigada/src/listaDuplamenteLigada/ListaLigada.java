package listaDuplamenteLigada;



public class ListaLigada {
	private Celula primeira = null;
	private Celula ultima = null;
	private int qtdElement = 0;
	

	public void adicionaNoComeco(Object elemento) {
		if(this.qtdElement == 0) {
			Celula nova = new Celula(elemento);
			this.primeira = nova;
			this.ultima = nova;
		}else {
			Celula nova = new Celula(elemento,this.primeira);
			this.primeira.setAnterior(nova);
			this.primeira = nova;
		}
		
		this.qtdElement++;
	}
	
	public void adiciona(Object elemento) {
		if(this.qtdElement == 0) {
			adicionaNoComeco(elemento);
		}else {
			Celula nova = new Celula(elemento);
			this.ultima.setProximo(nova);
			nova.setAnterior(this.ultima);
			this.ultima = nova;
			this.qtdElement++;
		}
		
	}
	
	public void adiciona(int posicao, Object elemento) {
		if(posicao == 0) {
			adicionaNoComeco(elemento);
		}else if(posicao == this.qtdElement) {
			adiciona(elemento);
		}else {	
			Celula anterior = this.pegaCelula(posicao - 1);
			Celula proxima = anterior.getProximo();
			Celula nova = new Celula(elemento,anterior.getProximo());
			anterior.setProximo(nova);
			nova.setAnterior(anterior);
			proxima.setAnterior(nova);
			this.qtdElement++;
		}
	}
	
	public Object pega(int posicao) {
		return this.pegaCelula(posicao).getElemento();
	}
	public void removeDoComeco() {
		if(this.qtdElement == 0) {
			throw new IllegalArgumentException("Lista Vazia");
		}
		this.primeira = this.primeira.getProximo();
		this.qtdElement--;
		
		if(this.qtdElement == 0) {
			this.ultima = null;
		}
	}
	public void removeDoFim() {
		if(this.qtdElement == 1) {
			this.removeDoComeco();
		}else {
			Celula penultima = this.ultima.getAnterior();
			penultima.setProximo(null);
			this.ultima = penultima;
			this.qtdElement--;
		}
	}
	public void remove(int posicao) {
		if(posicao == 0) {
			this.removeDoComeco();
		}else if(posicao == this.qtdElement-1) {
			this.removeDoFim();
		}else {
			Celula anterior = this.pegaCelula(posicao - 1);
			Celula atual = anterior.getProximo();
			Celula proxima = atual.getProximo();
			anterior.setProximo(proxima);
			proxima.setAnterior(anterior);
			this.qtdElement--;
		}
	}
	
	public int tamanho() {
		return this.qtdElement;
	}
	
	public boolean contem(Object o) {
		Celula atual = this.primeira;
		
		while (atual != null) {
			if(atual.getElemento().equals(o)) {
				return true;
			}
			atual = atual.getProximo();
		}
		return false;
	}
	
	@Override
	public String toString() {
		
		if(this.qtdElement == 0) {
			return "[]";
		}
		Celula atual = primeira;
		
		StringBuilder builder = new StringBuilder("[");
		for (int i = 0; i < qtdElement; i++) {
			builder.append(atual.getElemento());
			builder.append(",");
			atual = atual.getProximo();
		}	
		builder.append("]");
		return builder.toString();
	}
	
	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < this.qtdElement;
	}
	private Celula pegaCelula(int posicao) {
		if(!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição Inexistente.");
		}
		
		Celula atual = primeira;
		
		for (int i = 0; i < posicao; i++) {
			atual = atual.getProximo();
		}
		return atual;
	}
}