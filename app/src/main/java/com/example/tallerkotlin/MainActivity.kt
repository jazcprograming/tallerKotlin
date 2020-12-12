package com.example.tallerkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    var linearlayout:LinearLayout?=null

    var recycler: RecyclerView?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler=findViewById(R.id.recyclerFrutas)

        //linearlayout=findViewById(R.id.linearlayout)

        //val textView=findViewById<TextView>(R.id.texto)

        //textView.text=getString(R.string.txt2)

        /*val lista = ArrayList<String>()
        lista.add("Manzana")
        lista.add("Pera")
        lista.add("Piña")
        lista.add("Platano")
        lista.add("Mango")
        lista.add("Naranja")
        lista.add("Manzana")
        lista.add("Pera")
        lista.add("Piña")
        lista.add("Platano")
        lista.add("Mango")
        lista.add("Naranja")
        lista.add("Manzana")
        lista.add("Pera")
        lista.add("Piña")
        lista.add("Platano")
        lista.add("Mango")
        lista.add("Naranja")
        lista.add("Manzana")
        lista.add("Pera")
        lista.add("Piña")
        lista.add("Platano")
        lista.add("Mango")
        lista.add("Naranja")
        lista.add("Manzana")
        lista.add("Pera")
        lista.add("Piña")
        lista.add("Platano")
        lista.add("Mango")
        lista.add("Naranja"recycler?.adapter=FrutasAdapter(lista))

        recycler?.layoutManager= LinearLayoutManager(this,RecyclerView.VERTICAL,false)*/


        findViewById<Button>(R.id.button2).setOnClickListener {

            var intent= Intent(this,FrutasActivity::class.java)
            startActivity(intent,null)


            //recycler?.adapter=FrutasAdapter(lista)

            //LayoutInflater.from(this).inflate(R.layout.item_texto,linearlayout,true)





        //fun suma2(num1:Int,num2:Int)=num1 +num2
        //Log.d("RESULTADO",doblar(45,false).toString())



        }




}


    fun doblar(num:Int,doblar:Boolean):Int{


        return if (doblar) num*2 else num

    }





}