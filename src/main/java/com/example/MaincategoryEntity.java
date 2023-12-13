package com.example;

import jakarta.persistence.*;

@Entity
@Table(name = "MAINCATEGORY", schema = "WEB", catalog = "")
public class MaincategoryEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "MAINCATEGORY_ID")
    private Object maincategoryId;
    @Basic
    @Column(name = "MAINCATEGORY_NAME")
    private Object maincategoryName;

    public Object getMaincategoryId() {
        return maincategoryId;
    }

    public void setMaincategoryId(Object maincategoryId) {
        this.maincategoryId = maincategoryId;
    }

    public Object getMaincategoryName() {
        return maincategoryName;
    }

    public void setMaincategoryName(Object maincategoryName) {
        this.maincategoryName = maincategoryName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MaincategoryEntity that = (MaincategoryEntity) o;

        if (maincategoryId != null ? !maincategoryId.equals(that.maincategoryId) : that.maincategoryId != null)
            return false;
        if (maincategoryName != null ? !maincategoryName.equals(that.maincategoryName) : that.maincategoryName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = maincategoryId != null ? maincategoryId.hashCode() : 0;
        result = 31 * result + (maincategoryName != null ? maincategoryName.hashCode() : 0);
        return result;
    }
}
