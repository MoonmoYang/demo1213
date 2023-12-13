package com.example;

import jakarta.persistence.*;

@Entity
@Table(name = "PRODUCTS", schema = "WEB", catalog = "")
public class ProductsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "PRODUCTS_ID")
    private String productsId;
    @Basic
    @Column(name = "PRODUCTS_NAME")
    private String productsName;
    @Basic
    @Column(name = "MAINCATEOGRY_ID")
    private String maincateogryId;
    @Basic
    @Column(name = "SUBCATEGORY_ID")
    private String subcategoryId;

    public String getProductsId() {
        return productsId;
    }

    public void setProductsId(String productsId) {
        this.productsId = productsId;
    }

    public String getProductsName() {
        return productsName;
    }

    public void setProductsName(String productsName) {
        this.productsName = productsName;
    }

    public String getMaincateogryId() {
        return maincateogryId;
    }

    public void setMaincateogryId(String maincateogryId) {
        this.maincateogryId = maincateogryId;
    }

    public String getSubcategoryId() {
        return subcategoryId;
    }

    public void setSubcategoryId(String subcategoryId) {
        this.subcategoryId = subcategoryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductsEntity that = (ProductsEntity) o;

        if (productsId != null ? !productsId.equals(that.productsId) : that.productsId != null) return false;
        if (productsName != null ? !productsName.equals(that.productsName) : that.productsName != null) return false;
        if (maincateogryId != null ? !maincateogryId.equals(that.maincateogryId) : that.maincateogryId != null)
            return false;
        if (subcategoryId != null ? !subcategoryId.equals(that.subcategoryId) : that.subcategoryId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = productsId != null ? productsId.hashCode() : 0;
        result = 31 * result + (productsName != null ? productsName.hashCode() : 0);
        result = 31 * result + (maincateogryId != null ? maincateogryId.hashCode() : 0);
        result = 31 * result + (subcategoryId != null ? subcategoryId.hashCode() : 0);
        return result;
    }
}
