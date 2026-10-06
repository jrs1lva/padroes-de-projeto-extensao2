package br.com.ucsal.patterns.decorator;

public abstract class ServicoAdicionalDecorator implements ContaBancaria {

	protected ContaBancaria contaDecorada;

    public ServicoAdicionalDecorator(ContaBancaria conta) {
        this.contaDecorada = conta;
    }

}
