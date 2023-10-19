package com.example.businesscardapp

import android.graphics.fonts.FontStyle
import android.media.Image
import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SnackbarVisuals
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposableOpenTarget
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.rounded.Build
import androidx.compose.material3.LocalContentColor
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCardApp()
                }
            }
        }
    }
}

@Composable
fun BusinessCardApp() {
    BusinessCard (
        fullName = stringResource(R.string.fullName),
        title = stringResource(R.string.title),
        img = painterResource(R.drawable.android_logo),
        socialMediaHandle = stringResource(R.string.socialMediaHandle),
        emailAddress = stringResource(R.string.emailAddress),
        phoneNumber = stringResource(R.string.phoneNumber),
        backgroundColor = Color(0xFF76B479),
        backgroundColorImg = Color(0x9C2D3A28)
    )

}

@Composable
private fun BusinessCard(img: Painter,
                         fullName: String,
                         title: String,
                  phoneNumber: String,
                  socialMediaHandle: String,
                         backgroundColor: Color,
                         backgroundColorImg: Color,
                  emailAddress: String,
                         modifier: Modifier = Modifier) {

    Column(modifier = Modifier
        .fillMaxSize()
        .background(backgroundColor)
        .padding(50.dp)
        .height(150.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Column(modifier = Modifier
            .fillMaxWidth()
            .background(backgroundColorImg)) {
            Image(img, contentDescription = null,
                contentScale = ContentScale.Fit)
        }

    Column(modifier = modifier,

        horizontalAlignment = Alignment.CenterHorizontally
        ) {

        Row() {
            Column(
                modifier = modifier,
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = fullName,
                    fontWeight = FontWeight.Light,
                    fontSize = 60.sp
                )

                Text(text = title,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF1B5F21))
            }
        }
Column {
    Spacer(modifier = modifier.height(240.dp))
}
        Column() {
            Row() {
                Icon(Icons.Rounded.Phone, contentDescription = "Phone Number",
                    modifier = Modifier.background(color = backgroundColorImg))
                Spacer(modifier = Modifier.width(13.dp))

                Column (modifier = modifier
                ) {
                    Text(
                        text = phoneNumber)

                }
            }
            Column() {
                Row(modifier = Modifier) {
                    Icon(Icons.Rounded.Share, contentDescription = "Share on social")

                    Spacer(modifier = Modifier.width(13.dp))
                    Column {
                        Text(
                            text = socialMediaHandle
                        )
                    }
                }

            }
            Column {

                Row() {
                    Icon(Icons.Rounded.Email, contentDescription = "Email address")
                    Column {
                        Text(
                            text = emailAddress,
                            modifier = Modifier.absoluteOffset(16.dp)
                        )
                    }
                }
            }
        }
    }
}
}


@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardAppTheme {
        BusinessCardApp()
    }
}