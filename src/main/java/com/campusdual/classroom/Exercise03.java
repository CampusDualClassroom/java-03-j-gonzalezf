package com.campusdual.classroom;

public class Exercise03 {

    public static String greetings(String name) {
        return "Hola. Bienvenido " + name;
    }

    public static String error(String nombre) {
        return "Ups. No pudimos validar tus datos. Tu nombre de usuario no es " + nombre;
    }

    public static void checkUser(String user, String pass) {

        String message;

        if (user.equals("Sebas") && pass.equals("sebas01")) {
            message = greetings(user);
        } else {
            message = error("Sebas");
        }

        System.out.println(message);

    }

    public static void main(String[] args) {
        checkUser("Sebas", "sebas01");
        checkUser("Alvaro", "alvaro01");
    }

}
