package com.hamitmizrak.tutorials;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class _04_Limit {
    public static void main(String[] args) {

        List<String> listem=new ArrayList<>();
        listem.add("malatya");
        listem.add("malatya");
        listem.add("istanbul");
        listem.add("ankara");
        listem.add("izmir");
        listem.add("bolu");
        listem.add("bitlis");

        //sıralayıp 3 tanesini göstersin
        listem.stream()
                .sorted().limit(3)
                .collect(Collectors.toList()).forEach(System.out::println);
    }
}
