package ru.geekbrains.authentification.chain;

public class UserRoleValidator implements Validator{

    @Override
    public boolean validate(LoginProcess loginProcess) {
        if (loginProcess.getEmail().equalsIgnoreCase("admin@admin.ru")) {
            return true;
        }
        return false;
    }
}
