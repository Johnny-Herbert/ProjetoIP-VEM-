package ClassesFachadaIndividual;
import ClassesBasicas.Pessoa;
import Repositorios.RepositorioPessoaLista;
import Excecoes.PessoaJaCadastradaException;
import Excecoes.PessoaNaoEncontradaException;
import Excecoes.RepositorioPessoaCheioException;
import Repositorios.InterfaceRepositorioPessoa;

public class CadastroPessoa {
	private InterfaceRepositorioPessoa repPessoa;
	
	public CadastroPessoa(InterfaceRepositorioPessoa rep) {
		this.repPessoa = rep;
	}
	
	//adicionar pessoa
	public void inserir(Pessoa pessoa) throws PessoaJaCadastradaException, RepositorioPessoaCheioException, PessoaNaoEncontradaException {
		if(verificarExistenciaCadastro(pessoa.getCpf())) {
			throw new PessoaJaCadastradaException();
		}else {
			repPessoa.inserir(pessoa);
		}
	}
	//excluir pessoa
	public void excluir(String cpf) throws PessoaNaoEncontradaException{
		repPessoa.remover(cpf);
	}
	//atualizar pessoa
	public void atualizarCadastro(Pessoa pessoa) throws PessoaNaoEncontradaException{
		repPessoa.atualizar(pessoa);
	}
	//retornar pessoa
	public Pessoa retornarPessoa(String cpf) throws PessoaNaoEncontradaException {
		return repPessoa.procurar(cpf);
	}
	
	//verificar existencia pessoa
	public boolean verificarExistenciaCadastro(String cpf) throws PessoaNaoEncontradaException{
		return repPessoa.existe(cpf);
	}
}
