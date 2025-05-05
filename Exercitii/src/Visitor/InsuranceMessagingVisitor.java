package Visitor;
import java.util.List;

public class InsuranceMessagingVisitor implements Visitor {

    public void sendInsuranceMails(List<Client> clients) {
        for (Client client : clients) {
            client.accept(this);
        }
    }

    public void visit(Bank bank) {
        System.out.println(" " + bank.getName());
    }

    public void visit(Company company) {
        System.out.println("" + company.getName());
    }

    public void visit(Resident resident) {
        System.out.println("" + resident.getName());
    }

    public void visit(Restaurant restaurant) {
        System.out.println("" + restaurant.getName());
    }

}