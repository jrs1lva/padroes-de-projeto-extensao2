package br.com.ucsal.patterns.decorator;

public class SeguroDeVidaDecorator extends ServicoAdicionalDecorator {

	public SeguroDeVidaDecorator(ContaBancaria conta) {
		super(conta); 
	}
	
	@Override
    public String getServicos() {
		return contaDecorada.getServicos() + ", Seguro de Vida";
	}

	@Override
    public double getTarifaMensal() {
		return contaDecorada.getTarifaMensal() + 50.00;
	}

}
