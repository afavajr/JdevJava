package classes;

public class TestandoClassesFilhas {
    
public static void main(String[] args) {
    
    Aluno aluno = new Aluno();
    aluno.setNome("Antonio Anes");
    aluno.setNomeEscola("Estácio");
    aluno.setIdade(43);

    Diretor diretor = new Diretor();
    diretor.setRegistroGeral("12315468");
    diretor.setNome("Marcella da Silva");
    diretor.setIdade(43);

    Secretario secretario = new Secretario();
    secretario.setNome("Karol");
    
    
    System.out.println(aluno);
    System.out.println(diretor);
    System.out.println(secretario);

    //System.out.println(aluno.pessoaMaiorIdade() + " - " aluno.msgMaiorIdade());
    System.out.println(diretor.pessoaMaiorIdade());
    System.out.println(secretario.pessoaMaiorIdade());


}

    

}
