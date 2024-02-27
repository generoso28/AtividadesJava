package AtividadesSintaxeDia1;

import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o número de alunos: ");
        int numeroAlunos = entrada.nextInt();
        double[] notas = new double[numeroAlunos];
        for (int i = 0; i < numeroAlunos; i++) {
            System.out.printf("Digite a nota do %dº aluno: ", i + 1);
            notas[i] = entrada.nextDouble();
        }
        double soma = 0;
        for (int i = 0; i < numeroAlunos; i++) {
            soma += notas[i];
        }
        double media = soma / numeroAlunos;
        System.out.printf("A média das notas é %.2f\n", media);
    }

}
