package Excecoes;

public class RepositorioPessoaCheioException extends Exception{
	public RepositorioPessoaCheioException() {
		super("O Reposit�rio de pessoas est� cheio.");
	}
}
