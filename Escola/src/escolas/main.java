package escolas;

public class main {

    public static void main(String[] args) {
        Aluno aluno = new Aluno("Andrey Nonato", "444.555.666_43", "31/03/2005", "65498-7", "Engenharia Mecanica");
        Professor professor = new Professor("Rebeca", "893.656.567-00", "18/03/2001", "78945-6", "Programacão");
        Funcionario funcionario = new Funcionario("robson da Silva", "767.452.443-41", "30/04/1978", "56987-2", "Diretor");
        
        System.out.println("Dados do Aluno:");
        aluno.exibirDados();
        System.out.println();
        
        System.out.println("Dados do Professor:");
        professor.exibirDados();
        System.out.println();
        
        System.out.println("Dados do Funcionario:");
        funcionario.exibirDados();
        System.out.println();
    }
}