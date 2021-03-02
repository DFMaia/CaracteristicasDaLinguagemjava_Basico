package caracteristicasDaLinguagem.abstrato;

public class Programa {

    public static void main(String[] args) {

        final FormaGeometrica quadrado = new Quadrado("Quadrado", 25.0);

        System.out.println(quadrado);

        System.out.println(quadrado.nome());

        System.out.println(quadrado.area());

    }

}
