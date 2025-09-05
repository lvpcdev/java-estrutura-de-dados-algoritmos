/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classroom4_7;

import java.util.Scanner;

/**
 *
 * @author Lucas Vicente <lucasvpc47@gmail.com>
 * @date 20/05/2025
 * @brief Class Main2
 */
public class Main2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] A, B, C;
        int n, i, j, k;
        System.out.println("Escreva a quantidade de elementos dos dois conjuntos:");
        n = ler.nextInt();

        A = new int[n];
        B = new int[n];
        C = new int[2 * n];

        for (i = 0; i < A.length; i++) {
            System.out.printf("Digite o %d. termo do conjunto A: ", i + 1);
            A[i] = ler.nextInt();
        }
        for (i = 0; i < B.length; i++) {
            System.out.printf("Digite o %d. termo do conjunto B: ", i + 1);
            B[i] = ler.nextInt();
        }
        i = 0;
        j = 0;
        for (k = 0; k < n; k++) {
            if(A[i] < B[j]) {
                C[k] = A[i++];
            } else {
                C[k] = B[j++];
            }
        }
        
        while (i < n) {
            C[k++] = A[i++];
        }
        
        while (j < n) {
            C[k++] = B[j++];
        }
        
        for (k = 0; k < C.length; k++) {
            System.out.printf("%d. termo do conjunto C: %d\n", k+1, C[k]);
        } 
    }
}
