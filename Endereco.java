import java.io.Serializable;

public class Endereco implements Serializable {
    private String cidade;
    private String bairro;
    private String rua;
    private int numero;
    private String complemento;
    private int cep;

    public Endereco(String cidade, String bairro, String rua, int numero, String complemento, int cep) {
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
    }


    public Endereco(){
//        this.cidade = "";
//        this.bairro = "";
//        this.rua = "";
//        this.complemento = "";
//        this.cep = "";
    }

    public String getCidade() {

        return cidade;
    }

    public void setCidade(String cidade) {

        this.cidade = cidade;
    }

    public String getBairro() {

        return bairro;
    }

    public void setBairro(String bairro) {

        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public void imprimir(){
        System.out.println("Cidade: " + this.cidade);
        System.out.println("Bairro: " + this.bairro);
        System.out.println("Rua: " + this.rua);
        System.out.println("Número: " + this.numero);
        System.out.println("Complemento: " + this.complemento);
        System.out.println("CEP: " + this.cep);
        System.out.println();
    }


}


