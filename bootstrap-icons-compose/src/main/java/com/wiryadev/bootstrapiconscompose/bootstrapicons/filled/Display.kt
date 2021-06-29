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

public val Display: ImageVector
    get() {
        if (_display != null) {
            return _display!!
        }
        _display = Builder(name = "Display", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 12.0f)
                curveToRelative(0.0f, 0.667f, -0.083f, 1.167f, -0.25f, 1.5f)
                horizontalLineTo(5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                horizontalLineToRelative(-0.75f)
                curveToRelative(-0.167f, -0.333f, -0.25f, -0.833f, -0.25f, -1.5f)
                horizontalLineToRelative(4.0f)
                curveToRelative(2.0f, 0.0f, 2.0f, -2.0f, 2.0f, -2.0f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -2.0f, -2.0f, -2.0f, -2.0f, -2.0f)
                horizontalLineTo(2.0f)
                curveTo(0.0f, 2.0f, 0.0f, 4.0f, 0.0f, 4.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _display!!
    }

private var _display: ImageVector? = null
