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

public val FileEarmarkBinary: ImageVector
    get() {
        if (_fileEarmarkBinary != null) {
            return _fileEarmarkBinary!!
        }
        _fileEarmarkBinary = Builder(name = "FileEarmarkBinary", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.526f, 10.273f)
                curveToRelative(-0.542f, 0.0f, -0.832f, 0.563f, -0.832f, 1.612f)
                curveToRelative(0.0f, 0.088f, 0.003f, 0.173f, 0.006f, 0.252f)
                lineToRelative(1.559f, -1.143f)
                curveToRelative(-0.126f, -0.474f, -0.375f, -0.72f, -0.733f, -0.72f)
                close()
                moveTo(4.794f, 12.781f)
                curveToRelative(0.126f, 0.472f, 0.372f, 0.718f, 0.732f, 0.718f)
                curveToRelative(0.54f, 0.0f, 0.83f, -0.563f, 0.83f, -1.614f)
                curveToRelative(0.0f, -0.085f, -0.003f, -0.17f, -0.006f, -0.25f)
                lineToRelative(-1.556f, 1.146f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.293f, 0.0f)
                lineTo(4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(14.0f, 4.707f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.707f, 4.0f)
                lineTo(10.0f, 0.293f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.293f, 0.0f)
                close()
                moveTo(9.5f, 3.5f)
                verticalLineToRelative(-2.0f)
                lineToRelative(3.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                close()
                moveTo(7.05f, 11.885f)
                curveToRelative(0.0f, 1.415f, -0.548f, 2.206f, -1.524f, 2.206f)
                curveTo(4.548f, 14.09f, 4.0f, 13.3f, 4.0f, 11.885f)
                curveToRelative(0.0f, -1.412f, 0.548f, -2.203f, 1.526f, -2.203f)
                curveToRelative(0.976f, 0.0f, 1.524f, 0.79f, 1.524f, 2.203f)
                close()
                moveTo(10.855f, 13.405f)
                lineTo(10.855f, 14.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-0.595f)
                horizontalLineToRelative(1.181f)
                lineTo(9.036f, 10.5f)
                horizontalLineToRelative(-0.05f)
                lineToRelative(-1.136f, 0.747f)
                verticalLineToRelative(-0.688f)
                lineToRelative(1.19f, -0.786f)
                horizontalLineToRelative(0.69f)
                verticalLineToRelative(3.633f)
                horizontalLineToRelative(1.125f)
                close()
            }
        }
        .build()
        return _fileEarmarkBinary!!
    }

private var _fileEarmarkBinary: ImageVector? = null
