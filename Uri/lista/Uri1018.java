import java.util.Scanner;

public class Uri1018
{
    public static void main(String[] args){

        Scanner valor = new Scanner(System.in);

        int ValorDoCusto;

        ValorDoCusto = valor.nextInt(); 
            System.out.println(ValorDoCusto);
        System.out.println(ValorDoCusto/100 + " nota(s) de R$ 100,00");
            ValorDoCusto = ValorDoCusto % 100;
        System.out.println(ValorDoCusto/50 + " nota(s) de R$ 50,00");
            ValorDoCusto = ValorDoCusto % 50;
        System.out.println(ValorDoCusto/20 + " nota(s) de R$ 20,00");
            ValorDoCusto = ValorDoCusto% 20;
        System.out.println(ValorDoCusto/10 + " nota(s) de R$ 10,00");
            ValorDoCusto = ValorDoCusto % 10;
        System.out.println(ValorDoCusto/5 + " nota(s) de R$ 5,00");
            ValorDoCusto = ValorDoCusto% 5;
        System.out.println(ValorDoCusto/2 + " nota(s) de R$ 2,00");
            ValorDoCusto = ValorDoCusto % 2;
        System.out.println(ValorDoCusto/1 + " nota(s) de R$ 1,00");
            ValorDoCusto = ValorDoCusto % 1;

        valor.close();

    }
}