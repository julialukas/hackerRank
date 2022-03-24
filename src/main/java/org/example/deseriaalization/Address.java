package org.example.deseriaalization;

public class Address {
    private String line1;
    private String line2;
    private String city;
    private String state;
    private String postalCode;

    public Address(String line1, String line2, String city, String state, String postalCode) {
        this.line1 = line1;
        this.line2 = line2;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
    }

    public Address() {
    }
}
