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

public val NormalGroup.TypeH1: ImageVector
    get() {
        if (_typeH1 != null) {
            return _typeH1!!
        }
        _typeH1 = Builder(name = "TypeH1", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.637f, 13.0f)
                lineTo(8.637f, 3.669f)
                lineTo(7.379f, 3.669f)
                lineTo(7.379f, 7.62f)
                lineTo(2.758f, 7.62f)
                lineTo(2.758f, 3.67f)
                lineTo(1.5f, 3.67f)
                lineTo(1.5f, 13.0f)
                horizontalLineToRelative(1.258f)
                lineTo(2.758f, 8.728f)
                horizontalLineToRelative(4.62f)
                lineTo(7.378f, 13.0f)
                horizontalLineToRelative(1.259f)
                close()
                moveTo(13.966f, 13.0f)
                lineTo(13.966f, 3.669f)
                horizontalLineToRelative(-1.244f)
                lineTo(10.5f, 5.316f)
                verticalLineToRelative(1.265f)
                lineToRelative(2.16f, -1.565f)
                horizontalLineToRelative(0.062f)
                lineTo(12.722f, 13.0f)
                horizontalLineToRelative(1.244f)
                close()
            }
        }
        .build()
        return _typeH1!!
    }

private var _typeH1: ImageVector? = null
