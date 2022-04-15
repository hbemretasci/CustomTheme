package com.example.customtheme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.customtheme.ui.theme.CustomThemeTheme
import com.example.customtheme.ui.theme.spacing

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CustomThemeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(MaterialTheme.spacing.large),
                        name = "staysel"
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(
    modifier : Modifier,
    name: String
) {
    Surface(
        modifier = modifier,
        color = MaterialTheme.colors.primary
    ) {
        Text(
            text = "Hello $name!",
            modifier = Modifier.padding(MaterialTheme.spacing.extraLarge),
            color = MaterialTheme.colors.onPrimary,
        )
        Text(
            text = "Sabit Deneysel",
            modifier = Modifier.padding(MaterialTheme.spacing.extraLarge),
            color = MaterialTheme.colors.onPrimary,
        )
    }

}