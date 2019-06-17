package com.aula.estruturadedados.vetor.teste;

import com.aula.estruturadedados.vetor.Vetor;

public class TesteVetor05 {

	public static void main(String[] args) {
		
		
		Vetor vet = new Vetor(5);
		
		vet.adiciona("ele1");
		vet.adiciona("ele2");
		vet.adiciona("ele3");
		
		System.out.println(vet.busca("ele1"));
		
		System.out.println(vet.busca("ele5"));
	}
}
