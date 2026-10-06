package br.com.ucsal.patterns.visitor;

public interface ContaVisitavel {
	void accept(OperacaoBancariaVisitor visitor);
}
