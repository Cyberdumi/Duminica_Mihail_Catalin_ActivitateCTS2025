package Visitor;
import Bridge.Abstractions.Restaurant;
import Visitor.models.Bank;
import Visitor.models.Client;
import Visitor.models.Company;
import Visitor.models.Resident;

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

    @Override
    public void visit(Visitor.models.Restaurant restaurant) {

    }


    public void visit(Restaurant restaurant) {
        System.out.println("" + restaurant.getName());
    }

}