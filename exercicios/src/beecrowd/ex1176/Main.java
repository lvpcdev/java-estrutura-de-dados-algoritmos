/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beecrowd.ex1176;

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
        int T, n;
        long vAnt, vAtu;
        vAnt = 0;
        vAtu = 1;
        long [] fib = new long[61];
        String out = "";

        for (int i = 0; i < 61; i++) {
            if (i == 0) {
                fib[i] = 0;
            } else if (i == 1) {
                fib[i] = 1;
            } else {
                fib[i] = vAnt + vAtu;
                vAnt = vAtu;
                vAtu = fib[i];
            }
        }
        T = ler.nextInt();
        for (int i = 0; i < T; i++) {
            n = ler.nextInt();
            //System.out.printf("Fib(%d) = %d", n, fib[n]);
           out += "Fib(" + n + ") = " + fib[n] + "\n";
        }
        System.out.print(out);
    }
}
