import java.util.Scanner;

public class AppVeiculo {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        GerenciarVeiculos gerencia = new GerenciarVeiculos();
        int menu,Anodefabricacao;
        String Modelo,Marca,Placa,Tipodecombustivel;
        double Valordemercado;

        do {
            System.out.println("1 Add o veículo");
            System.out.println("2 Remover o veículo");
            System.out.println("3 Buscar o veículo por placa dada");
            System.out.println("4 Lista de todos os veiculos");
            System.out.println("5 Obter valor de imposto pela placa");
            System.out.println("6 Mostrar lista de carros por combustivel dado");
            System.out.println("7 Fechar programa");
                menu = Integer.parseInt(entrada.nextLine());switch (menu) {
                case 1:
                    System.out.println("Qual o modelo do veiculo?");
                    Modelo = entrada.nextLine();
                    System.out.println("Qual a marca do veiculo?");
                    Marca = entrada.nextLine();
                    System.out.println("Qual a placa do veiculo?");
                    Placa = entrada.nextLine();
                    System.out.println("Qual o tipo de combustivel do veiculo?");
                    Tipodecombustivel = entrada.nextLine();
                    System.out.println("Qual o ano de fabricaçâo do veiculo");
                    Anodefabricacao = Integer.parseInt(entrada.nextLine());
                    System.out.println("Qual o valor de mercado do veiculo?");
                    Valordemercado = Double.parseDouble(entrada.nextLine());
                    ((GerenciarVeiculos) gerencia).adicionarVeiculo(Modelo, Marca, Placa, Tipodecombustivel, Anodefabricacao, Valordemercado);
                    
                    break;
            
                case 2:
            
                    System.out.println("Qual a Placa do Veículo a ser Removido?");
                    Placa = entrada.nextLine();
                    ((GerenciarVeiculos) gerencia).remover(Placa);
                    break;
            
                case 3:
                    System.out.println("Qual a placa do veículo a ser encontrado?");
                    Placa = entrada.nextLine();
                    System.out.println(((GerenciarVeiculos) gerencia).buscarPorPlaca(Placa));
                    break;
            
                case 4:
                    System.out.println(((GerenciarVeiculos) gerencia).listarVeiculos());    
                
                    
                    
                    break;
            
                case 5:
                    
                    break;
            
                case 6:
                    

                    break;
                case 7:
                    
                    break;  

                default:
                    System.out.println("Opção invalida!\n");
                    break;
            }
        } while (menu != 7);


        entrada.close();
    }
}