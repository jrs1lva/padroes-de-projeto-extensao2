package br.com.ucsal.patterns.iterator;

public class BancoIterator implements IteratorUsuarios {
	private Usuario[] colecao;
    private int posicao = 0;

    public BancoIterator(Usuario[] colecao) {
    	this.colecao = colecao;
    }

    @Override
    public boolean hasNext() {
        return posicao < colecao.length && colecao[posicao] != null;
    }

    @Override
    public Usuario next() {
        return colecao[posicao++];
    }

}
