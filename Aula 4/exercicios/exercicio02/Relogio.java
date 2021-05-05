
public class Relogio {

    int hora, minuto,  segundo;

    void exibir() {
        // System.out.println(hora + ":" + minuto + segundo);
        // printf(FORMATO, VARIAVÉIS)
        // %d = inteiro, %f = casa decimal 
        // %2d = 2 casas
        // %02d = 2 casas = preenche com 0 à esquerda
        System.out.printf("%2d:%2d:%2d\n", hora, minuto, segundo);
        
    }
}