package br.com.ucsal.patterns.visitor;

public class FechamentoMensalVisitor implements OperacaoBancariaVisitor {
    @Override
    public void visit(ContaCorrente cc) {
        double taxaManutencao = 25.0;
        cc.setSaldo(cc.getSaldo() - taxaManutencao);
        System.out.println("Fechamento Corrente: Taxa de R$25.00 descontada.");
    }

    @Override
    public void visit(ContaPoupanca cp) {
        double rendimento = cp.getSaldo() * 0.02;
        cp.setSaldo(cp.getSaldo() + rendimento);
        System.out.println("Fechamento Poupança: Juros de R$" + rendimento + " aplicados.");
    }
}