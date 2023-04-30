package ink.duo3.exptracker.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable


private val LightColors = lightColorScheme(
    primary = md_theme_light_primary,
    onPrimary = md_theme_light_onPrimary,
    primaryContainer = md_theme_light_primaryContainer,
    onPrimaryContainer = md_theme_light_onPrimaryContainer,
//    primaryFixed = md_theme_light_primaryFixed,
//    onPrimaryFixed = md_theme_light_onPrimaryFixed,
//    primaryFixedDim = md_theme_light_primaryFixedDim,
//    onPrimaryFixedVariant = md_theme_light_onPrimaryFixedVariant,
    secondary = md_theme_light_secondary,
    onSecondary = md_theme_light_onSecondary,
    secondaryContainer = md_theme_light_secondaryContainer,
    onSecondaryContainer = md_theme_light_onSecondaryContainer,
//    secondaryFixed = md_theme_light_secondaryFixed,
//    onSecondaryFixed = md_theme_light_onSecondaryFixed,
//    secondaryFixedDim = md_theme_light_secondaryFixedDim,
//    onSecondaryFixedVariant = md_theme_light_onSecondaryFixedVariant,
    tertiary = md_theme_light_tertiary,
    onTertiary = md_theme_light_onTertiary,
    tertiaryContainer = md_theme_light_tertiaryContainer,
    onTertiaryContainer = md_theme_light_onTertiaryContainer,
//    tertiaryFixed = md_theme_light_tertiaryFixed,
//    onTertiaryFixed = md_theme_light_onTertiaryFixed,
//    tertiaryFixedDim = md_theme_light_tertiaryFixedDim,
//    onTertiaryFixedVariant = md_theme_light_onTertiaryFixedVariant,
    error = md_theme_light_error,
    onError = md_theme_light_onError,
    errorContainer = md_theme_light_errorContainer,
    onErrorContainer = md_theme_light_onErrorContainer,
    outline = md_theme_light_outline,
    background = md_theme_light_background,
    onBackground = md_theme_light_onBackground,
    surface = md_theme_light_surface,
    onSurface = md_theme_light_onSurface,
    surfaceVariant = md_theme_light_surfaceVariant,
    onSurfaceVariant = md_theme_light_onSurfaceVariant,
    inverseSurface = md_theme_light_inverseSurface,
    inverseOnSurface = md_theme_light_inverseOnSurface,
    inversePrimary = md_theme_light_inversePrimary,
    surfaceTint = md_theme_light_surfaceTint,
    outlineVariant = md_theme_light_outlineVariant,
    scrim = md_theme_light_scrim,
//    surfaceContainerHighest = md_theme_light_surfaceContainerHighest,
//    surfaceContainerHigh = md_theme_light_surfaceContainerHigh,
//    surfaceContainer = md_theme_light_surfaceContainer,
//    surfaceContainerLow = md_theme_light_surfaceContainerLow,
//    surfaceContainerLowest = md_theme_light_surfaceContainerLowest,
//    surfaceBright = md_theme_light_surfaceBright,
//    surfaceDim = md_theme_light_surfaceDim,
)


private val DarkColors = darkColorScheme(
    primary = md_theme_dark_primary,
    onPrimary = md_theme_dark_onPrimary,
    primaryContainer = md_theme_dark_primaryContainer,
    onPrimaryContainer = md_theme_dark_onPrimaryContainer,
//    primaryFixed = md_theme_dark_primaryFixed,
//    onPrimaryFixed = md_theme_dark_onPrimaryFixed,
//    primaryFixedDim = md_theme_dark_primaryFixedDim,
//    onPrimaryFixedVariant = md_theme_dark_onPrimaryFixedVariant,
    secondary = md_theme_dark_secondary,
    onSecondary = md_theme_dark_onSecondary,
    secondaryContainer = md_theme_dark_secondaryContainer,
    onSecondaryContainer = md_theme_dark_onSecondaryContainer,
//    secondaryFixed = md_theme_dark_secondaryFixed,
//    onSecondaryFixed = md_theme_dark_onSecondaryFixed,
//    secondaryFixedDim = md_theme_dark_secondaryFixedDim,
//    onSecondaryFixedVariant = md_theme_dark_onSecondaryFixedVariant,
    tertiary = md_theme_dark_tertiary,
    onTertiary = md_theme_dark_onTertiary,
    tertiaryContainer = md_theme_dark_tertiaryContainer,
    onTertiaryContainer = md_theme_dark_onTertiaryContainer,
//    tertiaryFixed = md_theme_dark_tertiaryFixed,
//    onTertiaryFixed = md_theme_dark_onTertiaryFixed,
//    tertiaryFixedDim = md_theme_dark_tertiaryFixedDim,
//    onTertiaryFixedVariant = md_theme_dark_onTertiaryFixedVariant,
    error = md_theme_dark_error,
    onError = md_theme_dark_onError,
    errorContainer = md_theme_dark_errorContainer,
    onErrorContainer = md_theme_dark_onErrorContainer,
    outline = md_theme_dark_outline,
    background = md_theme_dark_background,
    onBackground = md_theme_dark_onBackground,
    surface = md_theme_dark_surface,
    onSurface = md_theme_dark_onSurface,
    surfaceVariant = md_theme_dark_surfaceVariant,
    onSurfaceVariant = md_theme_dark_onSurfaceVariant,
    inverseSurface = md_theme_dark_inverseSurface,
    inverseOnSurface = md_theme_dark_inverseOnSurface,
    inversePrimary = md_theme_dark_inversePrimary,
    surfaceTint = md_theme_dark_surfaceTint,
    outlineVariant = md_theme_dark_outlineVariant,
    scrim = md_theme_dark_scrim,
//    surfaceContainerHighest = md_theme_dark_surfaceContainerHighest,
//    surfaceContainerHigh = md_theme_dark_surfaceContainerHigh,
//    surfaceContainer = md_theme_dark_surfaceContainer,
//    surfaceContainerLow = md_theme_dark_surfaceContainerLow,
//    surfaceContainerLowest = md_theme_dark_surfaceContainerLowest,
//    surfaceBright = md_theme_dark_surfaceBright,
//    surfaceDim = md_theme_dark_surfaceDim,
)

@Composable
fun AppTheme(
  useDarkTheme: Boolean = isSystemInDarkTheme(),
  content: @Composable() () -> Unit
) {
  val colors = if (!useDarkTheme) {
    LightColors
  } else {
    DarkColors
  }

  MaterialTheme(
    colorScheme = colors,
    content = content
  )
}