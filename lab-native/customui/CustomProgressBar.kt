package com.example.gamevault.customui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.sp

@Composable
fun CustomProgressBar(
    modifier: Modifier,
    backgroundColor: Color,
    foregroundColor: Brush,
    percent: Float,
    isShownText: Boolean
) {
    Box(
        modifier = modifier
            .background(backgroundColor)
            .fillMaxWidth()
    ) {
        Box(modifier = modifier
            .background(foregroundColor)
            .fillMaxWidth( percent / 100)
        )
        if (isShownText) Text("${percent} %", modifier = Modifier.align(alignment = Alignment.Center), fontSize = 12.sp, color = Color.White)
    }
}