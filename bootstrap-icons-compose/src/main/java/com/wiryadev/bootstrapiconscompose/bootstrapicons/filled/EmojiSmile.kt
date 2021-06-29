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
import com.wiryadev.bootstrapiconscompose.bootstrapicons.FilledGroup

public val FilledGroup.EmojiSmile: ImageVector
    get() {
        if (_emojiSmile != null) {
            return _emojiSmile!!
        }
        _emojiSmile = Builder(name = "EmojiSmile", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 16.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 8.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                close()
                moveTo(7.0f, 6.5f)
                curveTo(7.0f, 7.328f, 6.552f, 8.0f, 6.0f, 8.0f)
                reflectiveCurveToRelative(-1.0f, -0.672f, -1.0f, -1.5f)
                reflectiveCurveTo(5.448f, 5.0f, 6.0f, 5.0f)
                reflectiveCurveToRelative(1.0f, 0.672f, 1.0f, 1.5f)
                close()
                moveTo(4.285f, 9.567f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.683f, 0.183f)
                arcTo(3.498f, 3.498f, 0.0f, false, false, 8.0f, 11.5f)
                arcToRelative(3.498f, 3.498f, 0.0f, false, false, 3.032f, -1.75f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.866f, 0.5f)
                arcTo(4.498f, 4.498f, 0.0f, false, true, 8.0f, 12.5f)
                arcToRelative(4.498f, 4.498f, 0.0f, false, true, -3.898f, -2.25f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.183f, -0.683f)
                close()
                moveTo(10.0f, 8.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.672f, -1.0f, -1.5f)
                reflectiveCurveTo(9.448f, 5.0f, 10.0f, 5.0f)
                reflectiveCurveToRelative(1.0f, 0.672f, 1.0f, 1.5f)
                reflectiveCurveTo(10.552f, 8.0f, 10.0f, 8.0f)
                close()
            }
        }
        .build()
        return _emojiSmile!!
    }

private var _emojiSmile: ImageVector? = null
