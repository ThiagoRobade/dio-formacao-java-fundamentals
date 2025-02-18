package br.com.dio;

public class OperadoresBitwise {

    public static void main(String[] args) {
        var value1 = 6;
        var binary1 = Integer.toBinaryString(value1);

        System.out.printf("Primeiro número da operação %s (representação binária %s)\n", value1, binary1);
        var value2 = 5;
        var binary2 = Integer.toBinaryString(value2);
        System.out.printf("Segundo número da operação %s (representação binária %s)\n", value2, binary2);
        var result = value1 | value2;
        var binaryResult = Integer.toBinaryString(result);
        System.out.printf("%s | %s = %s\n", value1, value2, result, binaryResult);
    }

    /*
    * 0 = False
    * 1 = True
    */
}
