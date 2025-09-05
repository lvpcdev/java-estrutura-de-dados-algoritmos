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
 * @brief Class Ex05
 */
public class Ex05 {

    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 3;
        Scanner ler = new Scanner(System.in);
        int[][] A = new int[n1][n2];
        int[][] B = new int[n1][n2];
        int[][] AB = new int[n1][n2];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.printf("Informe o número da %da. linha e %da. coluna da matriz A: ", i + 1, j + 1);
                A[i][j] = ler.nextInt();
            }
        }
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.printf("Informe o número da %da. linha e %da. coluna da matriz B: ", i + 1, j + 1);
                B[i][j] = ler.nextInt(); 
            }
        }
        System.out.println("\n Matriz A:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("");
        }
        
        System.out.println("\n Matriz B:");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.print(B[i][j] + "\t");
            }
            System.out.println("");
        }
        
        System.out.println("\nMatriz A-B");
        for (int i = 0; i < AB.length; i++) {
            for (int j = 0; j < AB[i].length; j++) {
                AB[i][j] = A[i][j] - B[i][j];
                System.out.print(AB[i][j] + "\t");
            }
            System.out.println("");
        }

    }
}
