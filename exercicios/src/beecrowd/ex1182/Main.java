/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package beecrowd.ex1182;

import java.util.Scanner;

/**
 *
 * @author Lucas Vicente <lucasvpc47@gmail.com>
 * @date 06/06/2025
 * @brief Class Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double soma = 0;
        int n1 = 4;
        int n2 = 4;
        
        int C = ler.nextInt();
        if(0 <= C && C <= 11) {
        String T = ler.next();

        float [][] M = new float[n1][n2];

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                M[i][j] = ler.nextFloat();

                if (j == C) {
                    soma+= M[i][j];
                }
            }
        }
        
        
        
        if (T.equalsIgnoreCase("S")) {
            System.out.printf("%.1f\n",soma);
        } else if  (T.equalsIgnoreCase("M")) {
            System.out.printf("%.1f\n",soma/M[C].length);
        }

    }
    }
}
