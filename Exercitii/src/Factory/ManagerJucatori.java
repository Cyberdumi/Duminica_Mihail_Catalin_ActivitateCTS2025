package Factory;

import java.util.HashMap;
import java.util.Map;

public class ManagerJucatori {
    HashMap<String, IJucator> jucatori = new HashMap<>();
    static ManagerJucatori instance = null;

    private ManagerJucatori() {
        // nothing to do
    }

    static ManagerJucatori getInstance() {
        if (instance == null) {
            instance = new ManagerJucatori();
        }
        return instance;
    }

    void adaugaJucator(IJucator jucator) {
        jucatori.put(jucator.getNume(), jucator);
    }


    public void notifyOtherPlayers(String nume, EMedicamente medicament) {
        for(Map.Entry<String, IJucator> e: jucatori.entrySet()){
           if(!e.getKey().equals(nume)){
               e.getValue().adaugaMedicamentInterzis(medicament, false);
           }
        }
    }

    public HashMap<String, IJucator> getJucatori() {
        return jucatori;
    }
}
