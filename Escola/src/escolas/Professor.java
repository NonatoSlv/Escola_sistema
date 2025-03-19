package escolas;

public class Professor extends Pessoa{
    private String rf;
    private String disciplina;
    
    public Professor(String nome, String cpf, String dataNasc, String rf, String disciplina){
        super(nome, cpf, dataNasc);
        this.rf = rf;
        this.disciplina = disciplina;
    }
    
    public void exibirDados(){
        super.exibirDados();
        System.out.println("RF: " + rf);
        System.out.println("Disciplina:" + disciplina);
    }
    
}
