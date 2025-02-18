import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe sua idade: ");
        int idade = scanner.nextInt();

        //TODO: Implemente a estrutura condicional para verificar a classificação da idade:
        if(idade < 18) {
            System.out.println("Menor de idade");
        }  else if (idade >= 18 && idade <= 64) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Idoso");
        }

        scanner.close();
    }
}
