package br.com.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.example.newsapp.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int,
)

val pages = listOf(
    Page(
        title = "Financial News",
        description = "Get ready for a journey into the heart of the financial world. Stay informed, make wise decisions, and navigate the complexities of finance with our real-time updates and expert analyses.",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Travelling tips",
        description = "Discover the latest travel updates, expert tips, and insider insights to make your journeys seamless and memorable.",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Food and Health",
        description = "Your gateway to a healthier lifestyle!  Explore a world of nutritious recipes, wellness tips, and the latest insights on maintaining a balanced diet.",
        image = R.drawable.onboarding3
    )
)