package classes;
public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setNome("Antonio");

        Diretor diretor = new Diretor();
        diretor.setRegistroGeral("teste");

        Secretario secretario = new Secretario();
        secretario.setExperiencia("Administração");

        System.out.println(aluno);
        System.out.println(diretor);
        System.out.println(secretario);
        
    }
}
