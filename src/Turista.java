public class Turista {

    // Atributos
    private String nome;
    private String cpf;

    // métodos
    public String viajar(){
        return "Viajando...";
    }

    // construtor padrão
    Turista(){
    }

    // Sobrecarga de construtor personalizado
    Turista(String _nome){
        this.nome = _nome;
    }

    // Encapsulamento getters and setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
