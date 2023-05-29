package classes;
public class Pessoa {
    
    protected String nome;
    protected int idade;
    protected String dataNascimento;
    protected String registroGeral;
    protected String numeroCpf;
    protected String nomeMae;
    protected String nomePai;

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public String getRegistroGeral() {
        return registroGeral;
    }
    public String getNumeroCpf() {
        return numeroCpf;
    }
    public String getNomeMae() {
        return nomeMae;
    }
    public String getNomePai() {
        return nomePai;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public void setRegistroGeral(String registroGeral) {
        this.registroGeral = registroGeral;
    }
    public void setNumeroCpf(String numeroCpf) {
        this.numeroCpf = numeroCpf;
    }
    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }
    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
                + registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + "]";
    }

    public Boolean pessoaMaiorIdade() {
        return idade >= 18;
    }
}
