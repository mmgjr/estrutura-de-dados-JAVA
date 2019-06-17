package com.aula.estruturadedados.vetor.teste;

import com.aula.estruturadedados.vetor.Vetor;

public class TesteVetor08 {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(3);
		
		vetor.adiciona("B");
		vetor.adiciona("C");
		vetor.adiciona("E");
		vetor.adiciona("F");
		vetor.adiciona("G");
		System.out.println(vetor);
		
		vetor.remove(1);
		System.out.println(vetor);
		
		int pos = vetor.busca("E");
		System.out.println(pos);
		if(pos >= 0) {
			vetor.remove(pos);
		}else {
			System.out.println("Elemento não existe");
		}
		
		System.out.println(vetor);
		
		
		
	}

}
