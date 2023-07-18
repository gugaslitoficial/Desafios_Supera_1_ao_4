//Aqui estão as importações que utilizei para esse projeto:
import java.util.Scanner;

//@author Gustavo Romão
public class terceiroDesafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Abaixo estará o tamanho da array, o valor objetivado e seus inteiros:
        int n = scanner.nextInt();//Tamanho
        int k = scanner.nextInt();//Valor
        int[] arr = new int[n];//Cria inteiros

        //Aqui é o leitor: Iniciado com 0
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        //Contando pares e imprimindo o resultado até então:
        int count = countPairs(arr, k);//O "countPairs" é uma função que contará o número de pares de elementos em uma array;
        System.out.println(count);
        scanner.close();
    }

    //Declarar função que receberá um array de inteiros "arr" e valor alvo "k". E assim, retornar nosso valor inteiro.
    public static int countPairs(int[] arr, int k) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (Math.abs(arr[i] - arr[j]) == k) { //Verifica se a diferença absoluta dos elementos do par é igual ao "k" e, se sim, incrementa o "count".
                    count++;
                }
            }
        }
        return count;
    }
}