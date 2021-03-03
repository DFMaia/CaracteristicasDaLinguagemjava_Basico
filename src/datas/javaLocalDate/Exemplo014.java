package datas.javaLocalDate;

import java.time.LocalDateTime;

public class Exemplo014 {

    public static void main(String[] args) {

        LocalDateTime agora = LocalDateTime.now();

        System.out.println(agora);
        // 2021-03-03T11:08:53.150623500

        LocalDateTime futuro = agora.plusHours(1).plusDays(2).plusSeconds(12);

        System.out.println(futuro);
        // 2021-03-05T12:09:05.150623500

    }

}
