import java.util.Scanner;

public class Main {
    static double a = 0;
    static double b = 0;

    public static void main(String[] args) {
        //todo Вам нужно дополнить методы так, чтобы получился рабочий калькулятор
        a = inputDouble();
        b = inputDouble();
        System.out.println("Vvedite arifmiticheskoe deistvie:\n 1 - '+', \n 2 - '*', \n 3 - '-', \n 4 - '/'");
        byte arifmDeisv = new Scanner(System.in).nextByte();
        if (arifmDeisv == 1 ) sum();     //Метод суммирования чисел
        else if (arifmDeisv == 2) multiply(); //Метод умножения чисел
        else if (arifmDeisv == 3) diff();     //Метод вычитания чисел
        else if (arifmDeisv == 4) divide();   //Метод деления чисел
    }

    private static void divide() {
        //todo дописать логику и печать результата
        System.out.println(a / b);
    }

    private static void diff() {
        //todo дописать логику и печать результата
        System.out.println(a - b);
    }

    private static void multiply() {
        //todo дописать логику и печать результата
        System.out.println(a * b);
    }

    private static void sum() {
        //todo дописать логику и печать результата
        System.out.println(a + b);
    }

    private static double inputDouble() {
        //todo дописать логику
        System.out.println("Vvedite chislo: ");
        return new Scanner(System.in).nextDouble();
    }
}
