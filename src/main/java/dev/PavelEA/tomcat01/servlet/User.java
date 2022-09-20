package dev.PavelEA.tomcat01.servlet;

import lombok.Data;
import lombok.Getter;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private String username;
    private int victory;
    private int defeat;
    private int attempts;
}
