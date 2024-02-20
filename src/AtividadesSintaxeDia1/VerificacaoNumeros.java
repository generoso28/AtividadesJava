package AtividadesSintaxeDia1;

import java.util.Scanner;

public class VerificacaoNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            numeros[i] = entrada.nextInt();
        }
        int maior = numeros[0];
        for (int i = 1; i < 3; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        System.out.printf("O maior número é %d\n", maior);
        for (int i = 0; i < 3; i++) {
            if (numeros[i] > 0) {
                System.out.printf("O número %d é positivo\n", numeros[i]);
            } else if (numeros[i] < 0) {
                System.out.printf("O número %d é negativo\n", numeros[i]);
            } else {
                System.out.printf("O número %d é igual a zero\n", numeros[i]);
            }
        }
    }

}
