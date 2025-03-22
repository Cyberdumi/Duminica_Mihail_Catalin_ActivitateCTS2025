package Factory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Fotbalist extends Jucator {

    public Fotbalist( String nume) {
        super(ETipJucator.FOTBALIST, new ArrayList<>(Arrays.asList(EMedicamente.TREN, EMedicamente.ANABOLICS)), new HashSet<>(Arrays.asList(EAntrenamente.PASE, EAntrenamente.CARDIO)), nume);
    }
}
