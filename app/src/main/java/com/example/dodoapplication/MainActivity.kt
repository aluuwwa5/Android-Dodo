package com.example.dodoapplication


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.dodoapplication.adapter.PizzaAdapter
import com.example.dodoapplication.databinding.ActivityMainBinding
import com.example.dodoapplication.model.PizzaDataSource
import com.example.dodoapplication.model.PizzaDataSource.pizzaList
import com.example.dodoapplication.model.Pizzza

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private var adapter: PizzaAdapter? = null
    private lateinit var searchButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        searchButton = binding.Button
        handleSearch()

    PizzaAdapter(
    onPizzaClick = {
        handlePizzaClick(it)
    }
    )

    adapter = PizzaAdapter(
    onPizzaClick = {
        handlePizzaClick(it)}
    )

    binding.recyclerView.adapter = adapter


    adapter?.setData(PizzaDataSource.pizzaList)
}
    private fun handleSearch() {
        binding.Button.setOnClickListener {
            filterList()
        }
    }



    private fun filterList() {
        val query = binding.editText.text.toString().trim()
        if (query.isNotEmpty()) {
            val filteredList = PizzaDataSource.pizzaList.filter { it.title.lowercase().contains(query.lowercase()) }
            if (filteredList.isEmpty()) {
                Toast.makeText(this, "Ничего не найдено!", Toast.LENGTH_SHORT).show()
            }
            adapter?.setData(ArrayList(filteredList))
        }
        else {
            adapter?.setData(pizzaList)
        }
    }


private fun handlePizzaClick(pizza: Pizzza) {
    val intent = Intent(this, SecondActivity::class.java)
    intent.putExtra("Pizzza", pizza);
    startActivity(intent)
}}

