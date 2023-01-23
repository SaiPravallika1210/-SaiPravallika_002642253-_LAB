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
    String currentstreetname;
    String currentaptno;
    String currentcity;
    String currentzip;
    String Permstreetname;
    String permaptno;
    String permcity;
    String permzip;

    
    //public void setStreet(String street) {
      //  this.street = street;
    //}

    public String getCurrentstreetname() {
        return currentstreetname;
    }

    public String getCurrentaptno() {
        return currentaptno;
    }

    public String getCurrentcity() {
        return currentcity;
    }

    public String getCurrentzip() {
        return currentzip;
    }

    public String getPermstreetname() {
        return Permstreetname;
    }

    public String getPermaptno() {
        return permaptno;
    }

    public String getPermcity() {
        return permcity;
    }

    public String getPermzip() {
        return permzip;
    }

    public void setCurrentstreetname(String currentstreetname) {
        this.currentstreetname = currentstreetname;
    }

    public void setCurrentaptno(String currentaptno) {
        this.currentaptno = currentaptno;
    }

    public void setCurrentcity(String currentcity) {
        this.currentcity = currentcity;
    }

    public void setCurrentzip(String currentzip) {
        this.currentzip = currentzip;
    }

    public void setPermstreetname(String Permstreetname) {
        this.Permstreetname = Permstreetname;
    }

    public void setPermaptno(String permaptno) {
        this.permaptno = permaptno;
    }

    public void setPermcity(String permcity) {
        this.permcity = permcity;
    }

    public void setPermzip(String permzip) {
        this.permzip = permzip;
    }
    

    public Address(){
        this.currentstreetname="";
        this.currentaptno="";
        this.currentcity="";
        this.currentzip="";
        this.Permstreetname="";
        this.permaptno="";
        this.permcity="";
        this.permzip="";
        }

}
