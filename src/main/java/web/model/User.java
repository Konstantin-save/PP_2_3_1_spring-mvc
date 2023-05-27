package web.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

//    @Column(name = "department")
//    private String department;
//
//    @Column(name = "salary")
//    private String salary;

    public User() {
    }

    public User(long id, String lastName, String name, String surname, String department, String salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
//        this.department = department;
//        this.salary = salary;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

//    public String getDepartment() {
//        return department;
//    }
//
//    public void setDepartment(String department) {
//        this.department = department;
//    }
//
//    public String getSalary() {
//        return salary;
//    }
//
//    public void setSalary(String salary) {
//        this.salary = salary;
//    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                  ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
//                ", department='" + department + '\'' +
//                ", salary='" + salary + '\'' +
                '}';
    }
}