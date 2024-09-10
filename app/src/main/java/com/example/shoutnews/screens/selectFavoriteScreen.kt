package com.example.shoutnews.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shoutnews.components.CustomElevatedButton
import com.example.shoutnews.ui.theme.blackPrimary
import com.example.shoutnews.ui.theme.greyDark
import com.example.shoutnews.ui.theme.greyLighter
import com.example.shoutnews.ui.theme.greyPrimary
import com.example.shoutnews.ui.theme.interMedium
import com.example.shoutnews.ui.theme.interRegular
import com.example.shoutnews.ui.theme.interSemiBold
import com.example.shoutnews.ui.theme.purplePrimary

@Composable
fun SelectTopicScreen() {
    Scaffold(modifier = Modifier.fillMaxSize()) { contentPadding ->
        Column(
            modifier = Modifier
                .padding(contentPadding)
                .padding(horizontal = 20.dp)
        ) {
            Spacer(modifier = Modifier.height(28.dp))

            Column(horizontalAlignment = Alignment.Start) {
                Text(
                    "Select your favorite topics",
                    style = TextStyle(
                        fontFamily = interSemiBold,
                        fontSize = 24.sp,
                        color = blackPrimary,
                    ),
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    "Select some of your favorite topics to let us suggest better news for you",
                    style = TextStyle(
                        fontFamily = interRegular,
                        fontSize = 16.sp,
                        color = greyPrimary,
                    ),
                )
            }

            Spacer(modifier = Modifier.height(32.dp))

            GridSegment()

            Spacer(modifier = Modifier.height(16.dp))

            CustomElevatedButton(onTapped = {}, text = "Next")
        }
    }
}

@Composable
private fun GridSegment() {
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
        modifier = Modifier
            .fillMaxWidth(),
        columns = GridCells.Fixed(2),
        horizontalArrangement = Arrangement.spacedBy(14.dp),
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        items(itemList.size) { index ->
            GridItems(
                item = itemList[index], index = index,
            )
        }
    }

}

@Composable
private fun GridItems(modifier: Modifier = Modifier, item: String, index: Int) {
    var selectedIndex by remember {
        mutableStateOf(-1)
    }
    Card(
        modifier = Modifier
            .height(72.dp)
            .width(160.dp)
            .clickable {
                selectedIndex = index
            },
        elevation = CardDefaults.cardElevation(0.dp),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = if (selectedIndex == index) purplePrimary else greyLighter,
        ),
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                item,
                style = TextStyle(
                    fontSize = 16.sp,
                    fontFamily = interSemiBold,
                    color = if (selectedIndex == index) Color.White else greyDark,
                ),
            )
        }
    }
}