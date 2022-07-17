package utilities;

import java.util.concurrent.ThreadLocalRandom;

/**
 * genera un numero aleatorio entre los parametros min y max
 */
public class GeneradorAleatorio {
    public Integer integerAleatorio(Integer min, Integer max){
        int numero = ThreadLocalRandom.current().nextInt(min, max + 1);
        return numero;
    }
}
