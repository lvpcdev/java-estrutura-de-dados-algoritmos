/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classroom4_9;

import java.util.Scanner;

/**
 *
 * @author Lucas Vicente <lucasvpc47@gmail.com>
 * @date 26/05/2025
 * @brief Class Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int ic = 0;
        System.out.println("Informe a quantidade de elementos do conjunto A e B:");
        int n = ler.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Informe o %do. valor do conjunto A: ", i + 1);
            a[i] = ler.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("Informe o %do. valor do conjunto B: ", i + 1);
            b[i] = ler.nextInt();
        }
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i] == b[j]) {
                    c[k] = a[i];
                    k++;
                    ic++;
                }
            }
        }

        for (int i = 0; i < ic; i++) {
            System.out.printf("%do. elemento do conjunto C: %d\n", i + 1, c[i]);
        }
    }
}
