package escolas;

public class Aluno extends Pessoa{
    private String ra;
    private String curso;
    
    public Aluno(String nome, String cpf, String dataNasc, String ra, String curso){
        super(nome, cpf, dataNasc);
        this.ra = ra;
        this.curso = curso;
    }
    
    public void exibirDados(){
        super.exibirDados();
        System.out.println("RA: " + ra);
        System.out.println("Curso: " + curso);
    }
    
}