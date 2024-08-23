package com.ismailmesutmujde.javabasics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Arrays {

    public static void main(String[] args) {

        // Arrays -> Diziler

        // Dizileri oluşturma yöntemleri
        // 1. Yöntem : diziyi tanımla sonra dizi elemanlarına değer atama
        String[] myStringArray = new String[4];

        myStringArray[0] = "James";
        myStringArray[1] = "Lars";
        myStringArray[2] = "Kirk";
        myStringArray[3] = "Rob";

        System.out.println(myStringArray[1]);
        // int[] myIntegerArray = new int[3]; --> aşağıdaki hatayı almamak için dizini boyutu arttırılır..
        int[] myIntegerArray = new int[4];
        myIntegerArray[0] = 50;
        myIntegerArray[1] = 60;
        myIntegerArray[2] = 70;
        myIntegerArray[3] = 80; // çalışma anında hata verir.. ArrayIndexOutOfBoundsException Hatası

        System.out.println(myIntegerArray[1]);

        // 2. Yöntem : Diziyi tanımlarken dizi elemanlarına değer atama
        int[] myNumberArray = {1,2,3,4,5,6,7,8,9};  // Diziler 0. indeksten başlar...
        System.out.println(myNumberArray[2]);

        // Lists -> Listeler

        ArrayList<String> myMusicians = new ArrayList<String>();
        myMusicians.add("James");
        myMusicians.add("Lars");
        myMusicians.add(1,"Kirk");
        myMusicians.add("Rob");
        System.out.println(myMusicians.get(0));
        System.out.println(myMusicians.get(1));
        System.out.println(myMusicians.get(2));
        System.out.println(myMusicians.get(3));

        System.out.println(myMusicians.size());

        // Sets
        // HashSet
        HashSet<String> mySet = new HashSet<String>();
        mySet.add("James");
        mySet.add("James");

        // HashSet dizide 1'den fazla aynı elemanı barındırmıyor..
        System.out.println(mySet.size());

        // HashMap
        HashMap<String, String> myHashMap = new HashMap<String, String>();
        myHashMap.put("name","James");
        myHashMap.put("instrument", "Guitar");
        System.out.println(myHashMap.get("name"));
        System.out.println(myHashMap.get("instrument"));

        // argümanlara primitive değişken verirsek hata alırız..
        // HashMap<String,int> mySecondHashMap = new HashMap<String, int>();
        HashMap<String, Integer> mySecondHashMap = new HashMap<String, Integer>();
        mySecondHashMap.put("run", 100);
        mySecondHashMap.put("basketball", 200);
        System.out.println(mySecondHashMap.get("run"));
    }
}
