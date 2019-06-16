package conjuntos;


public class testeDeConjunto {

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
	}

}
