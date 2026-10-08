package com.example.banderas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Canvas
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.banderas.ui.theme.BanderasTheme
import kotlin.io.path.Path

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            BanderasTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
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
    Box(modifier = Modifier.fillMaxSize().background(Color(0xFF009B3A))) {
        Canvas(modifier = Modifier.fillMaxWidth(0.8f).fillMaxHeight(0.6f)) {
            val rombo = Path().apply {
                moveTo(size.width / 2, 0f)
                lineTo(size.width, size.height / 2)
                lineTo(size.width / 2, size.height)
                lineTo(0f, size.height / 2)
                close()
            }
            drawPath(path = rombo, color = Color(0xFFFFDF00))
            drawCircle(
                color = Color(0xFF002776),
                radius = size.minDimension * 0.22f,
                center = center
            )
        }
    }
}
@Preview(showBackground = true)
@Composable
fun BanderaScreenPreview() {
    BanderasTheme {
        BanderaScreen()
    }
}