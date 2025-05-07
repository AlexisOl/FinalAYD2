package org.example;

public class user {


    private String name;
    private String email;
    private String phone;

    private String address;
    private String city;
    private String zip;


    user(String name, String email, String phone, String address, String city, String zip) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.zip = zip;
    }



    user(){}


    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getZip() {
        return zip;
    }
}
