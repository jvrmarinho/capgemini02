package desafio;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();

        String fraseSemEspacos = frase.replace(" ", "");
        int tamanhoDaFrase = fraseSemEspacos.length();

        int raiz = (int) Math.round(Math.sqrt(tamanhoDaFrase));
        int linhas, colunas;

        //Manter o tamanho de linhas e colunas iguais!
        if(raiz * raiz == tamanhoDaFrase) {
            linhas = raiz;
            colunas = raiz;
        }
        else {
            linhas = raiz;
            colunas = raiz + 1;

            if(colunas * linhas > tamanhoDaFrase) {
                linhas++;
            }
        }
        
        int letraALetra = 0;
        char[][] matriz = new char[linhas][colunas];
        try {
            for(int i = 0; i < linhas; i++) {
                for(int j = 0; j < colunas; j++) {
                    matriz[i][j] = fraseSemEspacos.charAt(letraALetra);
                    letraALetra++;
                    if(letraALetra == fraseSemEspacos.length()) {
                        break;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        for(int x = 0; x < colunas; x++) {
            for(int y = 0; y < linhas; y++) {
                System.out.print(matriz[y][x]);
            }
        }

        scanner.close();

    }
}
