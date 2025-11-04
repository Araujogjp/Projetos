import java.util.ArrayList;
import java.util.Scanner;
public class GerenciarFornecedores {
    private ArrayList<Fornecedor> listFornecedores = new ArrayList<>(); // Lista de Fornecedores
    private Scanner sc = new Scanner(System.in);
    
    public Fornecedor buscarCod(int codigo){ // Método Buscador de Códigos
        for(Fornecedor f: listFornecedores){ // Percorrer a lista de Fornecedores
            if(f.getCodForn() == codigo){ 
                return f;
            }
        }
        return null;
    }
   
    // Cadastro de Fornecedores
    public void cadastrar(){
        while (true){
          System.out.println("Cadastro de Fornecedores");
          
          System.out.println("Digite o Código de Fornecedor: ");
          int codForn = sc.nextInt();
          sc.nextLine();
          
          if(codForn <= 0){ // Tratamento de Erro
            System.out.println("Código inválido");
            continue;
          }
          
          if(!listFornecedores.isEmpty()){ // Se a lista não estiver vazia execute o código
              Fornecedor fornExistente = buscarCod(codForn);
              if(fornExistente != null){
                  System.out.println("Esse código já está ligado a outro fornecedor");
                  continue;
              }
          }
          
          
          
          System.out.println("Nome: "); // Pegar Nome
          String nomeForn = sc.nextLine();
          if(nomeForn.isEmpty()){ // Não deixar o nome ser vazio
              System.out.println("Nome é Obrigatório");
              continue;
          }
          else{
            if(nomeForn.length() > 255){ // Limite é de 255 caracteres
               System.out.println("O limite é de 255 caracteres");
               continue;
            }
          }
          
          System.out.println("Rua: "); // Pegar o nome da Rua
          String ruaForn = sc.nextLine();
          if(ruaForn.isEmpty()){ // Não deixar o nome ser vazio
            System.out.println("Nome da Rua é obrigatório");
            continue;
          }
          else{
              if(ruaForn.length() > 255){ // Limite é de 255 caracteres
                System.out.println("O limite é de 255 caracteres");
                continue;
              }
          }
          
          System.out.println("Bairro: "); // Pegar o nome do Bairro
          String bairroForn = sc.nextLine();
          if(bairroForn.isEmpty()){ // Nome do Bairro não pode ser vazio
            System.out.println("Nome do Bairro é obrigatório");
            continue;
          }
          else{
              if(bairroForn.length() > 60){ // Limite de caracteres é 60
                System.out.println("O limite é de 60 caracteres");
                continue;
              }
          }
          
          System.out.println("Cidade: "); // Pegar o nome da cidade
          String cidadeForn = sc.nextLine();
          if(cidadeForn.isEmpty()){ // Nome da cidade não pode ser vazio
            System.out.println("Nome da cidade é obrigatório");
            continue;
          }
          else{
              if(cidadeForn.length() > 60){ // Limite de caracteres é 60
                System.out.println("O limite é de 60 caracteres");
                continue;
              }
          }
          
          System.out.println("Uf: "); // Pegar o Uf
          String ufForn = sc.nextLine();
          if(ufForn.isEmpty()){ // Uf não pode estar vazio
            System.out.println("Uf é obrigatório");
            continue;
          }
          else{
            if(ufForn.length() > 2){ // Limite de caraceteres é 2
               System.out.println("O limite é de 2 caracteres");
               continue;
            }
          }
          
          System.out.println("Cep: "); // Pegar o cep
          String cepForn = sc.nextLine();
          if(cepForn.isEmpty()){ // Cep não pode estar vazio
            System.out.println("Cep é obrigatório");
            continue;
          }
          else{
            if(cepForn.length() > 10){ // Limite de caracteres é 10
               System.out.println("O limite é de 10 caracteres");
               continue;
            }
          }
          
          System.out.println("Telefone: "); // Pegar o Telefone
          String telefoneForn = sc.nextLine(); 
          if(telefoneForn.isEmpty()){ // Telefone não pode estar vazio
            System.out.println("Telefone é obrigatório");
            continue;
          }
          else{
            if(telefoneForn.length() > 20){ // Limite de caracteres é 20
               System.out.println("O limite é de 20 caracteres");
               continue;
            }
          }
          Fornecedor forn = new Fornecedor(codForn, nomeForn, ruaForn, bairroForn, cidadeForn, ufForn, cepForn, telefoneForn); // Chamar o Construtor
          listFornecedores.add(forn); // Adicionando o Fornecedor na Lista
          System.out.println("Fornecedor cadastrado com sucesso");
          break;
        }
    }
    
    // Alteração de Dados dos fornecedores
    public void alterar(){
        System.out.println("Alterar Produtos");
        System.out.println("Se não deseja alterar apenas clique enter");
       
        System.out.println("Digite o código do Fornecedor: ");
        int codAlterarForn = sc.nextInt(); // Pegar o código 
        sc.nextLine();
       
        Fornecedor fornAlterar = buscarCod(codAlterarForn); // Criar uma caixa e chamar o método buscador de códigos
       
        if(fornAlterar == null){ // Se a caixa estiver vazia/Nula retorna pro inicio do método
            System.out.println("Esse Fornecedor não existe em nosso banco de dados");
            return;
        }
        
        System.out.println("Novo nome: ");
        String novoNomeForn = sc.nextLine();
        if(!novoNomeForn.isEmpty()){ // Se a variável novoNomeForn não estiver vazia o nome é alterado
            fornAlterar.setNomeForn(novoNomeForn);
            System.out.println("Nome alterado com sucesso!");
        }
        
        System.out.println("Nova Rua: ");
        String novaRuaForn = sc.nextLine();
        if(!novaRuaForn.isEmpty()){ // Verificar se a variável não está vazia
            fornAlterar.setRuaForn(novaRuaForn);
            System.out.println("Rua alterada com sucesso!");
        }
        
        System.out.println("Novo bairro: ");
        String novoBairroForn = sc.nextLine();
        if(!novoBairroForn.isEmpty()){ // Verificar se a variável não está vazia
            fornAlterar.setBairroForn(novoBairroForn);
            System.out.println("Bairro alterado com sucesso");
        }
        
        System.out.println("Nova Cidade: ");
        String novaCidadeForn = sc.nextLine(); 
        if(!novaCidadeForn.isEmpty()){ // Verificar se a variável não está vazia
            fornAlterar.setCidadeForn(novaCidadeForn);
            System.out.println("Cidade alterada com sucesso!");
        }
        
        System.out.println("Novo Uf: ");
        String novoUfForn = sc.nextLine();
        if(!novoUfForn.isEmpty()){ // Verificar se a variável não está vazia
            fornAlterar.setUfForn(novoUfForn);
            System.out.println("Uf alterado com sucesso!");
        }
        
        System.out.println("Novo Cep: ");
        String novoCepForn = sc.nextLine();
        if(!novoCepForn.isEmpty()){ // Verificar se a variável não está vazia
            fornAlterar.setCepForn(novoCepForn);
            System.out.println("Cep alterado com sucesso!");
        }
        
        System.out.println("Novo Telefone: ");
        String novoTelForn = sc.nextLine();
        if(!novoTelForn.isEmpty()){ // Verificar se a variável não está vazia
            fornAlterar.setTelefoneForn(novoNomeForn);
            System.out.println("Telefone alterado com sucesso!");
        }
        
        System.out.println("Alterações cadastradas com sucesso!"); 
    }
    
    // Consulta de Fornecedores
    public void consultar(){
        System.out.println("Consultar Fornecedor");
        System.out.println("Digite o código do Fornecedor: "); // Pegar o código para consulta
        int codFornConsultar = sc.nextInt();
        sc.nextLine();
        
        Fornecedor fornConsultar = buscarCod(codFornConsultar); // Criar uma caixa e chamar o método de busca de código
        
        if(fornConsultar == null){ // Verificar se a caixa está vazia 
           System.out.println("Fornecedor não encontrado no nosso banco de dados");
           return; // Retorna caso a caixa esteja vazia
        }
        
        // Continua caso a caixa não esteja vazia e mostra os dados do fornecedor
        System.out.println("Dados do Fornecedor");
        System.out.println("Fornecedor: "+fornConsultar.getNomeForn());
        System.out.println("Código: "+fornConsultar.getCodForn());
        System.out.println("Rua: "+fornConsultar.getRuaForn());
        System.out.println("Bairro: "+fornConsultar.getBairroForn());
        System.out.println("Cidade: "+fornConsultar.getCidadeForn());
        System.out.println("Uf: "+fornConsultar.getUfForn());
        System.out.println("Cep: "+fornConsultar.getCepForn());
        System.out.println("Telefone: "+fornConsultar.getTelefoneForn());
    }
    
    // Remover fornecedores
    public void remover(){
        System.out.println("Remover Fornecedores");
        System.out.println("Digite o código do Fornecedor: ");
        int codFornRemover = sc.nextInt();
        sc.nextLine();
        
        Fornecedor fornRemover = buscarCod(codFornRemover); // Criar uma caixa
        
        if(fornRemover == null){ // Veririficar se a caixa está nula
           System.out.println("Fornecedor não encontrado no nosso banco de dados");
           return;
        }
        
        System.out.println("Deseja mesmo remover?");
        System.out.println("[1] Para confirmar e [Qualquer outro número] Para cancelar: "); // Confirmar a remoção
        int opcao = sc.nextInt();
        sc.nextLine();
        if(opcao == 1){ // Remover
            listFornecedores.remove(fornRemover);
            System.out.println("Fornecedor removido com sucesso!");
        }
        else{ // Não Remover
            System.out.println("Operação cancelada");
            return;
        }
    }
    
    // Lista de Todos os fornecedores
    public void listarTds(){
        System.out.println("Lista de todos os Fornecedores");
        
        if(listFornecedores.isEmpty()){
            System.out.println("Nenhum Fornecedor cadastrado");
            return;
        }
        for(Fornecedor f: listFornecedores){
            System.out.println("Fornecedor: "+f.getNomeForn());
            System.out.println("Código: "+f.getCodForn());
            System.out.println("Rua: "+f.getRuaForn());
            System.out.println("Bairro: "+f.getBairroForn());
            System.out.println("Cidade: "+f.getCidadeForn());
            System.out.println("Uf: "+f.getUfForn());
            System.out.println("Cep: "+f.getCepForn());
            System.out.println("Telefone: "+f.getTelefoneForn());
        }
    }
}
