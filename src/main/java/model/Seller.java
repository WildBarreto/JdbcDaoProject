package model;

import javax.xml.crypto.Data;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Seller implements Serializable {

    private Integer id;
    private String name;
    private String email;
    private Date birthdate;
    private double baseSalary;

    private Department department;

    public Seller() {

    }

    public Seller(Integer id, String name, String email, Date birthdate, double baseSalary, Department department) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthdate = birthdate;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seller seller = (Seller) o;
        return Double.compare(seller.baseSalary, baseSalary) == 0 && Objects.equals(id, seller.id) && Objects.equals(name, seller.name) && Objects.equals(email, seller.email) && Objects.equals(birthdate, seller.birthdate) && Objects.equals(department, seller.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, birthdate, baseSalary, department);
    }

    @Override
    public String toString() {
        return "Seller{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", birthdate=" + birthdate +
                ", baseSalary=" + baseSalary +
                ", department=" + department +
                '}';
    }
}
