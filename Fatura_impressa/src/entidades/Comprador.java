package entidades;

import java.util.ArrayList;
import java.util.List;

public class Comprador implements CompradorInterface {
	private List<Compra> listCompras = new ArrayList<>();
	private String nome;
	private double valorTotalCompras;
	private int quantidadeCompras;

	public Comprador() {

	}

	public Comprador(String nome, int quantidadeCompras) {
		this.nome = nome;
		this.quantidadeCompras = quantidadeCompras;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValorTotalCompras() {
		return valorTotalCompras;
	}

	public int getQuantidadeCompras() {
		return quantidadeCompras;
	}

	public void setQuantidadeCompras(int quantidadeCompras) {
		this.quantidadeCompras = quantidadeCompras;
	}

	public List<Compra> getListCompras() {
		return listCompras;
	}

	@Override
	public void somaCompras() {
		for (Compra c : listCompras) {
			valorTotalCompras += c.getValorCompra();
		}

	}

}
