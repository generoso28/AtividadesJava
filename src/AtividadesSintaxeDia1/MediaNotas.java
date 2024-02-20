package AtividadesSintaxeDia1;

import java.util.Scanner;

public class MediaNotas {
    //3. Solicite ao usuário que insira o número de alunos da turma.
    //4. Crie um vetor (array) para armazenar as notas dos alunos, com o tamanho definido pelo número inserido pelo usuário.
    //5. Utilize um loop for para solicitar as notas de cada aluno e armazená-las no vetor.
    //6. Após coletar todas as notas, calcule a média das notas utilizando o vetor.
    //7. Exiba a média das notas na tela.
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
