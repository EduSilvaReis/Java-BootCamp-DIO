package Calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;

        System.out.println("digite o primeiro numero: ");
        a = scan.nextInt();
        System.out.println("digite o segundo numero: ");
        b = scan.nextInt();

        int soma = soma(a, b);
        int subtrai = subtrai(a, b);
        int multilpica = multilpica(a, b);
        int divide = divide(a, b);

        System.out.println("soma: " + soma);
        System.out.println("subtrai: " + subtrai);
        System.out.println("multiplica: " + multilpica);
        System.out.println("divide: " + divide);
    }

    public static int soma(int a, int b){
        return a + b;
    }
    public static int subtrai(int a, int b){
        return a - b;
    }
    public static int multilpica(int a, int b){
        return a * b;
    }
    public static int divide(int a, int b){
        return a / b;
    }

}
