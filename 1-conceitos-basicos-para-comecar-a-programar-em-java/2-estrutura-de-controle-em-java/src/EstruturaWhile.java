import java.util.Scanner;

public class EstruturaWhile {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var name = "";
        while (true) {
            System.out.println("Informe um nome: ");
            name = scanner.nextLine();

            if (name.equalsIgnoreCase("exit")) break;
        }
    }
}
