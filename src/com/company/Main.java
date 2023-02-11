package com.company;
import java.util.Scanner;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Scanner scan;

        int a=0;
        int[] liczba;

        while (a < 1111 || a > 9999) {
            scan = new Scanner(System.in);
            a = scan.nextInt();
        }

        liczba = new int[4];

        String x[];
        int y[];

        do {
            for (int i = 0; i < 4; i++) {
                liczba[i] = a % 10;
                a /= 10;
            }
            String cyfry[];
            cyfry = new String[4];
            for (int i = 0; i < 4; i++) {
                cyfry[i] = String.valueOf(liczba[i]);
            }


            x = new String[24];
            y = new int[24];

            x[0] = cyfry[0] + cyfry[1] + cyfry[2] + cyfry[3];
            x[1] = cyfry[0] + cyfry[1] + cyfry[3] + cyfry[2];
            x[2] = cyfry[0] + cyfry[2] + cyfry[1] + cyfry[3];
            x[3] = cyfry[0] + cyfry[2] + cyfry[3] + cyfry[1];
            x[4] = cyfry[0] + cyfry[3] + cyfry[1] + cyfry[2];
            x[5] = cyfry[0] + cyfry[3] + cyfry[2] + cyfry[1];
            x[6] = cyfry[1] + cyfry[0] + cyfry[2] + cyfry[3];
            x[7] = cyfry[1] + cyfry[0] + cyfry[3] + cyfry[3];
            x[8] = cyfry[1] + cyfry[2] + cyfry[0] + cyfry[3];
            x[9] = cyfry[1] + cyfry[2] + cyfry[3] + cyfry[0];
            x[10] = cyfry[1] + cyfry[3] + cyfry[0] + cyfry[2];
            x[11] = cyfry[1] + cyfry[3] + cyfry[2] + cyfry[0];
            x[12] = cyfry[2] + cyfry[0] + cyfry[1] + cyfry[3];
            x[13] = cyfry[2] + cyfry[0] + cyfry[3] + cyfry[1];
            x[14] = cyfry[2] + cyfry[1] + cyfry[0] + cyfry[3];
            x[15] = cyfry[2] + cyfry[1] + cyfry[3] + cyfry[0];
            x[16] = cyfry[2] + cyfry[3] + cyfry[0] + cyfry[1];
            x[17] = cyfry[2] + cyfry[3] + cyfry[1] + cyfry[0];
            x[18] = cyfry[3] + cyfry[0] + cyfry[1] + cyfry[2];
            x[19] = cyfry[3] + cyfry[0] + cyfry[2] + cyfry[1];
            x[20] = cyfry[3] + cyfry[1] + cyfry[0] + cyfry[2];
            x[21] = cyfry[3] + cyfry[1] + cyfry[2] + cyfry[0];
            x[22] = cyfry[3] + cyfry[2] + cyfry[0] + cyfry[1];
            x[23] = cyfry[3] + cyfry[2] + cyfry[1] + cyfry[0];
            for (int i = 0; i < 24; i++) {
                y[i] = Integer.valueOf(x[i]);
            }
            Arrays.sort(y);
            System.out.println("Min: " + y[0]);
            System.out.println("Max: " + y[23]);
            a = y[23] - y[0];
            System.out.println(a);

            TimeUnit.SECONDS.sleep(1);
        } while(y[0] != y[23] && a != 6174);
        //prawie zawsze dochodzi do 6174 i potem idzie petla nieskonczona
    }
}
