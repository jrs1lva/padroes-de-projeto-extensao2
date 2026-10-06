package br.com.ucsal.patterns.iterator;

public class BancoUsuariosColecao {
	private Usuario[] usuarios;
    private int index = 0;

    public BancoUsuariosColecao() {
        usuarios = new Usuario[5];
    }

    public void cadastrarUsuario(Usuario u) {
        if (index < usuarios.length) usuarios[index++] = u;
    }

    public IteratorUsuarios criarIterator() {
        return new BancoIterator(usuarios);
    }
}
