package com.aula.estruturadedados.vetor.labs;

import com.aula.estruturadedados.vetorlista.Lista;

public class TesteLista02 {

	public static void main(String[] args) {
		
		Lista<String> lista = new Lista<>(5);	
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		lista.adiciona("A");
		System.out.println(lista.ultimoIndece("A"));
	
		
		
	}

}