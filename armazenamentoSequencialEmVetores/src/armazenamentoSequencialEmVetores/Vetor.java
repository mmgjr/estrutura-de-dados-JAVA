package armazenamentoSequencialEmVetores;

import java.util.Arrays;

public class Vetor {

	private Aluno[] alunos = new Aluno[100];
	private int totalDeAlunos = 0;

	//Métodos	
	public void adiciona(Aluno aluno) {
		this.garanteEspaco();
		this.alunos[totalDeAlunos] = aluno;
		totalDeAlunos++;
	}
	public void adiciona(int posicao, Aluno aluno) {
		this.garanteEspaco();
		if(!posicaoOcupado(posicao)) {
			throw new IllegalArgumentException("Posição Inválida!");
		}
		for (int i = totalDeAlunos - 1; i >= posicao; i--) {
			alunos[i+1] = alunos[i];
		}
		alunos[posicao] = aluno;
		totalDeAlunos++;
	}

	public Aluno pega(int posicao) {
		if(!posicaoOcupado(posicao)) {
			throw new IllegalArgumentException("Posição Inválida!");
		}
		
		return alunos[posicao];
	}
	
	public void remove(int posicao) {
		for (int i = posicao; i < this.totalDeAlunos; i++) {
			this.alunos[i] = this.alunos[i+1];
		}
		totalDeAlunos--;
	}
	public boolean contem (Aluno aluno) {
		for (int i = 0; i < totalDeAlunos; i++) {
			if(aluno.equals(alunos[i])) {
				return true;
			}
		}
		return false;
	}
	

	
	public int tamanho() {
		return totalDeAlunos;
	}

	@Override
	public String toString() {
		return Arrays.toString(alunos);
	}

	//Método auxiliar
	private void garanteEspaco() {
		if(totalDeAlunos == alunos.length) {
			Aluno[] novoArray = new Aluno[alunos.length*2];
			for (int i = 0; i < alunos.length; i++) {
				novoArray[i] = alunos[i];
			}
			this.alunos = novoArray;
		}
	}
	
	private boolean posicaoOcupado(int posicao) {
		return posicao >= 0 && posicao < totalDeAlunos;
	}
}
