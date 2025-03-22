package Builder;

public class Decoratiuni implements IDecoratiuni{
    EMaterialDecoratiuni materialDecoratiuni;
    public Decoratiuni(EMaterialDecoratiuni materialDecoratiuni){
        this.materialDecoratiuni = materialDecoratiuni;
    }

    @Override
    public EMaterialDecoratiuni getMaterialDecoratiuni() {
        return materialDecoratiuni;
    }
}
