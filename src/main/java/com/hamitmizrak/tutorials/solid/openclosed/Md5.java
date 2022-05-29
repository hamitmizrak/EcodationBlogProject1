package com.hamitmizrak.tutorials.solid.openclosed;

public class Md5 implements IPassword{
    @Override
    public String hashData(String password) {
        return "data md5";
    }

    @Override
    public String hashData2(String password2) {
        return null;
    }
}
