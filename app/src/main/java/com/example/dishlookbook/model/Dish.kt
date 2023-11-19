package com.example.dishlookbook.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.dishlookbook.R

data class Dish(
    @DrawableRes val img: Int,
    @StringRes val countryName: Int,
    @StringRes val dishName: Int,
    @StringRes val dishDescription: Int

) {


    object DishRepo {

        val dishes = listOf(
            Dish(

                img = R.drawable.paella_spain,
                countryName = R.string.ES_country,
                dishName = R.string.dish_1,
                dishDescription = R.string.dish_description_1
            ),
            Dish(
                img = R.drawable.ceviche_peru,
                countryName = R.string.PERU_country,
                dishName = R.string.dish_2,
                dishDescription = R.string.dish_description_2
            ),
            Dish(
                img = R.drawable.mangal_salat,
                countryName = R.string.AZ_country,
                dishName = R.string.dish_3,
                dishDescription = R.string.dish_description_3
            ),
            Dish(
                img = R.drawable.okroshka_ru,
                countryName = R.string.RU_country,
                dishName = R.string.dish_4,
                dishDescription = R.string.dish_description_4
            ),
            Dish(
                img = R.drawable.couscous,
                countryName = R.string.MA_country,
                dishName = R.string.dish_5,
                dishDescription = R.string.dish_description_5
            ),
            Dish(
                img = R.drawable.pad_thai,
                countryName = R.string.THAI_country,
                dishName = R.string.dish_6,
                dishDescription = R.string.dish_description_6
            ),
            Dish(
                img = R.drawable.hummus,
                countryName = R.string.ISR_country,
                dishName = R.string.dish_7,
                dishDescription = R.string.dish_description_7
            ),
            Dish(
                img = R.drawable.karjalanpiirakka,
                countryName = R.string.FI_country,
                dishName = R.string.dish_8,
                dishDescription = R.string.dish_description_8
            ),
            Dish(
                img = R.drawable.beshbarmak_kz,
                countryName = R.string.KZ_country,
                dishName = R.string.dish_9,
                dishDescription = R.string.dish_description_9
            ),
            Dish(
                img = R.drawable.quiche_lorraine_fra,
                countryName = R.string.FR_country,
                dishName = R.string.dish_10,
                dishDescription = R.string.dish_description_10
            ),
            Dish(
                img = R.drawable.smorrebrod,
                countryName = R.string.DK_country,
                dishName = R.string.dish_11,
                dishDescription = R.string.dish_description_11
            ),
            Dish(
                img = R.drawable.sushi_jpn,
                countryName = R.string.JPN_country,
                dishName = R.string.dish_12,
                dishDescription = R.string.dish_description_12
            ),
            Dish(
                img = R.drawable.svickova,
                countryName = R.string.CZ_country,
                dishName = R.string.dish_13,
                dishDescription = R.string.dish_description_13
            ),
            Dish(
                img = R.drawable.tandoori_chicken,
                countryName = R.string.IN_country,
                dishName = R.string.dish_14,
                dishDescription = R.string.dish_description_14
            ),
            Dish(
                img = R.drawable.tiramisu_ita,
                countryName = R.string.IT_country,
                dishName = R.string.dish_15,
                dishDescription = R.string.dish_description_15
            ),
            Dish(
                img = R.drawable.dolmah_aze,
                countryName = R.string.AZ_country,
                dishName = R.string.dish_16,
                dishDescription = R.string.dish_description_16
            ),
            Dish(
                img = R.drawable.lasagne,
                countryName = R.string.IT_country,
                dishName = R.string.dish_17,
                dishDescription = R.string.dish_description_17
            ),
            Dish(
                img = R.drawable.chicken_gyros_valio,
                countryName = R.string.GR_country,
                dishName = R.string.dish_18,
                dishDescription = R.string.dish_description_18
            ),
            Dish(
                img = R.drawable.pizza_italy,
                countryName = R.string.IT_country,
                dishName = R.string.dish_19,
                dishDescription = R.string.dish_description_19
            ),
            Dish(
                img = R.drawable.cuban_sandwitch,
                countryName = R.string.CUBA_country,
                dishName = R.string.dish_20,
                dishDescription = R.string.dish_description_20
            )
        )
    }
}


data class Day(

    @StringRes val dayNumber: Int

) {

}
object DaysRepo {

    val days = listOf(

        DayData(dayNumber = R.string.day1),
        DayData(dayNumber = R.string.day2),
        DayData(dayNumber = R.string.day3),
        DayData(dayNumber = R.string.day4),
        DayData(dayNumber = R.string.day5),
        DayData(dayNumber = R.string.day6),
        DayData(dayNumber = R.string.day7),
        DayData(dayNumber = R.string.day8),
        DayData(dayNumber = R.string.day9),
        DayData(dayNumber = R.string.day10),
        DayData(dayNumber = R.string.day11),
        DayData(dayNumber = R.string.day12),
        DayData(dayNumber = R.string.day13),
        DayData(dayNumber = R.string.day14),
        DayData(dayNumber = R.string.day15),
        DayData(dayNumber = R.string.day16),
        DayData(dayNumber = R.string.day17),
        DayData(dayNumber = R.string.day18),
        DayData(dayNumber = R.string.day19),
        DayData(dayNumber = R.string.day20),
        DayData(dayNumber = R.string.day21),
        DayData(dayNumber = R.string.day22),
        DayData(dayNumber = R.string.day23),
        DayData(dayNumber = R.string.day24),
        DayData(dayNumber = R.string.day25),
        DayData(dayNumber = R.string.day26),
        DayData(dayNumber = R.string.day27),
        DayData(dayNumber = R.string.day28),
        DayData(dayNumber = R.string.day29),
        DayData(dayNumber = R.string.day30)
    )
}