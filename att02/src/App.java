import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        System.out.print("Digite a palavra que deseja substituir: ");
        String palavraOriginal = scanner.nextLine();

        System.out.print("Digite a palavra para substituir: ");
        String palavraSubstituta = scanner.nextLine();

        String fraseSubstituida = substituirPalavra(frase, palavraOriginal, palavraSubstituta);
        System.out.println("Frase com a palavra substituída: " + fraseSubstituida);
    }

    public static String substituirPalavra(String frase, String palavraOriginal, String palavraSubstituta) {
        return frase.replaceAll("\\b" + palavraOriginal + "\\b", palavraSubstituta);
    }
}