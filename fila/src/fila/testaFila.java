package fila;

import java.util.LinkedList;
import java.util.Queue;

public class testaFila {

	public static void main(String[] args) {
	
		Fila fila = new Fila();
		
		fila.adiciona("Joao");
		fila.adiciona("Henrique");
		
		System.out.println(fila);
		
		String nome = fila.remove();
		System.out.println(nome);
		System.out.println(fila);
		System.out.println("####################################");
		//Classe JAVA para fila - Queue
		Queue<String> filaJava = new LinkedList<String>();
		filaJava.add("Banana");
		filaJava.add("Uva");
		System.out.println(filaJava);
		String poll = filaJava.poll();//Remove o primeiro da fila.
		System.out.println(poll);
		System.out.println(filaJava);
	}

}
