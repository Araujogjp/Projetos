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
                if(cliExistente.getCodigoCli() == codigoCli){ // Verifica se o novo código cadastrado já existe na lista
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
                if(ufCli.length() > 2){ // Verifica o tamanho da String
                    System.out.println("O limite é de 2 caracteres");
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
}
