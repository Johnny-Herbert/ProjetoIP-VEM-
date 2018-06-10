package Repositorios;
import ClassesBasicas.Pessoa;

public class RepositorioPessoaArray implements InterfaceRepositorioPessoa {
	Pessoa[] pessoas;
	private int indice;

	
//falta colocar as exce�oes aqui
	public RepositorioPessoaArray() {
		this.indice = 0;
		this.pessoas = new Pessoa[100];
	}
	
	public void inserir(Pessoa pessoa) {
		if(existe(pessoa.getCpf())) {
			//exce��o
		}
		else {
			this.pessoas[indice] = pessoa;
			this.indice ++;
		}
	}

	public void atualizar(Pessoa pessoa) {
		boolean pessoa_encontrada = false;
		for(int i = 0; i < this.indice && pessoa_encontrada == false; i++) {
			if(this.pessoas[i].getCpf().equals(pessoa.getCpf()))
				this.pessoas[i] = pessoa;
		}
	}

	public void remover(String cpf) {
		boolean moverPessoa = false;
		if(existe(cpf)) {
			for(int i = 0; i < this.indice; i++) {
				if(moverPessoa) {
					this.pessoas[i-1] = this.pessoas[i];
				}
				else {
					if(this.pessoas[i].getCpf().equals(cpf))
						moverPessoa = true;
						this.pessoas[i] = null;
				}
			}
		}
		else {
			//exce��o
		}
		this.indice -- ;
	}

	public Pessoa procurar(String cpf) { 
		for(int i = 0; i < this.indice; i++) {
			if(this.pessoas[i].getCpf().equals(cpf))
				return this.pessoas[i];
		}
		//exce��o
		return null;
	}

	public boolean existe(String cpf) {
		boolean pessoa_encontrada = false; 
		for(int i = 0; i < this.indice && pessoa_encontrada == false; i++) {
			if(this.pessoas[i].getCpf().equals(cpf))
				pessoa_encontrada = true;
		}
		return pessoa_encontrada;
	}	
}
