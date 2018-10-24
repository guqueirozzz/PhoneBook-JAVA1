package PhoneBook;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Gustavo A. Queiroz
 * RA: 222160392
 */
public class Agenda {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        ArrayList <PhoneBook> agenda = new ArrayList<>();// Criando o Arraylist
        while (true) {
            Scanner input = new Scanner(System.in);//Cria um Scanner
        
            System.out.printf("Entre com uma das seguintes opções:\n");//Menu de opções
            System.out.printf("1 - Novo Contato\n");
            System.out.printf("2 - Mostra todos os contatos adicionados na agenda\n");
            System.out.printf("3 - Apaga o contato escolhido\n");
            System.out.printf("4 - Encerra o programa\n");
            System.out.printf(" ");
            
            int in = input.nextInt();//Scanner de input do índice do menu
              
            switch (in){
                
                case (1):
                    System.out.printf("Digite o nome: \n");
                    
                    String nome = input.next();//input do nome
                    
                    System.out.printf("Digite o Meio de contato(Celular ou Telefone): \n");
                    
                    Integer telefone = input.nextInt();//Scanner de input de telefone
                    
                    agenda.add(new PhoneBook(nome, telefone));
                    break;
                    
                    
                    case (2): 
                        for(int i = 0; i < agenda.size(); i++){
                            System.out.println(agenda.get(i).getNome());
                            System.out.println(agenda.get(i).getTelefone());
                        }
                    break;
                    
            
                case (3):
                    System.out.printf("Digite o contato que deseja remover: \n");
                    
                    nome = input.next();
                    
                    for(int i = agenda.size() - 1; i >= 0; i--){
                       final PhoneBook f = agenda.get(i);
                        System.out.printf("Procurando <\n" + agenda.get(i).nome + ">");
                        if(f.nome.equals(nome)){
                            System.out.printf("Nome localizado: \n" + i);
                            
                            agenda.remove(i);
                            System.out.printf("Removido com sucesso!\n");
                        }
                    }
                    break;
                    
                
                case (4):
                    System.exit(0);
            }         
        }
    }
}