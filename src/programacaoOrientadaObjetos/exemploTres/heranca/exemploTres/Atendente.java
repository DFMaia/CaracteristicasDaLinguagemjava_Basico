package programacaoOrientadaObjetos.exemploTres.heranca.exemploTres;

public class Atendente extends Funcionario{

    @Override
    public double CalculadorImposto() {
        return getSalario() * 0.01;
    }
}
