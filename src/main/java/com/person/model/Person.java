package com.person.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="Person")
public class Person  implements Serializable{

    @Id
    @Column(name="id")
    private int id;

    private String name;

    private String country;

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getCountry(){
        return this.country;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
