package caracteristicasDaLinguagem.interfaces;

public interface Carro extends Automovel{

    String marca();

    default void ligar(){
        System.out.println("Ligando o carro");
    }

    Double valor();

    default String codigoRenavan(){
        return "ASDQWE852741963VCXZ";
    }

}
