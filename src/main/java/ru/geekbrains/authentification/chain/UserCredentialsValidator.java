package ru.geekbrains.authentification.chain;

import ru.geekbrains.authentification.server.Server;

public class UserCredentialsValidator implements Validator{

    private final Server server;

    public UserCredentialsValidator(Server server) {
        this.server = server;
    }

    @Override
    public boolean validate(LoginProcess loginProcess) {
        if (!server.hasEmail(loginProcess.getEmail())) {
            System.out.println("This email is not registered!");
            return false;
        }
        if (!server.isValidPassword(loginProcess.getEmail(), loginProcess.getPassword())) {
            System.out.println("Wrong password!");
            return false;
        }

        return true;
    }
}
