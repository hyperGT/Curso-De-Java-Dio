package Codigos_Eclipse.attCats;

import java.util.Objects;

public class Cat {

	private String nome;
	private Integer idade;
	private String cor;

	/*
	 * Tips: Pressionando [Alt + seta pra cima] depois de ter selecionado um bloco
	 * de codigos, é possivel move-lo Use apenas [ctrl + Del] para deletar uma linha
	 * de código (ctrl + Del isEquals a ctrl + x in Apache NB) 
	 * [ctrl + Shift + F] identa automaticamente o código desorganizado
	 * [ctrl + Shift + O] faz a importação automática das bibliotecas necessárias 
	 */

	// gerando constructor com ctrl + 3
	public Cat(String nome, Integer idade, String cor) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
	}
	

	

	// gerando ToString() com ctrl + 3
	@Override
	public String toString() {
		return "Cat [nome=" + nome + ", idade=" + idade + ", cor=" + cor + "]";
	}


	

	







	// gerando os getters e setters com ctrl + 3
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the idade
	 */
	public Integer getIdade() {
		return idade;
	}

	/**
	 * @param idade the idade to set
	 */
	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	/**
	 * @return the cor
	 */
	public String getCor() {
		return cor;
	}

	/**
	 * @param cor the cor to set
	 */
	public void setCor(String cor) {
		this.cor = cor;
	}

	// gerando o equals e o hash code com ctrl + 3
	@Override
	public int hashCode() {
		return Objects.hash(cor, idade, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cat other = (Cat) obj;
		return Objects.equals(cor, other.cor) && Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome);
	}

}
