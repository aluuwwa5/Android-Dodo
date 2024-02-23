package com.example.dodoapplication.model

import com.example.dodoapplication.R

object PizzaDataSource {
    val pizzaList = arrayListOf(
        Pizzza(
            title = "Naruto",
            description = "Куриные кусочки, соус терияки, ананасы, моцарелла, фирменный соус альфредо",
            cost = "3 990 ₸",
            image = R.drawable.naruto

        ),
        Pizzza(
            title = "Vau! Kebab",
            description = "Мясо говядины, соус ранч, сыр моцарелла, сладкий перец, томаты, красный лук и фирменный томатный соус",
            cost = "2 990 ₸",
            image = R.drawable.vau_kebab
        ),
        Combo(
            title = "Meal from 3900 ₸",
            description = "Treat yourself! Small pizza, Dodster, a drink and a sauce. Pizza in a combo can be changed",
            cost ="3 900 ₸",
            image = R.drawable.img
        ),
        Pizzza(
            title = "Pepperoni with mushrooms",
            description = "Пикантная пепперони, моцарелла, шампиньоны, соус альфредо",
            cost = "2 000 ₸",
            image = R.drawable.pepperoni_mushroom
        ),
        Pizzza(
            title = "Ham and cucumbers",
            description = "Соус ранч, моцарелла, ветчина из цыпленка, маринованные огурчики, красный лук",
            cost = "2 000 ₸",
            image = R.drawable.ham_cucumbers
        ),
        Pizzza(
            title = "Hawaiian with alfredo",
            description = "Двойная порция цыпленка, кусочки ананасов, моцарелла, соус альфредо",
            cost = "2 400 ₸",
            image = R.drawable.hawaaii_alf
        ),
        Combo(
            title = "3 pizzas from 4900 ₸",
            description = "A real tasting! Three small special price pizzas. Combo price depends on the selected pizzas and may change",
            cost = "4 900 ₸",
            image = R.drawable.img_1
        ),
        Pizzza(
            title = "Barbecue сhicken",
            description = "Томатный соус, цыпленок, ветчина из мяса птицы, красный лук, моцарелла, соус Барбекю",
            cost = "2 700 ₸",
            image = R.drawable.barbecue_chicken
        ),
        Pizzza(
            title = "Аrriva!",
            description = "Цыпленок, острая чоризо, соус бургер, сладкий перец, красный лук, томаты, моцарелла, соус ранч, чеснок",
            cost = "2 400 ₸",
            image = R.drawable.arriva
        ),
        Pizzza(
            title = "Ham and mushrooms",
            description = "Ветчина, много моцареллы, шампиньоны, томатный соус",
            cost = "2 400 ₸",
            image = R.drawable.hum_cucumber
        ),
        Combo(
            title = "3 pizzas",
            description = "Three 30cm pizzas for every taste. Serves 5-10 people. Pizza selection is limited\n",
            cost = "7 300 ₸",
            image = R.drawable.img_2
        ),
        Pizzza(
            title = "Pepperoni fresh",
            description = "Пикантная пепперони, мно-о-ого моцареллы, томаты и томатный соус",
            cost = "1 900 ₸",
            image = R.drawable.pepperoni_fresh
        )


        

    )
}