package fr.devavance.tp_springboot_mvc_jpa.beans;
import jakarta.persistence.*;


// Marque la classe comme une entité JPA
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String address;
    private String email;
    private String phone;


    Fonction fonction;


    public Employee(){}


    public Employee(long id,String name, String address, String email, String phone, Fonction fonction) {
        this.id = id ;
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.fonction = fonction;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Fonction getFonction() {
        return fonction;
    }

    public void setFonction(Fonction fonction) {
        this.fonction = fonction;
    }

}
