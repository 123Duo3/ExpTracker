package ink.duo3.exptracker.ui.theme

import android.graphics.fonts.FontVariationAxis
import androidx.compose.material3.Typography
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontVariation
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import ink.duo3.exptracker.R

@OptIn(ExperimentalTextApi::class)
val Inter = FontFamily(
    Font(
        R.font.inter,
        variationSettings = FontVariation.Settings(FontVariation.weight(100)),
        weight = FontWeight(100)
    ),
    Font(
        R.font.inter,
        variationSettings = FontVariation.Settings(FontVariation.weight(200)),
        weight = FontWeight(200)
    ),
    Font(
        R.font.inter,
        variationSettings = FontVariation.Settings(FontVariation.weight(300)),
        weight = FontWeight(300)
    ),
    Font(
        R.font.inter,
        variationSettings = FontVariation.Settings(FontVariation.weight(400)),
        weight = FontWeight(400)
    ),
    Font(
        R.font.inter,
        variationSettings = FontVariation.Settings(FontVariation.weight(500)),
        weight = FontWeight(500)
    ),
    Font(
        R.font.inter,
        variationSettings = FontVariation.Settings(FontVariation.weight(600)),
        weight = FontWeight(600)
    ),
    Font(R.font.inter,
        variationSettings = FontVariation.Settings(FontVariation.weight(700)),
        weight = FontWeight(700)
    ),
    Font(
        R.font.inter,
        variationSettings = FontVariation.Settings(FontVariation.weight(800)),
        weight = FontWeight(800)
    ),
    Font(
        R.font.inter,
        variationSettings = FontVariation.Settings(FontVariation.weight(900)),
        weight = FontWeight(900)
    ),
)

val Typography = Typography(
    labelLarge = TextStyle(
        fontWeight = FontWeight.Medium,
        letterSpacing = 0.sp,
        lineHeight = 20.sp,
        fontSize = 14.sp,
        fontFamily = Inter
    ),
    labelMedium = TextStyle(
        fontWeight = FontWeight.Medium,
        letterSpacing = 0.10000000149011612.sp,
        lineHeight = 16.sp,
        fontSize = 12.sp,
        fontFamily = Inter
    ),
    labelSmall = TextStyle(
        fontWeight = FontWeight.Medium,
        letterSpacing = 0.10000000149011612.sp,
        lineHeight = 16.sp,
        fontSize = 11.sp,
        fontFamily = Inter
    ),
    bodyLarge = TextStyle(
        fontWeight = FontWeight.W400,
        letterSpacing = 0.sp,
        lineHeight = 24.sp,
        fontSize = 16.sp,
        fontFamily = Inter
    ),
    bodyMedium = TextStyle(
        fontWeight = FontWeight.W400,
        letterSpacing = 0.sp,
        lineHeight = 20.sp,
        fontSize = 14.sp,
        fontFamily = Inter
    ),
    bodySmall = TextStyle(
        fontWeight = FontWeight.W400,
        letterSpacing = 0.10000000149011612.sp,
        lineHeight = 16.sp,
        fontSize = 12.sp,
        fontFamily = Inter
    ),
    headlineLarge = TextStyle(
        fontWeight = FontWeight.W400,
        letterSpacing = 0.sp,
        lineHeight = 40.sp,
        fontSize = 32.sp,
        fontFamily = Inter
    ),
    headlineMedium = TextStyle(
        fontWeight = FontWeight.W400,
        letterSpacing = 0.sp,
        lineHeight = 36.sp,
        fontSize = 28.sp,
        fontFamily = Inter
    ),
    headlineSmall = TextStyle(
        fontWeight = FontWeight.W400,
        letterSpacing = 0.sp,
        lineHeight = 32.sp,
        fontSize = 24.sp,
        fontFamily = Inter
    ),
    displayLarge = TextStyle(
        fontWeight = FontWeight.W400,
        letterSpacing = 0.sp,
        lineHeight = 64.sp,
        fontSize = 57.sp,
        fontFamily = Inter
    ),
    displayMedium = TextStyle(
        fontWeight = FontWeight.W400,
        letterSpacing = 0.sp,
        lineHeight = 52.sp,
        fontSize = 45.sp,
        fontFamily = Inter
    ),
    displaySmall = TextStyle(
        fontWeight = FontWeight.W400,
        letterSpacing = 0.sp,
        lineHeight = 44.sp,
        fontSize = 36.sp,
        fontFamily = Inter
    ),
    titleLarge = TextStyle(
        fontWeight = FontWeight.W400,
        letterSpacing = 0.sp,
        lineHeight = 28.sp,
        fontSize = 22.sp,
        fontFamily = Inter
    ),
    titleMedium = TextStyle(
        fontWeight = FontWeight.Medium,
        letterSpacing = 0.sp,
        lineHeight = 24.sp,
        fontSize = 16.sp,
        fontFamily = Inter
    ),
    titleSmall = TextStyle(
        fontWeight = FontWeight.Medium,
        letterSpacing = 0.sp,
        lineHeight = 20.sp,
        fontSize = 14.sp,
        fontFamily = Inter
    )
)
