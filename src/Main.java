import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите число для подсчета суммы цифр");
        int n = input.nextInt();
        System.out.println("Сумма цифр равна:" + sumDigits(n));


        Scanner input2 = new Scanner(System.in);
        System.out.println("Введите число для подсчета факториала");
        int m = input2.nextInt();
        System.out.println("Факториал числа равен:" + factorial(m));


        System.out.println("Таблица умножения на 3:" + Arrays.toString(tablica()));


        Scanner input3 = new Scanner(System.in);
        System.out.println("Введите ваш стаж работы:");
        int q = input3.nextInt();
        Scanner input4 = new Scanner(System.in);
        System.out.println("Введите вашу текущую заработную плату: ");
        double w = input4.nextInt();
        System.out.println("Ваша новая заработная плата составит:" + premiya(q,w));
    }

    public static int sumDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static int factorial(int m) {
        int fact = 1;
        int x = 1;
        while (x <= m) {
            fact *= x;
            x += 1;
        }
        return fact;
    }

    public static int[] tablica() {
        int[] result = new int[10];
        int z = 0;
        while (z <= 9) {
            result[z] = 3 * z;
            z += 1;
        }
        return result;

    }

    public static double premiya(int q,double w) {
if (q>=1 & q<3){
    w=w*1.1;
    if (w<4000) {w=w+1000;}
    else {w=w+500;}
}
if (q>=3){
    w=w*1.2;
    if (w<4000) {w=w+1000;}
    else {w=w+500;}
}

return w;

    }






}