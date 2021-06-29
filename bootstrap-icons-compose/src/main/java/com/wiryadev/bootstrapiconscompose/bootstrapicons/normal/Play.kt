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

public val NormalGroup.Play: ImageVector
    get() {
        if (_play != null) {
            return _play!!
        }
        _play = Builder(name = "Play", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.804f, 8.0f)
                lineTo(5.0f, 4.633f)
                verticalLineToRelative(6.734f)
                lineTo(10.804f, 8.0f)
                close()
                moveTo(11.596f, 7.304f)
                arcToRelative(0.802f, 0.802f, 0.0f, false, true, 0.0f, 1.392f)
                lineToRelative(-6.363f, 3.692f)
                curveTo(4.713f, 12.69f, 4.0f, 12.345f, 4.0f, 11.692f)
                lineTo(4.0f, 4.308f)
                curveToRelative(0.0f, -0.653f, 0.713f, -0.998f, 1.233f, -0.696f)
                lineToRelative(6.363f, 3.692f)
                close()
            }
        }
        .build()
        return _play!!
    }

private var _play: ImageVector? = null
