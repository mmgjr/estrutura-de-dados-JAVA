package com.aula.estruturadedados.vetor.labs;

import java.util.ArrayList;
import java.util.Scanner;

import com.aula.estruturadedados.contato.Contato;


public class TesteLista07 extends TesteLista06{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		ArrayList<Contato> l = new ArrayList<Contato>(20);

		criarContatos(5,l);
		int op = 1;
		while (op != 0) {
			op = obterOpcaoMenu(sc);

			switch (op) {
			case 1:
				adicionarContatoFinal(sc,l);
				break;
			case 2:
				adicionarContatoPosicao(sc,l);
				break;
			case 3:
				obtemContatoPosicao(sc,l);
				break;
			case 4:
				obtemContato(sc,l);
				break;
			case 5:
				pesquisarUltimoIndice(sc,l);
				break;
			case 6:
				pesquisarContatoExiste(sc,l);
				break;
			case 7:
				excluirPorPosicao(sc,l);
				break;
			case 8:
				excluirContato(sc,l);
				break;
			case 9:
				imprimeTamanhoVetor(l);
				break;
			case 10:
				imprimeVetor(l);
				break;
			case 11:
				imprimeV(l);
				break;		
			default:
				break;
			}
		}
		System.out.println("Usuário digitou 0, encerrando o menu");


	}
private static void imprimeV(ArrayList<Contato> lista) {
		
		System.out.println(lista);
	}
	
	private static void imprimeVetor(ArrayList<Contato> lista) {
		lista.clear();
		System.out.println("ArrayList limpada");
	}
	
	private static void imprimeTamanhoVetor(ArrayList<Contato> lista) {
		System.out.println("Tamanho do vetor é de: "+lista.size());
	}
	
	private static void excluirContato(Scanner scan, ArrayList<Contato> lista) {

		int pos = leInfoInt("Entre com a posição a ser pesquisada", scan);
		try {
			Contato contato = lista.get(pos);
			lista.remove(contato);
			System.out.println("Contato excluído");

		} catch (Exception e) {
			System.out.println("Posição inválida!");
		}
	}

	private static void excluirPorPosicao(Scanner scan, ArrayList<Contato> lista) {

		int pos = leInfoInt("Entre com a posição a ser removida", scan);
		try {
			
			lista.remove(pos);
			System.out.println("Contato excluído");

		} catch (Exception e) {
			System.out.println("Posição inválida!");
		}
	}

	private static void pesquisarContatoExiste(Scanner scan, ArrayList<Contato> lista) {

		int pos = leInfoInt("Entre com a posição a ser pesquisada", scan);
		try {
			Contato contato = lista.get(pos);

			boolean existe = lista.contains(contato);

			if(existe) {
				System.out.println("Contato existe,seguem dados:");
				System.out.println(contato);
			}else {
				System.out.println("Contato não existe");
			}

		} catch (Exception e) {
			System.out.println("Posição inválida!");
		}
	}


	private static void pesquisarUltimoIndice(Scanner scan, ArrayList<Contato> lista) {

		int pos = leInfoInt("Entre com a posição a ser pesquisada", scan);
		try {
			Contato contato = lista.get(pos);
			System.out.println("Contato existe,seguem dados:");
			System.out.println(contato);
			System.out.println("Fazendo pesquisa do último índice do contato encontrado:");
			pos = lista.lastIndexOf(contato);
			System.out.println("Contato encontrado na posição "+pos);
		} catch (Exception e) {
			System.out.println("Posição inválida!");
		}
	}


	private static void obtemContato(Scanner scan, ArrayList<Contato> lista) {

		int pos = leInfoInt("Entre com a posição a ser pesquisada", scan);
		try {
			Contato contato = lista.get(pos);
			System.out.println("Contato existe,seguem dados:");
			System.out.println(contato);
			System.out.println("Fazendo pesquisa do contato encontrado:");
			pos = lista.indexOf(contato);
			System.out.println("Contato encontrado na posição "+pos);
		} catch (Exception e) {
			System.out.println("Posição inválida!");
		}
	}


	private static void obtemContatoPosicao(Scanner scan, ArrayList<Contato> lista) {

		int pos = leInfoInt("Entre com a posição a ser pesquisada", scan);
		try {
			Contato contato = lista.get(pos);
			System.out.println("Contato existe,seguem dados:");
			System.out.println(contato);
		} catch (Exception e) {
			System.out.println("Posição inválida!");
		}
	}

	private static void adicionarContatoPosicao(Scanner scan, ArrayList<Contato> lista) {
		System.out.println("Criando um contato, entre com as informações:");
		String nome = leInfo("Entre com o nome",scan);
		String telefone = leInfo("Entre com telefone",scan);
		String email = leInfo("Entre com o e-mail",scan);
		Contato cc = new Contato(nome,telefone,email);
		int posi = leInfoInt("Entre com a posição ", scan);
		try {
			lista.add(posi, cc);
		} catch (Exception e) {
			System.out.println("Não adicionado.");
		}

		System.out.println("O contato foi adicionado a lista");
	}
	private static void adicionarContatoFinal(Scanner scan, ArrayList<Contato> lista) {
		System.out.println("Criando um contato, entre com as informações:");
		String nome = leInfo("Entre com o nome",scan);
		String telefone = leInfo("Entre com telefone",scan);
		String email = leInfo("Entre com o e-mail",scan);
		Contato cc = new Contato(nome,telefone,email);
		lista.add(cc);
		System.out.println("O contato foi adicionado a lista");
	}




	private static void criarContatos(int qtd, ArrayList<Contato> lista) {
		Contato c;

		for (int i = 0; i < qtd; i++) {
			c = new Contato();
			c.setNome("Contato"+i);
			c.setTelefone(i+"969-996"+i);
			c.setEmail("contato"+i+"@hotmail.com");
			lista.add(c);
		}
	}


}
