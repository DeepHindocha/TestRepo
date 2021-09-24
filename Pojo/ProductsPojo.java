/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emart.pojo;

import java.util.Objects;

/**
 *
 * @author Deephindocha
 */
public class ProductsPojo {

   
       public ProductsPojo()
    {
        
    }

    public ProductsPojo(String productId, String productName, String productCompany, double productPrice, double ourPrice, int tax, int quantity,double total) {
        this.productId = productId;
        this.productName = productName;
        this.productCompany = productCompany;
        this.productPrice = productPrice;
        this.ourPrice = ourPrice;
        this.tax = tax;
        this.quantity = quantity;
        this.total=total;
    }

    public ProductsPojo(String string, String string0, String string1, double aDouble, double aDouble0, int aInt, int aInt0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCompany() {
        return productCompany;
    }

    public void setProductCompany(String productCompany) {
        this.productCompany = productCompany;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public double getOurPrice() {
        return ourPrice;
    }

    public void setOurPrice(double ourPrice) {
        this.ourPrice = ourPrice;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    @Override
    public String toString() {
        return "ProductPojo{" + "productId=" + productId + ", productName=" + productName + ", productCompany=" + productCompany + ", productPrice=" + productPrice + ", ourPrice=" + ourPrice + ", tax=" + tax + ", quantity=" + quantity + '}';
    }
    
     @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.productId);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ProductsPojo other = (ProductsPojo) obj;
        return Objects.equals(this.productId, other.productId);
    }

     private String productId;
     private String productName;
     private String productCompany;
     private double productPrice;
     private double ourPrice;
     private int tax;
     private int quantity;
     private double total;
    
}

    

