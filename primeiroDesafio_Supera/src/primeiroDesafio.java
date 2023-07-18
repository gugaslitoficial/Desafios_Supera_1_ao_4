// Aqui está as importações que utilizei para produzir esse desafio
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

//@autor Gustavo Romão
public class primeiroDesafio {
    public static void main(String[] args) {

        //Irei definir agora o número de linhas de entrada:
        try (Scanner scanner = new Scanner(System.in)) {
            int N = scanner.nextInt();
            List<Integer> pares = new ArrayList<>();
            List<Integer> impares = new ArrayList<>();

            for (int i=0; i<N; i++) {
                int num = scanner.nextInt();
                if (num % 2 == 0) {
                    pares.add(num);
                } else {
                    impares.add(num);
                }
            }

        //Criarei a ordem da lista dos números pares (na forma crescente):
        Collections.sort(pares);

        //Criarei a ordem da lista dos números ímpares (na forma decrescente):
        Collections.sort(impares, Comparator.reverseOrder());

        //Aqui irei colocar a ação de imprimir os números pares em ordem crescente:
        for (int par : pares) {
            System.out.println(par);
        }

        //Aqui irei colocar a ação de imprimir os números ímpares em ordem decrescente:
        for (int impar : impares) {
            System.out.println(impar);
        }

        //Como informado no desafio: os números deverão ser colocados por linha, ou seja, após colocar os números de "entrada" (um por linha) o código deverá executar a "saída".
        //Os números que serão usados como demonstração, devem ser colocados no "Debug Console", no caso do VSCode.
        //Não esqueça de rodar o método main da aplicação!
        //Irei colocar um vídeo, referente, ao desafio para mostrar que a aplicação está rodando!

        }
    }
}
