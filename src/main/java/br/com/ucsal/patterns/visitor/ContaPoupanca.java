package br.com.ucsal.patterns.visitor;

public class ContaPoupanca implements ContaVisitavel {
    private double saldo = 5000.0;
    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }

    @Override
    public void accept(OperacaoBancariaVisitor visitor) {
        visitor.visit(this);
    }
}