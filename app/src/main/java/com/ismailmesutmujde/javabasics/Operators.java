package com.ismailmesutmujde.javabasics;

class Sinif1{

}
class Sinif2{

}
public class Operators {

    public static void main(String[] args) {

        // Operators -> Operatörler

        // Atama Operatörleri
        // =  : En temel atama operatörüdür. Atamalar her zaman sağdan sola doğrudur.
        // += : Soldaki değere, kendi değeri ile beraber sağdaki değeri de ekleyerek tekrar soldaki değeri atar.
        // -= : Soldaki değerden, sağdaki değeri çıkararak tekrar soldaki değere atar.
        // *= : Soldaki değeri, sağdaki değerle çarparak tekrar soldaki değere atar.
        // /= : Soldaki değeri, sağdaki değere bölerek sonucu tekrar soldaki değere atar.

        // Örnek 1:
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Ornek 1 : Temel Atama Operatoru (=) ");
        int a1 = 5; // a1 değişkenine 5 değerini atadık
        int b1 = a1; // b1 değişkenine a1 değerini atadık
        System.out.println("b1 = " + b1);
        // 7 = a;  // hatalı atamadır. Bir değişken, bir değere atanamaz.

        // Örnek 2:
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Ornek 2 : Atama Operatoru ile Bir Degiskenin Degerini Baska Bir Degiskene Atama");
        String name = "ismail";
        int a2 = 10;
        int b2 = a2;
        System.out.println("name = " + name);
        System.out.println("a2 = " + a2);
        System.out.println("b2 = " + b2);

        // Örnek 3:
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Ornek 3 : Diger Atama Operatorleri-1");
        int t=0;
        t = t + 5;  // t değişkenine 5 değerini ekledik. Bunun kısa yolunu ise alttaki gibi yapabiliriz.
        System.out.println("t = " + t);
        t += 5;     // soldaki t değerine, sağdaki 5 değeri eklenerek tekrar t değişkenine atandı.
        System.out.println("t = " + t);
        t *= 10;    // t değeri ile 10 çarpılarak sonuç tekrar t değişkenine atandı.
        System.out.println("t = " + t);

        int s = 20;
        s *= 5;  // s = s * 5;
        System.out.println("s = " + s); // bu kod 100 çıktısını verir.

        // Örnek 4:
        int a=10, b=20, c=100, d=40;
        a+=5;
        b-=25;
        c*=2;
        d/=10;
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Ornek 4 : Diger Atama Operatorleri-2 : "+"a = "+ a +", b = "+ b + ", c = " + c + ", d = " + d);
        System.out.println("a += 5 isleminin sonucu a = " + a);
        System.out.println("b -= 25 isleminin sonucu b = " + b);
        System.out.println("c *= 2 isleminin sonucu c = " + c);
        System.out.println("d /= 10 isleminin sonucu d = " + d);

        // Örnek 5:
        // Çoklu Atama İşlemi
        int sayi1 = 3;
        int sayi2 = 5;
        int k=sayi1=sayi2;
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Ornek 5 : Coklu Atama Islemi");
        System.out.println("(k=sayi1=sayi2) = " + k);
        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);

        // Örnek 6:
        // İki Değişkenin Değerinin Takas Yapılması

        int deger1 = 5;
        int deger2 = 10;
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Ornek 6 : İki Değişkenin Değerinin Takas Yapılması");
        System.out.println("Ilk durumda;");
        System.out.println("deger1 = " + deger1);
        System.out.println("deger2 = " + deger2);
        int temp;
        temp = deger1;   // temp'de 5 değeri var.
        deger1 = deger2; // deger1'de 10 değeri var.
        deger2 = temp;   // deger2'de 5 değeri var.
        System.out.println("Son durumda;");
        System.out.println("deger1 = " + deger1);
        System.out.println("deger2 = " + deger2);

        // Karşılaştırma Operatörleri
        // <  : küçüktür
        // >  : büyüktür
        // <= : küçük eşittir
        // >= : büyük eşittir
        // == : eşittir
        // != : eşit değildir

        // Örnek 7:

        a = 10;
        b = 6;
        boolean sonuc = a<b;
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Ornek 7 : Ikı Sayinin Karsilastirilmasi");
        System.out.println(sonuc);

        // Örnek 8:
        int x =10;
        int y = 16;
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Ornek 8 : Ikı Sayinin Buyukluk Kucukluk Kontrolu");
        if (x>y) {
            System.out.println("x, y'den buyuktur.");
        } else if (x<y) {
            System.out.println("x, y'den kucuktur.");
        }

        // Örnek 9:
        sayi1 =1;
        sayi2 =2;
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Ornek 9 : Karsılastirma Operatorlerinin Kullanilmasi");
        if (sayi1==sayi2) {
            System.out.println("Sayilar ayni");
        }
        if (sayi1!=sayi2) {
            System.out.println("Sayilar farkli");
        }
        if (sayi1<sayi2) {
            System.out.println("Sayi1 daha kucuktur");
        }
        if (sayi1>sayi2) {
            System.out.println("Sayi2 daha buyuktur");
        }
        if (sayi1<=sayi2) {
            System.out.println("Sayi1, Sayi2'den kucuk ve esittir");
        }
        if (sayi1>=sayi2) {
            System.out.println("Sayi1, Sayi2'den buyuk ve esittir");
        }

        // Aritmetik Operatörler
        // +  : Toplama işlemi yapar.
        // -  : Çıkarma işlemi yapar.
        // *  : Çarpma işlemi yapar.
        // /  : Bölme işlemi yapar.
        // %  : Mod işlemi yapar, işlem sonucunda kalanı verir.
        // ++ : Değeri 1 artırır.
        // -- : Değeri 1 azaltır.

        // Örnek 10:
        // Temel Aritmetik Operatörler (+,-,*,/)
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Ornek 10 : Temel Aritmetik Operatorler (+,-,*,/) " + "x = " + x + ", y = " + y);
        x = 8;
        y = 5;
        System.out.println("Toplama islemi sonucu : x+y = " + (x+y));
        System.out.println("Cikarma islemi sonucu : x-y = " + (x-y));
        System.out.println("Carpma islemi sonucu : x*y = " + (x*y));
        System.out.println("Bolme islemi sonucu : x/y = " + (x/y));

        // Örnek 11:
        // Mod Operatörü : %
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Ornek 11 : % Mod Operatorunun Kullanımı");
        sayi1 = 40;
        sayi2 = 6;
        System.out.println("sayi1 % sayi2 : " +sayi1 % sayi2);

        // Örnek 12:
        // ( - ) Operatörü ile Sayıyı Negatif Yapma
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Ornek 12 : (-) Operatoru ile Sayiyi Negatif Yapma");
        x = 5;
        x = -x;
        System.out.println(x+x);

        // Örnek 13:
        // Arttırma (++) ve Azaltma (--) Operatörleri
        sayi1 = 10;
        a = sayi1++;
        b = sayi1;
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Ornek 13 : Arttırma ve Azaltma Operatorleri - 1");
        System.out.println("Arttirma operatoru (++) sona yazilirsa : " + a);
        System.out.println("Sayinin yeni degeri : " + b);

        // Örnek 14:
        sayi1 = 20;
        int e, f;
        a = ++sayi1;
        b = sayi1--;
        c = --sayi1;
        d = ++sayi1;
        e = sayi1++;
        f = sayi1;
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Ornek 14 : Arttırma ve Azaltma Operatorleri - 2");
        System.out.println("A degeri : " + a);
        System.out.println("B degeri : " + b);
        System.out.println("C degeri : " + c);
        System.out.println("D degeri : " + d);
        System.out.println("E degeri : " + e);
        System.out.println("F degeri : " + f);

        // Mantıksal Operatörler
        // &  : Mantıksal VE (AND) işlemi yapar.
        // |  : Mantıksal VEYA (OR) işlemi yapar.
        // && : Koşullu VE işlemi yapar. Karşılaştırılan iki değerden her ikisi de true olduğu sürece, true döndürür.
        // || : Koşullu VEYA işlemi yapar. Karşılaştırılan iki değerden en az biri true olduğu sürece, true döndürür.
        // !  : Mantıksal NOT (DEĞİL) işlemi yapar. Verilen boolean tipindeki verinin tersini verir. True ise false, false ise true.
        // ^  : Mantıksal XOR işlemi yapar. Verilen iki değeri XOR işlemine tabi tutar.

        // Örnek 15:
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Ornek 15 : Mantıksal Operatorle Login İslemi");
        int sifre = 1234;
        String ad = "ismail";
        if (sifre == 1234 && ad == "ismail") {
            System.out.println("giris basarili");
        }

        // Örnek 16:
        boolean p = false;
        boolean q = true;
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Ornek 16 : Mantıksal Operatorler");
        System.out.println("p & q = " + (p&q));
        System.out.println("p | q = " + (p|q));
        System.out.println("p && q = " + (p&&q));
        System.out.println("p || q = " + (p||q));
        System.out.println("p ^ q = " + (p^q));
        System.out.println("!p = " + (!p));
        System.out.println("(p&q) || (p^q) = " + ((p&q) || (p^q)));


        // Bitsel Operatörler
        // ~  : Bütün bitlerin tersini alır. 1 ise 0 yapar, 0 ise 1 yapar.
        // &  : Bitsel olarak VE (AND) işlemi yapar.
        // |  : Bitsel olarak VEYA (OR) işlemi yapar.
        // ^  : Bitsel olarak XOR işlemi yapar.
        // >> : Bitsel olarak sayıyı istenilen değer kadar SAĞA kaydırır.
        // << : Bitsel olarak sayıyı istenilen değer kadar SOLA kaydırır.

        // Örnek 17:
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Ornek 17 : Bitsel Operatorler - AND Islemi");
        System.out.println("1. sayi = 0011 (3)");
        System.out.println("2. sayi = 1110 (14)");
        System.out.println("Sonuc   = 0010 ("+(3&14)+")");

        // Örnek 18:
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Ornek 18 : Bitsel Operatorler - XOR Islemi");
        System.out.println("1. sayi = 0011 (3)");
        System.out.println("2. sayi = 1110 (14)");
        System.out.println("Sonuc   = 1101 ("+(3^14)+")");

        // Örnek 19:
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Ornek 19 : Bitsel Operatorler - ~ ile Bitlerin Tersini Alma");
        System.out.println("Sayi  = 0011 (3)");
        System.out.println("Sonuc = 1100 ("+(~3)+")"); // En baştaki bit işaret bitidir. Kalan 100 bitleride 4'e karşılık gelir.

        // Kaydırma Operatörleri (>>,<<)
        // Örnek 20:
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Ornek 20 : Kaydirma Operatorleri");
        System.out.println(9<<2);  // 9 sayısı 1001' e karşılık gelir. 2 bit sola kaydırırsak bütün bitler 2 kere sola kaydırılır ve en sağdan da 2 tane 0 gelir. Yeni sayımız 100100 olur. Bu da 36'ya karşılık gelir.
        System.out.println(9>>2);  // 9 sayısı 1001' e karşılık gelir. 2 bit sağa kaydırırsak en sağdaki 2 bit kaybolur ve kalan bitler 2 basamak sağa kayar. Yeni sayımız 0010 olur ve bu da 2'ye karşılık gelir.

        // Örnek 21:
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Ornek 21 : Bitsel Operatorler");
        byte n = 6;
        System.out.println("Sayimiz : " + n);
        System.out.println("~n sonucu : " + ~n);
        System.out.println("n&3 sonucu : " + (n&3));
        System.out.println("n<<2 sonucu : " + (n<<2));
        System.out.println("n>>2 sonucu : " + (n>>2));

        // Örnek 22:
        // Tip Karşılaştırma Operatörü
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Ornek 22 : Tip Karsilastirma Operatoru");
        Sinif1 s1 = new Sinif1();
        Sinif2 s2 = new Sinif2();
        if(s2 instanceof Sinif2) {
            System.out.println("s2, Sinif2'nin bir ornegidir.");
        } else {
            System.out.println("s2, Sinif2'nin bir ornegi degildir");
        }

        // Örnek 23:
        // Operator Onceligi
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Ornek 23 : Operator Onceligi");
        System.out.println("7+4*8/2*5 = " + 7+4*8/2*5);
        System.out.println("4+(5+(2*6)) = " + 4+(5+(2*6)));  // sağdan öncelikli
        System.out.println("((3/1)*4)-6 = " +(((3/1)*4)-6)); // soldan öncelikli

        // Örnek 24:
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Ornek 24 : Arttirma, Azaltma ve Karsilastirma Operatorleri");
        x = 5;
        System.out.println(x);
        x = x + 1;
        System.out.println(x);
        x++; // --> x = x + 1;
        System.out.println(x);
        x--; // --> x = x - 1;
        System.out.println(x);
        x = x * 5;
        System.out.println(x);

        y = 4;
        System.out.println(x>y);
        System.out.println(y>x);
        y=30;
        System.out.println(x>y);
        System.out.println(x>=y);
        System.out.println(x==y);
        System.out.println(x!=y);

        // Örnek 25:
        // and : &&
        // or  : ||
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Ornek 25 : Mantiksal Operatorler - Kosullu Ve/Veya Operatoru");
        x = 30;
        y = 4;
        int z = 5;
        System.out.println(x<y && z<y);
        System.out.println(x<y || z<y);
        System.out.println("---------------------------------------------------------------------------------");
    }
}
