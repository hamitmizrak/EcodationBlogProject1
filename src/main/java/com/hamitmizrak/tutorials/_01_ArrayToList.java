package com.hamitmizrak.tutorials;

import java.util.Arrays;
import java.util.List;

public class _01_ArrayToList {
    public static void main(String[] args) {
        String[] dizi={"malatya","malatya","istanbul","ankara","izmir","bolu","bitlis"};
        for (int i = 0; i < dizi.length; i++) {
            System.out.println(dizi[i]);
        }
        System.out.println( " ************************************* ");

        //1.Yöntem
        List<String> listem=  Arrays.asList(dizi);
        listem.forEach(System.out::println);

        System.out.println( " ************************************* ");

        //2.Yöntem
        listem.stream().forEach(System.out::println);
    }
}
