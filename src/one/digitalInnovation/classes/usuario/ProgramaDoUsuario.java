package one.digitalInnovation.classes.usuario;

public class ProgramaDoUsuario {

    public static void main(String[] args) {

        final var superUsuario = new SuperUsuario("root", "123456");

        superUsuario.getLogin();

        superUsuario.getSenha();

        String root = superUsuario.nome;

    }

}
