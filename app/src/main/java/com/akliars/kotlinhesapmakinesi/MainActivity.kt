package com.akliars.kotlinhesapmakinesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.viewmodel.CreationExtras
import com.akliars.kotlinhesapmakinesi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private  var sncText : String = ""
    private var toplam : Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.sayi0.setOnClickListener {
            binding.sonucText.setText(ekleSayi(0))
        }

        binding.sayi1.setOnClickListener {
            binding.sonucText.setText(ekleSayi(1))
        }

        binding.sayi2.setOnClickListener {
            binding.sonucText.setText(ekleSayi(2))
        }

        binding.sayi3.setOnClickListener {
            binding.sonucText.setText(ekleSayi(3))
        }

        binding.sayi4.setOnClickListener {
            binding.sonucText.setText(ekleSayi(4))
        }

        binding.sayi5.setOnClickListener {
            binding.sonucText.setText(ekleSayi(5))
        }

        binding.sayi6.setOnClickListener {
            binding.sonucText.setText(ekleSayi(6))
        }

        binding.sayi7.setOnClickListener {
            binding.sonucText.setText(ekleSayi(7))
        }

        binding.sayi8.setOnClickListener {
            binding.sonucText.setText(ekleSayi(8))
        }

        binding.sayi9.setOnClickListener {
            binding.sonucText.setText(ekleSayi(9))
        }

        binding.buttonTopla.setOnClickListener {
            binding.sonucText.setText(ekleIsaret("+"))
        }

        binding.buttonSonuc.setOnClickListener {
            var b = esittir().toString()
            binding.sonucText.setText(b)
        }

        binding.buttonAC.setOnClickListener {
            sifirla()
            binding.sonucText.setText("0")
        }


    }
    fun ekleSayi(s : Int) : String{
        if (sncText == ""){
            sncText = s.toString()
        } else{
            sncText += s.toString()
        }
        return sncText
    }

    fun ekleIsaret(s : String) : String{
        if (sncText != "" && sncText[sncText.length-1] != '+'){
            sncText += s
        }

        return sncText
    }

    fun esittir () : Int{
       // toplam += sncText.toInt()
       /* val str = "apple, banana, cherry, mango"
        val delimiter = ", "
        val values = str.split(delimiter)
        for (value in values) {
            println(value)
        }*/
        var sayilar = sncText.split("+")
        toplam = 0
        for (sayi in sayilar){
            if (sayi != ""){
                var a = sayi.toInt()
                Log.e("Sayilar",sayi)
                toplam += a
            }

        }
        sncText = toplam.toString()
        return toplam
    }
    fun sifirla (){
        sncText = "0"
        toplam = 0
    }

}