package Day00.ex00;

public class Program {

    public static void CalcData(int tmp){
        int number = 0;

        number += tmp % 10;
        tmp /= 10;
        number += tmp % 10;
        tmp /= 10;
        number += tmp % 10;
        tmp /= 10;
        number += tmp % 10;
        tmp /= 10;
        number += tmp % 10;
        tmp /= 10;
        number += tmp % 10;

        System.out.println(number);
    }
    public static void main(String[] args) {
        int number = 479598;
        CalcData(number);
    }
}
