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

public val FileLock: ImageVector
    get() {
        if (_fileLock != null) {
            return _fileLock!!
        }
        _fileLock = Builder(name = "FileLock", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(6.0f, 8.3f)
                curveToRelative(0.0f, -0.042f, 0.02f, -0.107f, 0.105f, -0.175f)
                arcTo(0.637f, 0.637f, 0.0f, false, true, 6.5f, 8.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(0.64f, 0.64f, 0.0f, false, true, 0.395f, 0.125f)
                curveToRelative(0.085f, 0.068f, 0.105f, 0.133f, 0.105f, 0.175f)
                verticalLineToRelative(2.4f)
                curveToRelative(0.0f, 0.042f, -0.02f, 0.107f, -0.105f, 0.175f)
                arcTo(0.637f, 0.637f, 0.0f, false, true, 9.5f, 11.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(0.637f, 0.637f, 0.0f, false, true, -0.395f, -0.125f)
                curveTo(6.02f, 10.807f, 6.0f, 10.742f, 6.0f, 10.7f)
                verticalLineTo(8.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                lineTo(4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(14.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                close()
                moveTo(10.0f, 6.0f)
                verticalLineToRelative(1.076f)
                curveToRelative(0.54f, 0.166f, 1.0f, 0.597f, 1.0f, 1.224f)
                verticalLineToRelative(2.4f)
                curveToRelative(0.0f, 0.816f, -0.781f, 1.3f, -1.5f, 1.3f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.719f, 0.0f, -1.5f, -0.484f, -1.5f, -1.3f)
                lineTo(5.0f, 8.3f)
                curveToRelative(0.0f, -0.627f, 0.46f, -1.058f, 1.0f, -1.224f)
                lineTo(6.0f, 6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                close()
            }
        }
        .build()
        return _fileLock!!
    }

private var _fileLock: ImageVector? = null
