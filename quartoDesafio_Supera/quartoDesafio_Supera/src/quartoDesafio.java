//Aqui está as importações necessárias para a realização desse desafio
import java.util.Scanner;

//@author Gustavo Romão
public class quartoDesafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Criando os casos de testes e o consumo de linhas:
        int N = scanner.nextInt();
        scanner.nextLine();

        //Criando loop para os testes:
        for (int i = 0; i < N; i++) {
            String linha = scanner.nextLine(); //Linha de entrada
            String novaLinha = decifrandoLinha(linha); //Função para decifrar
            System.out.println(novaLinha);
        }
        scanner.close();
    }

    //Criando o tamanho das linhas:
    public static String decifrandoLinha(String linha) {
        int tamanho = linha.length();
        StringBuilder novaLinha = new StringBuilder(tamanho);
        for (int i = tamanho / 2 - 1; i >= 0; i--) { //Concatenando os caracteres (meio->direita, último->primeiro)
            novaLinha.append(linha.charAt(i));
        }

        for (int i = tamanho - 1; i >= tamanho / 2; i--) { //Concatenando os caracteres (meio->esquerda, último->primeiro)
            novaLinha.append(linha.charAt(i));
        }

        //Com tudo pronto... Será retornado a linha decifrada
        return novaLinha.toString();
    }
}