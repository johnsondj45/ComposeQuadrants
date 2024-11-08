package com.example.composequadrants

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.FloatRange
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
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
                        textOneA = stringResource(id = R.string.text_composable),
                        textOneB = stringResource(id = R.string.text_description),
                        textTwoA = stringResource(id = R.string.image_composable),
                        textTwoB = stringResource(id = R.string.image_description),
                        textThreeA = stringResource(id = R.string.row_composable),
                        textThreeB = stringResource(id = R.string.row_description),
                        textFourA = stringResource(id = R.string.column_composable),
                        textFourB = stringResource(id = R.string.column_description),
                        modifier = Modifier.padding(innerPadding)

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
        Modifier.fillMaxSize(),
    ) {

        Row(
            modifier = modifier.weight(2f),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center

        ) {
            Text(
                text = textOneA,
                modifier = modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(color = androidx.compose.ui.graphics.Color(0xFFEADDFF))
                    .padding(16.dp),
                fontWeight = FontWeight.Bold,


                )
            Text(
                text = textOneB,
                modifier = modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(color = androidx.compose.ui.graphics.Color(0xFFEADDFF))
                    .padding(16.dp),


                )

            Text(
                text = textTwoA,
                modifier = modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(color = androidx.compose.ui.graphics.Color(0xFFD0BCFF))
                    .padding(16.dp),
                fontWeight = FontWeight.Bold
            )
            Text(
                text = textTwoB,
                modifier = modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(color = androidx.compose.ui.graphics.Color(0xFFD0BCFF))
                    .padding(16.dp),
            )

        }
        Row(
            modifier = modifier.weight(2f), verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = textThreeA,
                modifier = modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(color = androidx.compose.ui.graphics.Color(0xFFEADDFF))
                    .padding(16.dp),
                fontWeight = FontWeight.Bold
            )
            Text(
                text = textThreeB,
                modifier = modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .background(color = androidx.compose.ui.graphics.Color(0xFFEADDFF))
                    .padding(16.dp),
            )
            Text(
                text = textFourA,
                modifier = modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(color = androidx.compose.ui.graphics.Color(0xFFEADDFF))
                    .padding(16.dp),
                fontWeight = FontWeight.Bold
            )
            Text(
                text = textFourB,
                modifier = modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .background(color = androidx.compose.ui.graphics.Color(0xFFEADDFF))
                    .padding(16.dp),
            )


        }
    }
}
