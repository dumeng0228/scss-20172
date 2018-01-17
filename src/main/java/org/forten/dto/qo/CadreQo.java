package org.forten.dto.qo;

public class CadreQo {
    private String name;
    private String workNumber;
    private int first;
    private int page;
    private int rows;

    public CadreQo() {
        page = 1;
        rows = 10;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorkNumber() {
        return workNumber;
    }

    public void setWorkNumber(String workNumber) {
        this.workNumber = workNumber;
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "CadreQo{" +
                "name='" + name + '\'' +
                ", workNumber='" + workNumber + '\'' +
                ", first=" + first +
                ", page=" + page +
                ", rows=" + rows +
                '}';
    }
}
