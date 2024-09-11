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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
fun TermsScreen() {
    Scaffold(modifier = Modifier.fillMaxSize()) { contentPadding ->
        Column(
            modifier = Modifier
                .padding(contentPadding)
                .padding(horizontal = 20.dp)
                .verticalScroll(rememberScrollState())
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

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                """
                    Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean viverra porttitor enim at dapibus. Aliquam eleifend mauris lectus, eu pulvinar ante volutpat ac. Proin quis semper nulla. Pellentesque pulvinar, eros a vulputate pulvinar, felis nibh imperdiet massa, at vulputate lectus ipsum ut magna. Duis at arcu vel diam sodales ultricies vitae quis eros. Fusce eleifend laoreet dui. Vestibulum vel iaculis risus, nec ultricies augue. Ut et nibh eleifend, sollicitudin dui a, pellentesque enim. Nunc iaculis ut nisi id dictum.

                    Mauris hendrerit lorem arcu, id tempus quam mattis et. Sed interdum ornare lectus in euismod. Nunc eu placerat felis. Nunc eget libero id lorem eleifend luctus. Suspendisse ultricies blandit risus. Nam pellentesque tortor neque, pulvinar ornare velit auctor hendrerit. Mauris pretium nunc et odio sollicitudin, sed dignissim tortor tristique. Vestibulum leo dui, interdum vel tempor vel, gravida ut lorem. Pellentesque et posuere odio. Aenean faucibus malesuada lobortis. Integer sagittis, mauris eu vehicula aliquet, nunc eros commodo dui, ac scelerisque mauris ligula sit amet libero. Sed porta ut sem vitae vestibulum. Aliquam erat volutpat. Etiam congue pharetra dolor suscipit lobortis. Donec rhoncus a nibh quis congue.

                    Nullam tristique commodo posuere. Ut pulvinar dui non ligula dictum lacinia. Vestibulum quis dui justo. Curabitur egestas neque hendrerit, fermentum odio eu, posuere nisl. Suspendisse ac lorem a ligula pulvinar dictum vitae sed lorem. Nulla aliquam quis elit et varius. Mauris tincidunt odio ut fringilla placerat. Donec elementum interdum libero id maximus.

                    Quisque cursus vulputate pharetra. Fusce malesuada tempor porta. Nam vitae lectus vel ante malesuada venenatis id eu ante. Quisque vel interdum sem, non facilisis sapien. Mauris gravida eu velit in eleifend. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Suspendisse scelerisque eleifend tortor sit amet sollicitudin. Praesent lobortis rutrum ante, euismod aliquam leo sollicitudin eget. Aliquam sit amet scelerisque orci. Nulla tincidunt quam a ante faucibus, ullamcorper ultrices tortor volutpat. Etiam finibus viverra accumsan. Vivamus vitae eros mi. Donec id tellus a enim tincidunt vehicula vel at arcu.

                    Praesent sed tincidunt felis. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Ut et enim nunc. Curabitur et lorem in ex elementum sollicitudin. Quisque posuere magna nibh, vel dignissim mi laoreet et. Etiam lobortis turpis rhoncus, bibendum enim non, egestas est. Curabitur id lacus sit amet elit iaculis euismod. Ut elementum est a orci facilisis elementum. Maecenas dapibus, enim ac facilisis molestie, eros quam suscipit lorem, at gravida mi tellus fermentum nibh. Curabitur vestibulum tortor at ipsum sodales facilisis. Pellentesque at dui efficitur, rutrum velit vel, luctus dui.
                """.trimIndent(),
                style = TextStyle(
                    fontFamily = interRegular,
                    color = greyPrimary,
                    fontSize = 16.sp,
                ),
            )

            Spacer(modifier = Modifier.height(24.dp))
        }
    }
}