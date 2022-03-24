package org.example.deseriaalization;

public class Phones {
    private String phoneType="Business";
    private String phoneNumber="2023176538";
    private String lastModified="03-11-2022";

    public Phones(String phoneType, String phoneNumber, String lastModified) {
        this.phoneType = phoneType;
        this.phoneNumber = phoneNumber;
        this.lastModified = lastModified;
    }

    public Phones() {
    }
}
