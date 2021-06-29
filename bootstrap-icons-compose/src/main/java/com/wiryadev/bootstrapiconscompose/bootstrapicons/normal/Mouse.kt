package com.wiryadev.bootstrapiconscompose.bootstrapicons.normal

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wiryadev.bootstrapiconscompose.bootstrapicons.NormalGroup

public val NormalGroup.Mouse: ImageVector
    get() {
        if (_mouse != null) {
            return _mouse!!
        }
        _mouse = Builder(name = "Mouse", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                verticalLineToRelative(-2.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 8.0f, 3.0f)
                close()
                moveTo(12.0f, 11.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(4.0f, 5.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(8.0f, 0.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -5.0f, 5.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 10.0f, 0.0f)
                lineTo(13.0f, 5.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -5.0f, -5.0f)
                close()
            }
        }
        .build()
        return _mouse!!
    }

private var _mouse: ImageVector? = null
