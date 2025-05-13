package TemaJava;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Pacient> pacienti = citestePacienti("pacienti.txt");

        System.out.println("Număr total de pacienți: " + pacienti.size());

        afiseazaSectiiSortate(pacienti);
        String fisierBinar = "pacienti.bin";
        salveazaFisierBinar(pacienti, fisierBinar);
        citesteFisierBinar(fisierBinar);
    }

    private static List<Pacient> citestePacienti(String numeFisier) {
        List<Pacient> pacienti = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(numeFisier))) {
            String linie;
            while ((linie = br.readLine()) != null) {
                if (!linie.trim().isEmpty()) {
                    String[] parti = linie.split(",");
                    if (parti.length == 3) {
                        int cod = Integer.parseInt(parti[0].trim());
                        String nume = parti[1].trim();
                        String sectie = parti[2].trim();
                        pacienti.add(new Pacient(cod, nume, sectie));
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Eroare la citire fișier " + e.getMessage());
        }

        return pacienti;
    }

    private static void afiseazaSectiiSortate(List<Pacient> pacienti) {

        Map<String, Long> numarPacientiPerSectie = pacienti.stream()
                .collect(Collectors.groupingBy(Pacient::getSectie, Collectors.counting()));

        List<Map.Entry<String, Long>> sectiiSortate = new ArrayList<>(numarPacientiPerSectie.entrySet());
        sectiiSortate.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        System.out.println("\nSecții ordonate descrescător după numărul de pacienți:");
        for (Map.Entry<String, Long> entry : sectiiSortate) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " pacienți");
        }
    }

    private static void salveazaFisierBinar(List<Pacient> pacienti, String numeFisier) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(numeFisier))) {
            oos.writeObject(pacienti);
            System.out.println("\nFișierul binar a fost creat cu succes: " + numeFisier);
        } catch (IOException e) {
            System.err.println("Eroare la scrierea fișierului binar: " + e.getMessage());
        }
    }

    private static void citesteFisierBinar(String numeFisier) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(numeFisier))) {
            @SuppressWarnings("unchecked")
            List<Pacient> pacientiCititi = (List<Pacient>) ois.readObject();
            System.out.println("\nConținutul fișierului binar:");
            for (Pacient pacient : pacientiCititi) {
                System.out.println(pacient);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Eroare la citirea fișierului binar: " + e.getMessage());
        }
    }
}

final class Pacient implements Serializable {
    private static final long serialVersionUID = 1L;

    private final int cod;
    private final String nume;
    private final String sectie;

    public Pacient(int cod, String nume, String sectie) {
        this.cod = cod;
        this.nume = nume;
        this.sectie = sectie;
    }

    public int getCod() {
        return cod;
    }

    public String getNume() {
        return nume;
    }

    public String getSectie() {
        return sectie;
    }

    @Override
    public String toString() {
        return "Pacient{cod=" + cod + ", nume='" + nume + "', sectie='" + sectie + "'}";
    }
}