package programmingprojects.unit3;

import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) {
        int taban;
        int kuvvet;

        Scanner sc = new Scanner(System.in);

        System.out.println("taban : ");
        taban = sc.nextInt();
        System.out.println("kuvvet : ");
        kuvvet = sc.nextInt();


        long sonuc = 1;

        while (kuvvet != 0)
        {
            sonuc *= taban;
            --kuvvet;
        }

        System.out.println("CEVAP = " + sonuc);
    }

}
