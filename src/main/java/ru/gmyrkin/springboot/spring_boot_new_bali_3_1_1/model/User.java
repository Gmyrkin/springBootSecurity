package ru.gmyrkin.springboot.spring_boot_new_bali_3_1_1.model;

import jakarta.persistence.*;

@Entity // связать данной сущности с БД
@Table(name="users") // название табл в БД
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column// генерация ID на 1 (указано при создании табл в БД)
    private Long id;
    @Column(name="first_name") // явное указание колонок в табл в БД (т.к. есть нижнее подчеркивание)
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column (name="password")
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
