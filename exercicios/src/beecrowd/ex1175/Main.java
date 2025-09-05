/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package beecrowd.ex1175;

import java.util.Scanner;

/**
 *
 * @author Lucas Vicente <lucasvpc47@gmail.com>
 * @date 27/05/2025
 * @brief Class Main
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int tr, i, j;
        int[] N = new int[20];
        
        for (i = 0; i < 20; i++) {
        N[i] = ler.nextInt();
        }
        
        for(i = 0, j = 19; i != 10; i++, j--) {
            
            tr = N[i];
            N[i] = N[j];
            N[j] = tr;
        }
        
        for (i = 0; i < 20; i++) {
            System.out.printf("N[%d] = %d\n", i, N[i]);
        }
    }
}
