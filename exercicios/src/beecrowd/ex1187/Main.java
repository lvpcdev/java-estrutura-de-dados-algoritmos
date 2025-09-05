/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package beecrowd.ex1187;

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
        int n  = 12;
        int cont = 0;
        double [][] M = new double [n][n];
        String O = ler.next();
        double soma = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                M[i][j] = ler.nextDouble();
                
                if ((j > i) && (n -  i > j + 1)) {
                    soma += M[i][j];
                    cont++;
                }
            }
        } 
        if (O.equalsIgnoreCase("S")) {
            System.out.printf("%.1f\n",soma);
        } else if (O.equalsIgnoreCase("M")) {
            System.out.printf("%.1f\n",soma/cont);
        }
    }
}
