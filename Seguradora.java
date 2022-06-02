import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Seguradora implements Serializable {
    private List<Clientes> listaClientes;
    private List<Contratos> listaContratos;
    private List<Sinistro> listaSinistro;
    //private Menus menu;

    public Seguradora(){
        this.listaClientes = new ArrayList<Clientes>();
        this.listaContratos = new ArrayList<Contratos>();
        this.listaSinistro = new ArrayList<Sinistro>();
        //this.menu = new Menus();
    }

    public List<Clientes> getListaClientes() {

        return listaClientes;
    }

    public void setListaClientes(List<Clientes> listaClientes) {

        this.listaClientes = listaClientes;
    }

    public List<Contratos> getListaContratos() {

        return listaContratos;
    }

    public void setListaContratos(List<Contratos> listaContratos) {

        this.listaContratos = listaContratos;
    }

    public List<Sinistro> getListaSinistro() {

        return listaSinistro;
    }

    public void setListaSinistro(List<Sinistro> listaSinistro) {

        this.listaSinistro = listaSinistro;
    }

    public void executa(){
        Menus menu = new Menus();

        while(true) {
            try {


                switch (menu.menuPrincipal()) {
                    case 1:
                        Clientes novoCliente; // Clientes assume duas formas - física ou jurídica - Polimorfismo
                        switch (menu.menuClientes()) {
                            case 1:
                                cadastrarCliente();
                                break;
                            case 2:
                                menu.menuListarClientes(listaClientes);
                                break;
                            case 0:
                                break;
                            default:
                                throw new OpcaoInvalidaException();

                        }
                        break;
                    case 2:
                        switch (menu.menuContrato()) {
                            case 1:
                                cadastrarContrato();
                                break;
                            case 2:
                                menu.menuListarContratos(listaContratos);
                                break;
                            case 3:
                                menu.menuListarContratosSemSinistro(listaContratos);
                                break;
                            case 0:
                                break;
                            default:
                                throw new OpcaoInvalidaException();
                        }
                        break;
                    case 3:
                        switch (menu.menuSinistro()) {
                            case 1:
                                cadastrarSinistro();
                                break;
                            case 2:
                                menu.menuListarSinistro(listaContratos, listaSinistro);
                            default:
                                throw new OpcaoInvalidaException();
                        }
                        break;
                    case 0:
                        return;
                    default:
                        throw new OpcaoInvalidaException();


                }
            }catch (OpcaoInvalidaException ex){
                System.out.println("ERRO! O VALOR NÃO É UMA OPÇÃO VÁLIDA");

            }
        }
    }

    public void salvarClientesLista(Clientes cliente){

        listaClientes.add(cliente);
    }

    public void salvarContratoLista(Contratos contrato){

        listaContratos.add(contrato);
    }

    public void salvarSinistroLista(Sinistro sinistro){

        listaSinistro.add(sinistro);
    }


    private Clientes buscaContratante(String nomeContratante){
        Clientes buscaClientes;
        for(int i = 0; i < listaClientes.size(); i++){
            if(this.listaClientes.get(i).getNome().equalsIgnoreCase(nomeContratante)){
                buscaClientes = listaClientes.get(i);
                return buscaClientes;


            }
        }
        return buscaClientes = null;
    }

    private Clientes cadastrarCliente(){
        Clientes novoCliente;
        Menus menu = new Menus();
        switch (menu.menuClienteCadastro()){
            case 1:
                novoCliente = new PessoaFisica();
                menu.preencherPessoaFisica(novoCliente);
                salvarClientesLista(novoCliente);
                break;


            case 2:
                novoCliente = new PessoaJuridica();
                menu.preencherPessoaJuridica(novoCliente);
                salvarClientesLista(novoCliente);
                break;

            default:
                novoCliente = new PessoaFisica();
        }
        menu.exibeSucesso("Cliente");
        return novoCliente;

    }

    private void cadastrarContrato(){
        Contratos novoContrato;
        Menus menu = new Menus();
        Clientes clienteTemporario;
        boolean repetir = false;

        switch (menu.menuContratoCadastro()){
            case 1:
                novoContrato = new ContratoResidencial();
                 do{
                     clienteTemporario = buscaContratante(menu.preencherNomeContratante());
                    if(clienteTemporario == null){
                        switch (menu.menuClienteNaoEncontrado()){
                            case 1:
                                repetir = true;
                                break;
                            case 2:
                                novoContrato.setContratante(cadastrarCliente());
                                menu.preencherContratoResidencial(novoContrato);
                                salvarContratoLista(novoContrato);
                                menu.exibeSucesso("Contrato");
                                break;
                            case 0:
                                return;
                        }
                    }else{
                        menu.menuClienteEncontrado();
                        novoContrato.setContratante(clienteTemporario);
                        menu.preencherContratoResidencial(novoContrato);
                        salvarContratoLista(novoContrato);
                        menu.exibeSucesso("Contrato");
                        break;
                    }

                }while(repetir);
                break;

            case 2:
                novoContrato = new ContratoEmpresarial();
                do{
                    clienteTemporario = buscaContratante(menu.preencherNomeContratante());
                    if(clienteTemporario == null){

                        switch (menu.menuClienteNaoEncontrado()){
                            case 1:
                                repetir = true;
                                break;
                            case 2:
                                novoContrato.setContratante(cadastrarCliente());
                                menu.preencherContratoEmpresarial(novoContrato);
                                salvarContratoLista(novoContrato);
                                menu.exibeSucesso("Contrato");
                                break;
                            case 0:
                               return;
                        }
                    }else{
                        menu.menuClienteEncontrado();
                        novoContrato.setContratante(clienteTemporario);
                        menu.preencherContratoEmpresarial(novoContrato);
                        salvarContratoLista(novoContrato);
                        menu.exibeSucesso("Contrato");
                        break;
                    }
                }while(repetir);
                break;
        }

    }

    public void cadastrarSinistro(){

        Menus menu = new Menus();
        Sinistro novoSinistro = new Sinistro();
        Clientes clienteTemporario;
        boolean repetir = false;

        do{
            clienteTemporario = buscaContratante(menu.preencherNomeContratante());
            if(clienteTemporario == null){
                switch (menu.menuClienteNaoEncontrado()){
                    case 1:
                        repetir = true;
                        break;
                    case 2:
                        cadastrarCliente();
                        break;
                    case 0:
                        return;
                }
            }else{
                menu.menuListarContratos(this.listaContratos, clienteTemporario);
                Contratos contratoDoClienteTemporario = selecionaContrato(menu.menuSelecionarContrato(), clienteTemporario);
                novoSinistro.setContrato(contratoDoClienteTemporario);
                contratoDoClienteTemporario.setTemSinistro(true);
                menu.preencherSinistro(novoSinistro);
                salvarSinistroLista(novoSinistro);
                menu.exibeSucesso("Sinistro");
            }
        }while (repetir);

    }

    public Contratos selecionaContrato(int posicaoContrato, Clientes cliente){
        int contador = 0;
        //Contratos contrato;
        for(int i = 0; i < listaContratos.size(); i ++){
            if(listaContratos.get(i).getContratante().equals(cliente)){
                contador +=1;
                if(contador == posicaoContrato){
                    return listaContratos.get(i);
                }
            }

        }
        return null;

    }
}
