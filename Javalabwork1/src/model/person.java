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
    Address current;
    Address permanent;
    Contact office;
    Contact personal;
    
    public person(){
        this.firstname="";
        this.lastname="";
        this.collegename="";
        this.NUID="";
        this.current=new Address();
        this.permanent=new Address();
        this.personal=new Contact();
        this.office=new Contact();
        
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCollegename() {
        return collegename;
    }

    public void setCollegename(String collegename) {
        this.collegename = collegename;
    }

    public String getNUID() {
        return NUID;
    }

    public void setNUID(String NUID) {
        this.NUID = NUID;
    }

    public Address getCurrent() {
        return current;
    }

    public void setCurrent(Address current) {
        this.current = current;
    }

    public Address getPermanent() {
        return permanent;
    }

    public void setPermanent(Address permanent) {
        this.permanent = permanent;
    }

    public Contact getOffice() {
        return office;
    }

    public void setOffice(Contact office) {
        this.office = office;
    }

    public Contact getPersonal() {
        return personal;
    }

    public void setPersonal(Contact personal) {
        this.personal = personal;
    }

    
    
    
}
