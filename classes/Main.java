package classes;
public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setNome("Antonio");
        aluno.setIdade(22);

        Diretor diretor = new Diretor();
        diretor.setRegistroGeral("teste");
        diretor.setIdade(50);

        Secretario secretario = new Secretario();
        secretario.setExperiencia("Administração");
        secretario.setIdade(18);

        
        System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
        
        System.out.println("Maior de idade: "+ diretor.pessoaMaiorIdade());
       
        System.out.println ("Maior de idade: "+ secretario.pessoaMaiorIdade());

        System.out.println(aluno);
        System.out.println(diretor);
        System.out.println(secretario);
        
    }
}
