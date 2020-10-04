package eratosthenesprimesieve;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (true) {

            System.out.println("1 ... Primzahlen bis x");
            System.out.println("2 ... Summe von Primzahlen bis x");

            int eingabe = Integer.parseInt(in.nextLine());
            if (eingabe == 1) {

                System.out.println("Anzahl: ");
                String eingabe1 = in.nextLine();
                EratosthenesPrimeSieve run = new EratosthenesPrimeSieve(Integer.parseInt(eingabe1));
                run.beispielEINS();

            } else if (eingabe == 2) {
                System.out.println("Anzahl: ");
                String eingabe1 = in.nextLine();
            EratosthenesPrimeSieve run = new EratosthenesPrimeSieve(1);
            run.doitZWEI(Integer.parseInt(eingabe1));
            System.out.println("");

            }
            
        }

    }

}
