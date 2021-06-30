package com.wiryadev.bootstrapiconscompose

import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.LocalContentAlpha
import androidx.compose.material.LocalContentColor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * Icon component for Bootstrap Icon to standardize size with Material Icon
 *
 * @param bsIcon [ImageVector] to draw inside this Icon
 * @param modifier optional [Modifier] for this Icon
 * @param contentDescription text used by accessibility services to describe what this icon
 * represents. This should always be provided unless this icon is used for decorative purposes,
 * and does not represent a meaningful action that a user can take. This text should be
 * localized, such as by using [androidx.compose.ui.res.stringResource] or similar
 * @param size to declare the preferred size of the icon, defaulting to 24.dp
 * @param tint tint to be applied to [bsIcon]. If [Color.Unspecified] is provided, then no
 *  tint is applied
 */
@Composable
fun BsIcon(
    bsIcon: ImageVector,
    modifier: Modifier = Modifier,
    contentDescription: String? = null,
    size: Dp = 24.dp,
    tint: Color = LocalContentColor.current.copy(alpha = LocalContentAlpha.current)
) {
    Icon(
        painter = rememberVectorPainter(bsIcon),
        contentDescription = contentDescription,
        modifier = modifier.size(size),
        tint = tint
    )
}