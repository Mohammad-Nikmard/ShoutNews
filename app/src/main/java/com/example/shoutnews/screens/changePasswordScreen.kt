package com.example.shoutnews.screens

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
import androidx.compose.material3.IconButton
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
import com.example.shoutnews.ui.theme.blackPrimary
import com.example.shoutnews.ui.theme.greyLighter
import com.example.shoutnews.ui.theme.greyPrimary
import com.example.shoutnews.ui.theme.interMedium
import com.example.shoutnews.ui.theme.interSemiBold
import com.example.shoutnews.ui.theme.purplePrimary

@Composable
fun ChangePasswordScreen() {
    Scaffold(modifier = Modifier.fillMaxSize()) { contentPadding ->
        Column(
            modifier = Modifier
                .padding(contentPadding)
                .padding(horizontal = 20.dp)
        ) {
            Spacer(modifier = Modifier.height(24.dp))
            
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                IconButton(onClick = {}, modifier = Modifier.size(24.dp)) {
                    Image(
                        modifier = Modifier.size(24.dp),
                        painter = painterResource(id = R.drawable.icon_arrow_back),
                        contentDescription = "Back Icon"
                    )
                }

                Text(
                    "Change Password",
                    style = TextStyle(
                        fontSize = 24.sp,
                        color = blackPrimary,
                        fontFamily = interSemiBold,
                    ),
                )

                Spacer(modifier = Modifier.size(24.dp))
            }

            Spacer(modifier = Modifier.height(24.dp))

            TextFieldSection()

            Spacer(modifier = Modifier.height(16.dp))

            CustomElevatedButton(onTapped = {}, text = "Change Password")
        }
    }
}


@Composable
private fun TextFieldSection() {
    var currentPass by remember {
        mutableStateOf("")
    }

    var newPass by remember {
        mutableStateOf("")
    }

    var repeatPass by remember {
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
                "Current Password",
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
                contentDescription = "email Icon"
            )
        },
        value = currentPass,
        onValueChange = { value ->
            currentPass = value
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
        ),
        prefix = {
            Image(
                modifier = Modifier.size(24.dp),
                painter = painterResource(id = R.drawable.icon_lock),
                contentDescription = "Password Icon"
            )
        },
        value = newPass,
        onValueChange = { value ->
            newPass = value
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
                contentDescription = "Password Icon"
            )
        },
        value = repeatPass,
        onValueChange = { value ->
            repeatPass = value
        },
    )
}
