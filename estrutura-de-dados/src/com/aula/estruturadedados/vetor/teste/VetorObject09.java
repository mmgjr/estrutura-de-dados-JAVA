package com.aula.estruturadedados.vetor.teste;

import com.aula.estruturadedados.contato.Contato;
import com.aula.estruturadedados.vetor.VetorObjetos;

public class VetorObject09 {

	public static void main(String[] args) {
		
		
		VetorObjetos vetor = new VetorObjetos(3);
		
		Contato c1 = new Contato("Ana","1234-4567","ana@hotmail.com");
		Contato c2 = new Contato("Pedro","4567-1234","pedro@hotmail.com");
		Contato c3 = new Contato("Marcus","9999-6666","marcus@hotmail.com");
		
		Contato c4 = new Contato("Jose","9889-6556","jose@hotmail.com");
		
		vetor.adiciona(c1);
		vetor.adiciona(c2);
		vetor.adiciona(c3);
		
		System.out.println("Tamanho = "+vetor.tamanho());
		
		int pos = vetor.busca(c4);
		if(pos > -1) {
			System.out.println("Elemento existe no vetor");
		}else {
			System.out.println("Elemento não existe no vetor");
		}
		
		System.out.println(vetor);
		
	}

}
