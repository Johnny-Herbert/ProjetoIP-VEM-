package Excecoes;

public class EmpresaNaoEncontradaException extends Exception {
	
	public EmpresaNaoEncontradaException() {
		super("Empresa n�o cadastrada.");
	}
}
