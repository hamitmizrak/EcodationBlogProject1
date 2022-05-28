package com.hamitmizrak.tutorials;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class _03_Sorted {
    public static void main(String[] args) {

        List<String> listem=new ArrayList<>();
        listem.add("malatya");
        listem.add("malatya");
        listem.add("istanbul");
        listem.add("ankara");
        listem.add("izmir");
        listem.add("bolu");
        listem.add("bitlis");

        listem.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
    }
}
