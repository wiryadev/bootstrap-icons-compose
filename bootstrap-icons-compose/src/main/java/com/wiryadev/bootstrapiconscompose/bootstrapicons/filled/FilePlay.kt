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

public val FilePlay: ImageVector
    get() {
        if (_filePlay != null) {
            return _filePlay!!
        }
        _filePlay = Builder(name = "FilePlay", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                horizontalLineTo(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineTo(2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                close()
                moveTo(6.0f, 5.883f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.757f, -0.429f)
                lineToRelative(3.528f, 2.117f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 0.858f)
                lineToRelative(-3.528f, 2.117f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.757f, -0.43f)
                verticalLineTo(5.884f)
                close()
            }
        }
        .build()
        return _filePlay!!
    }

private var _filePlay: ImageVector? = null
