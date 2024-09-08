package com.example.shoutnews.screens

import androidx.annotation.DrawableRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shoutnews.R
import com.example.shoutnews.components.CustomElevatedButton
import com.example.shoutnews.ui.theme.blackLighter
import com.example.shoutnews.ui.theme.blackPrimary
import com.example.shoutnews.ui.theme.greyDark
import com.example.shoutnews.ui.theme.greyLighter
import com.example.shoutnews.ui.theme.greyPrimary
import com.example.shoutnews.ui.theme.interMedium
import com.example.shoutnews.ui.theme.interRegular
import com.example.shoutnews.ui.theme.interSemiBold
import com.example.shoutnews.ui.theme.purplePrimary

@Composable
fun LoginScreen() {
    Scaffold(modifier = Modifier.fillMaxSize()) { contentPadding ->
        Column(
            modifier = Modifier
                .padding(contentPadding)
                .padding(horizontal = 20.dp)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Column(horizontalAlignment = Alignment.Start) {
                Spacer(modifier = Modifier.height(28.dp))
                Text(
                    "Welcome Back \uD83D\uDC4B",
                    style = TextStyle(
                        fontSize = 24.sp,
                        fontFamily = interSemiBold,
                        color = blackPrimary,
                        textAlign = TextAlign.Left,
                    ),
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    "I am happy to see you again. You can continue where you left off by logging in",
                    style = TextStyle(
                        fontFamily = interRegular,
                        color = greyPrimary,
                        fontSize = 16.sp,
                        textAlign = TextAlign.Start,
                    ),
                )
            }
            Spacer(modifier = Modifier.height(32.dp))
            Column(horizontalAlignment = Alignment.End) {
                TextFieldSection()
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    "Forget Password?",
                    style = TextStyle(
                        color = greyPrimary,
                        fontSize = 16.sp,
                        fontFamily = interMedium,
                        textAlign = TextAlign.Center,
                    ),
                )
            }
            Spacer(modifier = Modifier.height(24.dp))
            CustomElevatedButton(onTapped = {}, text = "Sign In")
            Spacer(modifier = Modifier.weight(1f))
            Text(
                "or",
                style = TextStyle(
                    fontSize = 16.sp,
                    color = greyPrimary,
                    fontFamily = interSemiBold,
                    textAlign = TextAlign.Center,
                ),
            )

            Spacer(modifier = Modifier.weight(1f))
            SignInCard(imageID = R.drawable.icon_google, text = "Sign In with Google")
            Spacer(modifier = Modifier.height(16.dp))
            SignInCard(imageID = R.drawable.icon_facebook, text = "Sign In with Facebook")
            Spacer(modifier = Modifier.height(50.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    "Don't have an account? ",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontFamily = interMedium,
                        color = blackLighter,
                    ),
                )
                Text(
                    "Sign Up",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontFamily = interMedium,
                        color = blackPrimary,
                    ),
                )
            }

            Spacer(modifier = Modifier.height(24.dp))

        }

    }
}


@Composable
private fun TextFieldSection() {
    var emailAd by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    OutlinedTextField(
        textStyle = TextStyle(
            fontFamily = interMedium,
            color = blackPrimary,
            fontSize = 16.sp,
        ),
        placeholder = {
            Text(
                "Email Address",
                modifier = Modifier.padding(start = 24.dp),
                style = TextStyle(
                    fontSize = 16.sp,
                    fontFamily = interMedium,
                    color = greyPrimary,
                ),
            )
        },
        shape = RoundedCornerShape(12.dp),
        modifier = Modifier.fillMaxWidth(),
        colors = OutlinedTextFieldDefaults.colors(
            unfocusedBorderColor = Color.Transparent,
            focusedBorderColor = purplePrimary,
            disabledPrefixColor = greyPrimary,
            focusedContainerColor = Color.Transparent,
            unfocusedContainerColor = greyLighter,
            cursorColor = Color.Transparent,
        ),
        prefix = {
            Image(
                modifier = Modifier.size(24.dp),
                painter = painterResource(id = R.drawable.icon_email),
                contentDescription = "email Icon"
            )
        },
        value = emailAd,
        onValueChange = { value ->
            emailAd = value
        },
    )
    Spacer(modifier = Modifier.height(16.dp))
    OutlinedTextField(
        textStyle = TextStyle(
            fontFamily = interMedium,
            color = blackPrimary,
            fontSize = 16.sp,
        ),
        placeholder = {
            Text(
                "Password",
                modifier = Modifier.padding(start = 24.dp),
                style = TextStyle(
                    fontSize = 16.sp,
                    fontFamily = interMedium,
                    color = greyPrimary,
                ),
            )
        },
        shape = RoundedCornerShape(12.dp),
        modifier = Modifier.fillMaxWidth(),
        colors = OutlinedTextFieldDefaults.colors(
            unfocusedBorderColor = Color.Transparent,
            focusedBorderColor = purplePrimary,
            disabledPrefixColor = greyPrimary,
            focusedContainerColor = Color.Transparent,
            unfocusedContainerColor = greyLighter,
        ),
        prefix = {
            Image(
                modifier = Modifier.size(24.dp),
                painter = painterResource(id = R.drawable.icon_lock),
                contentDescription = "Password Icon"
            )
        },
        value = password,
        onValueChange = { value ->
            password = value
        },
    )
}

@Composable
private fun SignInCard(@DrawableRes imageID: Int, text: String) {
    Card(
        elevation = CardDefaults.cardElevation(0.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.Transparent,
        ),
        modifier = Modifier
            .height(56.dp)
            .fillMaxWidth(), shape = RoundedCornerShape(12.dp),
        border = BorderStroke(
            width = 1.dp, color = greyLighter,
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                modifier = Modifier.size(24.dp),
                painter = painterResource(id = imageID),
                contentDescription = "GoogleIcon",
            )
            Text(
                text,
                style = TextStyle(
                    fontSize = 16.sp,
                    color = greyDark,
                    fontFamily = interSemiBold,

                    ),
            )
            Spacer(modifier = Modifier.size(24.dp))
        }
    }

}