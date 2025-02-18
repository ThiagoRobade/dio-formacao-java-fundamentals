import java.util.Scanner;

public class EstruturaIfElse {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe seu nome:");
        var name = scanner.nextLine();
        System.out.println("Informe sua idade:");
        var age = scanner.nextInt();
        System.out.printf("Você é emancipado? (s/n)");
        var isEmancipated = scanner.next().equalsIgnoreCase("S");

        if (age >= 18){
            System.out.printf("%s tem %d anos\n", name, age);
        } else if (age <= 16 && isEmancipated){
            System.out.printf("%s, apesar de você ter %s anos, você é emancipado e pode dirigir. \n", name, age);
        } else {
            System.out.printf("%s, você não pode dirigir \n", name);
        }

        System.out.println("Fim da execução");
    }

}
