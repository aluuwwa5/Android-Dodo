package com.example.dodoapplication.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dodoapplication.databinding.ItemComboBinding
import com.example.dodoapplication.databinding.ItemPizzzaBinding
import com.example.dodoapplication.model.Pizza
import com.example.dodoapplication.model.Pizzza

class PizzaAdapter(private val onPizzaClick: (Pizza) -> Unit,
                   private val onComboClick: (Pizza) -> Unit):
    RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    private val pizzaList: ArrayList<out Pizza> = ArrayList()

    companion object {
        private const val VIEW_TYPE_PIZZA = 0
        private const val VIEW_TYPE_COMBO = 1
    }

    fun setData(pizza: List<Pizza>) {
        pizzaList.clear()
        pizzaList.addAll(ArrayList(pizza))
        notifyDataSetChanged()}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if (viewType == VIEW_TYPE_PIZZA) {
            PizzaViewHolder(
                ItemPizzzaBinding.inflate(
                    LayoutInflater.from(parent.context), parent, false
                )
            )
        } else {
            ComboViewHolder(
                ItemComboBinding.inflate(
                    LayoutInflater.from(parent.context), parent, false
                )
            )
        }
    }

    /**
     * метод, для определения количесвта элементов списка
     */
    override fun getItemCount() = pizzaList.size

    /**
     * для вызова метода из ViewHolder'a
     */
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val pizza = pizzaList[position]
        when(holder){
            is PizzaViewHolder -> holder.bind(pizza)
            is ComboViewHolder ->holder.bind(pizza)
        }

    }
    override fun getItemViewType(position: Int): Int {
        return if (pizzaList[position] is Pizzza) {
            VIEW_TYPE_PIZZA
        } else {
            VIEW_TYPE_COMBO
        }
    }

    inner class PizzaViewHolder(
        private val binding: ItemPizzzaBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(pizza: Pizza) {
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
    inner class ComboViewHolder(
        private val binding: ItemComboBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(pizza: Pizza) {
            with(binding) {
                combo.setImageResource(pizza.image)
                comboname.text = pizza.title
                combodescription.text = pizza.description
                comboprice.text = pizza.cost

                root.setOnClickListener {
                    onPizzaClick(pizza)
                }


            }
        }

    }
}

