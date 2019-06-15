package armazenamentoSequencialEmVetores;

public class VetorTeste {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Joao");
		Aluno a2 = new Aluno("Jose");
		Aluno a3 = new Aluno("Ana");
		Aluno a4 = new Aluno("Danilo");

		Vetor lista = new Vetor();
		System.out.println(lista.tamanho());
		lista.adiciona(a1);
		System.out.println(lista.tamanho());
		lista.adiciona(a2);
		System.out.println(lista.tamanho());
		
		System.out.println(lista.contem(a2));//true
		System.out.println(lista.contem(a4));//false
		System.out.println(lista.pega(1));
		
		lista.adiciona(0, a3);
		
		System.out.println(lista);
		
		lista.remove(1);
		System.out.println(lista);
	}

}
