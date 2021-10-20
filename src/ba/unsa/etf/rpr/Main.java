package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

    private static int sumaCifara(int broj) {
        int suma = 0;

        while (broj > 0) {
            suma += broj % 10;
            broj -= broj % 10;
            broj = broj / 10;
        }

        return suma;
    }

    public static void main(String[] args) {
        System.out.println("Unesite broj");
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % sumaCifara(i) == 0) {
                System.out.println(i);
            }
        }
    }
}
