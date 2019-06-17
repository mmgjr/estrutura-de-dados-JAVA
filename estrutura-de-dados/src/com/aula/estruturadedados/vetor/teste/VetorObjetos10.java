package com.aula.estruturadedados.vetor.teste;

import com.aula.estruturadedados.vetor.VetorObjetos;

public class VetorObjetos10 {

	public static void main(String[] args) {
		
		VetorObjetos vetor = new VetorObjetos(2);
/*É possível usar dois elemento diferentes,mas vai contra o conceito de Vetor*/
		vetor.adiciona(55);
		vetor.adiciona("Suco de uva");
		
		System.out.println(vetor);
		
	}

}
