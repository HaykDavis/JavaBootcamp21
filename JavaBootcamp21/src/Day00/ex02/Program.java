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
            if (j == number || number % i == 0) return false;
            else if (j > number) return true;
            i++;
        }
    }

    public static void main(String[] args) {
        long nextLong = 0;
        long number = 0;
        long requests = 0;
        Scanner scan = new Scanner(System.in);
        while (nextLong != 42){
            nextLong = scan.nextLong();
            if (nextLong <= 1) continue;
            number = CalcData(nextLong);
            if(checkNumber(number)) requests++;
            if (nextLong == 42) System.out.println("Count of coffee-request – " + requests);
        }
    }
}
