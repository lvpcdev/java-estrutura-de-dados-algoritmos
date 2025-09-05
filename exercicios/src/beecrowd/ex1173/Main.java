/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beecrowd.ex1173;
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
        int[] N = new int [10];
        
        int v  = ler.nextInt();
        for (int i = 0; i < 10; i++) {
            N[i] = (int) (v * Math.pow(2, i));
            System.out.printf("N[%d] = %d\n", i, N[i]);
        }
        
    }
}
