import java.io.Serializable;

public class ContratoEmpresarial extends Contratos implements Serializable {
    private int numeroDeFuncionarios;
    private int numeroDeVisitasDiarias;
    private Ramo ramo;

    public int getNumeroDeFuncionarios() {
        return numeroDeFuncionarios;
    }

    public void setNumeroDeFuncionarios(int numeroDeFuncionarios) {
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    public int getNumeroDeVisitasDiarias() {
        return numeroDeVisitasDiarias;
    }

    public void setNumeroDeVisitasDiarias(int numeroDeVisitasDiarias) {
        this.numeroDeVisitasDiarias = numeroDeVisitasDiarias;
    }

    public Ramo getRamo() {
        return ramo;
    }

    public void setRamo(Ramo ramo) {
        this.ramo = ramo;
    }

    @Override // SOBRESCREVE O MÉTODO ABSTRATO
    public double calculaSeguro() {
        double porcentagem = 4;
        int auxiliar = numeroDeFuncionarios / 10;
        porcentagem += auxiliar*0.2;
        auxiliar = numeroDeVisitasDiarias / 200;
        porcentagem += auxiliar * 0.3;

        if(ramo == Ramo.INDUSTRIA){
            porcentagem += 1;
        }else if (ramo == Ramo.COMERCIO){
            porcentagem += 0.5;
        }
        return getValorDoImovel() * porcentagem/100;
    }

    @Override
    public void imprimir() {
        getContratante().imprimir();
        getEndereco().imprimir();
        System.out.println("Valor do imóvel: " + getValorDoImovel());
        System.out.println("Número de funcionários: " + numeroDeFuncionarios);
        System.out.println("Número de visitas diárias: " + numeroDeVisitasDiarias);
        System.out.println("Ramo: " + ramo);
    }
}
