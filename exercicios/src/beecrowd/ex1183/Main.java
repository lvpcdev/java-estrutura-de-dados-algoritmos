/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package beecrowd.ex1183;

/**
 *
 * @author Lucas Vicente <lucasvpc47@gmail.com>
 * @date 08/06/2025
 * @brief Class Main
 */
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double soma = 0;
        int n1 = 12;
        int n2 = 12;
        int k = 0;
        
        
        String O = ler.next();

        float [][] M = new float[n1][n2];

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                M[i][j] = ler.nextFloat();

                if (j > i) {
                    soma+= M[i][j];
                    k++;
                }
            }
        }
        
        
        
        if (O.equalsIgnoreCase("S")) {
            System.out.printf("%.1f\n",soma);
        } else if  (O.equalsIgnoreCase("M")) {
            System.out.printf("%.1f\n",soma/k);
        }

    }
    }

