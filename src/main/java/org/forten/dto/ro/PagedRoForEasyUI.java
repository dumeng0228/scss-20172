package org.forten.dto.ro;

import org.forten.dto.PagedRo;

import java.util.Collection;

public class PagedRoForEasyUI<T> {
    private PagedRo ro;

    public PagedRoForEasyUI(PagedRo ro) {
        this.ro = ro;
    }
    public Collection<T>getrows(){return this.ro.getData();}

    public long getTatal(){return this.ro.getPage().getAmount();}

    public boolean isEmptyData(){return this.ro.isEmptyData();}

    @Override
    public String toString() {
        return "PagedRoForEasyUI{" +
                "ro=" + ro +
                '}';
    }
}
