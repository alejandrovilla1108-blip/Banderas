package com.example.banderas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BanderaEspaña()
        }
    }
}

@Composable
fun BanderaEspaña() {
    Column(modifier = Modifier.fillMaxSize()) {
        Box(modifier = Modifier.weight(2f).fillMaxWidth().background(Color.Yellow))
        Box(modifier = Modifier.weight(1f).fillMaxWidth().background(Color.Blue))
        Box(modifier = Modifier.weight(1f).fillMaxWidth().background(Color.Red))
    }
}