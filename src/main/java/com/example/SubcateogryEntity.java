package com.example;

import jakarta.persistence.*;

@Entity
@Table(name = "SUBCATEOGRY", schema = "WEB", catalog = "")
public class SubcateogryEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "SUBCATEGORY_ID")
    private Object subcategoryId;
    @Basic
    @Column(name = "SUBCATEGORY_NAME")
    private Object subcategoryName;
    @Basic
    @Column(name = "MAINCATEGORY_ID")
    private Object maincategoryId;

    public Object getSubcategoryId() {
        return subcategoryId;
    }

    public void setSubcategoryId(Object subcategoryId) {
        this.subcategoryId = subcategoryId;
    }

    public Object getSubcategoryName() {
        return subcategoryName;
    }

    public void setSubcategoryName(Object subcategoryName) {
        this.subcategoryName = subcategoryName;
    }

    public Object getMaincategoryId() {
        return maincategoryId;
    }

    public void setMaincategoryId(Object maincategoryId) {
        this.maincategoryId = maincategoryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SubcateogryEntity that = (SubcateogryEntity) o;

        if (subcategoryId != null ? !subcategoryId.equals(that.subcategoryId) : that.subcategoryId != null)
            return false;
        if (subcategoryName != null ? !subcategoryName.equals(that.subcategoryName) : that.subcategoryName != null)
            return false;
        if (maincategoryId != null ? !maincategoryId.equals(that.maincategoryId) : that.maincategoryId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = subcategoryId != null ? subcategoryId.hashCode() : 0;
        result = 31 * result + (subcategoryName != null ? subcategoryName.hashCode() : 0);
        result = 31 * result + (maincategoryId != null ? maincategoryId.hashCode() : 0);
        return result;
    }
}
