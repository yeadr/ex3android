package com.example.yussefact3

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.yussefact3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bocatas = ArrayList<Bocadillo>();
        bocatas.add(Bocadillo("Bocadillo de Jamón Serrano", "5,00 €", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQbPvRtDqpsFlVVjQtCYb8eSK3ToVJFzXRYty1G3aNbf_VkJgUjMAQqq7w&s=10?w=400"))
        bocatas.add(Bocadillo("Bocadillo de Tortilla", "4,50 €", "https://images.unsplash.com/photo-1528735602780-2552fd46c7af?w=400"))
        bocatas.add(Bocadillo("Bocadillo de Pollo", "5,50 €", "https://images.unsplash.com/photo-1606755962773-d324e0a13086?w=400"))
        bocatas.add(Bocadillo("Bocadillo de Atún", "4,00 €", "https://images.unsplash.com/photo-1521390188846-e2a3a97453a0?w=400"))
        bocatas.add(Bocadillo("Bocadillo de Bacon y Queso", "5,00 €", "https://images.unsplash.com/photo-1550507992-eb63ffee0847?w=400"))
        bocatas.add(Bocadillo("Bocadillo Vegetal", "4,50 €", "https://images.unsplash.com/photo-1539252554453-80ab65ce3586?w=400"))
        bocatas.add(Bocadillo("Bocadillo de Lomo", "5,50 €", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTPQLhQznlIHtCEy_ZG12gOqxotL-qViRo2BQocyWluFcFN6r4J6QTo1Eqg&s=10?w=400"))
        bocatas.add(Bocadillo("Bocadillo de Chorizo", "4,00 €", "https://images.unsplash.com/photo-1550507992-eb63ffee0847?w=400"))
        bocatas.add(Bocadillo("Bocadillo de Salmón", "6,00 €", "https://images.unsplash.com/photo-1528735602780-2552fd46c7af?w=400"))
        bocatas.add(Bocadillo("Bocadillo de Queso", "4,50 €", "https://images.unsplash.com/photo-1539252554453-80ab65ce3586?w=400"))

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = BocadilloAdapter(bocatas)

        Glide.with(binding.logo.context)
            .load("https://konig.cat/wp-content/uploads/2023/09/logo-2.webp?w=400")
            .into(binding.logo)
    }

    class Bocadillo(val nombre: String, val precio: String, val imagen: String)


}