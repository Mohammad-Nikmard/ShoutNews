package com.example.shoutnews.screens

import android.widget.Space
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
import com.example.shoutnews.ui.theme.greyPrimary
import com.example.shoutnews.ui.theme.interRegular
import com.example.shoutnews.ui.theme.interSemiBold

@Composable
fun BookmarkScreen() {
    Scaffold(modifier = Modifier.fillMaxSize()) { contentPadding ->
        Column(
            modifier = Modifier
                .padding(contentPadding)
                .padding(horizontal = 20.dp)
        ) {
            Spacer(modifier = Modifier.height(28.dp))

            Column(horizontalAlignment = Alignment.Start) {
                Text(
                    "Bookmarks",
                    style = TextStyle(
                        fontSize = 24.sp,
                        fontFamily = interSemiBold,
                        color = blackPrimary,
                    ),
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    "Saved articles to the library",
                    style = TextStyle(
                        fontSize = 16.sp,
                        color = greyPrimary,
                        fontFamily = interRegular,
                    ),
                )
            }

            Spacer(modifier = Modifier.height(32.dp))

            BookmarkData(
                image = R.drawable.ui_design_bookmard,
                title = "A Simple Trick For Creating Color Palettes Quickly",
                headTitle = "UI/UX Design"
            )

            Spacer(modifier = Modifier.height(16.dp))

            BookmarkData(
                image = R.drawable.art_bookmark,
                title = "Six steps to creating a color pallete",
                headTitle = "Art"
            )

            Spacer(modifier = Modifier.height(16.dp))

            BookmarkData(
                image = R.drawable.colors_bookmark,
                title = "Creating Color Palette from world around you",
                headTitle = "Colors"
            )

            Spacer(modifier = Modifier.height(16.dp))

            BookmarkData(
                image = R.drawable.ui_design_bookmard,
                title = "A Simple Trick For Creating Color Palettes Quickly",
                headTitle = "UI/UX Design"
            )

            Spacer(modifier = Modifier.height(16.dp))

        }
    }
}

@Composable
private fun BookmarkData(@DrawableRes image: Int, title: String, headTitle: String) {
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
                contentScale = ContentScale.Fit,
                painter = painterResource(id = image),
                contentDescription = "UI Design Bookmark",
            )

            Spacer(modifier = Modifier.width(20.dp))

            Column {

                Spacer(modifier = Modifier.height(8.dp))

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