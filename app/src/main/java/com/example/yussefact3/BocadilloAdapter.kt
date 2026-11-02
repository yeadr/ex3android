package com.example.yussefact3

import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.yussefact3.databinding.BocadilloBinding
import com.bumptech.glide.Glide
class BocadilloAdapter(val bocatas: ArrayList<MainActivity.Bocadillo>) : RecyclerView.Adapter<BocadilloAdapter.ViewHolder>() {
    class ViewHolder(val binding: BocadilloBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = BocadilloBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val bocata = bocatas[position]

        val borde = GradientDrawable().apply {
            setColor(Color.WHITE)
            setStroke(3, Color.BLACK)
            cornerRadius = 10f
        }

        holder.itemView.background = borde

        holder.binding.txtNombre.text = bocata.nombre
        holder.binding.txtPrecio.text = bocata.precio
        Glide.with(holder.itemView.context)
            .load(bocata.imagen)
            .into(holder.binding.imgProducto)
    }

    override fun getItemCount() = bocatas.size
}