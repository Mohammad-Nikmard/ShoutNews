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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.IconButton
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
import com.example.shoutnews.ui.theme.greyDark
import com.example.shoutnews.ui.theme.greyPrimary
import com.example.shoutnews.ui.theme.interBold
import com.example.shoutnews.ui.theme.interRegular
import com.example.shoutnews.ui.theme.interSemiBold
import com.example.shoutnews.ui.theme.purplePrimary

@Composable
fun NewsDetailScreen() {
    Scaffold(modifier = Modifier.fillMaxSize()) { contentPadding ->
        Column(
            modifier = Modifier
                .padding(contentPadding)
                .padding(horizontal = 20.dp)
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.Start,
        ) {
            Spacer(modifier = Modifier.height(28.dp))

            HeaderSection()

            Spacer(modifier = Modifier.height(24.dp))

            TitleSection()

            Spacer(modifier = Modifier.height(32.dp))

            Text(
                "Results",
                style = TextStyle(
                    fontFamily = interSemiBold,
                    color = blackPrimary,
                    fontSize = 16.sp,
                ),
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                """
                    After a day of solemn Sept. 11 memorial events, former President Donald J. Trump and Vice President Kamala Harris on Thursday will begin a period of intense campaigning stretching into the weekend. Mr. Trump will deliver a speech in Tucson, Ariz., before attending an evening fund-raiser in California. Ms. Harris will hold a rally in Charlotte, N.C., in the afternoon as her campaign begins a tour of battleground states. Hours later, she’ll fly to Greensboro for a second rally in North Carolina.

                    The packed day of events — which includes engagements for both of their running mates — comes after a contentious and personal debate on Tuesday, which drew 67.1 million viewers, more than the debate between Mr. Trump and President Biden in June. Mr. Trump’s bogus claims about an immigrant community in Springfield, Ohio, during the debate thrust the small town into the national spotlight.

                    Here’s what else to know:

                    Jan. 6 security: In an effort to prevent another attack on the Capitol like the deadly riot in 2021, the Department of Homeland Security has declared the certification of the election on Jan. 6, 2025, to be a special event that requires added security measures. The Secret Service will oversee the security plan.

                    Absentee ballots: Alabama began mailing out absentee ballots on Wednesday, the first state to do so. Mail ballots in North Carolina are also set to go out soon. Early in-person voting is set to start next week in parts of Pennsylvania and in Virginia.

                    Mail ballot issues: A bipartisan group of election officials said they were concerned on Wednesday about significant problems in the Postal Service in delivering mailed ballots. They highlighted previous cases “in nearly every state” of ballots being delivered “well after Election Day,” resulting in voters being disenfranchised.

                    9/11 memorials: Ms. Harris and Mr. Trump, along with President Biden and Senator JD Vance of Ohio, the Republican vice-presidential nominee, attended a commemoration at the World Trade Center memorial in Lower Manhattan under cool, sunny skies that matched the clear weather of the morning in 2001 when two hijacked jetliners struck the Twin Towers. Ms. Harris and Mr. Biden later attended a wreath-laying in Shanksville, Pa., where 40 passengers and crew members died when Flight 93 went down. Mr. Trump and Mr. Vance met with firefighters in Manhattan before Mr. Trump traveled to Pennsylvania for a separate ceremony.

                    Inflation cools: The Consumer Price Index rose 2.5 percent in August from a year earlier, notably cooler than July’s 2.9 percent increase. That will be welcome news to Ms. Harris and keeps the Federal Reserve on track to cut interest rates next week, the first cut in more than four years.
                """.trimIndent(),
                style = TextStyle(
                    fontSize = 16.sp,
                    fontFamily = interRegular,
                    color = greyDark,
                ),


            )

            Spacer(modifier = Modifier.height(24.dp))
        }
    }
}

@Composable
private fun HeaderSection() {

    Row(modifier = Modifier.fillMaxWidth()) {
        IconButton(onClick = {}, modifier = Modifier.size(24.dp)) {
            Image(
                modifier = Modifier.size(24.dp),
                painter = painterResource(id = R.drawable.icon_arrow_back),
                contentDescription = "Back Icon"
            )
        }

        Spacer(modifier = Modifier.weight(1f))

        IconButton(onClick = {}, modifier = Modifier.size(24.dp)) {
            Image(
                modifier = Modifier.size(24.dp),
                painter = painterResource(id = R.drawable.icon_share),
                contentDescription = "Share Icon"
            )
        }

        Spacer(modifier = Modifier.width(16.dp))

        IconButton(onClick = {}, modifier = Modifier.size(24.dp)) {
            Image(
                modifier = Modifier.size(24.dp),
                painter = painterResource(id = R.drawable.icon_bookmark),
                contentDescription = "Bookmark Icon"
            )
        }

    }
    Spacer(modifier = Modifier.height(24.dp))

    Image(
        modifier = Modifier
            .fillMaxWidth()
            .height(192.dp)
            .clip(RoundedCornerShape(16.dp)),
        contentScale = ContentScale.Fit,
        painter = painterResource(id = R.drawable.white_house),
        contentDescription = "White House Pic"
    )
}

@Composable
private fun TitleSection() {
    Card(
        modifier = Modifier
            .height(32.dp)
            .width(99.dp),
        colors = CardDefaults.cardColors(
            containerColor = purplePrimary,
        ),
        shape = RoundedCornerShape(16.dp),
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            Text(
                "US Election",
                style = TextStyle(
                    fontSize = 12.sp,
                    fontFamily = interSemiBold,
                    color = Color.White,
                ),
            )
        }
    }

    Spacer(modifier = Modifier.height(16.dp))

    Text(
        "The latest situation in the presidential election",
        style = TextStyle(
            fontSize = 20.sp,
            fontFamily = interBold,
            color = blackPrimary,
        ),
    )

    Spacer(modifier = Modifier.height(24.dp))

    Row(horizontalArrangement = Arrangement.Start) {
        Image(
            modifier = Modifier
                .size(48.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop,
            painter = painterResource(id = R.drawable.my_pic),
            contentDescription = "Writer Pic",
        )

        Spacer(modifier = Modifier.width(16.dp))
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start,
            modifier = Modifier.fillMaxSize()
        ) {
            Spacer(modifier = Modifier.height(5.dp))

            Text(
                "Mohammad Nikmard",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontFamily = interSemiBold,
                    color = blackPrimary,
                ),
            )

            Spacer(modifier = Modifier.height(5.dp))

            Text(
                "Programmer",
                style = TextStyle(
                    fontSize = 14.sp,
                    fontFamily = interRegular,
                    color = greyPrimary,
                ),
            )
        }
    }
}