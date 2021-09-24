package com.mustafaberat.siniflarvefonksiyonlar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var j = -10

        if (j == 0){
            ilkFonksiyon()
        } else {
            ikinciFonksiyon()
        }

        cikarma(500,20)
        var x = toplama(10,20)
        textView.text = "Sonuç : ${x}"

        button.setOnClickListener {
            val toplamaSonucu = toplama(10,50)
            textView.text = "Sonuç : ${toplamaSonucu}"
        }
        sinifCalismasi()
        nullGuvenligi()
    }

    fun ilkFonksiyon() {
        println("İlk Fonksiyon Çalıştırıldı.")
    }

    fun ikinciFonksiyon() {
        println("İkinci Fonksiyon Çalışştırıldı")

    }

    // Girdi Almak

    fun cikarma(x: Int, y: Int) {
        var result = x - y
        textView.text = "Sonuç: ${result}"
    }

    // Çıktı Vermek -> Döndürmek (Return)

    fun toplama(a:Int, b:Int) : Int {
        var result2 = a + b
        return result2
    }

    /*
    fun degistir(view : View) {
        val toplamaSonucu = toplama(10,50)
        textView.text = "Sonuç : ${toplamaSonucu}"
    }
     */

    fun sinifCalismasi() {

        var superman = SuperKahraman("Superman",50,"Gazeteci")

        textView.text = "Yaş: ${superman.yas}"
        superman.testFonksiyonu()
        println(superman.sacRenginiAl())

    }

    fun nullGuvenligi() {
        //Null, Nullability, Null Safety

        //Tanımlama, Definening
        var benimString : String?


        //Initialization - Başlatmak - Değer Atamak
        benimString = "Atıl"


        //println(benimYasim)

        //benimYasim = 2

        // 1.yöntem
        //if (benimYasim != null) {
        //  println(benimYasim * 2)
        //} else {
        //    println("Null Geldi.")
        //}

        // 2.yöntem

        //benimYasim = 3
        // !! -> null olmayacak, ? -> null olabilir.
        //println(benimYasim!!.minus(2))

        // 3.yöntem
        //elvis operatörü

        //benimYasim = 10
        //val sonuc = benimYasim?.minus(2) ?: 10
        //println(sonuc)

        // 4.yöntem
        // let
        //
        var benimYasim : Int? = null
        benimYasim?.let {
            println(it * 5)
        }
    }


}