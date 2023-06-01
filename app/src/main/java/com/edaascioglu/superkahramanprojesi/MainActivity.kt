package com.edaascioglu.superkahramanprojesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


private var Any.text: Any
    get() {}

class MainActivity : AppCompatActivity() {
    /*kapsamda bunu tanımlamak gerekiyor*/  var numara=0
      var isim=""
    var meslek=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Scope -Kapsam
        numara=5
    }
    fun superKahramanYap(view: View, isimText: Any, yasText: Any, meslekText: Any, sonucText: Any){
          numara=10
          val isim= isimText.text.toString()
          val yas=yasText.text.toString().toIntOrNull()
          val meslek=meslekText.text.toString()

            if (yas==null){
                sonucText.text="Doğru yaşı giriniz"

            }
            else{
                val superKahraman=SuperKahraman(isim,yas,meslek)
            }
           val superKahraman=SuperKahraman(isim,yas!!,meslek)
          sonucText.text="İsim:${superKahraman.isim} Yas:${superKahraman.yas} Meslek: ${superKahraman.meslek}"

    }
}