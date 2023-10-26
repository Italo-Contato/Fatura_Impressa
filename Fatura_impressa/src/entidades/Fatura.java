package entidades;

import java.util.ArrayList;
import java.util.List;

public class Fatura {
	private double valorFatura;
	private double ValorTotalCompras;
	private List<Comprador> listComprador = new ArrayList<>();

	public Fatura(double valorFatura) {
		this.valorFatura = valorFatura;
	}

	public double getValorFatura() {
		return valorFatura;
	}

	public void setValorFatura(double valorFatura) {
		this.valorFatura = valorFatura;
	}

	public double getValorTotalCompras() {
		return ValorTotalCompras;
	}

	public void setValorTotalCompras(double valorTotalCompras) {
		ValorTotalCompras = valorTotalCompras;
	}

	public List<Comprador> getListComprador() {
		return listComprador;
	}

}
