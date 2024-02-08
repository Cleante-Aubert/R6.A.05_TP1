package fr.devavance.tp_springboot_mvc_jpa.beans;

public class Employee {

    private int id;
    private String name;
        private String address;
    private String email;
    private String phone;

    private Fonction function;

    public Employee(){}

    public Employee(int id, String name, String address, String email, String phone, Fonction function) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.function = function;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setFunction(Fonction function) {
        this.function = function;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public Fonction getFunction() {
        return function;
    }

    public enum Fonction {
        CHEF_PROJET("blue"),
        DEV_OPS("green"),
        DEV_WEB("purple"),
        DEV_AI("yellow"),
        SOFTWARE_ARCHITECT("orange");
        private final String codeCouleur;


        private Fonction(String codeCouleur) {
            this.codeCouleur = codeCouleur;
        }

        public String getCodeCouleur() {
            return this.codeCouleur;
        }

    }




}
