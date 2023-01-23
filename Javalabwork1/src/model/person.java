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
public class person {
    private String firstname;
    private String lastname;
    private String collegename;
    String NUID;
    Address address;
    Contact contact;
    public person(){
        this.firstname="";
        this.lastname="";
        this.collegename="";
        this.NUID="";
        this.address=new Address();
        this.contact=new Contact();
    }

    public String getfirstName() {
        return firstname;
    }
    public String getlastname(){
        return lastname;
    }
    public String getcollegename(){
        return collegename;
    }
    public Address getAddress() {
        return address;
    }

    public void setfirstName(String firstname) {
        this.firstname = firstname;
    }
    public void setlastname(String lastname){
        this.lastname= lastname;
    }
    public void setcollegename(String collegename)
    {
       this.collegename= collegename;
    }
    
    public void setAddress(Address address) {
        this.address = address;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public String getNUID() {
        return NUID;
    }

    public void setNUID(String NUID) {
        this.NUID = NUID;
    }
    
    
}
