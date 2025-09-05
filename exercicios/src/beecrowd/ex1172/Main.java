/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package beecrowd.ex1172;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int [] X = new int [10];
        
        for (int i = 0; i < 10; i++) {
            X[i] = ler.nextInt();
            if (X[i] < 1) {
                X[i] = 1;
            }
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.printf("X[%d] = %d\n",i,X[i]);
        }
        
        
    }
}
