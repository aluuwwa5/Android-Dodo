package com.example.dodoapplication.adapter

import android.annotation.SuppressLint
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dodoapplication.databinding.ItemPizzzaBinding
import com.example.dodoapplication.model.Pizzza


class PizzaAdapter (private val onPizzaClick: (Pizzza) -> Unit):
    RecyclerView.Adapter<PizzaAdapter.ViewHolder>(){
        private val pizzaList: ArrayList<Pizzza> = ArrayList()

    companion object {
        private const val PIZZA_ADAPTER_TAG = "com.example.dodoapplication.adapter.PizzaAdapter"
    }
    @SuppressLint("NotifyDataSetChanged")
    fun setData(pizzas: ArrayList<Pizzza>) {
        pizzaList.clear()

        pizzaList.addAll(pizzas)


        notifyDataSetChanged()}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        Log.d(PIZZA_ADAPTER_TAG, "onCreateViewHolder")
        return ViewHolder(
            ItemPizzzaBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    /**
     * метод, для определения количесвта элементов списка
     */
    override fun getItemCount() = pizzaList.size

    /**
     * для вызова метода из ViewHolder'a
     */
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.d(PIZZA_ADAPTER_TAG, "onBindViewHolder: $position")
        holder.bind(pizzaList[position])
    }

    inner class ViewHolder(
        private val binding: ItemPizzzaBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(pizza: Pizzza) {
            with(binding) {
                pizzaImage.setImageResource(pizza.image)
                pizzaTitle.text = pizza.title
                pizzaDescription.text = pizza.description
                pizzaCost.text = pizza.cost

                root.setOnClickListener {
                    onPizzaClick(pizza)
                }


            }
        }
    }
}

