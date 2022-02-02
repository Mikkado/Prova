package aplicativos;

public class Pessoa {
    // Atributos
    private String nome;
    private long cpf;
    static Aeronave pilotos;

    // getteres e setteres

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public static Aeronave getPilotos() {
        return pilotos;
    }

    public static void setPilotos(Aeronave pilotos) {
        Pessoa.pilotos = pilotos;
    }

    // Construtor

    public Pessoa(String nome, long cpf, Aeronave pilotos) {
        this.nome = nome;
        this.cpf = cpf;
        Pessoa.pilotos = pilotos;
    }


    public Pessoa(String nome2, int cpf2) {
    }
}
