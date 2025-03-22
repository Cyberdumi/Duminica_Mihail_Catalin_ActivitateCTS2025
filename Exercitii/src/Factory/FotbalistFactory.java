package Factory;

public class FotbalistFactory implements IFactory {
    @Override
    public IJucator getJucator(String nume) {
        return new Fotbalist(nume);
    }

}
