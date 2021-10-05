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

		System.out.println(p.getNome() + " , R$" + p.getPreco() + " , " + p.getQuantidade());

		scan.close();

	}

}
