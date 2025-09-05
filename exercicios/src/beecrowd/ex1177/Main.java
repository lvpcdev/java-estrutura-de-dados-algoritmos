/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package beecrowd.ex1177;

import java.util.Scanner;

/**
 *
 * @author Lucas Vicente <lucasvpc47@gmail.com>
 * @date 29/05/2025
 * @brief Class Main
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int T, x;
        int j = 0;
        x = 1000;
        int [] N = new int [x];
        
        T = ler.nextInt();
        for (int i = 0; i < x; i++) {
            if (j == T - 1) {
                N[i] = j;
                j = 0;
            } else {
                N[i] = j;
                j++;
            }
        }
        
        for (int i = 0; i < x; i++) {
            System.out.printf("N[%d] = %d\n", i, N[i]);
        }
        
    }
}
