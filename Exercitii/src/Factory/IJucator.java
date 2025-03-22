package Factory;

import java.util.List;
import java.util.Set;

public interface IJucator {
    Set<EAntrenamente> getSetAntrenamente();
    List<EMedicamente> getListaMedicamente();
    void adaugaMedicamentInterzis(EMedicamente medicament, boolean notifyOtherPlayers);
    void adaugaAntrenament(EAntrenamente antrenament);
    String getNume();
    ETipJucator getTipJucator();
}
