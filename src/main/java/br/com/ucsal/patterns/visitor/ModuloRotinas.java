package br.com.ucsal.patterns.visitor;

import java.util.List;
import java.util.Arrays;

public class ModuloRotinas {
    public static void main(String[] args) {
        List<ContaVisitavel> contasAtivas = Arrays.asList(new ContaCorrente(), new ContaPoupanca());
        OperacaoBancariaVisitor fechamento = new FechamentoMensalVisitor();

        for (ContaVisitavel conta : contasAtivas) {
            conta.accept(fechamento);
        }
    }
}