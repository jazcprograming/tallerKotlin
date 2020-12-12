package com.example.tallerkotlin

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class FrutasAdapter(val lista :List<Frutas>): RecyclerView.Adapter<FrutasAdapter.ViewHolder>() {


    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val nombre= itemView.findViewById<TextView>(R.id.nombre)
        val precio= itemView.findViewById<TextView>(R.id.precio)
        val descripcion= itemView.findViewById<TextView>(R.id.descripcion)
        val unidad= itemView.findViewById<TextView>(R.id.unidad)
        val fondo=itemView.findViewById<View>(R.id.padre)
        val imagen=itemView.findViewById<ImageView>(R.id.imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var a=LayoutInflater.from(parent.context).inflate(R.layout.item_texto,parent,false)
        return ViewHolder(a)
    }

    override fun getItemCount(): Int {
        return lista.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val fruta= lista.get(position)
        holder.nombre.text=fruta.nombre
        holder.descripcion.text=fruta.descripcion
        holder.precio.text=fruta.precio.toString()
        holder.unidad.text=fruta.unidad
        holder.fondo.setBackgroundColor(Color.parseColor(fruta.colorPrincipal))
        Picasso.get().load(fruta.url).placeholder(R.drawable.ic_launcher_foreground).into(holder.imagen)
    }
}