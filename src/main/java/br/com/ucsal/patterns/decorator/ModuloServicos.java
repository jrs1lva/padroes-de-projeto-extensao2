package br.com.ucsal.patterns.decorator;

public class ModuloServicos {

	public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBasica();
        minhaConta = new SeguroDeVidaDecorator(minhaConta);
        minhaConta = new NotificacaoSMSDecorator(minhaConta);
        
        System.out.println("Pacote: " + minhaConta.getServicos());
        System.out.println("Tarifa Total: R$ " + minhaConta.getTarifaMensal());
    }

}
