package ink.duo3.exptracker.ui

import android.graphics.drawable.Icon
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.sharp.AccountCircle
import androidx.compose.material.icons.sharp.Search
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import ink.duo3.exptracker.R

@Composable
fun ExpTracker() {
    val scrollState = remember { ScrollableState { 0f } }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.surfaceVariant
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    top =
                    WindowInsets.systemBars
                        .asPaddingValues()
                        .calculateTopPadding()
                )
            ) {
            Row(
                Modifier.padding(16.dp, 8.dp, 16.dp, 0.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Surface(
                    modifier = Modifier.weight(1f),
                    color = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.15f),
                    shape = MaterialTheme.shapes.medium,
                ) {
                    Row(
                        Modifier
                            .clickable { /* TODO */ }
                            .padding(16.dp)) {
                        Icon(
                            imageVector = Icons.Sharp.Search,
                            contentDescription = "Search",
                            tint = MaterialTheme.colorScheme.onSurface
                        )
                        Text(
                            modifier = Modifier.padding(start = 16.dp),
                            text = "搜索...",
                            color = MaterialTheme.colorScheme.onSurface
                        )
                    }
                }
                Surface(
                    modifier = Modifier
                        .padding(start = 8.dp),
                    shape = CircleShape,
                    color = Color.Transparent
                ){
                    Icon(
                        modifier = Modifier
                            .clickable(onClickLabel = "Account") { /* TODO */ }
                            .padding(16.dp),
                        imageVector = Icons.Sharp.AccountCircle,
                        contentDescription = "Account",
                        tint = MaterialTheme.colorScheme.onSurface
                    )
                }
            }
            LazyColumn(
                Modifier
                    .fillMaxSize()
                    .padding(16.dp, 0.dp)
            ) {
                items(1) {index ->
                    ExpCard()
                }
            }
        }
    }
}