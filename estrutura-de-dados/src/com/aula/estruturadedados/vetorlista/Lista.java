package com.aula.estruturadedados.vetorlista;

import java.lang.reflect.Array;

/*Conceito de generics <T> passando o tipo da classe na declaração*/
public class Lista<T> {
	private T[] elements;
	private int leng;

	public Lista(int cap) {
		this.elements = (T[]) new Object[cap];//solução mais usada Casting
		this.leng = 0;
	}
	
	public Lista(int cap, Class<T> typeClass) {
/*Reflection- é uma API que permite acessar as classes e atributos do projeto*/		
		this.elements = (T[]) Array.newInstance(typeClass, cap);
		this.leng = 0;
	}

	public boolean adiciona(T element) {
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
			T[] newElements = (T[]) new Object[this.elements.length*2];
			for (int i = 0; i < this.elements.length; i++) {
				newElements[i] = this.elements[i];
			}
			this.elements = newElements;
		}
	}
	
	public boolean adiciona(T element,int position) {
		
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
	public void limpar() {
		//op 1
		this.elements = (T[])new Object[this.elements.length];
		/*
		//op 2
		this.leng = 0;
		//op 3	
		for(int i=0;i<this.leng;i++) {
			this.elements[i] = null;
		}
		this.leng=0;
		*/
	}
	
	public T obtem(int pos) {
		return this.busca(pos);
	}
	
	public T busca(int position) {
		if(!(position >= 0 && position < leng)) {
			throw new IllegalArgumentException("Posição inválida!");
		}
		return this.elements[position];
	}
	
	public boolean contem(T ele) {
		return busca(ele) > - 1;
	}
	public int ultimoIndece(T ele) {
		
		for (int i = this.leng-1; i >= 0; i--) {
			if(this.elements[i].equals(ele)) {
				return i;
				
			}
		}
		return -1;
	}
	
	
	public int busca(T ele) {
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
	
	public void remove(T ele) {
		 int pos = this.busca(ele);
		if(pos > -1) {
			this.remove(pos);
		}	
		
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
