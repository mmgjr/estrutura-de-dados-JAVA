package com.aula.estruturadedados.vetor.teste;

import com.aula.estruturadedados.vetor.Vetor;

public class TesteVetor03 {

	public static void main(String[] args) {
		
		Vetor vet = new Vetor(10);
		
		vet.adiciona("ele1");
		vet.adiciona("ele2");
		vet.adiciona("ele3");
		
		System.out.println(vet.tamanho());
		System.out.println(vet);
	}

}
