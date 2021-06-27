package com.wiryadev.bootstrapiconscompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.wiryadev.bootstrapiconscompose.ui.theme.BootstrapIconsComposeTheme
import icons.bootstrapicons.Filled
import icons.bootstrapicons.Normal
import com.wiryadev.bootstrapiconscompose.bootstrapicons.filled.FileImage
import icons.bootstrapicons.normal.FileImage

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BootstrapIconsComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                }
            }
        }
    }
}

@Composable
fun TestIcon() {
    Column(
        modifier = Modifier.fillMaxSize()
            .background(MaterialTheme.colors.surface)
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Icon(
                imageVector = BootstrapIcons.Filled.FileImage,
                contentDescription = "FileImage Fill",
                tint = Color.Green,
                modifier = Modifier
                    .background(Color.Black)
            )
            Icon(
                imageVector = Icons.Default.Clear,
                contentDescription = "FileImage Fill",
                tint = Color.Green,
            )
            Icon(
                imageVector = BootstrapIcons.Normal.FileImage,
                contentDescription = "FileImage Fill",
                tint = Color.Green,
                modifier = Modifier.background(Color.Black)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BootstrapIconsComposeTheme {
        TestIcon()
    }
}