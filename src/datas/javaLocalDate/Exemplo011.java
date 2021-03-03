package datas.javaLocalDate;

import java.time.LocalDate;

public class Exemplo011 {

    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();

        LocalDate ontem = hoje.minusDays(1);

        System.out.println(hoje);
        // 2021-03-03

        System.out.println(ontem);
        // 2021-03-02

    }

}
