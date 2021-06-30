package com.wiryadev.bootstrapiconscompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.outlined.AccountBox
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.accompanist.insets.statusBarsHeight
import com.google.accompanist.insets.statusBarsPadding
import com.wiryadev.bootstrapiconscompose.bootstrapicons.Filled
import com.wiryadev.bootstrapiconscompose.bootstrapicons.Normal
import com.wiryadev.bootstrapiconscompose.bootstrapicons.filled.*
import com.wiryadev.bootstrapiconscompose.bootstrapicons.normal.*
import com.wiryadev.bootstrapiconscompose.ui.theme.BootstrapIconsComposeTheme
import com.wiryadev.bootstrapiconscompose.ui.theme.Purple200
import com.wiryadev.bootstrapiconscompose.ui.theme.Purple500

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BootstrapIconsComposeTheme {
                // A surface container using the 'background' color from the theme
                Scaffold(
                    bottomBar = { IconsWithBottomBar() }
                ) { innerPadding ->
                    HomeScreen(paddingValues = innerPadding)
                }
            }
        }
    }
}

@Preview
@Composable
fun IconsWithBottomBar() {
    CompositionLocalProvider(
        values = arrayOf(
            LocalContentColor provides MaterialTheme.colors.background,
            LocalAbsoluteElevation provides LocalAbsoluteElevation.current
        )
    ) {
        Box(
            Modifier
                .background(
                    brush = Brush.linearGradient(
                        listOf(
                            Purple200,
                            Purple500,
                        )
                    )
                )
                .semantics(mergeDescendants = false) {}
                .pointerInput(Unit) { },
            propagateMinConstraints = true,
        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .height(56.dp)
                    .selectableGroup(),
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
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
    }
}

@Preview
@Composable
fun IconsWithActionBar() {
    TopAppBar(
        backgroundColor = MaterialTheme.colors.background,
        contentColor = MaterialTheme.colors.onBackground,
        modifier = Modifier.statusBarsPadding(),
    ) {
        Text(
            text = "Bootstrap Icons Demo",
            style = MaterialTheme.typography.h6,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier
                .padding(start = 12.dp)
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

@Composable
fun CommonIconDemoLayout(
    title: String,
    content: @Composable RowScope.() -> Unit
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text(
            text = title,
            style = MaterialTheme.typography.h6.copy(fontSize = 14.sp),
        )
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround,
        ) {
            content()
        }
    }
}

@Composable
fun NormalIcons() {
    CommonIconDemoLayout(
        title = "Normal Icons"
    ) {
        BsIcon(bsIcon = BootstrapIcons.Normal.Alarm)
        BsIcon(bsIcon = BootstrapIcons.Normal.Archive)
        BsIcon(bsIcon = BootstrapIcons.Normal.Badge8k)
        BsIcon(bsIcon = BootstrapIcons.Normal.BarChart)
        BsIcon(bsIcon = BootstrapIcons.Normal.CreditCard)
    }
}

@Preview
@Composable
fun FilledIcons() {
    CommonIconDemoLayout(
        title = "Filled Icons"
    ) {
        BsIcon(bsIcon = BootstrapIcons.Filled.Alarm)
        BsIcon(bsIcon = BootstrapIcons.Filled.Archive)
        BsIcon(bsIcon = BootstrapIcons.Filled.Badge8k)
        BsIcon(bsIcon = BootstrapIcons.Filled.BarChart)
        BsIcon(bsIcon = BootstrapIcons.Filled.CreditCard)
    }
}

// Icons for brand is within Normal package
@Composable
fun BrandIcons() {
    CommonIconDemoLayout(
        title = "Brand Icons"
    ) {
        BsIcon(bsIcon = BootstrapIcons.Normal.Github)
        BsIcon(bsIcon = BootstrapIcons.Normal.Whatsapp)
        BsIcon(bsIcon = BootstrapIcons.Normal.Facebook)
        BsIcon(bsIcon = BootstrapIcons.Normal.Instagram)
        BsIcon(bsIcon = BootstrapIcons.Normal.Youtube)
    }
}

@Composable
fun TintedIcons() {
    CommonIconDemoLayout(
        title = "Tinted Icons"
    ) {
        BsIcon(bsIcon = BootstrapIcons.Normal.Github, tint = Color.Unspecified)
        BsIcon(bsIcon = BootstrapIcons.Normal.Whatsapp, tint = Color(0xFF25D366))
        BsIcon(bsIcon = BootstrapIcons.Normal.Facebook, tint = Color(0xFF4267B2))
        BsIcon(bsIcon = BootstrapIcons.Normal.Instagram, tint = MaterialTheme.colors.primary)
        BsIcon(bsIcon = BootstrapIcons.Normal.Youtube, tint = Color.Red)
    }
}

@Composable
fun ButtonIcons() {
    CommonIconDemoLayout(
        title = "Button Icons"
    ) {
        val iconButtonBackground = Modifier.background(
            brush = Brush.linearGradient(
                listOf(
                    Purple200,
                    Purple500,
                )
            ),
            shape = CircleShape,
        )

        IconButton(
            onClick = { },
            modifier = iconButtonBackground,
        ) {
            BsIcon(bsIcon = BootstrapIcons.Filled.Alarm, tint = MaterialTheme.colors.onPrimary)
        }
        IconButton(
            onClick = { },
            modifier = iconButtonBackground,
        ) {
            BsIcon(bsIcon = BootstrapIcons.Normal.Archive, tint = MaterialTheme.colors.onPrimary)
        }
        IconButton(
            onClick = { },
            modifier = iconButtonBackground,
        ) {
            BsIcon(bsIcon = BootstrapIcons.Filled.Badge8k, tint = MaterialTheme.colors.onPrimary)
        }
        IconButton(
            onClick = { },
            modifier = iconButtonBackground,
        ) {
            BsIcon(bsIcon = BootstrapIcons.Normal.BarChart, tint = MaterialTheme.colors.onPrimary)
        }
        IconButton(
            onClick = { },
            modifier = iconButtonBackground,
        ) {
            BsIcon(bsIcon = BootstrapIcons.Filled.CreditCard, tint = MaterialTheme.colors.onPrimary)
        }
    }
}

@Composable
fun VariousSizeIcons() {
    CommonIconDemoLayout(
        title = "Various Size Icons (in Dp)"
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "16.dp")
            Spacer(modifier = Modifier.height(6.dp))
            BsIcon(bsIcon = BootstrapIcons.Filled.Mic, size = 16.dp)
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "24.dp")
            Spacer(modifier = Modifier.height(6.dp))
            BsIcon(bsIcon = BootstrapIcons.Filled.Mic)
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "32.dp")
            Spacer(modifier = Modifier.height(6.dp))
            BsIcon(bsIcon = BootstrapIcons.Filled.Mic, size = 32.dp)
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "48.dp")
            Spacer(modifier = Modifier.height(6.dp))
            BsIcon(bsIcon = BootstrapIcons.Filled.Mic, size = 48.dp)
        }
    }
}

@Composable
fun BootstrapVsMaterialIcons() {
    CommonIconDemoLayout(
        title = "Bootstrap (Top) vs Material (Bottom) Icons"
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            BsIcon(bsIcon = BootstrapIcons.Filled.Heart)
            Spacer(modifier = Modifier.height(6.dp))
            Icon(imageVector = Icons.Outlined.Favorite, contentDescription = "")
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            BsIcon(bsIcon = BootstrapIcons.Normal.Cart)
            Spacer(modifier = Modifier.height(6.dp))
            Icon(imageVector = Icons.Outlined.ShoppingCart, contentDescription = "")
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            BsIcon(bsIcon = BootstrapIcons.Filled.Lock)
            Spacer(modifier = Modifier.height(6.dp))
            Icon(imageVector = Icons.Filled.Lock, contentDescription = "")
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            BsIcon(bsIcon = BootstrapIcons.Normal.PersonSquare)
            Spacer(modifier = Modifier.height(6.dp))
            Icon(imageVector = Icons.Outlined.AccountBox, contentDescription = "")
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            BsIcon(bsIcon = BootstrapIcons.Filled.Telephone)
            Spacer(modifier = Modifier.height(6.dp))
            Icon(imageVector = Icons.Filled.Phone, contentDescription = "")
        }
    }
}

@Composable
fun UseDefaultIconComposable() {
    CommonIconDemoLayout(
        title = "Using default Icon composable"
    ) {
        Icon(imageVector = BootstrapIcons.Normal.Alarm, contentDescription = "")
        Icon(imageVector = BootstrapIcons.Normal.Archive, contentDescription = "")
        Icon(imageVector = BootstrapIcons.Normal.Badge8k, contentDescription = "")
        Icon(imageVector = BootstrapIcons.Normal.BarChart, contentDescription = "")
        Icon(imageVector = BootstrapIcons.Normal.CreditCard, contentDescription = "")
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreen(
    paddingValues: PaddingValues = PaddingValues(0.dp)
) {
    Box(
        Modifier
            .padding(paddingValues)
            .fillMaxSize()
    ) {
        LazyColumn(
            contentPadding = PaddingValues(
                horizontal = 16.dp
            ),
            verticalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            item {
                Spacer(Modifier.statusBarsHeight(additional = 56.dp))
            }
            item { NormalIcons() }
            item { FilledIcons() }
            item { BrandIcons() }
            item { TintedIcons() }
            item { ButtonIcons() }
            item { VariousSizeIcons() }
            item { BootstrapVsMaterialIcons() }
            item { UseDefaultIconComposable() }
            item {
                Spacer(Modifier.statusBarsHeight(additional = 24.dp))
            }
        }
        IconsWithActionBar()
    }
}