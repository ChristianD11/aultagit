

public class Pessoa {
    String nome;
    double salario;

    // this.nome se refere ao Atributo
    // nome se refere ao parâmetro

    public Pessoa(String nome, double salario)  {
        this.nome = nome; // this = prprio objeto
        this.salario = salario;
    }

    public Pessoa () {
        nome = "sem cadastro";
    }

    public void exibir() {
        System.out.println(nome + ", " + salario);

    }
}
