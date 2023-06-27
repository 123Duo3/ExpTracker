package ink.duo3.exptracker.ui

import android.graphics.drawable.VectorDrawable
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.sharp.KeyboardArrowRight
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ink.duo3.exptracker.R

@Composable
fun ExpCard() {
    Surface(
        Modifier.padding(top = 16.dp),
        color = MaterialTheme.colorScheme.tertiary,
        shape = MaterialTheme.shapes.large
    ) {
        Column(
            Modifier.padding(16.dp, 12.dp),
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    modifier = Modifier.weight(1f),
                    text = "菜鸟驿站",
                    style = MaterialTheme.typography.labelLarge,
                    color = MaterialTheme.colorScheme.onTertiary.copy(alpha = 0.72f)
                )

                Text(
                    modifier = Modifier.padding(8.dp, 0.dp),
                    text = "待取",
                    style = MaterialTheme.typography.labelLarge,
                    color = MaterialTheme.colorScheme.onTertiary.copy(alpha = 0.72f)
                )
                Icon(
                    painter = painterResource(id = R.drawable.ic_pending_24dp),
                    contentDescription = "",
                    tint = MaterialTheme.colorScheme.onTertiary.copy(alpha = 0.72f)
                )
            }

            CustomRow {
                Text(
                    modifier = Modifier.weight(1f),
                    text = "D-1-4836",
                    style = MaterialTheme.typography.displayMedium
                        .copy(fontWeight = FontWeight.ExtraBold),
                    color = MaterialTheme.colorScheme.onTertiary
                )

                Surface(
                    modifier = Modifier.padding(vertical = 8.dp),
                    shape = MaterialTheme.shapes.medium,
                    color = MaterialTheme.colorScheme.onTertiary.copy(alpha = 0.82f)
                ) {
                    Row(
                        Modifier
                            .clickable { /* TODO */ }
                            .padding(8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_barcode_24dp),
                            contentDescription = "",
                            tint = MaterialTheme.colorScheme.tertiary
                        )
                        Text(
                            modifier = Modifier.padding(start = 8.dp),
                            text = "身份码",
                            color = MaterialTheme.colorScheme.tertiary,
                            style = MaterialTheme.typography.labelLarge
                        )
                    }
                }
            }

            Divider()

            Text(
                text = "充电头",
                color = MaterialTheme.colorScheme.onTertiary,
                style = MaterialTheme.typography.titleLarge
            )

            Divider()

            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    modifier = Modifier.weight(1f),
                    text = "申通快递",
                    style = MaterialTheme.typography.labelMedium,
                    color = MaterialTheme.colorScheme.onTertiary.copy(alpha = 0.72f)
                )
                Text(
                    modifier = Modifier.padding(start = 8.dp),
                    text = "773217••••••••••23271",
                    style = MaterialTheme.typography.labelMedium,
                    color = MaterialTheme.colorScheme.onTertiary.copy(alpha = 0.72f)
                )
            }
            Row(
                modifier = Modifier.padding(top = 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    modifier = Modifier
                        .padding(end = 8.dp)
                        .width(16.dp),
                    text = "●",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onTertiary,
                    textAlign = TextAlign.Center
                )
                Text(
                    modifier = Modifier.weight(1f),
                    text = "快件已到达[代收点]，请及时取件",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onTertiary
                )
                Text(
                    modifier = Modifier.padding(start = 8.dp),
                    text = "今天 09:56",
                    style = MaterialTheme.typography.labelMedium,
                    color = MaterialTheme.colorScheme.onTertiary,
                    textAlign = TextAlign.End
                )
            }

            Divider()

            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    modifier = Modifier.weight(1f),
                    text = "已送达",
                    style = MaterialTheme.typography.titleSmall,
                    color = MaterialTheme.colorScheme.onTertiary
                )
                Icon(imageVector = Icons.Sharp.KeyboardArrowRight, contentDescription = "Detail")
            }
        }
    }
}

@Composable
fun Divider() {
    Column(Modifier.padding(0.dp, 8.dp)) {
        Surface(
            Modifier
                .height(1.dp)
                .fillMaxWidth(),
            color = MaterialTheme.colorScheme.onTertiary.copy(alpha = 0.24f)
        ) { }
    }
}

@Preview
@Composable
fun ExpCardPreview(){
    ExpCard()
}

@Composable
fun CustomRow(
    content: @Composable () -> Unit
) {
    // Retrieve the current screen density
    val density = LocalDensity.current
    // Convert the minimum spacing (8.dp) to pixels
    val minSpacing = with(density) { 8.dp.roundToPx() }

    Layout(
        content = content,
        modifier = Modifier
    ) { measurables, constraints ->
        // Measure each child
        val placeables = measurables.map { measurable ->
            measurable.measure(constraints)
        }

        // Calculate the total width of the row including the minimum spacing
        val rowWidth = placeables.sumOf { it.width } + minSpacing
        // Calculate the maximum height of the children
        val height = placeables.maxByOrNull { it.height }?.height ?: 0

        // Determine if we should display the elements in two lines
        val secondLine = rowWidth > constraints.maxWidth

        // Calculate the total height based on the elements' positions
        val totalHeight = if (secondLine) {
            placeables.sumOf { it.height }
        } else {
            height
        }

        layout(constraints.maxWidth, totalHeight) {
            var xPosition = 0
            var yPosition = 0

            placeables.forEachIndexed { index, placeable ->
                // Position the second element at the right end if the elements are in the same row
                if (!secondLine && index == 1) {
                    xPosition = constraints.maxWidth - placeable.width
                }

                // Calculate the vertical center for the elements when in the same row
                val centerY = (totalHeight - placeable.height) / 2

                // Place the element considering if they are in the same row or not
                placeable.place(x = xPosition, y = if (secondLine) yPosition else centerY)

                // Update the position for the next element
                if (secondLine) {
                    yPosition += placeable.height
                } else if (index == 0) {
                    xPosition += placeable.width + minSpacing
                }
            }
        }
    }
}
