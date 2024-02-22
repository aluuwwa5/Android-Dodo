package com.example.dodoapplication.model

import com.example.dodoapplication.R

object PizzaDataSource {
    val pizzaList = arrayListOf<Pizzza>(
        Pizzza(
            title = "Naruto",
            description = "Куриные кусочки, соус терияки, ананасы, моцарелла, фирменный соус альфредо",
            cost = "    3 990 ₸",
            image = R.drawable.naruto

        ),
        Pizzza(
            title = "Vau! Kebab",
            description = "Мясо говядины, соус ранч, сыр моцарелла, сладкий перец, томаты, красный лук и фирменный томатный соус",
            cost = "от 2 990 ₸",
            image = R.drawable.vau_kebab
        ),
        Pizzza(
            title = "Pepperoni with mushrooms",
            description = "Пикантная пепперони, моцарелла, шампиньоны, соус альфредо",
            cost = "от 2 000 ₸",
            image = R.drawable.pepperoni_mushroom
        ),
        Pizzza(
            title = "Ham and cucumbers",
            description = "Соус ранч, моцарелла, ветчина из цыпленка, маринованные огурчики, красный лук",
            cost = "от 2 000 ₸",
            image = R.drawable.ham_cucumbers
        ),
        Pizzza(
            title = "Hawaiian with alfredo",
            description = "Двойная порция цыпленка, кусочки ананасов, моцарелла, соус альфредо",
            cost = "от 2 400 ₸",
            image = R.drawable.hawaaii_alf
        ),
        Pizzza(
            title = "Barbecue сhicken",
            description = "Томатный соус, цыпленок, ветчина из мяса птицы, красный лук, моцарелла, соус Барбекю",
            cost = "от 2 700 ₸",
            image = R.drawable.barbecue_chicken
        ),
        Pizzza(
            title = "Аrriva!",
            description = "Цыпленок, острая чоризо, соус бургер, сладкий перец, красный лук, томаты, моцарелла, соус ранч, чеснок",
            cost = "от 2 400 ₸",
            image = R.drawable.arriva
        ),
        Pizzza(
            title = "Ham and mushrooms",
            description = "Ветчина, много моцареллы, шампиньоны, томатный соус",
            cost = "от 2 400 ₸",
            image = R.drawable.hum_cucumber
        ),
        Pizzza(
            title = "Pepperoni fresh",
            description = "Пикантная пепперони, мно-о-ого моцареллы, томаты и томатный соус",
            cost = "от 1 900 ₸",
            image = R.drawable.pepperoni_fresh
        )


        

    )
}