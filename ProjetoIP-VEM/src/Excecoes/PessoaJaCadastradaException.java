package Excecoes;

public class PessoaJaCadastradaException extends Exception{
	public PessoaJaCadastradaException() {
		super("Essa pessoa j� tem um cadastro no sistema");
	}
}
