package Day00.ex01;

import java.util.Scanner;

public class Program {

    protected static int counter = 0;
    public static boolean checkNumber(int number) {
        int i = 2;
        int j = 0;
        while (true){
            counter++;
            j = i * i;
            if (j == number || number % i == 0){
                return false;
            } else if (j > number) {
                return true;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        if (i <= 1){
            System.err.println("Illegal Argument");
            System.exit(-1);
        }
        if (!checkNumber(i)){
            System.out.println("false " + counter);
        } else {
            System.out.println("true " + counter);
        }
        System.exit(0);
    }

}
