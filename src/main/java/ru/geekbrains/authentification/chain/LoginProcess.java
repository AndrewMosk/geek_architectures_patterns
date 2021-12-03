package ru.geekbrains.authentification.chain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LoginProcess {
    private String email, password;
}
