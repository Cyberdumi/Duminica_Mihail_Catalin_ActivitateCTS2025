package Builder;

import java.util.ArrayList;
import java.util.List;

public class MagazinBuilder {
    private IPodea podea;
    private int intrari;
    private String denumire;
    private float suprafata;
    private List<IDecoratiuni> decoratiuniList;

    public MagazinBuilder(float suprafata, String denumire, int intrari) {
        this.suprafata = suprafata;
        this.denumire = denumire;
        this.intrari = intrari;
        this.decoratiuniList = new ArrayList<>();
    }

    public MagazinBuilder withDecoratiuni(List<IDecoratiuni> decoratiuniList) {
        this.decoratiuniList.addAll(decoratiuniList);
        return this;
    }

    public MagazinBuilder withPodea(IPodea podea) {
        this.podea = podea;
        return this;
    }

    public Magazin build() throws Exception {
        if(denumire == null){
            throw new Exception("Denumirea nu poate fi nula");
        }
        if(suprafata == 0.0f){
            throw new Exception("suprafata nu poate fi nula");
        }
        if(intrari == 0){
            intrari = 1;
        }
        if(intrari < (suprafata / 100) ) {
            throw new Exception("Numarul de intrari nu poate fi mai mic decat suprafata pe 100");
        }
        if(podea == null){
            podea = new Podea();
        }
        if(decoratiuniList != null ){
            for(IDecoratiuni d : decoratiuniList){
                if(d.getMaterialDecoratiuni() == EMaterialDecoratiuni.STICLA && podea.getDuritate() < 2 ){
                    throw new Exception("Nu ai voie sticla");
                }

            }
        }
        Magazin m = new Magazin(podea, decoratiuniList, denumire, intrari, suprafata);
        podea = null;
        decoratiuniList.clear();
        return m;
    }
}
