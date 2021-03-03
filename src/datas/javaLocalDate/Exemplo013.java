package datas.javaLocalDate;

import java.time.LocalTime;

public class Exemplo013 {

    public static void main(String[] args) {

        LocalTime agora = LocalTime.now();

        System.out.println(agora);
        // 11:08:24.274349200

        LocalTime maisUmaHora = agora.plusHours(1);

        System.out.println(maisUmaHora);
        // 12:08:24.274349200

    }

}
