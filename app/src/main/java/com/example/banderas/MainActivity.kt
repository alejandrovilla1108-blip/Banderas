package com.example.banderas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BanderaMexico()
        }
    }
}

@Composable
fun BanderaMexico() {
    Row(modifier = Modifier.fillMaxSize()) {
        Box(modifier = Modifier.weight(1f).fillMaxHeight().background(Color.Green))
        Box(modifier = Modifier.weight(1f).fillMaxHeight().background(Color.White), contentAlignment = Alignment.Center) {
           Image(painter = painterResource(id = R.drawable.logomex), contentDescription = "Escudo de Mexico", modifier = Modifier.size(120.dp))
        }
        Box(modifier = Modifier.weight(1f).fillMaxHeight().background(Color.Red))
    }
}