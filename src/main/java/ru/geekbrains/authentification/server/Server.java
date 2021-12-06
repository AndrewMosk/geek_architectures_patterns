package ru.geekbrains.authentification.server;

import ru.geekbrains.authentification.chain.LoginProcess;
import ru.geekbrains.authentification.chain.Validator;

import java.util.HashMap;
import java.util.Map;

public class Server {

    private final Map<String, String> users = new HashMap<>();
    private final Validator validator;

    public Server(Validator validator) {
        this.validator = validator;
    }

    public boolean logIn(String email, String password) {
        if (validator.validate(new LoginProcess(email, password))) {
            System.out.println("Authorization have been successful!");
            return true;
        }
        return false;
    }

    public void register(String email, String password) {
        users.put(email, password);
    }

    public boolean hasEmail(String email) {
        return users.containsKey(email);
    }

    public boolean isValidPassword(String email, String password) {
        return users.get(email).equals(password);
    }
}
