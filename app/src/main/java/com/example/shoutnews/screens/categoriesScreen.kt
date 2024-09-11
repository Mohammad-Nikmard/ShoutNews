package com.example.shoutnews.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shoutnews.ui.theme.blackPrimary
import com.example.shoutnews.ui.theme.greyDark
import com.example.shoutnews.ui.theme.greyLighter
import com.example.shoutnews.ui.theme.greyPrimary
import com.example.shoutnews.ui.theme.interRegular
import com.example.shoutnews.ui.theme.interSemiBold

@Composable
fun CategoryScreen() {
    Scaffold(modifier = Modifier.fillMaxSize()) { contentPadding ->
        Column(
            modifier = Modifier
                .padding(contentPadding)
                .padding(horizontal = 20.dp)
        ) {
            Spacer(modifier = Modifier.height(28.dp))

            Column(horizontalAlignment = Alignment.Start) {
                Text(
                    text = "Categories",
                    style = TextStyle(
                        fontSize = 24.sp,
                        fontFamily = interSemiBold,
                        color = blackPrimary,
                    ),
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    "Thousands of articles in each category",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontFamily = interRegular,
                        color = greyPrimary,
                    ),
                )
            }

            Spacer(modifier = Modifier.height(32.dp))

            GridSection()
        }
    }
}

@Composable
private fun GridSection() {
    val itemList: List<String> = listOf(
        "\uD83C\uDFC8   Sports",
        "⚖\uFE0F   Politics",
        "\uD83C\uDF1E   Life",
        "\uD83C\uDFAE   Gaming",
        "\uD83D\uDC3B   Animals",
        "\uD83C\uDF34   Nature",
        "\uD83C\uDF54   Food",
        "\uD83C\uDFA8   Art",
        "\uD83D\uDCDC   History",
        "\uD83D\uDC57   Fashion",
    )

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(itemList.size) { index ->
            Card(
                modifier = Modifier
                    .height(72.dp)
                    .width(160.dp).clickable{},
                elevation = CardDefaults.cardElevation(0.dp),
                border = BorderStroke(
                    width = 1.dp,
                    color = greyLighter,
                ),
                colors = CardDefaults.cardColors(
                    containerColor = Color.Transparent,
                ),
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                ) {
                    Text(
                        itemList[index],
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontFamily = interSemiBold,
                            color = greyDark,
                        ),
                    )
                }
            }
        }
    }
}