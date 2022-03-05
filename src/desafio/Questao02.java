package desafio;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n[] = new int[] {1, 5, 3, 4, 2};

        System.out.println("Digite um número inteiro: ");
        int valorX = scanner.nextInt();
        int count = 0;

        for(int i = 0; i < n.length; i++) {
            for(int j = i+1; j < n.length; j++) {
                if(n[i] - n[j] == valorX || n[j] - n[i] == valorX) {
                    count++;
                }
            }
        }

        System.out.println(count);

        //Finaliza a coleta de dados pelo teclado;
        scanner.close();
    }
}
