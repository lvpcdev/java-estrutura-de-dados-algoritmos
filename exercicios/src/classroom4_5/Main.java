/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package classroom4_5;

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
        int A[], fatant, fat;
        
        A = new int[10];
        for(int j = 0; j < A.length; j++) {
            A[j] = ler.nextInt();
        }
        
        for(int i = 0; i < A.length; i++) {
            fatant = A[i];
            fat = 1;
            do {
                fat *= fatant;
                fatant--;
            } while (fatant > 1);
            if (fat == 0) {
                fat = 1;
            }
            System.out.printf("Fatorial de %d é %d\n", A[i], fat);
        }
    }
}
