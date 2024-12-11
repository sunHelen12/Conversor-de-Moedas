package code.helen.java.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import code.helen.java.modelos.Conversao;

public class Logger {
    private DateTimeFormatter formatter;

    public Logger() {
        this.formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    }

    public String getCurrentTimestamp() {
        return LocalDateTime.now().format(formatter);
    }

    public void registrarLog(Conversao conversao) {
        System.out.println("Log registrado: " + conversao.toString());
    }
}

