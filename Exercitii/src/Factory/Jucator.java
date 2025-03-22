package Factory;

import java.util.List;
import java.util.Set;

public class Jucator implements IJucator {
    private final String nume;
    private final ETipJucator jucator;
    private final Set<EAntrenamente> antrenamente;
    private final List<EMedicamente> medicamente;

    public Jucator(ETipJucator jucator, List<EMedicamente> medicamente, Set<EAntrenamente> antrenamente, String nume) {
        this.jucator = jucator;
        this.medicamente = medicamente;
        this.antrenamente = antrenamente;
        this.nume = nume;
    }

    @Override
    public Set<EAntrenamente> getSetAntrenamente() {
        return antrenamente;
    }

    @Override
    public List<EMedicamente> getListaMedicamente() {
        return medicamente;
    }

    @Override
    public void adaugaMedicamentInterzis(EMedicamente medicament, boolean notifyOtherPlayers) {
        medicamente.add(medicament);
        if(notifyOtherPlayers) {
            ManagerJucatori.getInstance().notifyOtherPlayers(nume, medicament);
        }
    }

    @Override
    public void adaugaAntrenament(EAntrenamente antrenament) {
        antrenamente.add(antrenament);
    }

    @Override
    public ETipJucator getTipJucator() {
        return jucator;
    }

    @Override
    public String getNume() {
        return nume;
    }


}
