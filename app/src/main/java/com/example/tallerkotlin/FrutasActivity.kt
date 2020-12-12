package com.example.tallerkotlin

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tallerkotlin.Repositorio.RepositorioRetrofit.getService
import com.google.gson.Gson
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class FrutasActivity : AppCompatActivity(){

    var recycler: RecyclerView?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frutas)

        /*val lista = ArrayList<Frutas>()
        lista.add(Frutas(3,"Manzana","una fruta deliciosa roja","Kg","#ff7777","https://www.eluniversal.com.mx/sites/default/files/2016/09/07/manzana.jpg"))
        lista.add(Frutas(4,"Pera","una fruta con bastante agua","Kg","#77ff77","https://i.pinimg.com/originals/63/64/fb/6364fbeede3157aac881ed9c088d9c26.png"))
        lista.add(Frutas(2,"Mango","una fruta amarilla","Kg","#ffff77","https://www.eluniversal.com.mx/sites/default/files/2016/09/07/manzana.jpg"))
        lista.add(Frutas(10,"Plantano","una fruta larga","ciento","#ffff77","https://i.pinimg.com/originals/63/64/fb/6364fbeede3157aac881ed9c088d9c26.png"))
        lista.add(Frutas(3,"Piña","una fruta marron","unidad","#ff4444","https://i.pinimg.com/originals/63/64/fb/6364fbeede3157aac881ed9c088d9c26.png"))
        lista.add(Frutas(3,"Naranja","la numero1 nivel mundial","Kg","#ff4477","https://i.pinimg.com/originals/63/64/fb/6364fbeede3157aac881ed9c088d9c26.png"))
*/
        /*Log.e("FRUTASJSON", Gson().toJson(lista))
        Log.e("FRUTASOBJETO", lista.toString())*/

        recycler=findViewById(R.id.recyclerFrutas)

        recycler?.layoutManager= LinearLayoutManager(this,RecyclerView.VERTICAL,false)
        /*recycler?.adapter=FrutasAdapter(lista)*/

        llamarservicio()



    }



    fun llamarservicio(){
        val servicio= getService()

        GlobalScope.launch(Dispatchers.IO){
            val response = servicio.getFrutas()
            withContext(Dispatchers.Main){
                try {
                  var lista :List<Frutas>?=response.body()

                    recycler?.adapter=FrutasAdapter(lista!!)

                }
                catch(e:Exception){
                    Log.e("ERROR",e.toString())
                }




            }

        }



    }
}