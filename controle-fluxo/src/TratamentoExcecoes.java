import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TratamentoExcecoes {
    public static void main(String[] args) {
        // Try - Bloco que pode dar erro
        try {
            // Recolhendo valores
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            System.out.println("Digite o que deseja comprar : ");
            String item = scanner.nextLine();

            System.out.println("Quantas unidades deseja comprar : ");
            int quantidade = scanner.nextInt();

            // imprimindo resultado
            System.out.println("Item comprado: " + item + " | Quantidade: " + quantidade);
            scanner.close();
        }
        // Catch - Bloco caso Try encontre algum valor invalido inserido
        // dentro do () são os parametros de tipo de problema, nesse caso é colocar  string em variavel int
        catch (InputMismatchException e) {
            System.
            out.println("O campo quantidade precisa ser número ! ");
        }

    


    }
}
