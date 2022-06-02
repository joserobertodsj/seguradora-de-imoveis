import java.util.InputMismatchException;
import java.util.Scanner;

public class LeituraComVerificacao {

    public static int lerInteiro(Scanner leitor){
        String entrada = "";
        int op = -1;

        try{
            entrada = leitor.nextLine();
            if(entrada.matches("[0-9]+")){
                op = Integer.parseInt(entrada);
            }else{
                throw new NaoEInteiroException();
            }

        }catch (InputMismatchException | NaoEInteiroException ex){ //NaoEInteiroException quando for digitado letra e número e a input quando for digitado só letras (padrao do java)
            System.out.println("ERRO! DIGITE APENAS NÚMEROS.");
            op = lerInteiro(leitor);

        }
        return op;

    }
}
