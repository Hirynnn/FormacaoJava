public class CondicionaisRepeticoes {
    public static void main(String[] args) {
        /// Valor de negação
        int numero = 5;
        numero = -numero;
        System.out.println(numero);

        /// Tornando positivo
        numero = numero * -1;
        System.out.println(numero);

        /// repetição

        for (int i = 0; i < 4; i++) {

            System.out.println(i);

        }

        /// Realações
        int c = 1;
        int b = 30;

        if (c == b) {
            System.out.println("Ainda gosto dela");
        } else {
            System.out.println("Não somos iguais");
        }

        /// Operadores lógicos

        double total = 332.43;
        if (total > 30000 && total > 300) {
            System.out.println("Quero comprar açaí");

        } else if (total < 10 || total == 332.43) {
            System.out.println("Amor da minha vida");
        }


        

    }
}
