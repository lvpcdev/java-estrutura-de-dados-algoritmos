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
 * @brief Class Ex02
 */
public class Ex02 {

    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 2;
        Scanner ler = new Scanner(System.in);
        int[][] matriz = new int[n1][n2];
        int[][] matrizT = new int[n2][n1];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Informe o número da %da. linha e %da. coluna: ", i + 1, j + 1);
                matriz[i][j] = ler.nextInt();
                
                
                
            }
        }
        System.out.println("\n Matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("\nMatriz transposta");
        for (int i = 0; i < matrizT.length; i++) {
            for (int j = 0; j < matrizT[i].length; j++) {
                matrizT[i][j] = matriz[j][i];
                System.out.print(matrizT[i][j] + "\t");
            }
            System.out.println("");
        }

    }
}
