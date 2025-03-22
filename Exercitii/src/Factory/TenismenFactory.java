package Factory;

public class TenismenFactory implements IFactory {
    @Override
    public IJucator getJucator(String nume) {
        return new Tenismen(nume);
    }
}
