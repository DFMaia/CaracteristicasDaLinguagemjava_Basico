package one.digitalInnovation.classes.cliente;

public class ProgramaDoCliente {

    public static void main(String[] args) {

        final var cliente = new Cliente(18);

        cliente.getIdade();

        cliente.getPeso();

        //System.out.println(cliente.relatorio()); // ERROR. Não está no mesmo pacote mesmo apesar da herança.

    }

}