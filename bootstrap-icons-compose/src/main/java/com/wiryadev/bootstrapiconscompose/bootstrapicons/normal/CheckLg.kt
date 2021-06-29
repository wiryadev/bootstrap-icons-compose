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

public val NormalGroup.CheckLg: ImageVector
    get() {
        if (_checkLg != null) {
            return _checkLg!!
        }
        _checkLg = Builder(name = "CheckLg", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.485f, 1.431f)
                arcToRelative(1.473f, 1.473f, 0.0f, false, true, 2.104f, 2.062f)
                lineToRelative(-7.84f, 9.801f)
                arcToRelative(1.473f, 1.473f, 0.0f, false, true, -2.12f, 0.04f)
                lineTo(0.431f, 8.138f)
                arcToRelative(1.473f, 1.473f, 0.0f, false, true, 2.084f, -2.083f)
                lineToRelative(4.111f, 4.112f)
                lineToRelative(6.82f, -8.69f)
                arcToRelative(0.486f, 0.486f, 0.0f, false, true, 0.04f, -0.045f)
                close()
            }
        }
        .build()
        return _checkLg!!
    }

private var _checkLg: ImageVector? = null
