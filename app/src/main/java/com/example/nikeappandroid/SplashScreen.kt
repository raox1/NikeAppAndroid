package com.example.nikeappandroid

// SplashScreen.kt
// Created by Lalit Kumar on 24/10/24

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavHostController) {
    var isActive by remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {
        // Navigate to Onboarding screen after 2.5 seconds
        delay(2500L)
        isActive = true
        if (isActive) {
            navController.navigate("onboarding") {
                popUpTo("splash") { inclusive = true }
            }
        }
    }

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        if (isActive) {
            // Just to show the transition logic; this screen will change soon
            Text("Navigating...", fontSize = 24.sp, fontWeight = FontWeight.Bold)
        } else {
            Text("NIKE", fontSize = 32.sp, fontWeight = FontWeight.Bold, color = Color.Black)
        }
    }
}

