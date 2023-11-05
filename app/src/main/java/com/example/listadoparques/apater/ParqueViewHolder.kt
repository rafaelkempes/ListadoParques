package com.example.listadoparques.apater

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.listadoparques.Parques
import com.example.listadoparques.databinding.ItemParquesBinding

public class ParqueViewHolder(view: View):RecyclerView.ViewHolder(view) {
 val binding = ItemParquesBinding.bind(view)
 fun render(parquesMode: Parques) {
  binding.NombreParque.text = parquesMode.nombre
  binding.DescripcionParque.text = parquesMode.descripcion
  Glide.with(binding.Imagenparque.context).load(parquesMode.foto).into(binding.Imagenparque)
  binding.Imagenparque.setOnClickListener{ Toast.makeText(binding.Imagenparque.context,parquesMode.nombre,Toast.LENGTH_LONG).show()}

 }
}