package com.aula.estruturadedados.vetor.labs;


import com.aula.estruturadedados.vetorlista.Lista;

public class TesteLista01 {

	public static void main(String[] args) {
		
		
		Lista<String> lista = new Lista<>(5);	
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		System.out.println(lista.contem("A"));
		System.out.println(lista.contem("E"));
		System.out.println(lista.contem("B"));
		


	}

}
