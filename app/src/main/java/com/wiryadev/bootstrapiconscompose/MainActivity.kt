package com.wiryadev.bootstrapiconscompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.wiryadev.bootstrapiconscompose.bootstrapicons.Filled
import com.wiryadev.bootstrapiconscompose.bootstrapicons.Normal
import com.wiryadev.bootstrapiconscompose.bootstrapicons.filled.*
import com.wiryadev.bootstrapiconscompose.bootstrapicons.normal.Bell
import com.wiryadev.bootstrapiconscompose.bootstrapicons.normal.Youtube
import com.wiryadev.bootstrapiconscompose.ui.theme.BootstrapIconsComposeTheme

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
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.surface)
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Icon(
                imageVector = BootstrapIcons.Filled.XSquare,
                contentDescription = "FileImage Fill",
                modifier = Modifier
            )
            Icon(
                imageVector = BootstrapIcons.Normal.Youtube,
                contentDescription = "FileImage Fill",
                modifier = Modifier
            )
            Icon(
                imageVector = Icons.Default.Clear,
                contentDescription = "FileImage Fill",
            )
            BsIcon(
                bsIcon = BootstrapIcons.Filled.XSquare,
                contentDescription = "FileImage Fill",
            )
        }
    }
}

@Composable
fun IconsWithBottomBar() {
    BottomNavigation {
        BottomNavigationItem(
            selected = true,
            onClick = { },
            icon = {
                BsIcon(
                    bsIcon = BootstrapIcons.Filled.House,
                    contentDescription = "Home"
                )
            },
            label = {
                Text(text = "Home")
            }
        )
        BottomNavigationItem(
            selected = true,
            onClick = { },
            icon = {
                BsIcon(
                    bsIcon = BootstrapIcons.Filled.Grid1x2,
                    contentDescription = "Discover"
                )
            },
            label = {
                Text(text = "Discover")
            }
        )
        BottomNavigationItem(
            selected = true,
            onClick = { },
            icon = {
                BsIcon(
                    bsIcon = BootstrapIcons.Filled.ChatLeft,
                    contentDescription = "Message"
                )
            },
            label = {
                Text(text = "Message")
            }
        )
        BottomNavigationItem(
            selected = true,
            onClick = { },
            icon = {
                BsIcon(
                    bsIcon = BootstrapIcons.Filled.Person,
                    contentDescription = "Profile"
                )
            },
            label = {
                Text(text = "Profile")
            }
        )
    }
}

@Preview
@Composable
fun IconsWithActionBar() {
    TopAppBar(
        backgroundColor = MaterialTheme.colors.background,
        contentColor = MaterialTheme.colors.onBackground,
    ) {
        Text(
            text = "Bootstrap Icon Demo",
            style = MaterialTheme.typography.subtitle1,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier
                .weight(1f)
                .align(Alignment.CenterVertically)
        )
        IconButton(
            onClick = { },
            modifier = Modifier.align(Alignment.CenterVertically)
        ) {
            BsIcon(
                bsIcon = BootstrapIcons.Normal.Bell,
                contentDescription = "Notification"
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreen() {
    Box {
        Column {
        }
        IconsWithBottomBar()
    }
}