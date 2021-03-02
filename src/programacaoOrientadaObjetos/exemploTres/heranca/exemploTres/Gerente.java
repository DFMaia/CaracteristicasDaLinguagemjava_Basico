package programacaoOrientadaObjetos.exemploTres.heranca.exemploTres;

public class Gerente extends Funcionario{

    @Override
    public double CalculadorImposto() {
        return this.getSalario() * 0.01;
    }
}
