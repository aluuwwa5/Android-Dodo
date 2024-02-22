package com.example.dodoapplication

import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dodoapplication.databinding.ActivitySecondBinding
import com.example.dodoapplication.model.Pizzza

class SecondActivity : AppCompatActivity() {
    companion object {
        const val KEY_RESULT = "KeyResult"
    }

//    getSupportActionBar().setDisplayHomeAsUpEnabled(true)
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val pizza = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            intent.getSerializableExtra("Pizzza", Pizzza::class.java) as Pizzza
        } else {
            intent.getSerializableExtra("Pizzza") as Pizzza
        }
    binding.pizzaTitle.text=pizza.title
        binding.pizzaDescription.text=pizza.description
        binding.pizzaCost.text=pizza.cost
        binding.pizzaImage.setImageResource(pizza.image)
    }
}