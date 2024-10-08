package com.example.shoutnews

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.shoutnews.screens.BookmarkScreen
import com.example.shoutnews.screens.CategoryScreen
import com.example.shoutnews.screens.ChangePasswordScreen
import com.example.shoutnews.screens.CreatePasswordScreen
import com.example.shoutnews.screens.ForgotPasswordScreen
import com.example.shoutnews.screens.HomeScreen
import com.example.shoutnews.screens.LanguageScreen
import com.example.shoutnews.screens.LoginScreen
import com.example.shoutnews.screens.NewsDetailScreen
import com.example.shoutnews.screens.SelectTopicScreen
import com.example.shoutnews.screens.SignUpScreen
import com.example.shoutnews.screens.TermsScreen
import com.example.shoutnews.screens.WelcomeScreen
import com.example.shoutnews.ui.theme.ShoutNewsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ShoutNewsTheme {
                HomeScreen()
            }
        }
    }
}

