/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classroom4_7;

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
        int[] A, B, C;
        int n, b, a, k, j ,i;

        System.out.println("Informe a quantidade de elementos nos dois conjuntos:");
        n = ler.nextInt();
        A = new int[n];
        B = new int[n];
        C = new int[2 * n];

        for (i = 0; i < A.length; i++) {
            System.out.printf("Informe %d. termo do conjunto A: ", i + 1);
            A[i] = ler.nextInt();
        }

        for (j = 0; j < B.length; j++) {
            System.out.printf("Informe %d. termo do conjunto B: ", j + 1);
            B[j] = ler.nextInt();
        }
        
        k = 0;
        for (i = 0,j = 0; i < n && j < n;) {
            if (A[i]<B[j]) {
                C[k++] = A[i++];
            } else {
                C[k++]= B[j++];
            }
        }
        
        while(i < n) {
            C[k++] = A[i++];
        }
        
        while(j < n) {
            C[k++]= B[j++];
        }
        
        for (k = 0; k < C.length; k++) {    
            System.out.printf("%d. número: %d\n", k+1, C[k]);
        }   
    }
}
