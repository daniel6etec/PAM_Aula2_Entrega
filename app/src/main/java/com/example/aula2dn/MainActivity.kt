package com.example.aula2dn

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.aula2dn.ui.theme.Aula2DNTheme
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Aula2DNTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column() {
        Row() {
            Image(painter = painterResource(R.drawable.socail_messenger_app_logo),
                contentDescription = "Papibagruigrafo",
                modifier = Modifier.size(80.dp).clip(CircleShape)
            )
        }
        Row() {
            botaoInfo()
        }
        Row {
            botaoDebug()
        }
        Row {
            botaoWarning()
        }
    }
}

@Composable
fun botaoDebug(){
    Column() {
        Row() {
            FloatingActionButton(onClick = {Log.d("debug", "debug")}) {
                Text("debug")
            }
        }
    }
}

@Composable
fun botaoInfo(){
    Column() {
        Row() {
            FloatingActionButton(onClick = {Log.i("info", "info")}) {
                Text("info")
            }
        }
    }
}

@Composable
fun botaoWarning(){
    Column() {
        Row() {
            FloatingActionButton(onClick = { Log.w("warning", "warning")}) {
                Text("Warning")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Aula2DNTheme {
        Greeting("Android")
    }
}