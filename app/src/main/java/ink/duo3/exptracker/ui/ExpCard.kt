package ink.duo3.exptracker.ui

import android.graphics.drawable.VectorDrawable
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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

            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    modifier = Modifier.weight(1f),
                    text = "D-1-483600000000",
                    style = MaterialTheme.typography.displayMedium
                                .copy(fontWeight = FontWeight.ExtraBold),
                    color = MaterialTheme.colorScheme.onTertiary
                )

                Surface(
                    modifier = Modifier.padding(start = 8.dp),
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