package com.aula.estruturadedados.vetor.teste;

import com.aula.estruturadedados.contato.Contato;
import com.aula.estruturadedados.vetorlista.Lista;

public class TesteLista11 {

	public static void main(String[] args) {
		
		
		Lista<String> vetor = new Lista<>(1);	
		vetor.adiciona("Elemento");
		System.out.println(vetor);
		
		
		Lista<Contato> cont = new Lista<>(1);
		Contato contato = new Contato("Batata","6969-6969","batata@hotmail.com");
		cont.adiciona(contato);
		
		System.out.println(cont);
		
	}

}
