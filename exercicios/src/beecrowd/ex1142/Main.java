/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package beecrowd.ex1142;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n = ler.nextInt();
        int count = 1;
        for (int i = 0; i < n;count++) {
            if (count % 4 == 0) {
                System.out.println("PUM");
                i++;
            } else {
                System.out.print(count + " ");
                
            }
        }
    }
}
