package com.aula.estruturadedados.vetor;

public class Vetor {

	private String[] elements;
	private int leng;

	public Vetor(int cap) {
		this.elements = new String[cap];
		this.leng = 0;
	}
	/*
	public void adiciona(String element) {
		for (int i = 0; i < this.elements.length; i++) {
			if(this.elements[i] == null) {
				this.elements[i] = element;
				break;
			}
		}
	}
	*/
	/*
	public void adiciona(String element) throws Exception {
		
		if(this.leng < this.elements.length) {
			this.elements[this.leng] = element;
			this.leng++;
		}else {
			throw new Exception("Vetor está cheio,não foi possível adicionar esse elemento");
		}	
	
	}
	*/
	public boolean adiciona(String element) {
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
			String[] newElements = new String[this.elements.length*2];
			for (int i = 0; i < this.elements.length; i++) {
				newElements[i] = this.elements[i];
			}
			this.elements = newElements;
		}
	}
	
	public boolean adiciona(String element,int position) {
		
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
	
	public String busca(int position) {
		if(!(position >= 0 && position < leng)) {
			throw new IllegalArgumentException("Posição inválida!");
		}
		return this.elements[position];
	}
	
	public int busca(String ele) {
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
