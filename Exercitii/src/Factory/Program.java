package Factory;

public class Program {
    public static void main(String[] args) {
        FotbalistFactory fotbalistFactory = new FotbalistFactory();
        TenismenFactory tenismenFactory = new TenismenFactory();
       ManagerJucatori managerJucatori = ManagerJucatori.getInstance();

        managerJucatori.adaugaJucator(fotbalistFactory.getJucator("Felix"));
        managerJucatori.adaugaJucator(fotbalistFactory.getJucator("Dumi"));
        managerJucatori.adaugaJucator(tenismenFactory.getJucator("Doru"));
        managerJucatori.getJucatori().get("Felix").adaugaAntrenament(EAntrenamente.SUTURI);
        managerJucatori.getJucatori().get("Felix").adaugaMedicamentInterzis(EMedicamente.STEROIDS, true);
    }
}
