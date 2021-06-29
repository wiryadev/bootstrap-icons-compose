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

public val Tv: ImageVector
    get() {
        if (_tv != null) {
            return _tv!!
        }
        _tv = Builder(name = "Tv", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth =
                16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.5f, 13.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 3.0f, 13.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineTo(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                close()
                moveTo(2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                reflectiveCurveToRelative(2.0f, 0.0f, 2.0f, 2.0f)
                verticalLineToRelative(6.0f)
                reflectiveCurveToRelative(0.0f, 2.0f, -2.0f, 2.0f)
                horizontalLineTo(2.0f)
                reflectiveCurveToRelative(-2.0f, 0.0f, -2.0f, -2.0f)
                verticalLineTo(4.0f)
                reflectiveCurveToRelative(0.0f, -2.0f, 2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _tv!!
    }

private var _tv: ImageVector? = null
