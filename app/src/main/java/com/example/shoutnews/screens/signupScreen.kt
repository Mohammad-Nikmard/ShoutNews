package com.example.shoutnews.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shoutnews.R
import com.example.shoutnews.components.CustomElevatedButton
import com.example.shoutnews.components.CustomSubRowText
import com.example.shoutnews.ui.theme.blackPrimary
import com.example.shoutnews.ui.theme.greyLighter
import com.example.shoutnews.ui.theme.greyPrimary
import com.example.shoutnews.ui.theme.interMedium
import com.example.shoutnews.ui.theme.interRegular
import com.example.shoutnews.ui.theme.interSemiBold
import com.example.shoutnews.ui.theme.purplePrimary

@Composable
public fun SignUpScreen() {
    Scaffold(modifier = Modifier.fillMaxSize()) { contentPadding ->
        Column(
            modifier = Modifier
                .padding(contentPadding)
                .padding(horizontal = 20.dp)
        ) {

            Spacer(modifier = Modifier.height(28.dp))

            Column(horizontalAlignment = Alignment.Start) {
                Text(
                    "Welcome to Shout \uD83D\uDC4B",
                    style = TextStyle(
                        fontSize = 24.sp,
                        fontFamily = interSemiBold,
                        color = blackPrimary,
                    ),
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    "Hello, I guess you are new around here. You can start using the application after sign up.",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontFamily = interRegular,
                        color = greyPrimary,
                    ),
                )
            }

            Spacer(modifier = Modifier.height(32.dp))

            TextFieldSection()

            Spacer(modifier = Modifier.height(16.dp))

            CustomElevatedButton(onTapped = {}, text = "Sign Up")

            Spacer(modifier = Modifier.weight(1f))

            CustomSubRowText(leftText = "Already have an account? ", rightText = "Sign In")

            Spacer(modifier = Modifier.height(24.dp))
        }
    }
}


@Composable
private fun TextFieldSection() {
    var userName by remember {
        mutableStateOf("")
    }

    var emailAd by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    var repeatPassword by remember {
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
                "Username",
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
                modifier = Modifier.size(22.dp),
                painter = painterResource(id = R.drawable.user_icon),
                contentDescription = "userName Icon"
            )
        },
        value = userName,
        onValueChange = { value ->
            userName = value
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
    Spacer(modifier = Modifier.height(16.dp))
    OutlinedTextField(
        textStyle = TextStyle(
            fontFamily = interMedium,
            color = blackPrimary,
            fontSize = 16.sp,
        ),
        placeholder = {
            Text(
                "Repeat Password",
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
                contentDescription = "Repeat Password Icon"
            )
        },
        value = repeatPassword,
        onValueChange = { value ->
            repeatPassword = value
        },
    )
}
