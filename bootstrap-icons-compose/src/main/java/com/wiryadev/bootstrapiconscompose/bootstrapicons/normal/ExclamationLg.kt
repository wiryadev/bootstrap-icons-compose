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

public val NormalGroup.ExclamationLg: ImageVector
    get() {
        if (_exclamationLg != null) {
            return _exclamationLg!!
        }
        _exclamationLg = Builder(name = "ExclamationLg", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.002f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                close()
                moveTo(6.197f, 1.99f)
                arcToRelative(1.81f, 1.81f, 0.0f, true, true, 3.602f, 0.0f)
                lineToRelative(-0.701f, 7.015f)
                arcToRelative(1.105f, 1.105f, 0.0f, false, true, -2.2f, 0.0f)
                lineToRelative(-0.7f, -7.015f)
                close()
            }
        }
        .build()
        return _exclamationLg!!
    }

private var _exclamationLg: ImageVector? = null
