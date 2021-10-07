package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Product p = new Product();

		System.out.println("________DADOS DO PRODUTO__________");
		System.out.print("Nome: ");
		p.setNome(scan.nextLine());
		System.out.print("Preço: ");
		p.setPreco(scan.nextDouble());
		System.out.print("Quantidade em estoque: ");
		p.setQuantidade(scan.nextInt());

		System.out.println(p);
		System.out.println();

		System.out.println("Digite a quantidade a ser adicionada ao estoque: ");
		int qtde = scan.nextInt();
		p.adicionarProdutos(qtde);
		System.out.println("DADOS ATUALIZADOS COM SUCESSO!");
		System.out.println(p);

		System.out.println("Digite a quantidade a ser removida do estoque: ");
		qtde = scan.nextInt();
		p.removerProdutos(qtde);
		System.out.println("DADOS ATUALIZADOS COM SUCESSO!");
		System.out.println(p);

		scan.close();

	}

}
