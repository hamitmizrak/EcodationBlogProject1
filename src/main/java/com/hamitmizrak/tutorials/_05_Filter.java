package com.hamitmizrak.tutorials;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class _05_Filter {

    public static void main(String[] args) {
        List<String> listem=new ArrayList<>();
        listem.add("malatya");
        listem.add("malatya");
        listem.add("malatya");
        listem.add("malatya");
        listem.add("istanbul");
        listem.add("ankara");
        listem.add("izmir");
        listem.add("bolu");
        listem.add("bolu");
        listem.add("bolu");
        listem.add("bitlis");

        //Listedeki malatya geçenleri ekranda göster
        listem.stream()
              .filter( (asd)->"malatya".equals(asd) )
                .collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("*************************************************");

        //Listedeki malatya geçenmeyenleri ekranda göster
        listem.stream()
                .filter( (asd)->!"malatya".equals(asd) )
                .collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("*************************************************");

        //Listedeki malatya geçenmeyenleri küçükten büyüğe doğru sırala fve ekranda göster
        listem.stream()
                .filter( (asd)->!"malatya".equals(asd) ).sorted()
                .collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("*************************************************");
        //Listedeki malatya geçenmeyenleri küçükten büyüğe doğru sırala ve ilk 3 veriyi ekranda göster
        listem.stream()
                .filter( (ferhat)->!"malatya".equals(ferhat))
                .sorted()
                .limit(3)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("****************SEARCH*********************************");
        //Search
        String searchValue= JOptionPane.showInputDialog("Lütfen aramak istediğiniz kelimeyi giriniz");
        listem.stream()
                .filter((temp)->searchValue.equalsIgnoreCase(temp))
                .distinct()
                .collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("****************SEARCH toUPPERCASE*********************************");
        //Search bulduğu kelimeleri büyük harfle yazsın
        listem.stream()
                .filter((sena)->searchValue.equalsIgnoreCase(sena))
                .map((temp)->temp.toUpperCase().substring(0,3).concat("*****"))
                .collect(Collectors.toList()).forEach(System.out::println);

    }
}