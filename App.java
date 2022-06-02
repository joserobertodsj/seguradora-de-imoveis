import java.io.File;
import java.io.IOException;


public class App {
    public static void main(String[] args) {

        String nomeArquivo = "Seguradora.ser";
        Seguradora seguradora;

        File teste = new File(nomeArquivo);

        if(teste.exists()){
            seguradora = null;
            try {
                seguradora = (Seguradora) Serializador.deserializar(nomeArquivo);
            } catch (ClassNotFoundException | IOException e) {
                e.printStackTrace();
            }

        }else{
            seguradora = new Seguradora();

        }

        seguradora.executa();

        try {
            Serializador.serializar(seguradora, nomeArquivo);
        } catch (IOException ex) {
            ex.printStackTrace();
            return;
        }
    }
}
