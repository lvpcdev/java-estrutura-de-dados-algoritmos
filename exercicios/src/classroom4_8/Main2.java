/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classroom4_8;

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
        int n, i, j, k, verif;

        System.out.println("Informe quantidade de termos nos conjuntos A e B:");
        n = ler.nextInt();

        A = new int[n];
        B = new int[n];
        C = new int[2 * n];

        k = 0;
        for (i = 0; i < n; i++) {
            System.out.printf("Informe o %d. termo do conjunto A: ", i + 1);
            A[i] = ler.nextInt();
            C[k++] = A[i];
        }
        for (i = 0; i < n; i++) {
            System.out.printf("Informe o %d. termo do conjunto B: ", i + 1);
            B[i] = ler.nextInt();
            C[k++] = B[i];
        }


        k = 0;

        for (i = 0; i < 2 * n; i++) {
            verif = 0;
            for (j = i + 1; j < 2 * n; j++) {
                if (C[i] == C[j]) {
                    verif++;
                }
            }
            if (verif != 0) {
                C[i] = 0;
            }
        }
        
        j = 0;
        for (i = 0; i < n * 2; i++) {
            if (C[i] == 0) {
                C[i] = C[2*n-1];
                C[2*n-1] = 0;
            }
        }

        for (k = 0; k < C.length; k++) {
            System.out.printf("%d. termo do conjunto C: %d\n", k + 1, C[k]);
        }
    }
}
