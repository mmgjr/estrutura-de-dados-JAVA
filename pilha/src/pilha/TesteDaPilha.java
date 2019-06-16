package pilha;

import java.util.Stack;

public class TesteDaPilha {

	public static void main(String[] args) {
		
		Pilha pilha = new Pilha();
		
		pilha.insere("Mauricio");
		System.out.println(pilha);
		
		pilha.insere("Guilherme");
		System.out.println(pilha);
		
		System.out.println("Pilha está vazia? "+pilha.vazia());
		
		String del1 = pilha.remove();
		System.out.println(del1);
		
		String del2 = pilha.remove();
		System.out.println(del2);
		
		System.out.println("Pilha está vazia? "+pilha.vazia());
		System.out.println(pilha);
		
		System.out.println("#################################");
		
		//Classe do JAVA STACK
		Stack<String> stack = new Stack<String>();
		stack.push("Ana");
		stack.push("Pedro");
		System.out.println(stack);
		String nome = stack.peek();
		System.out.println(nome);
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		
	}

}
