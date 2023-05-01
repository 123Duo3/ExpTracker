package ink.duo3.exptracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.view.WindowCompat
import ink.duo3.exptracker.ui.ExpTracker
import ink.duo3.exptracker.ui.theme.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false);
        setContent {
            AppTheme {
                ExpTracker()
            }
        }
    }
}
