import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter First Number:  ");
        double num1 = scanner.nextDouble();
        System.out.print("Please Enter Second Number:  ");
        double num2 = scanner.nextDouble();
        Calculator calculator = new Calculator();
        System.out.print("Please Enter Character: ");
        char c = scanner.next().charAt(0);
        switch (c) {
            case '+':
                System.out.println(calculator.add(num1, num2));
                break;
            case '-':
                System.out.println(calculator.minus(num1, num2));
                break;
            case '/':
                System.out.println(calculator.divide(num1, num2));
                break;

        }
    }
}
