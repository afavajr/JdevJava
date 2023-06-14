package classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

public class PrimeiraClasseJava {
    
    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {
        
        String login = JOptionPane.showInputDialog("informe o login:");
        String senha = JOptionPane.showInputDialog("informe a senha:");

        if (login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("admin")) {

            List<Aluno> alunos = new ArrayList<Aluno>();

            HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
        }

    }
}
