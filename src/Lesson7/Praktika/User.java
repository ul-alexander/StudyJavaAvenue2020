package Lesson7.Praktika;

import java.util.Date;

public class User {

    private int id;
    private String name;
    private String surname;
    private String pathToPhoto;
    private Date dateRegister;

    public User() {
    }

    public User(int id, String name, String surname, String pathToPhoto, Date dateRegister) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.pathToPhoto = pathToPhoto;
        this.dateRegister = dateRegister;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPathToPhoto() {
        return pathToPhoto;
    }

    public void setPathToPhoto(String pathToPhoto) {
        this.pathToPhoto = pathToPhoto;
    }

    public Date getDateRegister() {
        return dateRegister;
    }

    public void setDateRegister(Date dateRegister) {
        this.dateRegister = dateRegister;
    }
}
