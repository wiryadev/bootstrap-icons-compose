package com.wiryadev.bootstrapiconscompose.bootstrapicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val EmojiHeartEyes: ImageVector
    get() {
        if (_emojiHeartEyes != null) {
            return _emojiHeartEyes!!
        }
        _emojiHeartEyes = Builder(name = "EmojiHeartEyes", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, 16.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 8.0f, 0.0f)
                close()
                moveTo(4.756f, 4.566f)
                curveToRelative(0.763f, -1.424f, 4.02f, -0.12f, 0.952f, 3.434f)
                curveToRelative(-4.496f, -1.596f, -2.35f, -4.298f, -0.952f, -3.434f)
                close()
                moveTo(11.315f, 10.014f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.548f, 0.736f)
                arcTo(4.498f, 4.498f, 0.0f, false, true, 7.965f, 13.0f)
                arcToRelative(4.498f, 4.498f, 0.0f, false, true, -3.898f, -2.25f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.548f, -0.736f)
                horizontalLineToRelative(0.005f)
                lineToRelative(0.017f, 0.005f)
                lineToRelative(0.067f, 0.015f)
                lineToRelative(0.252f, 0.055f)
                curveToRelative(0.215f, 0.046f, 0.515f, 0.108f, 0.857f, 0.169f)
                curveToRelative(0.693f, 0.124f, 1.522f, 0.242f, 2.152f, 0.242f)
                curveToRelative(0.63f, 0.0f, 1.46f, -0.118f, 2.152f, -0.242f)
                arcToRelative(26.58f, 26.58f, 0.0f, false, false, 1.109f, -0.224f)
                lineToRelative(0.067f, -0.015f)
                lineToRelative(0.017f, -0.004f)
                lineToRelative(0.005f, -0.002f)
                close()
                moveTo(11.245f, 4.566f)
                curveToRelative(1.397f, -0.864f, 3.543f, 1.838f, -0.953f, 3.434f)
                curveToRelative(-3.067f, -3.554f, 0.19f, -4.858f, 0.952f, -3.434f)
                close()
            }
        }
        .build()
        return _emojiHeartEyes!!
    }

private var _emojiHeartEyes: ImageVector? = null
