package utilities;

import java.util.concurrent.ThreadLocalRandom;

public class GeneradorAleatorio {
    public Integer integerAleatorio(Integer min, Integer max){
        int numero = ThreadLocalRandom.current().nextInt(min, max + 1);
        return numero;
    }
}
