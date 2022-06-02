import java.io.Serializable;

public abstract class  Clientes implements Serializable {
    private String nome;
    private Endereco endereco;

    public Clientes(){

        this.endereco = new Endereco();
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public Endereco getEndereco() {

        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public abstract void imprimir();


}
