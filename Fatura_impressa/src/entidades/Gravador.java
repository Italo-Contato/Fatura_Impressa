package entidades;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Gravador {
	// classe que será responsavel por gerar um arquivo de texto(.txt ou .csv)
	String caminho = "C:\\temp\\fatura.txt";

	public void gravaFatura(Fatura fatura) throws IOException {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminho))) {
			StringBuilder sb = new StringBuilder();
			bw.write("Valor Total da futura: ");
			bw.newLine();
			sb.append(fatura.getValorFatura());
			bw.newLine();
			bw.write(sb.toString());
		} catch (IOException err) {
			System.out.println(err + ": erro ao gerar fatura!");
		}
	}

	public void gravaCompradores(Fatura fatura) {
		for (int i = 0; i < fatura.getListComprador().size(); i++) {
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminho, true))) {
				StringBuilder sb = new StringBuilder();
				bw.newLine();
				bw.write("________________");
				bw.newLine();
				
				sb.append("\n");
				bw.write("Nome: " + fatura.getListComprador().get(i).getNome());
				for (int j = 0; j < fatura.getListComprador().get(i).getListCompras().size(); j++) {
					sb.append("\n");
					sb.append("Compras: ");
					sb.append("\n");
					sb.append(fatura.getListComprador().get(i).getListCompras().get(j).getNomeCompra() + ": ");
					sb.append(fatura.getListComprador().get(i).getListCompras().get(j).getValorCompra());
					bw.write(sb.toString());
				}
			} catch (IOException err) {
				System.out.println("Err: ao gravar compradores");

			}
		}
	}

}
