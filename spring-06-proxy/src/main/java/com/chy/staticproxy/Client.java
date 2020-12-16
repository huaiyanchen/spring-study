package com.chy.staticproxy;

public class Client {
    public static void main(String[] args) {
        Landlord landlord = new Landlord();
        // landlord.rent();
        Proxy proxy = new Proxy(landlord);
        proxy.seeHouse();

        proxy.rent();
    }
}
