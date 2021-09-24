package com.mustafaberat.dortislemkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var deger1 : Int? = null
    var deger2 : Int? = null
    var sonuc : Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun topla(view : View){
        deger1 = editText.text.toString().toIntOrNull()
        deger2 = editText2.text.toString().toIntOrNull()

        if (deger1 == null || deger2 == null) {
            sonucTextView.text = "Lütfen Rakam Giriniz."
        } else {
            sonuc = deger1!! + deger2!!
            sonucTextView.text = "Sonuç: ${sonuc}"
        }
    }

    fun cikar(view : View){
        deger1 = editText.text.toString().toIntOrNull()
        deger2 = editText2.text.toString().toIntOrNull()

        if (deger1 == null || deger2 == null) {
            sonucTextView.text = "Lütfen Rakam Giriniz."
        } else {
            sonuc = deger1!! - deger2!!
            sonucTextView.text = "Sonuç: ${sonuc}"
        }

    }

    fun bol(view : View){
        deger1 = editText.text.toString().toIntOrNull()
        deger2 = editText2.text.toString().toIntOrNull()

        if (deger1 == null || deger2 == null) {
            sonucTextView.text = "Lütfen Rakam Giriniz."
        } else {
            sonuc = deger1!! / deger2!!
            sonucTextView.text = "Sonuç: ${sonuc}"
        }

    }

    fun carp(view : View){
        deger1 = editText.text.toString().toIntOrNull()
        deger2 = editText2.text.toString().toIntOrNull()

        if (deger1 == null || deger2 == null) {
            sonucTextView.text = "Lütfen Rakam Giriniz."
        } else {
            sonuc = deger1!! * deger2!!
            sonucTextView.text = "Sonuç: ${sonuc}"
        }

    }



}