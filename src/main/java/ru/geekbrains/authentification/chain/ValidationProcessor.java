package ru.geekbrains.authentification.chain;

import java.util.Arrays;

public class ValidationProcessor {

    private final LoginProcess loginProcess;

    public ValidationProcessor(LoginProcess loginProcess) {
        this.loginProcess = loginProcess;
    }

    void process(Validator... validators) {
        Arrays.stream(validators).forEach(validator -> validator.validate(loginProcess));
    }
}
