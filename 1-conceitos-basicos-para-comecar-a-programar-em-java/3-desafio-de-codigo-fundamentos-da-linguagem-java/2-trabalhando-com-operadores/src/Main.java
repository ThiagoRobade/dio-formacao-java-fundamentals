/*

2. Escreva um programa que receba dois números inteiros e exiba a soma, subtração, multiplicação,
divisão inteira e o resto da divisão entre eles.

 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("");
        int a = scanner.nextInt();
        System.out.print("");
        int b = scanner.nextInt();

        //TODO: Implemente as operações solicitadas na descrição  e exibir o resultado
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        scanner.close();
    }
}
