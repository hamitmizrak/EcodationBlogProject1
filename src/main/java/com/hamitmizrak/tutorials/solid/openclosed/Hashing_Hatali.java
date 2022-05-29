package com.hamitmizrak.tutorials.solid.openclosed;

public class Hashing_Hatali {
//Open Close: var olan özelliği korulamalı yeni özelliği eklemede bir sıkıntı olmasın
    public String hashingMethod(String password,String hashingType) {
        String dataReturn = null;
        String decoder=password+" Çözümledik";
        if (hashingType.equals("Base64")) {
            dataReturn="base64 data"+decoder;
        } else if (hashingType.equals("Md5")) {
            dataReturn="Md5 data"+decoder;
        }
        return dataReturn;
    }
}
