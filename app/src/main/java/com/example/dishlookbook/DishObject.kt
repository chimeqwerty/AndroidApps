package com.example.dishlookbook

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.BottomAppBarDefaults.ContentPadding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.dishlookbook.model.Day
import com.example.dishlookbook.model.DayData
import com.example.dishlookbook.model.Dish
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue


@Composable
fun DishItemCollection(dish: List<Dish>,modifier: Modifier = Modifier, contentPadding: PaddingValues = PaddingValues(0.dp)) {

    LazyColumn(contentPadding = ContentPadding, modifier = modifier
            .padding(
                horizontal = 16.dp,
                vertical = 8.dp
            )
    )
    {

             items(Dish.DishRepo.dishes) {

                DishItem(
                    dish = it,
                    modifier = Modifier
                        .padding(horizontal = 16.dp, vertical = 8.dp)
                )
            }

        }
}


@Composable
fun DishItem(dish: Dish, modifier: Modifier = Modifier) {

    var expanded by remember { mutableStateOf(false) }
// https://developer.android.com/codelabs/basic-android-kotlin-compose-woof-animation?continue=https%3A%2F%2Fdeveloper.android.com%2Fcourses%2Fpathways%2Fandroid-basics-compose-unit-3-pathway-3%23codelab-https%3A%2F%2Fdeveloper.android.com%2Fcodelabs%2Fbasic-android-kotlin-compose-woof-animation#2

    Card (modifier = modifier,
        shape = RoundedCornerShape(8.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 3.dp)
    ){


            Column(modifier = modifier
                .padding(top = 3.dp,
                   bottom = 5.dp,
                    start = 8.dp,
                end = 8.dp)) {

                Row(modifier = modifier) {
                    CountryName(countryName = dish.countryName)
                    Spacer(modifier = modifier.weight(1f))
                    DishItemButton(expanded = expanded,
                        onClick = { expanded = !expanded })
                }


                DishName(dishName = dish.dishName)

                Row(
                    modifier = modifier
                ) {

                    DishImg(img = dish.img)
                }
                if (expanded) {
                    DishDescription(dishDescription = dish.dishDescription)
                }
            }


        }

    }


@Composable
private fun DishName(
    @StringRes dishName: Int
) {

    Text(stringResource(id = dishName))

}


@Composable
private fun DishDescription(
    @StringRes dishDescription: Int
) {
    Text(text = stringResource(id = dishDescription))
}

@Composable
private fun CountryName(
    @StringRes countryName: Int
) {
    Text(text = stringResource(id = countryName))

}


@Composable
private fun DishImg(
    @DrawableRes img: Int,
    modifier: Modifier = Modifier) {

    Image(
        painter = painterResource(id = img),
        contentDescription = null,
        contentScale = ContentScale.FillWidth)

}

@Composable
fun DayItem(day: DayData, modifier: Modifier = Modifier) {

    DaySpec(dayNumber = day.dayNumber,
        modifier = modifier.
    padding(2.dp))

}


@Composable
private fun DaySpec(
    @StringRes dayNumber: Int,
    modifier: Modifier = Modifier) {

    Text(text = stringResource(id = dayNumber))
    
}


@Composable
private fun DishItemButton(
    expanded: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
){
    IconButton(
        onClick = onClick,
        modifier = modifier
    ) {
            Icon(
                imageVector = if (expanded)
                    Icons.Filled.KeyboardArrowUp else
                        Icons.Filled.KeyboardArrowDown,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.secondary
            )
    }
}


