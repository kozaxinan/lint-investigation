package com.example.slacklintinvestigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.slacklintinvestigation.ui.theme.SlackLintInvestigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SlackLintInvestigationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding),
                        {}
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier, somethingToDo: () -> Unit) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
    LaunchedEffect(key1 = "some") {
        somethingToDo.invoke()
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SlackLintInvestigationTheme {
        Greeting("Android", Modifier, {})
    }
}