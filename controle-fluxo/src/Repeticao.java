public class Repeticao {

    public static void main(String[] args) {
        // for com arrays
        float[] notas = { 3, 10, 7, 5, 4, 9, 7, 4, 6, 7 };

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 6) {
                System.out.println("Pai tá aprovado");
            } else {
                System.out.println("Cê ta reprovado filho");
            }
        }

        // for each (como um for i in lista do python)

        for (float notaAluno : notas) {
            System.out.println(notaAluno);
        }

        // Break(para o bloco) e continue (para apenas o loop que se encontra)
        for (int i = 0; i < notas.length; i++) {

            if (notas[i] < 8) {
                System.out.println("Só tem burro aqui");
                continue;

            } else {
                System.out.println("Tem um gênio aqui");
                break;
            }

        }

        // repetição while
        int total = 10;
        while (total != 0) {

            total--;
            System.out.println("Diminuindo valor" + total);

        }

        // do while (verifica a condição depois do loop)
        
        boolean gostar = false ;

        System.out.println(" Ela gosta de você ?");
        do { 
            System.out.println("Falando pra ela !! ");
            gostar = false ;
            if (gostar == true){System.out.println("Ela Gosta de você ");} else{System.out.println("Ela te vê como amigo");}
        } while (gostar== true );
        
        
    }
}