package com.example.shoutnews.screens

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shoutnews.R
import com.example.shoutnews.components.CustomElevatedButton
import com.example.shoutnews.ui.theme.greyPrimary
import com.example.shoutnews.ui.theme.interRegular

@Composable
fun WelcomeScreen() {
    Scaffold(modifier = Modifier.fillMaxSize()) { contentPadding ->
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Column(
                modifier = Modifier
                    .padding(contentPadding)
                    .padding(horizontal = 20.dp)
            ) {

                Spacer(modifier = Modifier.weight(1f))

                Text(
                    "All news in one place, be the first to know last news",
                    modifier = Modifier.padding(horizontal = 75.dp),
                    style = TextStyle(
                        fontSize = 16.sp,
                        color = greyPrimary,
                        fontFamily = interRegular,
                        textAlign = TextAlign.Center,
                    ),
                )

                Spacer(modifier = Modifier.height(64.dp))

                CustomElevatedButton(onTapped = {}, text = "Get Started")

                Spacer(modifier = Modifier.height(24.dp))
            }

            Image(
                modifier = Modifier
                    .height(350.dp)
                    .width(500.dp),
                painter = painterResource(id = R.drawable.handshake_vector),
                contentDescription = "HandShake"
            )
        }

    }
}