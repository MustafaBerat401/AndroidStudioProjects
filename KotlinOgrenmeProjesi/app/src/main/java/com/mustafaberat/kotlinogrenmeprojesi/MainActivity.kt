package com.mustafaberat.kotlinogrenmeprojesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("Merhaba kotlin")
        println(5 * 10)


        // Int
        //Değişkenler
        var a = 5
        var b = 10

        println(a * b)
        println("-------------------Int---------------")

        var yas = 50 // daha sonradan değeri değiştirilebilir.

        println(yas / 5 * 8)

        yas = 60

        println(yas / 5 * 8)

        // Sabitler
        val x = 10 // daha sonradan değeri değiştirilemez.

        val x2 = 5
        val y = 20

        println(y * x2)

        val yasSonucu = yas * x2
        println(yasSonucu)

        //Tanımlama (Definin)
        val benimIntegerim : Int

        // Başlatma, Değerini atama (Initializing, Initialization)
        benimIntegerim = 5

        var yeniInteger : Int = 20

        println(benimIntegerim / 2)

        // Long

        println("-------------------Long---------------")

        var benimLong : Long = 100
        benimLong = 3000000000000
        println(benimLong)

        // Double & Float

        println("-------------------Double & Float---------------")

        val pi = 3.14

        println(pi * 2)

        val floatPi : Float = 3.14f
        println(floatPi * 2)

        val yeniDouble = 5.0
        println(yeniDouble / 2)



        // String

        println("-------------------String---------------")

        val benimString = "Benim yeni metnim"
        println(benimString.length)

        val isim = "Mustafa Berat"
        val soyisim = "Demir"

        val tamisim = isim + soyisim
        println(tamisim)

        val yeniBirString : String
        yeniBirString = "10"

        val baskaBirString = "20"

        println(yeniBirString + baskaBirString)

        // Boolean

        println("-------------------Boolean---------------")

        var benimBoolean = true
        benimBoolean = false

        // < --> küçüktür
        // > --> büyüktür
        // == --> eşittir
        // != --> eşit değildir
        // <= --> küçük eşit
        // >= --> büyük eşit
        // && --> ve
        // || --> veya

        println(3 < 8)
        println(4!=4)

        // Veri tipi dönüştürme

        println("-------------------Dönüşüm---------------")

        val benimInt = 10
        val benimLongaCevrilenInt = benimInt.toLong()

        val kullaniciGirdisi = "50"
        val cevir = kullaniciGirdisi.toInt()
        println(cevir / 2)

        // KOLEKSİYONLAR

        // Array - Dizi

        println("-------------------Dizi---------------")


        val benimDizim = arrayOf("Atıl","Mustafa","Berat","Demir","Osman")

        //index
        println(benimDizim[0])
        println(benimDizim.get(1))
        benimDizim[2] = "Mahmut"
        println(benimDizim.get(2))
        benimDizim.set(3,"Mehmet")
        println(benimDizim[3])

        val numaraDizisi = doubleArrayOf(1.0, 3.2, 5.7, 5.8)
        println(numaraDizisi.get(2))

        val karisikDizi = arrayOf("Berat", 24, 16.5, true, 12)
        println(karisikDizi.get(3))

        // ArrayList - Listeler

        println("-------------------ArrayList---------------")

        val isimListesi = arrayListOf("Atıl","Mustafa","Osman")

        println(isimListesi[0])
        println(isimListesi.get(1))

        isimListesi.add("Mehmet")
        isimListesi.add("Atlas")
        println(isimListesi.get(4))

        val karisikArrayList = arrayListOf<Any>()
        karisikArrayList.add("3")
        karisikArrayList.add(10)
        karisikArrayList.add(true)

        val intArrayList = ArrayList<Int>()
        intArrayList.add(5)
        intArrayList.add(10)
        println(intArrayList.get(1))

        // Set

        println("-------------------Set----------------")

        val ornekDizi = arrayOf(7,8,9,9,8,5,4,4,6)
        println("index 2: ${ornekDizi[2]}")
        println("index 3: ${ornekDizi[3]}")

        println(ornekDizi.size)

        val benimSet = setOf<Int>(7,8,9,8,8,9,10)
        println(benimSet.size)

        // For Each
        benimSet.forEach {
            println(it)
        }

        val digerSet = HashSet<String>()
        digerSet.add("Atıl")
        digerSet.add("Atıl")
        digerSet.add("Atıl")
        digerSet.add("Mustafa")

        digerSet.forEach {
            println(it)
        }

        // Map

        println("-------------------SONUÇÇÇ----------------")

        // Anahtar Kelime - Değer (Key-Value Pairing)
        val benimListem = arrayListOf<Int>(40,50,60,70,80,90)
        val benimDigerListem = arrayListOf<Int>(30,40,12,10,20,30)
        val benimMap = hashMapOf<String,ArrayList<Int>>("IlkListe" to benimDigerListem, "IkinciListe" to benimListem)
        println(benimMap.get("IlkListe")?.get(2))
        println("-------------------SONUÇÇÇÇ----------------")

        val yemekKaloriMap = hashMapOf<String, Int>()
        yemekKaloriMap.put("Elma",100)
        yemekKaloriMap.put("Et",200)
        yemekKaloriMap.put("Tavuk",300)

        println(yemekKaloriMap.get("Et"))

        val benimMapim = HashMap<String, String>()
        benimMapim.put("Örnek", "Değer")

        val yeniMap = hashMapOf<String, Int>("Atıl" to 40, "Örnek" to 50)
        println(yeniMap.get("Örnek"))

        // Matematiksel İşlemler

        println("-------------------Matematiksel İşlemler----------------")

        var sayi = 8
        println(sayi)
        sayi = sayi + 1
        println(sayi)
        sayi++
        println(sayi)
        sayi--
        println(sayi)

        var digerSayi = 10

        println(digerSayi > sayi)

        // && --> VE
        // || --> VEYA

        println(digerSayi > sayi && 2 > 3)
        println(digerSayi > sayi || 2 > 3)

        println(8 + 7)
        println(10-4)
        println(20*5)
        println(10/2)

        // Remainder - Kalanı Bulmak

        println(10%3)
        println(10%2)
        println(11%5)

        // If Kontrolleri

        println("-------------------If Statements (Eğer Kontrolleri)----------------")

        val skor = 29

        if (skor < 10) {
            println("Oyunu Kaybettin!")
        } else if (skor >= 10 && skor < 20) {
            println("Skorun 10 ve 20 arasında, çok iyi skor aldın.")
        } else if (skor >= 20 && skor < 30) {
            println("Skorun 20 ile 30 arasında rekorlar kırıyorsun")
        } else {
            println("Skorun 30'un üstünde, efsane oynadın.")
        }

        // When

        println("-------------------When----------------")

        var notRakami = 0
        var notStringi = ""

        when(notRakami) {
            0 -> notStringi = "Geçersiz Not"
            1 -> notStringi = "Zayıf"
            2 -> notStringi = "Kötü"
            3 -> notStringi = "Orta"
            4 -> notStringi = "İyi"
            else -> notStringi = "Pek İyi"
        }

        println(notStringi)

        // Döngüler

        println("-------------------For Döngüsü----------------")

        val baskaBirDizi = arrayOf(5, 10, 15, 20, 25, 30)
        val q = baskaBirDizi[0] / 5 + 3
        println(q)

        println("döngü başladı")
        for (num in baskaBirDizi) {
            println(num / 5 + 3)
        }
        println("döngü bitti")


        for (indeks in baskaBirDizi.indices) {
            println(baskaBirDizi[indeks] / 5 + 3)
        }

        for (b in 0..9) {
            println(b)
        }

        val benimDigerStringDizim = ArrayList<String>()
        benimDigerStringDizim.add("Atıl")
        benimDigerStringDizim.add("Samancıoğlu")

        for (str in benimDigerStringDizim) {
            println(str)
        }

        benimDigerStringDizim.forEach {
            println(it)
        }

        println("-------------------While Döngüsü----------------")

        var j = 0

        while ( j <= 10 ) {
            println(j)
            j = j + 1
        }




    }

}