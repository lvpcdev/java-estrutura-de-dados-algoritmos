/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beecrowd.ex1190;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n = 4;
        int qtd = 0;
        double soma = 0;
        char O = ler.nextLine().charAt(0);

        double[][] M = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                M[i][j] = ler.nextDouble();
                if ((j > i) && (n - i < j + 1)) {
                    soma += M[i][j];
                    qtd++;
                }
            }
        }
        
        if (O == 'S' || O == 's') {
            System.out.printf("%.1f\n",soma);
        } else if (O == 'M' || O == 'm') {
            System.out.printf("%.1f\n",soma/qtd);
        }

    }
}
