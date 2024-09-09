package com.example.shoutnews.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import com.example.shoutnews.ui.theme.blackLighter
import com.example.shoutnews.ui.theme.blackPrimary
import com.example.shoutnews.ui.theme.interMedium

@Composable
public fun CustomSubRowText(leftText: String , rightText: String){
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            leftText,
            style = TextStyle(
                fontSize = 16.sp,
                fontFamily = interMedium,
                color = blackLighter,
            ),
        )
        Text(
            rightText,
            style = TextStyle(
                fontSize = 16.sp,
                fontFamily = interMedium,
                color = blackPrimary,
            ),
        )
    }
}