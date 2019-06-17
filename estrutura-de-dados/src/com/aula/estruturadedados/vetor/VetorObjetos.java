package com.aula.estruturadedados.vetor;

public class VetorObjetos {

	private Object[] elements;
	private int leng;

	public VetorObjetos(int cap) {
		this.elements = new Object[cap];
		this.leng = 0;
	}

	public boolean adiciona(Object element) {
		this.aumentaCap();
		if(this.leng < this.elements.length) {
			this.elements[this.leng] = element;
			this.leng++;
			return true;
		}	
		return false;
	}
	
	private void aumentaCap() {
		if(this.leng == this.elements.length) {
			Object[] newElements = new Object[this.elements.length*2];
			for (int i = 0; i < this.elements.length; i++) {
				newElements[i] = this.elements[i];
			}
			this.elements = newElements;
		}
	}
	
	public boolean adiciona(Object element,int position) {
		
		if(!(position >= 0 && position < leng)) {
			throw new IllegalArgumentException("Posição inválida!");
		}
		
		this.aumentaCap();
		
		for (int i = this.leng-1; i >= position; i--) {
			this.elements[i+1] = this.elements[i];
		}
		this.elements[position] = element;
		this.leng++;
		return true;
	}
	
	public Object busca(int position) {
		if(!(position >= 0 && position < leng)) {
			throw new IllegalArgumentException("Posição inválida!");
		}
		return this.elements[position];
	}
	
	public int busca(Object ele) {
		for (int i = 0; i < leng; i++) {
			if(this.elements[i].equals(ele)) {
				return i;
			}
		}
		return -1;
	}
	
	public void remove(int position) {
		if(!(position >= 0 && position < leng)) {
			throw new IllegalArgumentException("Posição inválida!");
		}
		for (int i = position; i < this.leng-1; i++) {
			this.elements[i] = this.elements[i+1];
		}
		this.leng--;
	}
	
	public int tamanho() {
		return this.leng;
	}
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		
		s.append("[");
		
		for (int i = 0; i < this.leng-1; i++) {
			s.append(this.elements[i]);
			s.append(", ");
		}
		//Imprimindo o último elemento.
		if(this.leng > 0) {
			s.append(this.elements[this.leng-1]);
		}
		s.append("]");
		return s.toString();
	}
	
	
}
