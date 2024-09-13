package com.example.shoutnews.screens

import android.view.RoundedCorner
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shoutnews.R
import com.example.shoutnews.ui.theme.blackPrimary
import com.example.shoutnews.ui.theme.greyLighter
import com.example.shoutnews.ui.theme.greyPrimary
import com.example.shoutnews.ui.theme.interBold
import com.example.shoutnews.ui.theme.interMedium
import com.example.shoutnews.ui.theme.interRegular
import com.example.shoutnews.ui.theme.interSemiBold
import com.example.shoutnews.ui.theme.purplePrimary

@Composable
fun HomeScreen() {
    Scaffold(modifier = Modifier.fillMaxSize()) { contentPadding ->
        Column(
            modifier = Modifier
                .padding(contentPadding)
                .verticalScroll(rememberScrollState()),

            ) {
            Spacer(modifier = Modifier.height(28.dp))

            Column(
                modifier = Modifier.padding(horizontal = 20.dp),
                horizontalAlignment = Alignment.Start,
            ) {
                Text(
                    "Browse",
                    style = TextStyle(
                        fontSize = 24.sp,
                        fontFamily = interSemiBold,
                        color = blackPrimary,
                    ),
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    "Discover things of this world",
                    style = TextStyle(
                        color = greyPrimary,
                        fontSize = 16.sp,
                        fontFamily = interRegular,
                    ),
                )
            }

            Spacer(modifier = Modifier.height(32.dp))

            SearchBox()

            Spacer(modifier = Modifier.height(24.dp))

            SuggestionBox()

            Spacer(modifier = Modifier.height(24.dp))

            HeadlineSection()

            Spacer(modifier = Modifier.height(48.dp))

            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .padding(horizontal = 20.dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    "Recommended for you",
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontFamily = interSemiBold,
                        color = blackPrimary,
                    ),
                )
                Text(
                    "See All",
                    style = TextStyle(
                        fontSize = 14.sp,
                        color = greyPrimary,
                        fontFamily = interMedium,
                    ),
                )
            }

            Spacer(modifier = Modifier.height(24.dp))

            Box(modifier = Modifier.height(600.dp)) {
                RecommendData()
            }
        }

    }
}


@Composable
private fun SearchBox() {
    var search by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .padding(horizontal = 20.dp)
            .fillMaxWidth()
    ) {
        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            prefix = {
                Image(
                    modifier = Modifier.size(24.dp),
                    painter = painterResource(id = R.drawable.icon_search),
                    contentDescription = "Search Icon",
                )
            },
            suffix = {
                Image(
                    modifier = Modifier.size(24.dp),
                    painter = painterResource(id = R.drawable.icon_mic),
                    contentDescription = "Mic Icon",
                )
            },
            placeholder = {
                Text(
                    "Search",
                    modifier = Modifier.padding(start = 24.dp),
                    style = TextStyle(
                        fontFamily = interMedium,
                        color = greyPrimary,
                        fontSize = 16.sp,
                    ),
                )
            },
            colors = TextFieldDefaults.colors(
                unfocusedIndicatorColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent,
                errorIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent,
                unfocusedContainerColor = greyLighter,
                focusedContainerColor = greyLighter,
                errorContainerColor = greyLighter,
                disabledContainerColor = greyLighter,
            ),
            shape = RoundedCornerShape(12.dp),
            value = search, onValueChange = { search = it },
        )
    }
}

@Composable
private fun SuggestionBox() {
    val suggestionList: List<String> =
        listOf("Random", "Sports", "Gaming", "Politics", "Medical", "Tech")

    var selectedIndex by remember {
        mutableIntStateOf(0)
    }
    LazyRow(
        modifier = Modifier.padding(start = 20.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(suggestionList.size) { item ->
            Card(
                modifier = Modifier
                    .height(height = 35.dp)
                    .width(80.dp)
                    .clickable {
                        selectedIndex = item
                    },
                colors = CardDefaults.cardColors(
                    containerColor = if (selectedIndex == item) purplePrimary else greyLighter,
                ),
                elevation = CardDefaults.cardElevation(0.dp),
                shape = RoundedCornerShape(16.dp),
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxSize(),
                ) {
                    Text(
                        suggestionList[item],
                        style = TextStyle(
                            color = if (selectedIndex == item) Color.White else greyPrimary,
                            fontSize = 12.sp,
                            fontFamily = interSemiBold,
                        ),
                    )
                }
            }
        }
    }
}

@Composable
private fun HeadlineSection() {

    val headlineMap = mapOf(

        "Politics" to R.drawable.headline2,
        "Sports" to R.drawable.headline1,
        "Tech" to R.drawable.headline3,
    )

    val headlineList: List<String> = listOf(
        "Trump says there will be no more debates after first Harris face-off",
        "What’s Real Madrid star Mbappe’s pay dispute with his former club PSG?",
        "OpenAI launches new series of AI models with 'reasoning' abilities"
    )

    val suggestionList: List<String> = headlineMap.keys.toList()

    LazyRow(
        modifier = Modifier.padding(start = 20.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        items(headlineList.size) { index ->
            Box(modifier = Modifier.size(256.dp)) {
                Image(
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .height(256.dp)
                        .width(256.dp)
                        .clip(RoundedCornerShape(12.dp)),
                    painter = painterResource(id = headlineMap.values.toList()[index]),
                    contentDescription = "White House"
                )

                Column(
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .padding(end = 24.dp, top = 24.dp),
                ) {
                    Image(
                        modifier = Modifier
                            .size(24.dp),
                        painter = painterResource(id = R.drawable.white_bookmark),
                        contentDescription = "BookMark Icon",
                    )
                }

                Column(
                    modifier = Modifier
                        .align(Alignment.BottomStart)
                        .padding(start = 24.dp)
                ) {
                    Text(
                        suggestionList[index],

                        style = TextStyle(
                            color = Color.White,
                            fontSize = 12.sp,
                            fontFamily = interRegular,
                        ),
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        headlineList[index],

                        style = TextStyle(
                            color = Color.White,
                            fontSize = 16.sp,
                            fontFamily = interBold,
                        ),
                    )
                    Spacer(modifier = Modifier.height(24.dp))
                }
            }
        }
    }
}

@Composable
private fun RecommendData() {
    val imageMap = mapOf(
        "UI/UX Design" to R.drawable.recommend_pic1,
        "Random" to R.drawable.recommend_pic2,
        "History" to R.drawable.recommend_pic3,
        "Art" to R.drawable.recommend_pic4,
        "Hot" to R.drawable.recommend_pic5,
    )
    val headList: List<String> = imageMap.keys.toList()
    val titleList: List<String> = listOf(
        "New York City celebrates David Wojnarowicz’s 70th birthday",
        "Over 50% of gallerists have a poor work-life balance, with those in the US most acutely affected",
        "'Go, thou, and do likewise': a field guide to Britain’s stone circles delivers both scholarship and romance",
        "Ready for the art-world reckoning?",
        "Refik Anadol's AI tribute to Czech composer Antonín Dvořák takes the stage in Washington, DC",
    )


    LazyColumn(
        modifier = Modifier.padding(horizontal = 20.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        items(imageMap.size) { index ->
            RecommendSection(
                image = imageMap.values.toList()[index],
                title = titleList[index],
                headTitle = headList[index],
            )
        }
    }
}


@Composable
private fun RecommendSection(@DrawableRes image: Int, title: String, headTitle: String) {
    Card(
        modifier = Modifier.fillMaxWidth(), colors = CardDefaults.cardColors(
            containerColor = Color.Transparent,
        )
    ) {
        Row(modifier = Modifier.fillMaxWidth()) {
            Image(
                modifier = Modifier
                    .size(96.dp)
                    .clip(RoundedCornerShape(12.dp)),
                contentScale = ContentScale.Crop,
                painter = painterResource(id = image),
                contentDescription = "UI Design Bookmark",
            )

            Spacer(modifier = Modifier.width(20.dp))

            Column {

                Text(
                    headTitle,
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontFamily = interRegular,
                        color = greyPrimary,
                    ),
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    title,
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontFamily = interSemiBold,
                        color = blackPrimary,
                    ),
                )
            }
        }
    }
}