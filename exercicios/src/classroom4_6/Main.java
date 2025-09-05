package classroom4_6;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
  
        int[] A, B, C;
        int nA, nB, nC, verifA, verifB, verif;
        verif = 0;
        verifA = 0;
        verifB = 0;
        
        System.out.println("Informe a quantidade de termos no conjunto A:");
        nA = ler.nextInt();
        
        A = new int[nA];
        B = new int[nA];
        nC = nA + nA;
        C = new int [nC];
        
        for (int i = 0; i < A.length; i++) {
            System.out.printf("Informe o %d. termo do conjunto A:", i+1);
            A[i] = ler.nextInt();
            
        }
        
        for (int j = 0; j < B.length; j++) {
            System.out.printf("Informe o %d. termo do conjunto B:", j+1);
            B[j] = ler.nextInt();
        }
        
        for (int k = 0; k < C.length; k++) {
            if (verif == 0) {
                C[k] = A[verifA];
                verif++;
                verifA++;
            } else if (verif == 1) {
                C[k] = B[verifB];
                verif--;
                verifB++;
            }          
            System.out.printf("%d. número: %d\n", k+1, C[k]);
        }       
    }
}
