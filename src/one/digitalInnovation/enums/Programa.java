package one.digitalInnovation.enums;

public class Programa {

    public static void main(String[] args) {

        System.out.println(TipoVeiculo.TERRESTRE);
        System.out.println(TipoVeiculo.AQUATICO);

        //System.out.println(TipoVeiculo.valueOf("AERO"));

        /*for TipoVeiculo tipo : TipoVeiculo.values(){
            System.out.println("Tipo: " + tipo);
        }*/

        for(TipoVeiculo tipo : TipoVeiculo.values()){
            System.out.println("Tipo: " + tipo);
        }

        System.out.println("Código do status CLOSE: " + Status.CLOSE.getCod());
        System.out.println("Texto do status OPEN: " + Status.OPEN.getTexto());

    }

}
