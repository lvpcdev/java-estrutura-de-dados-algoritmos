/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beecrowd.ex1174;

import java.util.Scanner;

/**
 *
 * @author Lucas V236045icente <lucasvpc47@gmail.com>
 * @date 28/05/2025
 * @brief Class Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n = 100;

        double[] A = new double[n];

        for (int i = 0; i < n; i++) {
            A[i] = ler.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            if (A[i] <= 10) {
                System.out.printf("A[%d] = %.1f\n", i, A[i]);
            }
        }

    }
}
