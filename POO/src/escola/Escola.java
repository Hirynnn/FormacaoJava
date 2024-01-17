package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno vitor = new Aluno("Vitor", 31);
        vitor.setEndereco("Nova Iguaçu");
        System.out.println("O aluno " + vitor.getNome() + " tem " + vitor.getIdade() + " anos " + "Mora em : " + vitor.getEndereco());

        
    }
}