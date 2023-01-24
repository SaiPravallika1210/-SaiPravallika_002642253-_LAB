/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author balin
 */
public class Address {
    String streetname;
    String aptno;
    String city;
    String zip;
    

    
    //public void setStreet(String street) {
      //  this.street = street;
    //}

    public String getStreetname() {
        return streetname;
    }

    public void setStreetname(String streetname) {
        this.streetname = streetname;
    }

    public String getAptno() {
        return aptno;
    }

    public void setAptno(String aptno) {
        this.aptno = aptno;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

   
    

    public Address(){
        this.streetname="";
        this.aptno="";
        this.city="";
        this.zip="";
        
        }

}
