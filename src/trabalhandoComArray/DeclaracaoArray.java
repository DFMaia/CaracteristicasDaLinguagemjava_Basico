package trabalhandoComArray;

import java.util.Arrays;

public class DeclaracaoArray {

    public static void main(String[] args) {

        //Declaração       qunatidade de posições
        int[] array = new int[7];

        //Declaração    vetores com valores.
        int[] array2 = {12,32,54,6,8,89,64};

        System.out.println(array[1]);
        System.out.println(array2[3]);

        //Alterando o valor de um array
        array2[2] = 10;
        System.out.println(array2[2]);

        //Comprimento de um array
        System.out.println(array2.length);

        int [] meuArray3 = {12,32,54,6,8,89,64};

        for(int i = 0; i < meuArray3.length; i++){
            System.out.print(meuArray3[i] + " ");
        }

        System.out.println("\n\n------>Array multidimensional<------");

        int [][] meuArrayMulti = { {1,2,3,4}, {53,63,73}};

        for (int i = 0; i < meuArrayMulti.length; i++){
            for (int j = 0; j < meuArrayMulti[i].length; j++){
                System.out.println(meuArrayMulti[i][j]);
            }
        }

    }

}
