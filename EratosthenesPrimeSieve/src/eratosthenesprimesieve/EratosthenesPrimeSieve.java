/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eratosthenesprimesieve;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Max
 */
public class EratosthenesPrimeSieve implements PrimeSieve {

    int pMax;
    List<Integer> list = new ArrayList<>();
    List<String> listbspZWEI = new ArrayList<>();

    public EratosthenesPrimeSieve(int max) {

        pMax = max;

    }

    @Override
    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    @Override
    public void printPrimes() {

        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i));

        }

    }

    public void beispielEINS() {

        for (int i = 0; i < pMax; i++) {

            if (isPrime(i)) {
                list.add(i);

            }

        }
        printPrimes();

    }

    public String beispielZWEI(int n) {

        int num1 = n / 2;
        int num2 = n / 2;
        if (isPrime(num1)) {

            return "" + num1 + " + " + num2;

        }
        while (true) {

            num1 += 1;
            num2 -= 1;

            if (isPrime(num1) && isPrime(num2)) {

                return "" + num1 + " + " + num2;

            }

        }

    }

    public void doitZWEI(int obgrze) {

        

        for (int i = 0; i <= obgrze; i++) {

            if (i < 3) {
            } else {
                if ((i % 2) == 0) {
                    listbspZWEI.add(i + " Summe: " + i + " = " + beispielZWEI(i));
                }
            }

        }

        

        for (int y = 0; y < listbspZWEI.size(); y++) {

            System.out.println(listbspZWEI.get(y));

        }
    }

}
