package com.aula.estruturadedados.vetor.teste;

import com.aula.estruturadedados.vetor.Vetor;

public class TesteVetor04 {

	public static void main(String[] args) {
		
		Vetor vet = new Vetor(5);
		
		vet.adiciona("ele1");
		vet.adiciona("ele2");
		vet.adiciona("ele3");
		System.out.println(vet.busca(0));
		//System.out.println(vet.busca(2));
		//System.out.println(vet.busca(3));
		//System.out.println(vet.busca(10));
		//System.out.println(vet.busca(-1));
	}

}
