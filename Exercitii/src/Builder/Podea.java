package Builder;

public class Podea implements IPodea{
    int duritate;

    public Podea() {
        this.duritate = 1;
    }

    @Override
    public int getDuritate() {
        return duritate;
    }
}
