package escola;

public class Aluno {
    private String nome;
    private int idade;
    private String endereco;
     
    public Aluno(String nome, int idade) {

        this.nome = nome;
        this.idade = idade;

    }
    

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

}
