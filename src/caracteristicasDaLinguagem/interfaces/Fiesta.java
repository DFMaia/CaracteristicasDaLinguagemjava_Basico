package caracteristicasDaLinguagem.interfaces;

public class Fiesta implements Carro, Veiculo{

    @Override
    public String marca() {
        return "Forde";
    }

    @Override
    public String registro() {
        return "QWE123456789ASD";
    }

    @Override
    public void ligar() {
        Carro.super.ligar();

        Veiculo.super.ligar();
    }

    @Override
    public Double valor() {
        return 60000.0;
    }

}
