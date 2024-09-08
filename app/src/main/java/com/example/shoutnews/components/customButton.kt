package com.example.shoutnews.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shoutnews.ui.theme.interSemiBold
import com.example.shoutnews.ui.theme.purplePrimary

@Composable
public fun CustomElevatedButton(onTapped: () -> Unit, text: String) {
    ElevatedButton(
        modifier = Modifier
            .height(56.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = purplePrimary,
        ),
        onClick = {
            onTapped()
        },
    ) {
        Text(
            text,
            style = TextStyle(
                fontSize = 16.sp,
                fontFamily = interSemiBold,
                color = Color.White,
            ),
        )
    }
}