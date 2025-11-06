import java.util.ArrayList;
import java.util.Scanner;
public class GerenciarClientes {
    
    private ArrayList<Cliente> listClientes = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    public Cliente buscarCodCli(int codigo){ // Método buscador de Código
        for(Cliente c : listClientes){
            if(c.getCodigoCli() == codigo){
                return c;
            }
        }
        return null;
    }
    
    // Cadastro de Clientes
    public void cadastrar(){
        while(true){
           System.out.println("Cadastro de Clientes");
        
            System.out.println("Digite o códgido do cliente: ");
            int codigoCli = sc.nextInt();
            sc.nextLine();  
            
            if(codigoCli <= 0){ // Tratamento de erro
                System.out.println("Código não pode ser menor que 0");
                continue;
            }
            
            if(!listClientes.isEmpty()){ // Verificar se a lista não está vazia
                Cliente cliExistente = buscarCodCli(codigoCli);
                if(cliExistente != null){ // Verifica se o novo código cadastrado já existe na lista
                    System.out.println("Esse código já está ligado a um Cliente");
                    continue;
                }
            }
            
            System.out.println("Nome: ");
            String nomeCli = sc.nextLine();
            if(nomeCli.isEmpty()){ // verifica se o Nome está vazio
                System.out.println("Nome é obrigatório");
                continue;
            }
            else{
                if(nomeCli.length() > 255){ // Verifica o tamanho da String
                    System.out.println("O limite é de 255 caracteres");
                    continue;
                }
            }
            
            System.out.println("Rua: ");
            String enderecoCli = sc.nextLine();
            if(enderecoCli.isEmpty()){ // Verifica se o nome da rua está vazio
                System.out.println("Nome da Rua é obrigatório");
                continue;
            }
            else{
                if(enderecoCli.length() > 255){ // Verifica o tamanho da string
                    System.out.println("O limite é de 255 caracteres");
                    continue;
                }
            }
            
            System.out.println("Bairro: ");
            String bairroCli = sc.nextLine();
            if(bairroCli.isEmpty()){ // Verifica se o nome do bairro está vazio
               System.out.println("Nome do Bairro é obrigatório");
               continue;
            }
            else{
                if(bairroCli.length() > 60){ // Verifica o tamanho da string
                    System.out.println("O limite é de 60 caracteres");
                    continue;
                }
            }
            
            System.out.println("Cidade: ");
            String cidadeCli = sc.nextLine(); 
            if(cidadeCli.isEmpty()){ // Verifica se o nome da cidade está vazio
                System.out.println("Nome da Cidade é obrigatório");
                continue;
            }
            else{
                if(cidadeCli.length() > 60){ // Verifica o tamanho da String
                    System.out.println("O limite é de 60 caracteres");
                    continue;
                }
            }
            
            System.out.println("Uf: ");
            String ufCli = sc.nextLine();
            if(ufCli.isEmpty()){ // Verifica se o uf está vazio
                System.out.println("Uf é obrigatório");
                continue;
            }
            else{
                if(ufCli.length() != 2){ // Verifica o tamanho da String
                    System.out.println("Uf deve possuir dois caracteres");
                    continue;
                }
            }
            
            System.out.println("Cep: ");
            String cepCli = sc.nextLine();
            if(cepCli.isEmpty()){ // Verifica se o cep está vazio
                System.out.println("Cep é obrigatório");
                continue;
            }
            else{
                if(cepCli.length() > 10){ // Verifica o tamanho da String
                    System.out.println("O limite é de 10 caracteres");
                    continue;
                }
            }
            
            System.out.println("Telefone: ");
            String telefoneCli = sc.nextLine();
            if(telefoneCli.isEmpty()){ // Verifica se o Telefone está vazio
                System.out.println("Telefone é obrigatório");
                continue;
            }
            else{
                if(telefoneCli.length() > 20){ // Verifica o tamanho da String
                    System.out.println("O limite é de 20 caracteres");
                    continue;
                }
            }
            
            
            System.out.println("Cpf: ");
            String cpf = sc.nextLine();
            if(cpf.isEmpty()){ // Verifica se o cpf está vazio
                System.out.println("Cpf é obrigatório");
                continue;
            }
            else{
                if(cpf.length() > 11){ // Verifica o tamanho da String
                    System.out.println("O limite é de 11 caracteres");
                    continue;
                }
            }
            
            System.out.println("Rg: ");
            String rg = sc.nextLine();
            if(rg.isEmpty()){ // Verifica se o rg está vazio
               System.out.println("Rg é obrigatório");
               continue;
            }
            else{
                if(rg.length() > 10){ // Verifica o tamanho da String
                    System.out.println("O limite é de 10 caracteres");
                    continue;
                }
            }
            
            Cliente c  = new Cliente(codigoCli, nomeCli, enderecoCli, bairroCli, cidadeCli, ufCli, cepCli, telefoneCli, cpf, rg); // Chamar o construtor
            listClientes.add(c); // Adiciona o cliente na lista
            System.out.println("Cliente cadastrado com sucesso");
        }
    }
    
    // Editar Clientes
    public void alterar(){
        System.out.println("Consultar informações de Clientes");
        System.out.println("Se não deseja alterar o dado em questão apenas clique enter");
        System.out.println("Digite o código de Cliente: ");
        int codCliAlterar = sc.nextInt();
        sc.nextLine();
        
        Cliente cliAlterar = buscarCodCli(codCliAlterar); // Cria uma caixa e chama o método
        
        if(cliAlterar == null){
            System.out.println("Nenhum Cliente de código: "+codCliAlterar+" encontrado no nosso banco de dados");
            return;
        }
        
        System.out.println("Novo nome: ");
        String novoNomeCli = sc.nextLine();
        if(!novoNomeCli.isEmpty()){ // Verificar se a String não está vazia
            cliAlterar.setNome(novoNomeCli);
            System.out.println("Nome alterado com sucesso!");
        }
        
        System.out.println("Nova Rua: ");
        String novaRuaCli = sc.nextLine();
        if(!novaRuaCli.isEmpty()){ // Verificar se a String não está vazia
            cliAlterar.setEndereco(novaRuaCli);
            System.out.println("Rua alterada com sucesso!");
        }
        
        System.out.println("Novo Bairro: ");
        String novoBairroCli = sc.nextLine();
        if(!novoBairroCli.isEmpty()){ // Verificar se a String não está vazia
            cliAlterar.setBairro(novoBairroCli);
            System.out.println("Novo bairro cadastrado com sucesso!");
        }
        
        System.out.println("Nova cidade: ");
        String novaCidadeCli = sc.nextLine();
        if(!novaCidadeCli.isEmpty()){ // Verificar se a String não está vazia
            cliAlterar.setCidade(novaCidadeCli);
            System.out.println("Nova cidade cadastrada com sucesso!");
        }
        
        System.out.println("Novo Uf: ");
        String novoUfCli = sc.nextLine();
        if(!novoUfCli.isEmpty()){ // Verificar se a String não está vazia
            cliAlterar.setUf(novoUfCli);
            System.out.println("Novo Uf cadastrado com sucesso!");
        }
        
        System.out.println("Novo Cep: ");
        String novoCepCli = sc.nextLine();
        if(!novoCepCli.isEmpty()){ // Verificar se a String não está vazia
            cliAlterar.setCep(novoCepCli);
            System.out.println("Novo Cep cadastrado com sucesso!");
        }
        System.out.println("Alterações realizadas com sucesso!");
    }
    
    // Consultar clientes
    public void consultar(){
       System.out.println("Consultar Cliente");
        System.out.println("Digite o código do cliente: ");
        int codCliConsultar = sc.nextInt();
        
        Cliente cliConsultar = buscarCodCli(codCliConsultar); // Criando uma caixa e buscando o código
        
        if(cliConsultar == null){ // Verificar se a caixa está vazia
           System.out.println("Nenhum cliente de código: "+codCliConsultar+" encontrado no banco de dados");
           return;
        }
        
        // Se a caixa não estiver vazia os prints são acionados
        System.out.println("Dados do Cliente: ");
        System.out.println("Nome: "+cliConsultar.getNomeCli());
        System.out.println("Rua: "+cliConsultar.getEnderecoCli());
        System.out.println("Bairro: "+cliConsultar.getBairroCli());
        System.out.println("Cidade: "+cliConsultar.getCidadeCli());
        System.out.println("Uf: "+cliConsultar.getUfCli());
        System.out.println("Cep: "+cliConsultar.getCepCli());
        System.out.println("Telefone: "+cliConsultar.getTelefoneCli());
    }
    
    public void remover(){
        System.out.println("Remover ");
        System.out.println("Digite o código do cliente: ");
        int codCliRemover = sc.nextInt();
        sc.nextLine();
        
        Cliente cliRemover = buscarCodCli(codCliRemover); // Criando uma caixa e buscando o código
        if(cliRemover == null){ // Verificar se a caixa está vazia
            System.out.println("Nenhum cliente com o código: "+codCliRemover+" encontrado no banco de dados");
            return;
        }
        
        System.out.println("Deseja remover mesmo?");
        System.out.println("Digite 1(Sim):  ");
        System.out.println("Digite 2(Não): ");
        System.out.println("Opção: ");
        int opcao = sc.nextInt();
        sc.nextLine();
        if(opcao == 1){
            listClientes.remove(cliRemover);
            System.out.println("Cliente removido com sucesso!");
        }
        else{
            System.out.println("Operação cancelada");
        }
    }
    
    public void listarTds(){
        if(listClientes.isEmpty()){
            System.out.println("Nenhum cliente cadastrado");
            return;
        }
        for(Cliente c: listClientes){
                System.out.println("Dados do Cliente: "+c.getNomeCli());
                System.out.println("Código: "+c.getCodigoCli());
                System.out.println("Rua: "+c.getEnderecoCli());
                System.out.println("Bairro: "+c.getBairroCli());
                System.out.println("Cidade: "+c.getCidadeCli());
                System.out.println("Uf: "+c.getUfCli());
                System.out.println("Cep: "+c.getCepCli());
                System.out.println("Telefone: "+c.getTelefoneCli());
       }
    }
}
