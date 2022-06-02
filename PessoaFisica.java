import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class PessoaFisica extends Clientes implements Serializable {
    private long cpf;
    private Calendar dataDeNascimento;

    public PessoaFisica(){
        this.dataDeNascimento = new GregorianCalendar();
    }

    public long getCpf() {

        return cpf;
    }

    public void setCpf(long cpf) {

        this.cpf = cpf;
    }

    public Calendar getDataDeNascimento() {

        return dataDeNascimento;
    }

    public void setDataDeNascimento(Calendar dataDeNascimento) {

        this.dataDeNascimento = dataDeNascimento;
    }

    public void imprimir(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.cpf);
        System.out.println("Data de Nascimento: " + this.dataDeNascimento.get(Calendar.DAY_OF_MONTH) + "/" + this.dataDeNascimento.get(Calendar.MONTH) + "/" + this.dataDeNascimento.get(Calendar.YEAR));
        this.getEndereco().imprimir();

    }
}
