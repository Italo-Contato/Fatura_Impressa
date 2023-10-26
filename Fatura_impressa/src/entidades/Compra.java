package entidades;

public class Compra {
	private String nomeCompra;
	private double valorCompra;

	public Compra() {

	}

	public Compra(String nomeCompra, double valorCompra) {
		this.nomeCompra = nomeCompra;
		this.valorCompra = valorCompra;
	}

	public String getNomeCompra() {
		return nomeCompra;
	}

	public void setNomeCompra(String nome_compra) {
		this.nomeCompra = nome_compra;
	}

	public double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}

}
