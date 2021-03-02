package programacaoOrientadaObjetos.exemploTres.heranca.exemploTres;

public class Funcionario {

    private double salario;

    public double getSalario() {
        return salario;
    }

    public double CalculadorImposto(){
        return getSalario() * 0.01;
    }

}
