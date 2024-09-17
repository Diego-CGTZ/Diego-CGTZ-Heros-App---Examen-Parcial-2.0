package com.example.herosapp_examenparcial.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.motion.widget.MotionScene.Transition.TransitionOnClick
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.herosapp_examenparcial.R
import com.example.herosapp_examenparcial.models.Publisher
import com.example.herosapp_examenparcial.models.Universe
import com.squareup.picasso.Picasso

class UniverseAdapter(val universeList : List<Universe>,
                      val onClick:(Universe)->Unit)
    : RecyclerView.Adapter<UniverseViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UniverseViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.sup_item,parent,false)
        return UniverseViewHolder(view)
    }

    override fun getItemCount(): Int {
        return universeList.count()
    }

    override fun onBindViewHolder(holder: UniverseViewHolder, position: Int) {
        val universe = universeList[position]
        holder.universeName.text = universe.name
        Picasso.get().load(universe.image).into(holder.universeImage)
        Picasso.get().load(universe.logo).into(holder.supLogo)
        holder.itemView.setOnClickListener{
            onClick(universe)
        }
    }
}

class UniverseViewHolder(view : View) : ViewHolder(view){
    val universeName : TextView = view.findViewById(R.id.universe_name)
    val universeImage : ImageView = view.findViewById(R.id.universe_logo)
    val supLogo : ImageView = view.findViewById(R.id.sup_img)
}