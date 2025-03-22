package Builder;

import java.util.List;

public class Magazin {


    private final IPodea podea;
    private final int intrari;
    private final String denumire;
    private final float suprafata;
    private final List<IDecoratiuni> decoratiuniList;

    public Magazin(IPodea podea, List<IDecoratiuni> decoratiuniList, String denumire, int intrari, float suprafata) {
        this.podea = podea;
        this.decoratiuniList = decoratiuniList;
        this.denumire = denumire;
        this.intrari = intrari;
        this.suprafata = suprafata;
    }

    public IPodea getPodea() {
        return podea;
    }

    public List<IDecoratiuni> getDecoratiuniList() {
        return decoratiuniList;
    }

    public float getSuprafata() {
        return suprafata;
    }

    public String getDenumire() {
        return denumire;
    }

    public int getIntrari() {
        return intrari;
    }
}
