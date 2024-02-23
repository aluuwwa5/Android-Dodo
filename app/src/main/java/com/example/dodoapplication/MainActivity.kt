package com.example.dodoapplication


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.dodoapplication.adapter.PizzaAdapter
import com.example.dodoapplication.databinding.ActivityMainBinding
import com.example.dodoapplication.model.Pizza
import com.example.dodoapplication.model.PizzaDataSource

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var pizzaList: List<Pizza> = PizzaDataSource.pizzaList
    private lateinit var adapter: PizzaAdapter
    private lateinit var searchButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        searchButton = binding.Button
        handleSearch()
    adapter = PizzaAdapter(
    onPizzaClick = {
        handlePizzaClick(it)
    },
        onComboClick = {
            handleComboClick(it)
    }
    )

    binding.recyclerView.adapter = adapter

    adapter.setData(pizzaList)
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


private fun handlePizzaClick(pizza: Pizza) {
    val intent = Intent(this, SecondActivity::class.java)
    intent.putExtra("Pizzza", pizza);
    startActivity(intent)
}
private fun handleComboClick(pizza:Pizza){
    val intent = Intent(this, SecondActivity::class.java)
    intent.putExtra("Combo", pizza)
    startActivity(intent)
            }
    }



