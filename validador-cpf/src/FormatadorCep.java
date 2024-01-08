import java.util.Scanner;

public class FormatadorCep {
    public static void main(String[] args) {

        // Criando o imput
        Scanner sc = new Scanner(System.in);
        try {
            String cep = sc.nextLine();

            // Chama o metodo que valida e cria a exception caso necessário
            String cepFormatdo = formatarCep(cep);
            System.out.println(cepFormatdo);
            sc.close();
        }
        // chamando a regra excpetion criada no metodo
        catch (CepException e) {
            // depois de chama a regra exception para não parar o programa avisa o usuario e
            // volta pro try
            System.out.println("Cep errado manooo! ");
        }
    }

    // Criando a regra de exception
    static String formatarCep(String cep) throws CepException {
        if (cep.length() != 8) {
            // throw new cria nova exception
            throw new CepException();
        }

        return "543.545-04";

    }

}
