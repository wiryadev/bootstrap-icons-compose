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

public val FilledGroup.ChatDots: ImageVector
    get() {
        if (_chatDots != null) {
            return _chatDots!!
        }
        _chatDots = Builder(name = "ChatDots", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.0f)
                curveToRelative(0.0f, 3.866f, -3.582f, 7.0f, -8.0f, 7.0f)
                arcToRelative(9.06f, 9.06f, 0.0f, false, true, -2.347f, -0.306f)
                curveToRelative(-0.584f, 0.296f, -1.925f, 0.864f, -4.181f, 1.234f)
                curveToRelative(-0.2f, 0.032f, -0.352f, -0.176f, -0.273f, -0.362f)
                curveToRelative(0.354f, -0.836f, 0.674f, -1.95f, 0.77f, -2.966f)
                curveTo(0.744f, 11.37f, 0.0f, 9.76f, 0.0f, 8.0f)
                curveToRelative(0.0f, -3.866f, 3.582f, -7.0f, 8.0f, -7.0f)
                reflectiveCurveToRelative(8.0f, 3.134f, 8.0f, 7.0f)
                close()
                moveTo(5.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                close()
                moveTo(9.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                close()
                moveTo(12.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                close()
            }
        }
        .build()
        return _chatDots!!
    }

private var _chatDots: ImageVector? = null
