package caracteristicasDaLinguagem.classes.pessoa;

import caracteristicasDaLinguagem.classes.usuario.SuperUsuario;

public class ProgramaDoUsuario {

    public static void main(String[] args) {

        final var batman = new SuperUsuario("batman", "123456");

        //batman.getSenha(); //ERROR Precisa estar no mesmo pacote.
    }

}
