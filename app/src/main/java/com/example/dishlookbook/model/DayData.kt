package com.example.dishlookbook.model

import androidx.annotation.StringRes
import com.example.dishlookbook.R

data class DayData(
    @StringRes val dayNumber: Int
) {


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
}