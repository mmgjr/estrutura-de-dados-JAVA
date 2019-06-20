package com.aula.estruturadedados.vetor.labs;

import java.util.Scanner;

import com.aula.estruturadedados.contato.Contato;
import com.aula.estruturadedados.vetorlista.Lista;

public class TesteLista06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);	
		Lista<Contato> l = new Lista<Contato>(20);

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
	private static void imprimeV(Lista<Contato> lista) {
		
		System.out.println(lista);
	}
	
	private static void imprimeVetor(Lista<Contato> lista) {
		lista.limpar();
		System.out.println("Lista limpada");
	}
	
	private static void imprimeTamanhoVetor(Lista<Contato> lista) {
		System.out.println("Tamanho do vetor é de: "+lista.tamanho());
	}
	
	private static void excluirContato(Scanner scan, Lista<Contato> lista) {

		int pos = leInfoInt("Entre com a posição a ser pesquisada", scan);
		try {
			Contato contato = lista.busca(pos);
			lista.remove(contato);
			System.out.println("Contato excluído");

		} catch (Exception e) {
			System.out.println("Posição inválida!");
		}
	}

	private static void excluirPorPosicao(Scanner scan, Lista<Contato> lista) {

		int pos = leInfoInt("Entre com a posição a ser removida", scan);
		try {
			
			lista.remove(pos);
			System.out.println("Contato excluído");

		} catch (Exception e) {
			System.out.println("Posição inválida!");
		}
	}

	private static void pesquisarContatoExiste(Scanner scan, Lista<Contato> lista) {

		int pos = leInfoInt("Entre com a posição a ser pesquisada", scan);
		try {
			Contato contato = lista.busca(pos);

			boolean existe = lista.contem(contato);

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


	private static void pesquisarUltimoIndice(Scanner scan, Lista<Contato> lista) {

		int pos = leInfoInt("Entre com a posição a ser pesquisada", scan);
		try {
			Contato contato = lista.busca(pos);
			System.out.println("Contato existe,seguem dados:");
			System.out.println(contato);
			System.out.println("Fazendo pesquisa do último índice do contato encontrado:");
			pos = lista.ultimoIndece(contato);
			System.out.println("Contato encontrado na posição "+pos);
		} catch (Exception e) {
			System.out.println("Posição inválida!");
		}
	}


	private static void obtemContato(Scanner scan, Lista<Contato> lista) {

		int pos = leInfoInt("Entre com a posição a ser pesquisada", scan);
		try {
			Contato contato = lista.busca(pos);
			System.out.println("Contato existe,seguem dados:");
			System.out.println(contato);
			System.out.println("Fazendo pesquisa do contato encontrado:");
			pos = lista.busca(contato);
			System.out.println("Contato encontrado na posição "+pos);
		} catch (Exception e) {
			System.out.println("Posição inválida!");
		}
	}


	private static void obtemContatoPosicao(Scanner scan, Lista<Contato> lista) {

		int pos = leInfoInt("Entre com a posição a ser pesquisada", scan);
		try {
			Contato contato = lista.busca(pos);
			System.out.println("Contato existe,seguem dados:");
			System.out.println(contato);
		} catch (Exception e) {
			System.out.println("Posição inválida!");
		}
	}

	private static void adicionarContatoPosicao(Scanner scan, Lista<Contato> lista) {
		System.out.println("Criando um contato, entre com as informações:");
		String nome = leInfo("Entre com o nome",scan);
		String telefone = leInfo("Entre com telefone",scan);
		String email = leInfo("Entre com o e-mail",scan);
		Contato cc = new Contato(nome,telefone,email);
		int posi = leInfoInt("Entre com a posição ", scan);
		try {
			lista.adiciona(cc, posi);
		} catch (Exception e) {
			System.out.println("Não adicionado.");
		}

		System.out.println("O contato foi adicionado a lista");
	}
	private static void adicionarContatoFinal(Scanner scan, Lista<Contato> lista) {
		System.out.println("Criando um contato, entre com as informações:");
		String nome = leInfo("Entre com o nome",scan);
		String telefone = leInfo("Entre com telefone",scan);
		String email = leInfo("Entre com o e-mail",scan);
		Contato cc = new Contato(nome,telefone,email);
		lista.adiciona(cc);
		System.out.println("O contato foi adicionado a lista");
	}
	protected static String leInfo(String msg,Scanner scan) {
		System.out.println(msg);
		String entrada = scan.nextLine();
		return entrada;
	}
	protected static int leInfoInt(String msg,Scanner scan) {
		boolean entradaVal = false;

		int num = 0;

		while (!entradaVal) {
			try {
				System.out.println(msg);
				String entrada = scan.nextLine();
				num = Integer.parseInt(entrada);	
				entradaVal = true;
			} catch (Exception e) {
				System.out.println("Entrada inválida");
			}


		}


		return num;
	}

	protected static int obterOpcaoMenu(Scanner scan) {
		boolean entradaValida = false;
		int opcao = 0;
		String entrada;

		while (!entradaValida) {
			System.out.println("Escolha a opção:");
			System.out.println("1-Adiciona contato no final do vetor");
			System.out.println("2-Adiciona contato na posição específica");
			System.out.println("3-Busca contato em posição específica");
			System.out.println("4-Consulta contato");
			System.out.println("5-Consulta último índice do contato");
			System.out.println("6-Verifica se contato existe");
			System.out.println("7-Remove por posição");
			System.out.println("8-Excluir contato");
			System.out.println("9-Verifica tamanho do vetor");
			System.out.println("10-Excluir todos os contatos");
			System.out.println("11-Imprime vetor");
			System.out.println("0- sair");

			try {
				entrada = scan.nextLine();
				opcao =Integer.parseInt(entrada);

				if(opcao >= 0 && opcao <=11) {
					entradaValida = true;
				}else {
					throw new Exception();
				}

			} catch (Exception e) {
				System.out.println("Entrada inválida, digite novamente\n\n");
			}

		}

		return opcao;
	}

	protected static void criarContatos(int qtd, Lista<Contato> lista) {
		Contato c;

		for (int i = 0; i < qtd; i++) {
			c = new Contato();
			c.setNome("Contato"+i);
			c.setTelefone(i+"969-996"+i);
			c.setEmail("contato"+i+"@hotmail.com");
			lista.adiciona(c);
		}
	}

}
