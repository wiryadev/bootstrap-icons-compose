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

public val Sticky: ImageVector
    get() {
        if (_sticky != null) {
            return _sticky!!
        }
        _sticky = Builder(name = "Sticky", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.5f, 1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 1.0f, 2.5f)
                verticalLineToRelative(11.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 2.5f, 15.0f)
                horizontalLineToRelative(6.086f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.06f, -0.44f)
                lineToRelative(4.915f, -4.914f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 15.0f, 8.586f)
                lineTo(15.0f, 2.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 13.5f, 1.0f)
                horizontalLineToRelative(-11.0f)
                close()
                moveTo(8.5f, 9.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(4.396f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.177f, 0.427f)
                lineToRelative(-5.146f, 5.146f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.427f, -0.177f)
                lineTo(8.5f, 9.5f)
                close()
            }
        }
        .build()
        return _sticky!!
    }

private var _sticky: ImageVector? = null
