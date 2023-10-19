package com.example.taskmanagerapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskmanagerapp.ui.theme.TaskManagerAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskManagerAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TaskManagerApp()
                }
            }
        }
    }
}

    @Composable
    fun TaskManagerApp( ) {
        TaskManager (
            headlineTextString = stringResource(R.string.headlineTextString),
            secondaryTextString = stringResource(R.string.secondaryTextString),
            img = painterResource(R.drawable.ic_task_completed)
        )
    }

    @Composable
    private fun TaskManager (headlineTextString: String, secondaryTextString: String, img: Painter, modifier: Modifier = Modifier) {

              Column (
                 modifier = Modifier.fillMaxSize(),
                  verticalArrangement = Arrangement.Center,
                  horizontalAlignment = Alignment.CenterHorizontally
              )

                  {
                  Image(img, contentDescription = null)

                     Text(
                         text = headlineTextString,
                         fontWeight = FontWeight.Bold,
                         modifier = modifier.padding(top = 24.dp, bottom = 8.dp)

                     )
                      Text(
                          text = secondaryTextString,
                          fontSize = 16.sp
                      )
              }
    }

@Preview(showBackground = true)
@Composable
fun TaskManagerAppPreview() {
    TaskManagerAppTheme {
        TaskManager(stringResource(R.string.headlineTextString),
                    stringResource(R.string.secondaryTextString),
                    painterResource(R.drawable.ic_task_completed)
        )
    }
}