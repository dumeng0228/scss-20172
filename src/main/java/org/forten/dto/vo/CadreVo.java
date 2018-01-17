package org.forten.dto.vo;

import java.util.Objects;

public class CadreVo {
    private int id;
    private String name;
    private String gender;
    private String workNumber;
    private String cadreTel;
    private String email;

    public CadreVo() {
    }

    public CadreVo(int id, String name, String gender, String workNumber, String cadreTel, String email) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.workNumber = workNumber;
        this.cadreTel = cadreTel;
        this.email = email;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getWorkNumber() {
        return workNumber;
    }

    public void setWorkNumber(String workNumber) {
        this.workNumber = workNumber;
    }

    public String getCadreTel() {
        return cadreTel;
    }

    public void setCadreTel(String cadreTel) {
        this.cadreTel = cadreTel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CadreVo cadreVo = (CadreVo) o;
        return id == cadreVo.id;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "CadreVo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", workNumber='" + workNumber + '\'' +
                ", cadreTel='" + cadreTel + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
