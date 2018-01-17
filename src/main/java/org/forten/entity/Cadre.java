package org.forten.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;
@Entity
@Table
public class Cadre implements Serializable {
    @Id
    private int id;
    @Column
    @NotNull(message = "姓名为2到8个字")
    @Size(min = 2,max = 8)
    private String name;
    @Column(name = "work_number")
    private String workNumber;
    @Column
    private String gender;
    @Column(name = "cadre_tel")
    private String cadreTel;
    @Column
    private String email;

    public Cadre() {
    }

    public Cadre(int id, String name, String workNumber, String gender, String cadreTel, String email) {
        this.id = id;
        this.name = name;
        this.workNumber = workNumber;
        this.gender = gender;
        this.cadreTel = cadreTel;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getWorkNumber() {
        return workNumber;
    }

    public String getGender() {
        return gender;
    }

    public String getCadreTel() {
        return cadreTel;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkNumber(String workNumber) {
        this.workNumber = workNumber;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setCadreTel(String cadreTel) {
        this.cadreTel = cadreTel;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cadre cadre = (Cadre) o;
        return id == cadre.id;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Cadre{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", workNumber='" + workNumber + '\'' +
                ", gender='" + gender + '\'' +
                ", cadreTel='" + cadreTel + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
