package br.com.ucsal.patterns.decorator;

public class ContaBasica implements ContaBancaria{

	@Override
	public String getServicos() {
		return "Conta Básica";
	}

	@Override
	public double getTarifaMensal() {
		return 15.00;
	}

}
