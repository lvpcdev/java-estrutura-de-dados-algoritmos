/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beecrowd.ex1171;

import java.util.Scanner;

/**
 *
 * @author Lucas Vicente <lucasvpc47@gmail.com>
 * @date 26/05/2025
 * @brief Class Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n = ler.nextInt();
        int x;
        int[] freq = new int[2001];

        for (int i = 0; i < n; i++) {
            x = ler.nextInt();
            freq[x]++;
        }
        
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                System.out.printf("%d aparece %d vez(es)\n", i, freq[i]);
            }
        }
    }
}
