package com.wiryadev.bootstrapiconscompose.bootstrapicons.normal

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wiryadev.bootstrapiconscompose.bootstrapicons.NormalGroup

public val NormalGroup.Outlet: ImageVector
    get() {
        if (_outlet != null) {
            return _outlet!!
        }
        _outlet = Builder(name = "Outlet", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.34f, 2.994f)
                curveToRelative(0.275f, -0.338f, 0.68f, -0.494f, 1.074f, -0.494f)
                horizontalLineToRelative(7.172f)
                curveToRelative(0.393f, 0.0f, 0.798f, 0.156f, 1.074f, 0.494f)
                curveToRelative(0.578f, 0.708f, 1.84f, 2.534f, 1.84f, 5.006f)
                curveToRelative(0.0f, 2.472f, -1.262f, 4.297f, -1.84f, 5.006f)
                curveToRelative(-0.276f, 0.338f, -0.68f, 0.494f, -1.074f, 0.494f)
                lineTo(4.414f, 13.5f)
                curveToRelative(-0.394f, 0.0f, -0.799f, -0.156f, -1.074f, -0.494f)
                curveTo(2.762f, 12.297f, 1.5f, 10.472f, 1.5f, 8.0f)
                curveToRelative(0.0f, -2.472f, 1.262f, -4.297f, 1.84f, -5.006f)
                close()
                moveTo(4.414f, 3.5f)
                arcToRelative(0.376f, 0.376f, 0.0f, false, false, -0.299f, 0.126f)
                curveTo(3.599f, 4.259f, 2.5f, 5.863f, 2.5f, 8.0f)
                curveToRelative(0.0f, 2.137f, 1.099f, 3.74f, 1.615f, 4.374f)
                curveToRelative(0.06f, 0.073f, 0.163f, 0.126f, 0.3f, 0.126f)
                horizontalLineToRelative(7.17f)
                curveToRelative(0.137f, 0.0f, 0.24f, -0.053f, 0.3f, -0.126f)
                curveToRelative(0.516f, -0.633f, 1.615f, -2.237f, 1.615f, -4.374f)
                curveToRelative(0.0f, -2.137f, -1.099f, -3.74f, -1.615f, -4.374f)
                arcToRelative(0.376f, 0.376f, 0.0f, false, false, -0.3f, -0.126f)
                horizontalLineToRelative(-7.17f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 5.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                lineTo(5.5f, 6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                close()
                moveTo(10.0f, 5.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                lineTo(9.5f, 6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                close()
                moveTo(7.0f, 10.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                close()
            }
        }
        .build()
        return _outlet!!
    }

private var _outlet: ImageVector? = null
