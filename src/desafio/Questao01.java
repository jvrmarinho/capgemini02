package desafio;

public class Questao01 {
    public static void main(String[] args) {
        int arr[] = new int[] {9, 2, 1, 4, 6};

        if(arr.length % 2 == 0) {
            System.out.println("O tamanho do array inserido é par!");
        }
        else {
            ordenar(arr);

            int mediana = mediana(arr);

            System.out.println(arr[mediana]);
        }
    }


    public static void ordenar(int[] arr) {
        int aux = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    aux = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = aux;
                }
            }
        }
    }

    public static int mediana(int[] arr){
        int mediana = arr.length/2;
        return mediana;
    }

}