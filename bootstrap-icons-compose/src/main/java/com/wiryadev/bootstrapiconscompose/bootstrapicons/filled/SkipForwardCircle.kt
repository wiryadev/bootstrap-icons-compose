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

public val SkipForwardCircle: ImageVector
    get() {
        if (_skipForwardCircle != null) {
            return _skipForwardCircle!!
        }
        _skipForwardCircle = Builder(name = "SkipForwardCircle", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 0.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(4.79f, 5.093f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 4.0f, 5.5f)
                verticalLineToRelative(5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.79f, 0.407f)
                lineTo(7.5f, 8.972f)
                verticalLineTo(10.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.79f, 0.407f)
                lineTo(11.0f, 8.972f)
                verticalLineTo(10.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                verticalLineToRelative(-5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.0f)
                verticalLineToRelative(1.528f)
                lineTo(8.29f, 5.093f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.79f, 0.407f)
                verticalLineToRelative(1.528f)
                lineTo(4.79f, 5.093f)
                close()
            }
        }
        .build()
        return _skipForwardCircle!!
    }

private var _skipForwardCircle: ImageVector? = null
