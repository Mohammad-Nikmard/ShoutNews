package com.example.shoutnews.screens

import android.widget.Space
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shoutnews.R
import com.example.shoutnews.components.CustomElevatedButton
import com.example.shoutnews.components.CustomSubRowText
import com.example.shoutnews.ui.theme.blackLighter
import com.example.shoutnews.ui.theme.blackPrimary
import com.example.shoutnews.ui.theme.greyLighter
import com.example.shoutnews.ui.theme.greyPrimary
import com.example.shoutnews.ui.theme.interMedium
import com.example.shoutnews.ui.theme.interRegular
import com.example.shoutnews.ui.theme.interSemiBold
import com.example.shoutnews.ui.theme.purplePrimary


@Composable
fun CreatePasswordScreen() {
    Scaffold(modifier = Modifier.fillMaxSize()) { contentPadding ->
        Column(
            modifier = Modifier
                .padding(contentPadding)
                .padding(horizontal = 20.dp)
        ) {
            Spacer(modifier = Modifier.height(28.dp))

            Column(horizontalAlignment = Alignment.Start) {
                Text(
                    "Create New Password \uD83D\uDD12",
                    style = TextStyle(
                        fontSize = 24.sp,
                        fontFamily = interSemiBold,
                        color = blackPrimary,
                    ),
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    "You can create a new password, please don't forget it too.",
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

            CustomElevatedButton(onTapped = {}, text = "Confirm")

            Spacer(modifier = Modifier.weight(1f))

            CustomSubRowText(leftText = "Didn't receive an email? ", rightText = "Send again")

            Spacer(modifier = Modifier.height(24.dp))
        }
    }
}

@Composable
private fun TextFieldSection() {
    var newPassword by remember {
        mutableStateOf("")
    }

    var repeatNewPassword by remember {
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
                "New Password",
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
                painter = painterResource(id = R.drawable.icon_lock),
                contentDescription = "newPassword Icon"
            )
        },
        value = newPassword,
        onValueChange = { value ->
            newPassword = value
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
                "Repeat New Password",
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
        value = repeatNewPassword,
        onValueChange = { value ->
            repeatNewPassword = value
        },
    )
}