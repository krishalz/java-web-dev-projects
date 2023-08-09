package org.launchcode;

public class Message {

    public static String getMessage(String lang) {

        if (lang.equals("sp")) {
            return "¡Que tal, Mundo!";
        } else if (lang.equals("fr")) {
            return "Bonjour, le monde!";
        } else if (lang.equals("ge")) {
            return "Heil, vorlde!";
        } else {
                return "Hello, World!";
            }
        }
    }

