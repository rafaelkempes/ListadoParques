package com.example.listadoparques.apater

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.listadoparques.Parques
import com.example.listadoparques.R

class ParqueAdapter(private val ParqueList:List<Parques>): RecyclerView.Adapter<ParqueViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParqueViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ParqueViewHolder(layoutInflater.inflate(R.layout.item_parques,parent,false))
    }

    override fun getItemCount(): Int {
        return ParqueList.size
    }

    override fun onBindViewHolder(holder: ParqueViewHolder, position: Int) {
        val item = ParqueList[position]
        holder.render(item)
    }
}