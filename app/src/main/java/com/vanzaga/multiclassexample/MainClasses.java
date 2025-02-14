package com.vanzaga.multiclassexample;

import java.io.Serializable;
public class MainClasses {

    public static class User implements Serializable {
        private String username;
        private String nombre;
        private String email;

        public User(String username, String nombre, String email) {
            this.username = username;
            this.nombre = nombre;
            this.email = email;
        }

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

    public static class UserAddress implements Serializable {
        private String ciudad;
        private String postalCode;

        public UserAddress(String ciudad, String postalCode) {
            this.ciudad = ciudad;
            this.postalCode = postalCode;
        }

        public String getCiudad() {
            return ciudad;
        }

        public String getPostalCode() {
            return postalCode;
        }
    }
}