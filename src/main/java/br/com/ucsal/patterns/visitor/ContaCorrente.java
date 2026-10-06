package br.com.ucsal.patterns.visitor;

public class ContaCorrente implements ContaVisitavel{
	private double saldo = 1000.0;
    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }

    @Override
    public void accept(OperacaoBancariaVisitor visitor) {
        visitor.visit(this);
    }
}
