package aplicativos;

public class Pilotos extends Pessoa {
    private long breve;
    private long matricula;
     // estou dando uma aeronave para o piloto

    // getteres e setteres
    

    public long getBreve() {
        return breve;
    }

    public void setBreve(long breve) {
        this.breve = breve;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public Pilotos(String nome, long cpf, Aeronave pilotos, long breve, long matricula) {
        super(nome, cpf, pilotos);
        this.breve = breve;
        this.matricula = matricula;
    }

        

    }

   

    


    
   

