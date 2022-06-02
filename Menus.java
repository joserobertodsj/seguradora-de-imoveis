import java.util.List;
import java.util.Scanner;

public class Menus {
    Scanner leitor = new Scanner(System.in);

    public int menuPrincipal(){
        clear();
        System.out.println();
        System.out.println("*****SEGURADORA DE IMÓVEIS*****");
        System.out.println();
        System.out.println("1 - Menu de clientes");
        System.out.println("2 - Menu de contratos");
        System.out.println("3 - Menu de sinistro");
        System.out.println();
        System.out.println("0 - Sair");
        System.out.println();
        System.out.println("Digite 1, 2, 3 ou 0 para escolher uma das opções acima: ");
        int opcao = LeituraComVerificacao.lerInteiro(leitor);
        return opcao;
    }



    public int menuClientes(){
        clear();
        System.out.println();
        System.out.println("*****SEGURADORA DE IMÓVEIS*****");
        System.out.println();
        System.out.println("MENU DE CLIENTES");
        System.out.println();
        System.out.println("1 - Cadastrar clientes ");
        System.out.println("2 - Listar clientes");
        System.out.println();
        System.out.println("0 - Voltar para o Menu principal");
        System.out.println();
        System.out.println("Digite 1, 2, ou 0 para escolher uma das opções acima: ");
        int opcao = LeituraComVerificacao.lerInteiro(leitor);
        return opcao;
    }

    public int menuClienteCadastro(){
        System.out.flush();
        System.out.println();
        System.out.println("*****SEGURADORA DE IMÓVEIS*****");
        System.out.println();
        System.out.println("MENU CADASTRO DE CLIENTES");
        System.out.println();
        System.out.println("1 - Cadastrar cliente pessoa física");
        System.out.println("2 - Cadastrar cliente pessoa jurídica");
        System.out.println();
        System.out.println("0 - Voltar para o Menu principal");
        System.out.println();
        System.out.println("Digite 1, 2, ou 0 para escolher uma das opções acima: ");
        int opcao = LeituraComVerificacao.lerInteiro(leitor);
        return opcao;
    }

    public int menuContratoCadastro(){
        System.out.flush();
        System.out.println();
        System.out.println("*****SEGURADORA DE IMÓVEIS*****");
        System.out.println();
        System.out.println("MENU CADASTRO DE CONTRATOS");
        System.out.println();
        System.out.println("1 - Cadastrar contrato residencial");
        System.out.println("2 - Cadastrar contrato empresarial");
        System.out.println();
        System.out.println("0 - Voltar para o Menu principal");
        System.out.println();
        System.out.println("Digite 1, 2, ou 0 para escolher uma das opções acima: ");
        int opcao = LeituraComVerificacao.lerInteiro(leitor);
        return opcao;
    }

    public int menuContrato(){
        System.out.flush();
        System.out.println();
        System.out.println("*****SEGURADORA DE IMÓVEIS*****");
        System.out.println();
        System.out.println("MENU DE CONTRATOS");
        System.out.println();
        System.out.println("1 - Cadastrar contrato");
        System.out.println("2 - Listar contratos");
        System.out.println("3 - Listar contratos (sem sinistro)");
        System.out.println();
        System.out.println("0 - Voltar para o Menu principal");
        System.out.println();
        System.out.println("Digite 1, 2, 3 ou 0 para escolher uma das opções acima: ");
        int opcao = LeituraComVerificacao.lerInteiro(leitor);
        return opcao;
    }

    public int menuSinistro(){
        System.out.flush();
        System.out.println();
        System.out.println("*****SEGURADORA DE IMÓVEIS*****");
        System.out.println();
        System.out.println("MENU DE SINISTROS");
        System.out.println();
        System.out.println("1 - Cadastrar sinistro ");
        System.out.println("2 - Listar sinistros");
        System.out.println();
        System.out.println("0 - Voltar para o Menu principal");
        System.out.println();
        System.out.println("Digite 1, 2, ou 0 para escolher uma das opções acima: ");
        int opcao = LeituraComVerificacao.lerInteiro(leitor);
        return opcao;
    }

    public void menuClienteEncontrado(){
        System.out.flush();
        System.out.println();
        System.out.println("CLIENTE ENCONTRADO!");
        System.out.println();

    }

    public int menuClienteNaoEncontrado(){
        System.out.flush();
        System.out.println();
        System.out.println("CLIENTE NÃO ENCONTRADO!");
        System.out.println();
        System.out.println("1 - Digitar novamente");
        System.out.println("2 - Cadastrar cliente");
        System.out.println();
        System.out.println("0 - Voltar para o Menu principal");
        System.out.println();
        System.out.println("Digite 1, 2, ou 0 para escolher uma das opções acima: ");
        int opcao = LeituraComVerificacao.lerInteiro(leitor);
        return opcao;
    }

    public int menuOpcaoLocal(){
        System.out.flush();
        System.out.println();
        System.out.println("ESCOLHA O LOCAL DO IMÓVEL");
        System.out.println();
        System.out.println("1 - Urbano");
        System.out.println("2 - Suburbano");
        System.out.println("3 - Rural");
        System.out.println();
        System.out.println("Digite 1, 2, ou 3 para escolher uma das opções acima: ");
        int opcao = LeituraComVerificacao.lerInteiro(leitor);
        return opcao;
    }

    public int menuOpcaoTipo(){
        System.out.flush();
        System.out.println();
        System.out.println("ESCOLHA O TIPO DO IMÓVEL");
        System.out.println();
        System.out.println("1 - Casa");
        System.out.println("2 - Apartamento");
        System.out.println();
        System.out.println("Digite 1 ou 2 para escolher uma das opções acima: ");
        int opcao = LeituraComVerificacao.lerInteiro(leitor);
        return opcao;
    }

    public int menuOpcaoRamo(){
        System.out.flush();
        System.out.println();
        System.out.println("ESCOLHA O RAMO DO NEGÓCIO");
        System.out.println();
        System.out.println("1 - Comércio");
        System.out.println("2 - Indústria");
        System.out.println("3 - Agropecuária");
        System.out.println();
        System.out.println("Digite 1, 2 ou 3 para escolher uma das opções acima: ");
        int opcao = LeituraComVerificacao.lerInteiro(leitor);
        return opcao;
    }


    public String preencherNomeContratante(){
        System.out.flush();
        System.out.println();
        System.out.println("*****SEGURADORA DE IMÓVEIS*****");
        System.out.println();
        System.out.println("BUSCANDO CONTRATANTE");
        System.out.println();
        System.out.println("Digite o nome do contratante: ");
        String contratante = leitor.nextLine();
        return contratante;
    }

    public int menuSelecionarContrato(){
        System.out.flush();
        System.out.println();
        System.out.println("*****SEGURADORA DE IMÓVEIS*****");
        System.out.println();
        System.out.println("Digite o número do contrato: ");
        int opcao = LeituraComVerificacao.lerInteiro(leitor);
        return opcao;
    }

    public void preencherSinistro(Sinistro sinistro){
        System.out.println("*****SEGURADORA DE IMÓVEIS*****");
        System.out.println();
        System.out.println("CADASTRANDO SINISTRO");
        System.out.println();
        System.out.println("Digite a data do sinistro: ");
        System.out.println("Ano: ");
        int ano = LeituraComVerificacao.lerInteiro(leitor);

        System.out.println("Mês: ");
        int mes = LeituraComVerificacao.lerInteiro(leitor);

        System.out.println("Dia: ");
        int dia = LeituraComVerificacao.lerInteiro(leitor);

        sinistro.getData().set(ano, mes, dia);

        System.out.println("Digite a porcentagem de perda: ");
        sinistro.setPorcentagemPerda(leitor.nextDouble());
        leitor.nextLine();

    }

    private void preencherContratosDadosComuns(Contratos novo){
        System.out.println("*****SEGURADORA DE IMÓVEIS*****");
        System.out.println();
        System.out.println("--- DADOS DO CONTRATO ---");
        System.out.println();
        preencherEndereco(novo.getEndereco());
        System.out.println();
        System.out.println("Digite o valor do imóvel: R$ ");
        novo.setValorDoImovel(leitor.nextDouble());
        leitor.nextLine();
    }

    public void preencherContratoResidencial(Contratos novo){
        preencherContratosDadosComuns(novo);
        ContratoResidencial contratoResidencialAtual = ((ContratoResidencial) novo);


        try {
            switch (menuOpcaoLocal()) {
                case 1:
                    contratoResidencialAtual.setLocal(Contratos.LocalImovel.URBANO);
                    break;
                case 2:
                    contratoResidencialAtual.setLocal(Contratos.LocalImovel.SUBURBANO);
                    break;
                case 3:
                    contratoResidencialAtual.setLocal(Contratos.LocalImovel.RURAL);
                    break;
                default:
                    throw new OpcaoInvalidaException();

            }
            switch (menuOpcaoTipo()) {
                case 1:
                    contratoResidencialAtual.setTipo(Contratos.TipoImovel.CASA);
                    break;
                case 2:
                    contratoResidencialAtual.setTipo(Contratos.TipoImovel.APARTAMENTO);
                    break;
                default:
                    throw new OpcaoInvalidaException();
            }
        }catch (OpcaoInvalidaException ex){
            System.out.println("ERRO! O VALOR NÃO É UMA OPÇÃO VÁLIDA");
            preencherContratoResidencial(novo);

        }


    }

    public void preencherContratoEmpresarial(Contratos novo){
        preencherContratosDadosComuns(novo);
        ContratoEmpresarial contratoEmpresarialAtual = ((ContratoEmpresarial) novo);

        System.out.println("Digite o número de funcionários: ");
        contratoEmpresarialAtual.setNumeroDeFuncionarios(Integer.parseInt(leitor.nextLine()));

        System.out.println("Digite o número de visitas diárias: ");
        contratoEmpresarialAtual.setNumeroDeVisitasDiarias(Integer.parseInt(leitor.nextLine()));
        try{

        switch (menuOpcaoRamo()){
            case 1:
                contratoEmpresarialAtual.setRamo(Contratos.Ramo.COMERCIO);
                break;
            case 2:
                contratoEmpresarialAtual.setRamo(Contratos.Ramo.INDUSTRIA);
                break;
            case 3:
                contratoEmpresarialAtual.setRamo(Contratos.Ramo.AGROPECUARIA);
                break;
            default:
                throw new OpcaoInvalidaException();
            }
        }catch (OpcaoInvalidaException ex){
            System.out.println("ERRO! O VALOR NÃO É UMA OPÇÃO VÁLIDA");
            preencherContratoEmpresarial(novo);

        }
    }

    private void preencherEndereco(Endereco enderecoAtual){
        System.out.println();
        System.out.println("DADOS DO ENDEREÇO ");
        System.out.println();

        System.out.println("Digite a cidade: ");
        enderecoAtual.setCidade(leitor.nextLine());

        System.out.println("Digite o bairro: ");
        enderecoAtual.setBairro(leitor.nextLine());

        System.out.println("Digite a rua: ");
        enderecoAtual.setRua(leitor.nextLine());

        System.out.println("Digite o número: ");
        enderecoAtual.setNumero(LeituraComVerificacao.lerInteiro(leitor));

        System.out.println("Digite o complemento: ");
        enderecoAtual.setComplemento(leitor.nextLine());

        System.out.println("Digite o CEP: ");
        enderecoAtual.setCep(LeituraComVerificacao.lerInteiro(leitor));
    }



    private void preencherCLienteDadosComuns(Clientes novo){

        System.out.println("*****SEGURADORA DE IMÓVEIS*****");
        System.out.println();
        System.out.println("CADASTRANDO CLIENTE");
        System.out.println();
        System.out.println("Digite o nome: ");
        novo.setNome(leitor.nextLine());

        Endereco enderecoAtual = novo.getEndereco();
        preencherEndereco(enderecoAtual);
    }

    public void preencherPessoaFisica(Clientes novo){
       preencherCLienteDadosComuns(novo);

        PessoaFisica clientePfAtual = ((PessoaFisica) novo);

        System.out.println("Digite o CPF: ");
        clientePfAtual.setCpf((leitor.nextLong()));
        leitor.nextLine();

        System.out.println("Digite a data de nascimento: ");
        System.out.println("Ano: ");
        int ano = LeituraComVerificacao.lerInteiro(leitor);

        System.out.println("Mês: ");
        int mes = LeituraComVerificacao.lerInteiro(leitor);

        System.out.println("Dia: ");
        int dia = LeituraComVerificacao.lerInteiro(leitor);

        clientePfAtual.getDataDeNascimento().set(ano, mes, dia);
    }

    public void preencherPessoaJuridica(Clientes novo){

        preencherCLienteDadosComuns(novo);

        PessoaJuridica clientePjAtual = ((PessoaJuridica) novo);

        System.out.println("Digite o CNPJ: ");
        clientePjAtual.setCnpj(leitor.nextLong());
        leitor.nextLine();

        System.out.println("Digite o nome fantasia: ");
        clientePjAtual.setNomeFantasia(leitor.nextLine());
    }

    public void menuListarClientes(List<Clientes> listaClientes){
        int contador = 0;
        for(int i = 0; i< listaClientes.size(); i++){
            System.out.println(++contador + "-");
            System.out.println("------------------");
            listaClientes.get(i).imprimir();
            System.out.println();
        }
        if(contador == 0){

            System.out.println("NENHUM RESULTADO ENCONTRADO!");
        }

    }

    public void menuListarContratos(List<Contratos> listaContratos){
        int contador = 0;
        for(int i = 0; i < listaContratos.size(); i++){
            System.out.println(++contador + "- ");
            System.out.println("------------------");

            listaContratos.get(i).imprimir();
            System.out.println();
        }
        if(contador == 0){

            System.out.println("NENHUM RESULTADO ENCONTRADO!");
        }
    }

    public void menuListarContratos(List<Contratos> listaContratos, Clientes cliente){
        int contador = 0;
        System.out.println("--- " + cliente.getNome().toUpperCase() + " ---");
        System.out.println();
        System.out.println("Contratos:");
        System.out.println();

        for(int i = 0; i < listaContratos.size(); i++){
            if(listaContratos.get(i).getContratante().equals(cliente)){
                System.out.println(++contador + "- ");
                System.out.println("------------------");

                listaContratos.get(i).imprimir();
                System.out.println();
            }
        }
        if(contador == 0){

            System.out.println("NENHUM RESULTADO ENCONTRADO!");
        }
    }

    public void menuListarSinistro(List<Contratos> listaContratos, List<Sinistro> listaSinistros){
        int contador = 0;
        boolean encontrado = false;

        for (int i = 0; i < listaContratos.size(); i++){
            if(listaContratos.get(i).getTemSinistro()){
                encontrado = true;
                System.out.println("--- CONTRATO ---");
                listaContratos.get(i).imprimir();
                System.out.println();
                for(int j = 0; j < listaSinistros.size(); j++){
                    if(listaContratos.get(i).getTemSinistro() && listaContratos.get(i).equals(listaSinistros.get(j).getContrato())){
                        System.out.println("#" + ++contador + "-");
                        listaSinistros.get(j).imprimir();
                    }
                }
                contador = 0;
            }
        }
        if(!encontrado){
            System.out.println("NENHUM RESULTADO ENCONTRADO!");
        }


    }

    public void menuListarContratosSemSinistro(List<Contratos> listaContratos){
        int contador = 0;
        for(int i = 0; i < listaContratos.size(); i++){
            if(!listaContratos.get(i).getTemSinistro()){
                System.out.print(++contador + "- ");
                System.out.println("------------------");
                listaContratos.get(i).imprimir();
            }

        }
        if(contador == 0){

            System.out.println("NENHUM RESULTADO ENCONTRADO!");
        }
    }

    public final static void clear() {
        try
        {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows"))
            {
                Runtime.getRuntime().exec("cls");
            }
            else
            {
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (final Exception e)
        {

        }
    }

    public void exibeSucesso(String tipo){
        System.out.println(tipo + " cadastrado com sucesso!");
        System.out.println();
    }

    public void pressioneEnterParaContinuar(){
        System.out.println("Pressione ENTER para continuar");
        System.out.println();
        leitor.nextLine();
    }


}
