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

public val Easel: ImageVector
    get() {
        if (_easel != null) {
            return _easel!!
        }
        _easel = Builder(name = "Easel", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.473f, 0.337f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.946f, 0.0f)
                lineTo(6.954f, 2.0f)
                horizontalLineTo(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(1.85f)
                lineToRelative(-1.323f, 3.837f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.946f, 0.326f)
                lineTo(4.908f, 11.0f)
                horizontalLineTo(7.5f)
                verticalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                verticalLineTo(11.0f)
                horizontalLineToRelative(2.592f)
                lineToRelative(1.435f, 4.163f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.946f, -0.326f)
                lineTo(12.15f, 11.0f)
                horizontalLineTo(14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineTo(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineTo(9.046f)
                lineTo(8.473f, 0.337f)
                close()
            }
        }
        .build()
        return _easel!!
    }

private var _easel: ImageVector? = null
