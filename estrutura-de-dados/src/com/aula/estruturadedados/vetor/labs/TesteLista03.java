package com.aula.estruturadedados.vetor.labs;

import com.aula.estruturadedados.vetorlista.Lista;

public class TesteLista03 {

	public static void main(String[] args) {
		
		
		Lista<String> lista = new Lista<>(5);	
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		lista.adiciona("D");
		System.out.println(lista);
		lista.remove("A");
		System.out.println(lista);

	}

}