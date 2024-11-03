package com.example.nikeappandroid

// OnboardingScreen.kt
// Created by Lalit Kumar on 24/10/24

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun OnboardingScreen(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black) // Optional: To avoid transparency issues
            .systemBarsPadding()     // Ensures image fills entire screen including status bar
    ) {
        Image(
            painter = painterResource(id = R.drawable.abc),
            contentDescription = "Onboarding Background",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Image(
            painter = painterResource(id = R.drawable.onboarding_shoe),
            contentDescription = "Shoe Image",
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = LocalConfiguration.current.screenHeightDp.dp / 5)
                .size(320.dp) // Adjust the size as needed
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = LocalConfiguration.current.screenHeightDp.dp / 2 + 80.dp) // Adjust based on shoe image position
        ) {
            Text(
                text = "Start Journey \nwith NIKE",
                color = Color.White,
                fontSize = 34.sp,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.SemiBold
            )

            Spacer(modifier = Modifier.height(16.dp))
            // Adjust height as needed.
            Text(
                text = "Smart gorgeous and fashionable collection make \n you cool",
                color = Color.Gray,
                fontSize = 16.sp,
                textAlign = TextAlign.Center
            )
        }


    }
}


@Preview(showBackground = true)
@Composable
fun onboardingScreenPreview() {
    val navController = rememberNavController()
    OnboardingScreen(navController = navController)
}