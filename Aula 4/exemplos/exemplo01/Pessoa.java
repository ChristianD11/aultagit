
public class Pessoa {
    //atributos - característica
    String nome;
    String telefone;

    //metodos - ações
    void apresentar() {
        System.out.println("Olá! Eu sou " + nome);
    }

    String obterTelefone() {
        return telefone;
    }    
    
}