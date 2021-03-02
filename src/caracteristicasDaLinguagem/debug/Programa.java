package caracteristicasDaLinguagem.debug;

import caracteristicasDaLinguagem.debug.imc.CalculadoraDeImc;
import caracteristicasDaLinguagem.debug.pessoa.Pessoa;

public class Programa {

    public static void main(String[] args) {

        final Pessoa pessoa = new Pessoa("André", 1.9, 100.00);

        final var calculadorDeImc = new CalculadoraDeImc();
        final var imc = calculadorDeImc.calcula(pessoa);

        System.out.printf("IMC = %.2f", imc);

    }

}
