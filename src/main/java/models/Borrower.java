package models;

import javax.persistence.*;

@Entity
@Table(name="borrowers")
public class Borrower {

    private int id;
    private String name;

    public Borrower(){

    }

    public Borrower(String name){
        this.name = name;
    }

    @Id
    @GeneratedValue
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

