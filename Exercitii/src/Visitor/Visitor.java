package Visitor;


import Visitor.models.Bank;
import Visitor.models.Company;
import Visitor.models.Resident;
import Visitor.models.Restaurant;

public interface Visitor {

    void visit(Bank bank);

    void visit(Company company);

    void visit(Resident resident);

    void visit(Restaurant restaurant);

}