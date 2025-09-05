/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classroom5;

import java.util.Scanner;

/**
 *
 * @author Lucas Vicente <lucasvpc47@gmail.com>
 * @date 02/06/2025
 * @brief Class Ex01
 */
public class Ex01 {

    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 3;
        int somaP = 0;
        int somaS = 0;
        Scanner ler = new Scanner(System.in);
        int[][] matriz = new int[n1][n2];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Informe o número da %da. linha e %da. coluna: ", i + 1, j + 1);
                matriz[i][j] = ler.nextInt();
                if (i == j) {
                    somaP += matriz[i][j];
                }

                if (n1 - i == j + 1) {
                    somaS += matriz[i][j];
                }
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }

        if (somaS == somaP) {
            System.out.printf("A soma das duas diagonais são iguais, pois %d é igual a %d\n", somaP, somaS);
        } else {
            System.out.printf("A soma das duas diagonais não são iguais, pois %d não é igual a %d\n", somaP, somaS);
        }

    }
}
