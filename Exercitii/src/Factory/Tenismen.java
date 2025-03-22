package Factory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Tenismen extends Jucator{

    public Tenismen( String nume) {
        super(ETipJucator.TENISMEN, new ArrayList<>(Arrays.asList(EMedicamente.TREN, EMedicamente.ANABOLICS)), new HashSet<>(Arrays.asList(EAntrenamente.ALERGARI, EAntrenamente.CARDIO)), nume);
    }
}
