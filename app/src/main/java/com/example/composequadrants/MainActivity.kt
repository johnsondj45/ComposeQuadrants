package com.example.composequadrants

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrants.ui.theme.ComposeQuadrantsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeQuadrantsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Quadrants(
                        textOneA = "Android",
                        modifier = Modifier.padding(innerPadding)
                        //in progress
                    )
                }
            }
        }
    }
}

@Composable
fun Quadrants(
    textOneA: String,
    textOneB: String,
    textTwoA: String,
    textTwoB: String,
    textThreeA: String,
    textThreeB: String,
    textFourA: String,
    textFourB: String,
    modifier: Modifier = Modifier,
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.padding(top = 16.dp, bottom = 16.dp, start = 16.dp, end = 16.dp)
    ) {
        Row() {


            Text(
                text = textOneA,
                modifier = modifier

            )
            Text(
                text = textOneB,
                modifier = modifier
            )
        }
        Text(
            text = textTwoA,
            modifier = modifier
        )
        Text(
            text = textTwoB,
            modifier = modifier
        )
        Row() {
            Text(
                text = textThreeA,
                modifier = modifier
            )
            Text(
                text = textThreeB,
                modifier = modifier
            )
            Text(
                text = textFourA,
                modifier = modifier
            )
            Text(
                text = textFourB,
                modifier = modifier
            )


        }
    }
}