package programacaoOrientadaObjetos.exemploUm;

public class Carro {

    private Integer quantidadeDePessoas = 0;
    private final Integer QUANTIDADEDELUGARES = 5;

    public Integer getQuantidadeDePessoas() {
        return quantidadeDePessoas;
    }

    public String adicionaPessoa(Integer pessoa){
        if(pessoa <= 0 && pessoa > QUANTIDADEDELUGARES){
            return "Não é possível adicionar essa quantidade";
        } else if(this.quantidadeDePessoas > QUANTIDADEDELUGARES){
            return "O carro está cheio";
        } else{
            this.quantidadeDePessoas += pessoa;
            return "A quantidade de lugares disponíveis agora é: " + getQuantidadeDePessoas();
        }

    }

    public String removePessoa(Integer pessoa){
        if(pessoa <= 0 && pessoa > QUANTIDADEDELUGARES){
            return "Não é possível adicionar essa quantidade";
        } else if(this.quantidadeDePessoas <= 0){
            return "O carro está vazio";
        } else{
            this.quantidadeDePessoas -= pessoa;
        }

        return "A quantidade de lugares disponíveis agora é: " + getQuantidadeDePessoas();
    }
}

class Programa{

    public static void main(String[] args) {

        Carro carro = new Carro();
        System.out.println(carro.adicionaPessoa(5));
        System.out.println(carro.removePessoa(2));

    }

}
