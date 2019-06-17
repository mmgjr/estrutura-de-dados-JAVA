package com.aula.estruturadedados.vetor.teste;

import java.util.ArrayList;


public class TesteArray12 {

	public static void main(String[] args) {
		
		
		ArrayList<String> array = new ArrayList<String>();
		array.add("A");
		array.add("C");
		System.out.println(array);
		array.add(1, "B");
		System.out.println(array);
		
		boolean existe = array.contains("D");
		if(existe) {
			System.out.println("Elemento existe no array");
		}else {
			System.out.println("Elemento não existe no array");
		}
		
		int pos = array.indexOf("B");
		if(pos > -1) {
			System.out.println("Elemento existe no array na posição "+pos);
		}else {
			System.out.println("Elemento não existe no array "+pos);
		}
	
		System.out.println(array.get(2));//busca por posição
		
		array.remove(0);
		array.remove("B");
		System.out.println(array);
		
		System.out.println(array.size());
	}

}
