package entities;

public class Product {

	private String nome;
	private double preco;
	private int quantidade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double valorTotalEstoque() {
		return this.preco * this.quantidade;
	}

	public void adicionarProdutos(int quantidade) {
		this.quantidade += quantidade;
	}

	public void removerProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}

	@Override
	public String toString() {

		return "[DADOS DO PRODUTO]: \n"
				+ nome
				+", R$ " 
				+preco
				+", "
				+quantidade
				+" unidades. TOTAL: R$"
				+valorTotalEstoque();
	}

}
