package program;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

import entidades.Compra;
import entidades.Comprador;
import entidades.Fatura;
import entidades.Gravador;

public class App {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor da fatura: ");
		double valorDaFatura = sc.nextDouble();
		System.out.print("Digite quantas pessoas devem nessa fatura: ");
		int quantidadePessoas = sc.nextInt();
		sc.nextLine();
		Fatura fatura = new Fatura(valorDaFatura);
		for (int i = 0; i < quantidadePessoas; i++) {
			// Criar comprador
			System.out.println("Digite o nome do " + (i + 1) + "º comprador(a):");
			String nome = sc.nextLine();
			System.out.print("Digite quantas compras vc acha que " + nome + " fez: ");
			int quantidadeDeCompras = sc.nextInt();
			sc.nextLine();
			fatura.getListComprador().add(new Comprador(nome, quantidadeDeCompras));
		}
		for (int i = 0; i < quantidadePessoas; i++) {
			// Atribuir valores aos compradores
			System.out.println("Compras de " + fatura.getListComprador().get(i).getNome() + ": ");
			int ListComprasSize = (fatura.getListComprador().get(i).getQuantidadeCompras());
			for (int j = 0; j < ListComprasSize; j++) {

				System.out.println("Digite o nome da " + (j + 1) + "º compra de "
						+ fatura.getListComprador().get(i).getNome() + ": ");
				String nomeCompra = sc.nextLine();
				System.out.println("Digite o valor da " + (j + 1) + "º compra  : ");
				double valorCompra = sc.nextDouble();
				sc.nextLine();
				fatura.getListComprador().get(i).getListCompras().add(new Compra(nomeCompra, valorCompra));
			}
		}
		Gravador gravador = new Gravador();
		gravador.gravaFatura(fatura);
		gravador.gravaCompradores(fatura);
	}

}
