package ChainOfResponsability;

import ChainOfResponsability.Handlers.Handler;

public class AuthService {

    private final Handler handler;

    public AuthService(Handler handler) {
        this.handler = handler;
    }

    public boolean logIn(String email, String password) {
        if (handler.handle(email, password)) {
            System.out.println("Autorizat cu succes");
            return true;
        }
        return false;
    }

}