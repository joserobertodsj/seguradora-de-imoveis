import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Sinistro implements Serializable {
    private Calendar data;
    private double porcentagemPerda;
    private Contratos contrato;

    public Sinistro(){
        this.data = new GregorianCalendar();
    }
    public Calendar getData() {

        return data;
    }

    public void setData(Calendar data) {

        this.data = data;
    }

    public double getPorcentagemPerda() {

        return porcentagemPerda;
    }

    public void setPorcentagemPerda(double porcentagemPerda) {

        this.porcentagemPerda = porcentagemPerda;
    }

    public Contratos getContrato() {

        return contrato;
    }

    public void setContrato(Contratos contrato) {

        this.contrato = contrato;
    }

    public void imprimir(){
        //System.out.println("--- CONTRATO ---");
       //System.out.println();
        //contrato.imprimir();
        //System.out.println();
        System.out.println("--- SINISTRO ---");
        System.out.println();
        System.out.println("Data do sinistro: " + this.data.get(Calendar.DAY_OF_MONTH) + "/" + this.data.get(Calendar.MONTH) + "/" + this.data.get(Calendar.YEAR));
        System.out.println();
        System.out.println("Porcentagem de perca: " + this.porcentagemPerda + "%");
        System.out.println();
        System.out.println("----------------");
    }
}
