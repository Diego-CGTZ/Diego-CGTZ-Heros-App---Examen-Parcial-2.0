package com.example.herosapp_examenparcial.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.herosapp_examenparcial.R
import com.example.herosapp_examenparcial.models.Universe
import com.squareup.picasso.Picasso

class SupAdapter(val supList : List<Universe>) : RecyclerView.Adapter<SupViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SupViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.sup_item,parent,false)
        return SupViewHolder(view)
    }

    override fun getItemCount(): Int {
        return supList.count()
    }

    override fun onBindViewHolder(holder: SupViewHolder, position: Int) {
        val sup = supList[position]
        holder.supName.text = sup.name
        Picasso.get().load(sup.logo).into(holder.supLogo)
    }

}

class SupViewHolder(view: View): ViewHolder(view){
    val supName : TextView = view.findViewById(R.id.sup_name)
    val supLogo : ImageView = view.findViewById(R.id.sup_img)
}