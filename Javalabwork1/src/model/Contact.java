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
public class Contact {
    private String officephone;
    private String officeemail;
    private String personalphone;
    private String personalemail;
    public Contact()
    {
        this.officephone="";
        this.officeemail="";
        this.personalemail="";
        this.personalphone="";    
 }

    public String getOfficephone() {
        return officephone;
    }

    public String getOfficeemail() {
        return officeemail;
    }

    public String getPersonalphone() {
        return personalphone;
    }

    public String getPersonalemail() {
        return personalemail;
    }

    public void setOfficephone(String officephone) {
        this.officephone = officephone;
    }

    public void setOfficeemail(String officeemail) {
        this.officeemail = officeemail;
    }

    public void setPersonalphone(String personalphone) {
        this.personalphone = personalphone;
    }

    public void setPersonalemail(String personalemail) {
        this.personalemail = personalemail;
    }
    
}
