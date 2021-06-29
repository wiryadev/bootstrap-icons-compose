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

public val Trash2: ImageVector
    get() {
        if (_trash2 != null) {
            return _trash2!!
        }
        _trash2 = Builder(name = "Trash2", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.037f, 3.225f)
                arcTo(0.703f, 0.703f, 0.0f, false, true, 2.0f, 3.0f)
                curveToRelative(0.0f, -1.105f, 2.686f, -2.0f, 6.0f, -2.0f)
                reflectiveCurveToRelative(6.0f, 0.895f, 6.0f, 2.0f)
                arcToRelative(0.702f, 0.702f, 0.0f, false, true, -0.037f, 0.225f)
                lineToRelative(-1.684f, 10.104f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.305f, 15.0f)
                lineTo(5.694f, 15.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.973f, -1.671f)
                lineTo(2.037f, 3.225f)
                close()
                moveTo(11.927f, 2.535f)
                curveTo(10.966f, 2.214f, 9.578f, 2.0f, 8.0f, 2.0f)
                curveToRelative(-1.58f, 0.0f, -2.968f, 0.215f, -3.926f, 0.534f)
                curveToRelative(-0.477f, 0.16f, -0.795f, 0.327f, -0.975f, 0.466f)
                curveToRelative(0.18f, 0.14f, 0.498f, 0.307f, 0.975f, 0.466f)
                curveTo(5.032f, 3.786f, 6.42f, 4.0f, 8.0f, 4.0f)
                reflectiveCurveToRelative(2.967f, -0.215f, 3.926f, -0.534f)
                curveToRelative(0.477f, -0.16f, 0.795f, -0.327f, 0.975f, -0.466f)
                curveToRelative(-0.18f, -0.14f, -0.498f, -0.307f, -0.975f, -0.466f)
                close()
            }
        }
        .build()
        return _trash2!!
    }

private var _trash2: ImageVector? = null
