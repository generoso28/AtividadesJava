package AtividadesSintaxeDia1;

import java.util.Scanner;

public class TabuadaInterativa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();
        int i = 1;
        while (i <= 10) {
            System.out.printf("%d * %d = %d\n", numero, i, numero * i);
            i++;
        }
    }
}
