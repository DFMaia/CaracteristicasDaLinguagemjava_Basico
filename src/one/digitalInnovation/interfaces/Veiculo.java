package one.digitalInnovation.interfaces;

public interface Veiculo {

    String registro();

    default void ligar(){
        System.out.println("Ligando veículo!");
    }

}
