import java.io.Serializable;

public abstract class Contratos implements Serializable {

    //enumeração
    public enum LocalImovel {
        URBANO,
        SUBURBANO,
        RURAL
    }

    public enum TipoImovel{
        CASA,
        APARTAMENTO
    }

    public enum Ramo{
        COMERCIO,
        INDUSTRIA,
        AGROPECUARIA
    }

    private Clientes contratante;
    private Endereco endereco;
    private double valorDoImovel;
    private Sinistro sinistro;
    private boolean temSinistro;


    public Contratos(){

        this.endereco = new Endereco();
    }

    public Clientes getContratante() {

        return contratante;
    }

    public void setContratante(Clientes contratante) {
        this.contratante = contratante;
    }

    public Endereco getEndereco() {

        return endereco;
    }

    public void setEndereco(Endereco endereco) {

        this.endereco = endereco;
    }

    public double getValorDoImovel() {

        return valorDoImovel;
    }

    public void setValorDoImovel(double valorDoImovel) {

        this.valorDoImovel = valorDoImovel;
    }

    public Sinistro getSinistro() {

        return sinistro;
    }

    public void setSinistro(Sinistro sinistro) {

        this.sinistro = sinistro;
    }

    public abstract double calculaSeguro();

    public abstract void imprimir();

    public boolean getTemSinistro(){

        return this.temSinistro;
    }
    public void setTemSinistro(boolean temSinistro) {
        this.temSinistro = temSinistro;
    }



}
