package PhoneBook;

/**
 *
 * @author Gustavo A. Queiroz
 * RA: 222160392
 */

public class PhoneBook {

    /*Variáveis da Classe Phonebook*/
    
        private int telefone;
        protected String nome;
    
    
    /**
     * Construtor da Classe
     * 
     * @param nome
     * @param telefone
     */
        
    public PhoneBook(String nome, int telefone) {
        this.nome = nome;
        
        this.telefone = telefone;
            }

    /**
     *
     * @return nome
     */
    public String getNome() {
        
        return nome;
            }

    
    public void setNome(String nome) {
        
        this.nome = nome;
            }

    /**
     *
     * @return telefone
     */
    public int getTelefone() {
        
        return telefone;
            }

    
    public void setTelefone(int telefone) {
        
        this.telefone = telefone;
             }

   

        }
