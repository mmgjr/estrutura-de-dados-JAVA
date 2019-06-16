package conjuntoComArrayListMaisLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Conjunto {
	private ArrayList<LinkedList<String>> tabela = 
			new ArrayList<LinkedList<String>>();
	
/*Quando a classe Conjunto for instanciada, ela receberá 26 Listas*/	
	public Conjunto() {
		for (int i = 0; i < 26; i++) {
			tabela.add(new LinkedList<String>());
		}
	}
	
	public void adiciona(String palavra) {
		if(!contem(palavra)) {
			int index = calculaIndiceDaTabela(palavra);
			List<String> lista = tabela.get(index);
			lista.add(palavra);
		}
		
	}
	
	public void remove(String palavra) {
		if(contem(palavra)) {
			int index = calculaIndiceDaTabela(palavra);
			List<String> lista = tabela.get(index);
			lista.remove(palavra);
		}
	}
	
//Método auxiliar.	
	private int calculaIndiceDaTabela(String palavra) {
		return palavra.toLowerCase().charAt(0) % 26;
	}
	private boolean contem(String palavra) {
		int index = calculaIndiceDaTabela(palavra);
		return tabela.get(index).contains(palavra);
		
	}

	@Override
	public String toString() {
		return tabela.toString();
	}
	
	
}
