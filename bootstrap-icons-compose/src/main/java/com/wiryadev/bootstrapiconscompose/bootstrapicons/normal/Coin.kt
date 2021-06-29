package com.wiryadev.bootstrapiconscompose.bootstrapicons.normal

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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

public val NormalGroup.Coin: ImageVector
    get() {
        if (_coin != null) {
            return _coin!!
        }
        _coin = Builder(name = "Coin", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5f, 9.511f)
                curveToRelative(0.076f, 0.954f, 0.83f, 1.697f, 2.182f, 1.785f)
                lineTo(7.682f, 12.0f)
                horizontalLineToRelative(0.6f)
                verticalLineToRelative(-0.709f)
                curveToRelative(1.4f, -0.098f, 2.218f, -0.846f, 2.218f, -1.932f)
                curveToRelative(0.0f, -0.987f, -0.626f, -1.496f, -1.745f, -1.76f)
                lineToRelative(-0.473f, -0.112f)
                lineTo(8.282f, 5.57f)
                curveToRelative(0.6f, 0.068f, 0.982f, 0.396f, 1.074f, 0.85f)
                horizontalLineToRelative(1.052f)
                curveToRelative(-0.076f, -0.919f, -0.864f, -1.638f, -2.126f, -1.716f)
                lineTo(8.282f, 4.0f)
                horizontalLineToRelative(-0.6f)
                verticalLineToRelative(0.719f)
                curveToRelative(-1.195f, 0.117f, -2.01f, 0.836f, -2.01f, 1.853f)
                curveToRelative(0.0f, 0.9f, 0.606f, 1.472f, 1.613f, 1.707f)
                lineToRelative(0.397f, 0.098f)
                verticalLineToRelative(2.034f)
                curveToRelative(-0.615f, -0.093f, -1.022f, -0.43f, -1.114f, -0.9f)
                lineTo(5.5f, 9.511f)
                close()
                moveTo(7.677f, 7.345f)
                curveToRelative(-0.59f, -0.137f, -0.91f, -0.416f, -0.91f, -0.836f)
                curveToRelative(0.0f, -0.47f, 0.345f, -0.822f, 0.915f, -0.925f)
                verticalLineToRelative(1.76f)
                horizontalLineToRelative(-0.005f)
                close()
                moveTo(8.369f, 8.538f)
                curveToRelative(0.717f, 0.166f, 1.048f, 0.435f, 1.048f, 0.91f)
                curveToRelative(0.0f, 0.542f, -0.412f, 0.914f, -1.135f, 0.982f)
                lineTo(8.282f, 8.518f)
                lineToRelative(0.087f, 0.02f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.0f, 15.0f)
                arcTo(7.0f, 7.0f, 0.0f, true, false, 8.0f, 1.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 0.0f, 14.0f)
                close()
                moveTo(8.0f, 16.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 8.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.0f, 13.5f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, 0.0f, -11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 0.0f, 11.0f)
                close()
                moveTo(8.0f, 14.0f)
                arcTo(6.0f, 6.0f, 0.0f, true, false, 8.0f, 2.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                close()
            }
        }
        .build()
        return _coin!!
    }

private var _coin: ImageVector? = null
