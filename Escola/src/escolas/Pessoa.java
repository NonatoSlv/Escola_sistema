package escolas;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected String dataNasc;
    
    public Pessoa(String nome, String cpf, String dataNasc){
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
    }
    
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Data de Nascimento: " + dataNasc);
    }
    
}
