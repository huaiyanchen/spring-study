package com.chy.staticproxy;

public class Proxy {
    private Landlord landlord;

    public Proxy() {
    }

    public Proxy(Landlord landlord) {
        this.landlord = landlord;
    }

    public void rent() {
        landlord.rent();
    }

    public void seeHouse () {
        System.out.println("看房");
    }

}
