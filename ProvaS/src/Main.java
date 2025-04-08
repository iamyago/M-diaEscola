import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanho;
        System.out.println("informe a quantidade de notas: ");
        tamanho = scanner.nextInt();

        double mediaMinima = 6;
        double notaminima = 5;

        float[] notas1 = new float[tamanho];
        float soma = 0;
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Prova " + (i + 1) + ": ");
            notas1[i] = scanner.nextFloat();
            soma += notas1[i];
        }

        double media = soma / tamanho;

        if (media >= mediaMinima){
            System.out.println("Aluno APROVADO!");
        } else if (media >= notaminima){
            System.out.println("Ainda consegue recuperar");
        } else {
            System.out.println("Aluno REPROVADO!");
        }

        System.out.println("a media do aluno e: " + media);


    }
}
