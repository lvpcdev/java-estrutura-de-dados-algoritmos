/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex_extra;

import java.util.Scanner;

/**
 *
 * @author Lucas Vicente <lucasvpc47@gmail.com>
 * @date 19/05/2025
 * @brief Class Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] A;
        int n, menor;

        System.out.println("Informe a quantidade de elementos nos dois conjuntos:");
        n = ler.nextInt();
        A = new int[n];

        for (int i = 0; i < A.length; i++) {
            System.out.printf("Informe %d. termo do conjunto A: ", i + 1);
            A[i] = ler.nextInt();
        }

        for (int j = 0; j < A.length; j++) {
            for (int k = j+1; k < A.length; k++) {
                if (A[k] < A[j]) {
                    menor = A[j];
                    A[j]  = A[k];
                    A[k] = menor;
                }
            }
        }

        for (int i = 0; i < A.length; i++) {
            System.out.printf("%d. termo: %d\n", i+1, A[i]);
        }
    }
}
