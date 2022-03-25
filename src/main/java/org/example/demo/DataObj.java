package org.example.demo;

import java.util.Date;
import java.util.List;
import java.util.Map;

class DataObj {
    /*

     */
    private String product;
    private double version;
    private Date releaseDate;
    private boolean demo;
    private Person person;

    public DataObj(String product, double version, Date releaseDate, boolean demo, Person person) {
        this.product = product;
        this.version = version;
        this.releaseDate = releaseDate;
        this.demo = demo;
        this.person = person;

    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public boolean isDemo() {
        return demo;
    }

    public void setDemo(boolean demo) {
        this.demo = demo;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
/*
===================================================
 */
class Person{
     private int id;
     private String name;
     private Map<String,String>phones;
     private String eemails[];
     private Date dob;
     private boolean registered;
     private List<emergencyContacts> contacts;

    public Person(int id, String name, Map<String, String> phones, String[] eemails, Date dob, boolean registered,List<emergencyContacts>contacts) {
        this.id = id;
        this.name = name;
        this.phones = phones;
        this.eemails = eemails;
        this.dob = dob;
        this.registered = registered;
        this.contacts= contacts;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getPhones() {
        return phones;
    }

    public void setPhones(Map<String, String> phones) {
        this.phones = phones;
    }

    public String[] getEemails() {
        return eemails;
    }

    public void setEemails(String[] eemails) {
        this.eemails = eemails;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public boolean isRegistered() {
        return registered;
    }

    public void setRegistered(boolean registered) {
        this.registered = registered;
    }
}

/*
===================================================
 */

class emergencyContacts{
    private String name;
    private String phone;
    private String relationship;

    public emergencyContacts(String name, String phone, String relationship) {
        this.name = name;
        this.phone = phone;
        this.relationship = relationship;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }
}
