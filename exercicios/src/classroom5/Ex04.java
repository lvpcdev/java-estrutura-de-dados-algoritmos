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
 * @brief Class Ex04
 */
public class Ex04 {

    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 3;
        Scanner ler = new Scanner(System.in);
        int[][] A = new int[n1][n2];
        boolean identidade = true;

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.printf("Informe o número da %da. linha e %da. coluna da matriz A: ", i + 1, j + 1);
                A[i][j] = ler.nextInt();
                if (i == j) {
                    if (A[i][j] != 1) {
                        identidade = false;
                    }
                } else {
                    if (A[i][j] != 0) {
                        identidade = false;
                    }
                }
            }
        }
        
        System.out.println("\n Matriz A:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("");
        }
        
        
        if (identidade == true) {
            System.out.println("A matriz A é identidade");
        } else {
            System.out.println("A matriz A não é identidade");
        }
        
    }
}
