package com.hamitmizrak.tutorials;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _02_List {
    public static void main(String[] args) {

        List<String> listem=new ArrayList<>();
        listem.add("malatya");
        listem.add("malatya");
        listem.add("istanbul");
        listem.add("ankara");
        listem.add("izmir");
        listem.add("bolu");
        listem.add("bitlis");

        listem.forEach(System.out::println);
        listem.stream().forEach(System.out::println);
    }
}
