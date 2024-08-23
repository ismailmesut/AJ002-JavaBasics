package com.ismailmesutmujde.javabasics;

public class Variables {

    public static void main(String[] args) {

        // Variables -> Değişkenler
        // byte, short, int, long, float, double, char, String, boolean

        // byte          : tam sayı
        // size          : 8 bit (1 byte)
        // value range   : -128 ile 127 (-2^7 ile 2^7-1)

        // short         : tam sayı
        // size          : 16 bit (2 byte)
        // value range   : -32768 ile 32767 (-2^15 ile 2^15-1)

        // integer       : tam sayı
        // size          : 32 bit (4 byte)
        // value range   : -2^31 ile 2^31-1
        int age = 20;
        System.out.println(10*age);
        System.out.println(age/5);

        int x = 5;
        int y = 11;
        System.out.println(y/x);

        // long          : tam sayı
        // size          : 64 bit (8 byte)
        // value range   : -2^63 ile 2^63-1
        long myLong = 11;
        System.out.println(myLong/5);

        // float         : ondalıklı sayı
        // size          : 32 bit (4 byte)
        // value range   : -3,4*10^38 ile 3,4*10^38
        float myfloat = 20.0f;
        System.out.println(myfloat/4);

        // double        : ondalıklı sayı
        // Size          : 64 bit (8 byte)
        // Value Range   : -1,7*10^308 ile 1,7*10^308
        double z = 5.0;
        double a = 11;
        System.out.println(a/z);

        // z = "james"; --> hata verir.

        // Örnek : Dairenin Çevresi
        double pi = 3.14;
        int r = 5;
        System.out.println("Dairenin Çevresi : " + 2*r*pi);

        // char          : karakter
        // size          : 16 bit (2 byte)
        char value1 = 'M';
        char value2 = '-';
        char value3 = '8';
        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);

        // String        : metinsel ifadelerde
        String name = "James";
        String surname = "Hetfield";
        String fullname = name + " " + surname;

        System.out.println(name);
        System.out.println(surname);
        System.out.println(fullname);

        // name = 40; --> hata verir.

        // boolean       : mantıksal ifadelerde
        // size          : 1 bit
        // value         : true veya false
        boolean isAlive = true;
        isAlive = false;
        System.out.println(isAlive);

        // Constants -> Sabitler

        // final
        final int myInteger = 5;
        System.out.println("myInteger: " + myInteger);
        // myInteger = 4; --> hata verir.
        System.out.println("myInteger: " + myInteger);
    }
}