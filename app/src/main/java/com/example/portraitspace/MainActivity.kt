package com.example.portraitspace

import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.portraitspace.ui.theme.ImageSpaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ImageSpaceTheme {
                    PortraitSpaceApp()
            }
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PortraitView(modifier: Modifier = Modifier) {

    // val bgColor = Color.LightGray
    val minValue = 1
    val maxValue = 8

    //var countBackward by remember { mutableStateOf (1) }
    var count by remember { mutableStateOf(1) }

    // logic statement for "previous" button
    if (count <= minValue) {
        count = 1
    }
    // logic statement for "next" button
    if (count > maxValue) {
        count = 1
    }

    val imageResourceForward = when (count) {
        1 -> R.drawable.bitcoin_btc_logo
        2 -> R.drawable.cardano_logo
        3 -> R.drawable.eth_logo
        4 -> R.drawable.filecoin_logo
        5 -> R.drawable.internet_computer_icp_logo
        6 -> R.drawable.polkadot_logo
        7 -> R.drawable.polygon_logo
        else -> R.drawable.solana_logo
    }


    val firstRowDescriptionResource = when (count) {
        1 -> R.string.btc
        2 -> R.string.ada
        3 -> R.string.eth
        4 -> R.string.fil
        5 -> R.string.icp
        6 -> R.string.dot
        7 -> R.string.matic
        else -> R.string.sol
    }

    val secondRowDescriptionResource = when (count) {
        1 -> R.string.btcDescription
        2 -> R.string.adaDescription
        3 -> R.string.ethDescription
        4 -> R.string.filDescription
        5 -> R.string.icpDescription
        6 -> R.string.dotDescription
        7 -> R.string.maticDescription
        else -> R.string.solDescription
    }

    Column {

        Column(modifier = Modifier
            .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {

            Surface(
                modifier = Modifier.padding(8.dp),
                shape = RoundedCornerShape(8.dp),
                shadowElevation = 10.dp
                ) {

                Image(painterResource(id = imageResourceForward), null)

            }
            Spacer(modifier = Modifier.height(100.dp))

            Card(colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surfaceVariant),
                modifier = Modifier
                    .size(width = 240.dp, height = 100.dp))

             {
            Text(stringResource(id = firstRowDescriptionResource), fontSize = 20.sp,
                fontWeight = FontWeight.Light,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(top = 16.dp))

              Text(stringResource(id = secondRowDescriptionResource),
                     textAlign = TextAlign.Center)
        }


            Spacer(modifier = Modifier.height(28.dp))

            // Row composable for buttons
            Row () {
                Spacer(modifier = modifier.width(10.dp))
                ElevatedButton(modifier = Modifier,
                    onClick = { count-- } //this is a counter, adding +1 on every iteration
                ) {
                    Text(stringResource(R.string.previousButtonTapDescription),
                        color = Color.Blue
                    )
                }

                ElevatedButton(modifier = Modifier,
                    onClick = { count++ } //this is a counter, adding +1 on every iteration
                ) {
                    Text(stringResource(R.string.nextButtonTapDescription),
                        color = Color.Blue
                    )
                }
            }

        }
    }
}


@Preview(showBackground = true)
@Composable
fun PortraitSpaceApp() {
    ImageSpaceTheme {
        PortraitView()
    }
}