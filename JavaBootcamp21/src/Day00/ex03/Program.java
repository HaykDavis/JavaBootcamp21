package Day00.ex03;

import java.util.Scanner;

public class Program {
    static int numberOfWeek = 0;
    static long minFinalScore = 0;
    static int minScore = 9;
    static int maxScore = 0;

    public static void initScore(){
        minScore = 9;
        maxScore = 0;
    }

    public static void throwErr(){
        System.err.println("Illegal Argument");
        System.exit(-1);
    }

    public static void endScript(){
        long number;
        int week = 1;
        while (numberOfWeek > 0){
            number = minFinalScore % 10;
            System.out.print("Week " + week + " ");
            while (number > 0) {
                System.out.print("=");
                number--;
            }
            System.out.println(">");
            minFinalScore /= 10;
            week++;
            numberOfWeek--;
        }
        System.exit(0);
    }

    public static long pow(int value, int powValue) {
        long result = 1;
        for (int i = 1; i <= powValue; i++) {
            result *= value;
        }
        return result;
    }

    public static void makeLongArray(int score, int degree){
        minFinalScore += (long) score * (pow(10, degree - 1));
    }

    public static void main(String[] args) {
        Scanner scanStr = new Scanner(System.in);
        while (numberOfWeek < 18) {
            if (scanStr.hasNext("42")) endScript();
            if (!scanStr.next().equals("Week")) throwErr();
            if (!scanStr.next().equals("" + (numberOfWeek + 1))) throwErr();
            if (!scanStr.nextLine().equals("")) throwErr();
            for (int i = 0; i < 5; i++){
                if (scanStr.hasNextInt()) maxScore = scanStr.nextInt();
                if (maxScore < 1 || maxScore > 9) throwErr();
                if (maxScore < minScore) minScore = maxScore;
            }
            makeLongArray(minScore, numberOfWeek + 1);
            initScore();
            numberOfWeek++;
        }
        scanStr.close();
        endScript();
    }
}

