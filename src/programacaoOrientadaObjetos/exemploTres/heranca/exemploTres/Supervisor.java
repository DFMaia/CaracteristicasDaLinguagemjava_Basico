package programacaoOrientadaObjetos.exemploTres.heranca.exemploTres;

public class Supervisor extends Funcionario{

    @Override
    public double CalculadorImposto() {
        return getSalario() * 0.05;
    }
}
