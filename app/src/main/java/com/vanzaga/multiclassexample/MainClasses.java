package com.vanzaga.multiclassexample;

import java.io.Serializable;
public class MainClasses {

    // La clase User maneja los datos del usuario, como nombre de usuario, nombre y email.
    public static class User implements Serializable {

        // Declaración de variables
        private String username;
        private String nombre;
        private String email;

        // Constructor de la clase User
        public User(String username, String nombre, String email) {
            this.username = username;
            this.nombre = nombre;
            this.email = email;
        }

        // Métodos getter para obtener los datos del usuario
        public String getUsername() {
            return username;
        }

        public String getName() {
            return nombre;
        }

        public String getEmail() {
            return email;
        }
    }

    //La clase UserAddress maneja los datos de la dirección del usuario, como calle, ciudad y código postal.
    public static class UserAddress implements Serializable {

        // Declaración de variables
        private String ciudad;
        private String postalCode;

        // Constructor de la clase UserAddress
        public UserAddress(String ciudad, String postalCode) {
            this.ciudad = ciudad;
            this.postalCode = postalCode;
        }

        // Métodos getter para obtener los datos de la dirección del usuario
        public String getCiudad() {
            return ciudad;
        }

        public String getPostalCode() {
            return postalCode;
        }
    }
}