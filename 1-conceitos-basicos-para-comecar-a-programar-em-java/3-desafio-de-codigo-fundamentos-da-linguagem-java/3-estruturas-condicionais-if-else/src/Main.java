/*

3. Implemente um programa que receba a nota de
um estudante (de 0 a 10) e informe se ele foi
"Reprovado" (nota < 5), está em "Recuperação"
(nota entre 5 e 6.9), ou foi "Aprovado" (nota ≥ 7).

 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        double nota = scanner.nextDouble();

        //TODO: Implemente a estrutura condicional para verificar a classificação da nota:
        if (nota < 5) {
            System.out.println("Reprovado");
        } else if (nota >= 5 && nota <= 6.9) {
            System.out.println("Recuperacao");
        } else {
            System.out.println("Aprovado");
        }


        scanner.close();
    }
}
