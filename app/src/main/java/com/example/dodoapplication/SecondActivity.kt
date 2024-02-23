package com.example.dodoapplication

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.dodoapplication.databinding.ActivitySecondBinding
import com.example.dodoapplication.model.Pizza

class SecondActivity : AppCompatActivity() {

//    getSupportActionBar().setDisplayHomeAsUpEnabled(true)
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val pizza = intent.extras?.getSerializable("pizza") as Pizza
        binding.pizzaTitle.text=pizza.title
        binding.pizzaDescription.text=pizza.description
        binding.pizzaCost.text="В корзину за ${pizza.cost}"
        binding.pizzaImage.setImageResource(pizza.image)
    }
    fun goBack(view: View) {
        finish()
    }
}