package br.com.ucsal.patterns.visitor;

public interface OperacaoBancariaVisitor {
	void visit(ContaCorrente cc);
    void visit(ContaPoupanca cp);
}
