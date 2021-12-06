package ru.geekbrains.authentification.chain;

public interface Validator {

    boolean validate(LoginProcess loginProcess);
}
