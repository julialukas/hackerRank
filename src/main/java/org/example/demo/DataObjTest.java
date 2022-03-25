package org.example.demo;

import java.util.*;

public class DataObjTest {

    public static Map<String, String> getPhones() {
        Map<String, String>phones = new HashMap<>();
        phones.put("home","2028760962");
        phones.put("mobile","4765423476");

        return phones;
    }
    public static String []getEmails(){
        String emails[]=new String[]{"Kari@gmail.com","joeri@gmail.com","mikeri@gmail.com"};
    return emails;
    }
    public static List<emergencyContacts> getContacts(){
        emergencyContacts c= new emergencyContacts("Kari","2025437653","friend");
        emergencyContacts c2= new emergencyContacts("Julia","2025437653","friend");
        List<emergencyContacts>cList= new ArrayList<>();
        cList.add(c);
        cList.add(c2);
       return cList;
    }

    public static void main(String[] args) {


        DataObj obj = new DataObj(
                "Kari products", 1.0, new Date(), true,
                new Person(01, "KariThe Boss", getPhones(), getEmails(),
                        new Date(), true, getContacts()));
       Person p= obj.getPerson();
        System.out.println(p.getDob());
    }

}
