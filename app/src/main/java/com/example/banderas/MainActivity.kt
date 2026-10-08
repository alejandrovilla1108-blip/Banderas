package com.example.banderas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.banderas.ui.theme.BanderasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            BanderasTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                ) { innerPadding ->

                    BanderaScreen(
                        modifier = Modifier
                            .padding(innerPadding)
                            .fillMaxSize()
                    )
                }
            }
        }
    }
}

@Composable
fun BanderaScreen(modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize()) {
        Column(modifier = Modifier.fillMaxSize()) {
            Row(modifier = Modifier.weight(1f).fillMaxWidth().background(Color.Red)) {}
            Row(modifier = Modifier.weight(1f).fillMaxWidth().background(Color.White)) {}
            Row(modifier = Modifier.weight(1f).fillMaxWidth().background(Color.Red)) {}
            Row(modifier = Modifier.weight(1f).fillMaxWidth().background(Color.White)) {}
            Row(modifier = Modifier.weight(1f).fillMaxWidth().background(Color.Red)) {}
            Row(modifier = Modifier.weight(1f).fillMaxWidth().background(Color.White)) {}
            Row(modifier = Modifier.weight(1f).fillMaxWidth().background(Color.Red)) {}
            Row(modifier = Modifier.weight(1f).fillMaxWidth().background(Color.White)) {}
            Row(modifier = Modifier.weight(1f).fillMaxWidth().background(Color.Red)) {}
            Row(modifier = Modifier.weight(1f).fillMaxWidth().background(Color.White)) {}
            Row(modifier = Modifier.weight(1f).fillMaxWidth().background(Color.Red)) {}
            Row(modifier = Modifier.weight(1f).fillMaxWidth().background(Color.White)) {}
            Row(modifier = Modifier.weight(1f).fillMaxWidth().background(Color.Red)) {}
        }

        Box(modifier = Modifier.width(120.dp).height(108.dp).background(Color(0xFF3C3B6E))) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(4.dp),
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                    repeat(6) {
                        Text(text = "★", color = Color.White, fontSize = 8.sp)
                    }
                }
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                    repeat(5) {
                        Text(text = "★", color = Color.White, fontSize = 8.sp)
                    }
                }
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                    repeat(6) {
                        Text(text = "★", color = Color.White, fontSize = 8.sp)
                    }
                }
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                    repeat(5) {
                        Text(text = "★", color = Color.White, fontSize = 8.sp)
                    }
                }
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                    repeat(6) {
                        Text(text = "★", color = Color.White, fontSize = 8.sp)
                    }
                }
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                    repeat(5) {
                        Text(text = "★", color = Color.White, fontSize = 8.sp)
                    }
                }
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                    repeat(6) {
                        Text(text = "★", color = Color.White, fontSize = 8.sp)
                    }
                }
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                    repeat(5) {
                        Text(text = "★", color = Color.White, fontSize = 8.sp)
                    }
                }
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                    repeat(6) {
                        Text(text = "★", color = Color.White, fontSize = 8.sp)
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, widthDp = 300, heightDp = 200)
@Composable
fun BanderaScreenPreview() {
    BanderasTheme {
        BanderaScreen()
    }
}