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

public val NormalGroup.BorderAll: ImageVector
    get() {
        if (_borderAll != null) {
            return _borderAll!!
        }
        _borderAll = Builder(name = "BorderAll", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(16.0f)
                lineTo(0.0f, 16.0f)
                lineTo(0.0f, 0.0f)
                close()
                moveTo(1.0f, 1.0f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(6.5f)
                lineTo(7.5f, 1.0f)
                lineTo(1.0f, 1.0f)
                close()
                moveTo(8.5f, 1.0f)
                verticalLineToRelative(6.5f)
                lineTo(15.0f, 7.5f)
                lineTo(15.0f, 1.0f)
                lineTo(8.5f, 1.0f)
                close()
                moveTo(15.0f, 8.5f)
                lineTo(8.5f, 8.5f)
                lineTo(8.5f, 15.0f)
                lineTo(15.0f, 15.0f)
                lineTo(15.0f, 8.5f)
                close()
                moveTo(7.5f, 15.0f)
                lineTo(7.5f, 8.5f)
                lineTo(1.0f, 8.5f)
                lineTo(1.0f, 15.0f)
                horizontalLineToRelative(6.5f)
                close()
            }
        }
        .build()
        return _borderAll!!
    }

private var _borderAll: ImageVector? = null
