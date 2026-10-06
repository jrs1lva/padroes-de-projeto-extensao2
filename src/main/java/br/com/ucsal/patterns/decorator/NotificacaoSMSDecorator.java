package br.com.ucsal.patterns.decorator;

public class NotificacaoSMSDecorator extends ServicoAdicionalDecorator {

	public NotificacaoSMSDecorator(ContaBancaria conta) {
		super(conta);
	}
	
	@Override
	public String getServicos() {
		return contaDecorada.getServicos() + ", Notificação SMS";
	}

	@Override
	public double getTarifaMensal() {
		return contaDecorada.getTarifaMensal() + 5.50; 
	}
}
