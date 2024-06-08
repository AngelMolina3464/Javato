package advance;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class timer {
    public String timerResolve(int horas, int minutos){

        String result;
        int minutosEst = 54;
        int horasEst = 7;
        float staticNumber = minutosEst + (60 * horasEst);
        float dinamicNumber = (horas *60) + minutos;
        float resultPorcent = (dinamicNumber / staticNumber)*100;

        BigDecimal rounder = new BigDecimal(resultPorcent);
        rounder = rounder.setScale(2, RoundingMode.HALF_UP);

        double valorRedondeado = rounder.doubleValue();

        result = "% " + String.valueOf(valorRedondeado);
        return result;
    }
}
