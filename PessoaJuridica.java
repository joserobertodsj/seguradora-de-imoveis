import java.io.Serializable;

public class PessoaJuridica extends Clientes implements Serializable {
    private long cnpj;
    private String nomeFantasia;

    public long getCnpj() {

        return cnpj;
    }

    public void setCnpj(long cnpj) {

        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {

        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {

        this.nomeFantasia = nomeFantasia;
    }

    public void imprimir(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Nome Fantasia: " + this.nomeFantasia);
        System.out.println("CNPJ: " + this.cnpj);
        this.getEndereco().imprimir();
    }
}
