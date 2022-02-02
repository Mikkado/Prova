package aplicativos;

public class Aeronave extends Pilotos{

    private String modelo;
    private String categoria;
    private Pilotos pl1;

    // getteres e setteres


    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Pilotos getPl1() {
        return pl1;
    }

    public void setPl1(Pilotos pl1) {
        this.pl1 = pl1;
    }

    // construtores

    public Aeronave(String nome, long cpf, long breve, long matricula, String modelo,
            String categoria) {
        super(nome, cpf, pilotos, breve, matricula);
        this.modelo = modelo;
        this.categoria = categoria;
        

        
    }

    }

    
    
