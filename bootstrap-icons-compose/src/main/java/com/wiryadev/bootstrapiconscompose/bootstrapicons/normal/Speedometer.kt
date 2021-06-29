package com.wiryadev.bootstrapiconscompose.bootstrapicons.normal

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val NormalGroup.Speedometer: ImageVector
    get() {
        if (_speedometer != null) {
            return _speedometer!!
        }
        _speedometer = Builder(name = "Speedometer", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                lineTo(8.5f, 4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                lineTo(7.5f, 2.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 8.0f, 2.0f)
                close()
                moveTo(3.732f, 3.732f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.707f, 0.0f)
                lineToRelative(0.915f, 0.914f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.708f, 0.708f)
                lineToRelative(-0.914f, -0.915f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -0.707f)
                close()
                moveTo(2.0f, 8.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(1.586f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(2.5f, 8.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 2.0f, 8.0f)
                close()
                moveTo(11.5f, 8.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(12.0f, 8.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                close()
                moveTo(12.254f, 3.754f)
                arcToRelative(0.389f, 0.389f, 0.0f, false, false, -0.527f, -0.02f)
                lineTo(7.547f, 7.31f)
                arcTo(0.91f, 0.91f, 0.0f, true, false, 8.85f, 8.569f)
                lineToRelative(3.434f, -4.297f)
                arcToRelative(0.389f, 0.389f, 0.0f, false, false, -0.029f, -0.518f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.664f, 15.889f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 9.336f, 0.11f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -2.672f, 15.78f)
                close()
                moveTo(1.999f, 11.606f)
                arcTo(11.945f, 11.945f, 0.0f, false, true, 8.0f, 10.0f)
                curveToRelative(2.186f, 0.0f, 4.236f, 0.585f, 6.001f, 1.606f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, false, -12.002f, 0.0f)
                close()
            }
        }
        .build()
        return _speedometer!!
    }

private var _speedometer: ImageVector? = null
