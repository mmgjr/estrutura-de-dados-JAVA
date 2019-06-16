package conjuntoComArrayListMaisLinkedList;

import java.util.HashSet;
import java.util.Set;

public class teste {

	public static void main(String[] args) {
		Conjunto conjunto = new Conjunto();
		
		conjunto.adiciona("Ana");
		System.out.println(conjunto);
		
		conjunto.adiciona("Pedro");
		System.out.println(conjunto);

		conjunto.adiciona("Mauricio");
		System.out.println(conjunto);
		
		conjunto.adiciona("Mauricio");
		System.out.println(conjunto);
		
		conjunto.adiciona("Amanda");
		System.out.println(conjunto);
		
		conjunto.remove("Mauricio");
		System.out.println(conjunto);
		
		System.out.println("###################################");
		
// Estrutura de Conjuntos no JAVA é o Set
		Set<String> conj = new HashSet<String>();
		conj.add("Alice");
		conj.add("Luiz");
		System.out.println(conj);
		String name = "Ana";//62.465+3.410+97=65972 resultado do calculo do hash
		System.out.println(name.hashCode());
		
		
	}

}
