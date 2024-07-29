import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    static double a = 0;
    public static void main(String[] args) {
        a = inputDouble();
        proverkaChisla();
        //Написать программу, в которой пользователь вводит целое число.
        //Если число четное, то печатаем true, если не четное, печатаем false
        //В методе main НЕ ДОПУСТИМО написание какого либо кода, кроме вызова методов.
        //Методы и их логику продумайте сами
    }
    private static double inputDouble() {
        //todo дописать логику
        System.out.println("Vvedite chislo: ");
        return new Scanner(System.in).nextDouble();
    }
    private static void proverkaChisla() {
        if ((a % 2) == 0) System.out.println("true");
        else System.out.println("false");
    }
}