package Day00.ex02;

import java.util.Scanner;

public class Program {

    public static long CalcData(long tmp){
        long number = 0;

        while (tmp > 0){
            number += tmp % 10;
            tmp /= 10;
        }
        return number;
    }

    public static boolean checkNumber(long number) {
        long i = 2;
        long j = 0;
        while (true) {
            j = i * i;
            if (j == number || number % i == 0) {
                return false;
            } else if (j > number) {
                return true;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        long i = 0;
        long number = 0;
        long requests = 0;
        Scanner scan = new Scanner(System.in);
        while (i != 42){
            i = scan.nextLong();
            if (i <= 1) continue;
            number = CalcData(i);
            if(checkNumber(number)) requests++;
            if (i == 42) {
                System.out.println("Count of coffee-request – " + requests);
            }
        }
    }
}
