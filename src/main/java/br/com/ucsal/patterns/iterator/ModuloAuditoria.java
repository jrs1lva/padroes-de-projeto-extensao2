package br.com.ucsal.patterns.iterator;

public class ModuloAuditoria {

	public static void main(String[] args) {
        BancoUsuariosColecao banco = new BancoUsuariosColecao();
        banco.cadastrarUsuario(new Usuario("Adailton", "11122233344"));
        banco.cadastrarUsuario(new Usuario("Lucas", "55566677788"));

        IteratorUsuarios iterator = banco.criarIterator();
        while (iterator.hasNext()) {
            System.out.println("Auditando usuário: " + iterator.next().getNome());
        }
    }

}
