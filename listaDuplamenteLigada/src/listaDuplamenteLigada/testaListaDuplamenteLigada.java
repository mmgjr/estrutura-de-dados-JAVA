package listaDuplamenteLigada;

public class testaListaDuplamenteLigada {

	public static void main(String[] args) {

		ListaLigada lista = new ListaLigada();
		
		System.out.println(lista);
		
		lista.adicionaNoComeco("mauricio");
		System.out.println(lista);
		
		lista.adicionaNoComeco("paulo");
		System.out.println(lista);
		
		lista.adicionaNoComeco("guilherme");
		System.out.println(lista);
		
		lista.adiciona("marcelo");
		System.out.println(lista);
		
		lista.adiciona(2, "gabriel");
		System.out.println(lista);
		
		Object x = lista.pega(2);
		System.out.println(x);
		
		System.out.println(lista.tamanho());
		
		//lista.removeDoFim();
		lista.remove(2);
		System.out.println(lista);
		System.out.println(lista.contem("marcelo"));
		System.out.println(lista.contem("pedro"));
		System.out.println(lista.tamanho());

	}

}
