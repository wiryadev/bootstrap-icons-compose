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

public val InfoSquare: ImageVector
    get() {
        if (_infoSquare != null) {
            return _infoSquare!!
        }
        _infoSquare = Builder(name = "InfoSquare", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(2.0f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(0.0f, 2.0f)
                close()
                moveTo(8.93f, 6.588f)
                lineTo(6.64f, 6.875f)
                lineTo(6.558f, 7.255f)
                lineTo(7.008f, 7.338f)
                curveToRelative(0.294f, 0.07f, 0.352f, 0.176f, 0.288f, 0.469f)
                lineToRelative(-0.738f, 3.468f)
                curveToRelative(-0.194f, 0.897f, 0.105f, 1.319f, 0.808f, 1.319f)
                curveToRelative(0.545f, 0.0f, 1.178f, -0.252f, 1.465f, -0.598f)
                lineToRelative(0.088f, -0.416f)
                curveToRelative(-0.2f, 0.176f, -0.492f, 0.246f, -0.686f, 0.246f)
                curveToRelative(-0.275f, 0.0f, -0.375f, -0.193f, -0.304f, -0.533f)
                lineTo(8.93f, 6.588f)
                close()
                moveTo(8.0f, 5.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                close()
            }
        }
        .build()
        return _infoSquare!!
    }

private var _infoSquare: ImageVector? = null
