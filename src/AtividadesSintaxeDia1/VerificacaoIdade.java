package AtividadesSintaxeDia1;

import java.util.Scanner;

public class VerificacaoIdade {
    public static void main(String[] args) {
        System.out.print("Digite sua idade: ");
        Scanner entrada = new Scanner(System.in);
        int idadeUsuario = entrada.nextInt();
        if (idadeUsuario >= 18) {
            System.out.println("Você é maior de idade!");
        } else {
            System.out.println("Você é menor de idade!");
        }
    }
}
