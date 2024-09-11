package com.example.shoutnews.screens

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
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
import com.example.shoutnews.ui.theme.blackPrimary
import com.example.shoutnews.ui.theme.greyDark
import com.example.shoutnews.ui.theme.greyLighter
import com.example.shoutnews.ui.theme.interSemiBold
import com.example.shoutnews.ui.theme.purplePrimary

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LanguageScreen() {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
    ) { contentPadding ->
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
                    "Language",
                    style = TextStyle(
                        fontSize = 24.sp,
                        fontFamily = interSemiBold,
                        color = blackPrimary
                    ),
                )

                Spacer(modifier = Modifier.size(24.dp))

            }
            Spacer(modifier = Modifier.height(24.dp))

            var selectedIndex by remember {
                mutableIntStateOf(1)
            }

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp)
                    .clickable {
                        selectedIndex = 1
                    },
                colors = CardDefaults.cardColors(
                    containerColor = if (selectedIndex == 1) purplePrimary else greyLighter,
                ),
            ) {
                Row(
                    modifier = Modifier
                        .padding(horizontal = 24.dp)
                        .fillMaxSize(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        "English",
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontFamily = interSemiBold,
                            color = if (selectedIndex == 1) Color.White else greyDark,
                        ),
                    )

                    if (selectedIndex == 1) {
                        Image(
                            modifier = Modifier.size(24.dp),
                            painter = painterResource(id = R.drawable.check_icon),
                            contentDescription = "CheckMark"
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp)
                    .clickable {
                        selectedIndex = 2
                    },
                colors = CardDefaults.cardColors(
                    containerColor = if (selectedIndex == 2) purplePrimary else greyLighter,
                ),
            ) {
                Row(
                    modifier = Modifier
                        .padding(horizontal = 24.dp)
                        .fillMaxSize(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        "Turkish",
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontFamily = interSemiBold,
                            color = if (selectedIndex == 2) Color.White else greyDark,
                        ),
                    )

                    if (selectedIndex == 2) {
                        Image(
                            modifier = Modifier.size(24.dp),
                            painter = painterResource(id = R.drawable.check_icon),
                            contentDescription = "CheckMark"
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp)
                    .clickable {
                        selectedIndex = 3
                    },
                colors = CardDefaults.cardColors(
                    containerColor = if (selectedIndex == 3) purplePrimary else greyLighter,
                ),
            ) {
                Row(
                    modifier = Modifier
                        .padding(horizontal = 24.dp)
                        .fillMaxSize(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        "German",
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontFamily = interSemiBold,
                            color = if (selectedIndex == 3) Color.White else greyDark,
                        ),
                    )

                    if (selectedIndex == 3) {
                        Image(
                            modifier = Modifier.size(24.dp),
                            painter = painterResource(id = R.drawable.check_icon),
                            contentDescription = "CheckMark"
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp)
                    .clickable {
                        selectedIndex = 4
                    },
                colors = CardDefaults.cardColors(
                    containerColor = if (selectedIndex == 4) purplePrimary else greyLighter,
                ),
            ) {
                Row(
                    modifier = Modifier
                        .padding(horizontal = 24.dp)
                        .fillMaxSize(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        "Spanish",
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontFamily = interSemiBold,
                            color = if (selectedIndex == 4) Color.White else greyDark,
                        ),
                    )

                    if (selectedIndex == 4) {
                        Image(
                            modifier = Modifier.size(24.dp),
                            painter = painterResource(id = R.drawable.check_icon),
                            contentDescription = "CheckMark"
                        )
                    }
                }
            }


        }

    }
}
