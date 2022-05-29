package com.hamitmizrak.tutorials.solid.openclosed;

public class Base64 implements IPassword{
    @Override
    public String hashData(String password) {
        return "data";
    }

    @Override
    public String hashData2(String password2) {
        return null;
    }
}
