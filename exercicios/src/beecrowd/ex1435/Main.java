/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beecrowd.ex1435;

import java.util.Scanner;

/**
 *
 * @author Lucas Vicente <lucasvpc47@gmail.com>
 * @date 09/06/2025
 * @brief Class Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int n = 0;
        
        n = ler.nextInt();
        while (n != 0) {
            
            int[][] M = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    M[i][j] = 1;

                    for (int k = 0; k < 50; k++) {
                        if (i > k && i < n - (k + 1) && j > k && j < n - (k + 1)) {
                            M[i][j] = (k + 2);
                        }
                    }
                }

            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (j == 0) {
                        System.out.printf("%3d", M[i][j]);
                    } else {
                        System.out.printf(" %3d", M[i][j]);
                    }

                }
                System.out.println("");
            }
                n = ler.nextInt();
        } 

    }
}

