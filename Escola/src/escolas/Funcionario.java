package escolas;

public class Funcionario extends Pessoa{
    private String rgm;
    private String cargo;

    public Funcionario(String nome, String cpf, String dataNasc, String rgm, String cargo){
        super(nome, cpf, dataNasc);
        this.rgm = rgm;
        this.cargo = cargo;
    }
    
    public void exibirDados(){
        super.exibirDados();
        System.out.println("RGM: " + rgm);
        System.out.println("Cargo: " + cargo);
    }
        
}