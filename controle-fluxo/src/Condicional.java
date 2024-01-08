public class Condicional {
    public static void main(String[] args) throws Exception {

        // Estudando controle de fluxo

        // if e else simples

        String comida = "Arroz";

        if (comida == "Arroz") {
            System.out.println("Vamo comer arroz ");
        } else {
            System.out.println("tô com fome ");
        }

        // if e else composto
        float nota = 6;
        if (nota >= 6) {
            System.out.println("Pai tá aprovado");
        } else {
            System.out.println("Cê ta reprovado filho");
        }

        // condicional ternária

        String resultado = nota >= 6 ? "Passou raspando"
                : nota < 5 && nota > 4 ? "Quem passa direto é trem, vem recuperação" : "Reprovado burro pra desgraça";
        System.out.println(resultado);

        // Switch case

        String doceFavorito = "Acai com nutella";

        switch (doceFavorito) {
            case "Bolo":
                System.out.println("Meu doce favorito é Bolo");
                break;

            case "Pudim":
                System.out.println("Meu doce favorito é Pudim! ");
                break;

            case "Acai com nutella":
                System.out.println("Meu doce favorito é açaí com nutella !");

            default:
                System.out.println("Prefiro salgado :(");
                break;
        }

    }

}
