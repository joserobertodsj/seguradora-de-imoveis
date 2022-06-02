import java.io.Serializable;

public class ContratoResidencial extends Contratos implements Serializable {
    private LocalImovel local;
    private TipoImovel tipo;

    public LocalImovel getLocal() {
        return local;
    }

    public void setLocal(LocalImovel local) {
        this.local = local;
    }

    public TipoImovel getTipo() {
        return tipo;
    }

    public void setTipo(TipoImovel tipo) {
        this.tipo = tipo;
    }

    public double calculaSeguro(){
        double porcentagem = 2;
        if(local == LocalImovel.URBANO){
            porcentagem += 1;
        }else if(local == LocalImovel.SUBURBANO){
            porcentagem += 0.5;
        }

        if(tipo == TipoImovel.CASA){
            porcentagem += 0.5;
        }

        return getValorDoImovel() * porcentagem/100;

    }

    @Override
    public void imprimir() {
        getContratante().imprimir();
        getEndereco().imprimir();
        System.out.println("Valor do imóvel: " + getValorDoImovel());
        System.out.println("Local do imóvel: " + local);
        System.out.println("Tipo do imóvel: " + tipo);
    }
}
