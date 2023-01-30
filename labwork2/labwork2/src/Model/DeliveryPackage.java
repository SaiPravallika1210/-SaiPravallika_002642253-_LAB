/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author balin
 */
public class DeliveryPackage {
    int packageId;
    double packageweight;
    ArrayList<Product> product;
    
    Customer customer;
    
    public DeliveryPackage(){
        this.product = new ArrayList<Product>();
        this.customer = new Customer();
    }

    public int getPackageId() {
        return packageId;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    public double getPackageweight() {
        return packageweight;
    }

    public void setPackageweight(double packageweight) {
        this.packageweight = packageweight;
    }


    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<Product> getProduct() {
        return product;
    }

    public void setProduct(ArrayList<Product> product) {
        this.product = product;
    }
    
    public Product createProduct(int productId, String productName, double price ){
        Product product  = new Product();
        product.setProductId(productId);
        product.setProductName(productName);
        product.setPrice(price);
        
        this.product.add(product);
        return product;
    }
    
    public Product findproduct(int pid){
        for(Product prod: this.product){
            if(prod.getProductId() == pid){
                return prod;
                
            }
        }
        return null;
    }
    
    
    
    
    
}
