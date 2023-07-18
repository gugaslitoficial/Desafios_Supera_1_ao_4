//Aqui poderemos ver todas as importações que fiz para a realização desse desafio:
import java.util.Locale;
import java.util.Scanner;

//@autor Gustavo Romão
public class segundoDesafio {
    public static void main(String[] args) {
        
        //Primeiro irei definir o separador decimal, como solicitado pelo desafio.
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        //Irei definir o valor do ponto flutuante N e, o convertor para centavos:
        double valor = scanner.nextDouble();
        int centavos = (int) Math.round(valor * 100);

        ////Abaixo irei colocar a lista de notas e moedas:
        int[] notasMoedas = {10000, 5000, 2000, 1000, 500, 200, 100, 50, 25, 10, 5, 1};

        // Esse treicho abaixo, será uma array que conta a quantidade de notas e moedas:
        int[] quantidade = new int[12];

        //Será criado apenas dois loops para percorrer as notas e moedas.
        //Será calculado a quantidade de notas e moedas necessárias: dividindo o valor em centavos pelo da nota/moeda.
        //Também, conforme colocaremos nas linhas, iremos atualizar a quantidade de notas/moedas e, o valor delas que restaram.
        //Depois disso tudo, iremos imprimir a relação!
        System.out.println("NOTAS:");
        for (int i = 0; i < 6; i++) {
            quantidade[i] = centavos / notasMoedas[i];
            centavos %= notasMoedas[i];
            System.out.printf("%d nota(s) de R$ %.2f%n", quantidade[i], notasMoedas[i] / 100.0);
        }

        System.out.println("MOEDAS:");
        for (int i = 6; i < 12; i++) {
            quantidade[i] = centavos / notasMoedas[i];
            centavos %= notasMoedas[i];
            System.out.printf("%d moeda(s) de R$ %.2f%n", quantidade[i], notasMoedas[i] / 100.0);
        }

        // "%d" - É um marcador de posição; 
        // "moeda(s) de R$" - É um texto estático; 
        //"%.2f" - É outro marcador de posição para valores flutuantes com duas casas decimais; 
        //"%n" - Representa uma quebra de linhas;
            
        //Iremos fechar o objeto Scanner e liberar os recursos que estão nele:
        scanner.close();
    }
}