public class TipoVariaveis {
    public static void main(String[] args) throws Exception {
        /// Chamando o Paulão
        System.out.println("FALA PAULOOOOOO");
        String pessoa = "Eduardo";
        System.out.println(arroz(pessoa));

        /// chamando a soma
        float num1 = 3.5f;
        float num2 = 3.53f;
        System.out.println(soma(num1, num2));

        /// Chamando status acordado
        boolean eu = true;
        System.out.println(acorda(eu));

    }

    /// brincando com string
    public static String arroz(String pessoa) {
        return pessoa;
    }

    /// Brincando com float
    public static float soma(float num1, float num2) {
        return (num1 + num2);
    }

    /// Brincando com boolean e condicional
    public static boolean acorda(boolean eu) {
        if (eu == false) {
            eu = true;
        } else {
            eu = false;
        }

        return eu;

    }



}
