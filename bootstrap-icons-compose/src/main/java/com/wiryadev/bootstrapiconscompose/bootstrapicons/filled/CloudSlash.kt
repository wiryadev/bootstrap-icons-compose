package com.wiryadev.bootstrapiconscompose.bootstrapicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wiryadev.bootstrapiconscompose.bootstrapicons.FilledGroup

public val FilledGroup.CloudSlash: ImageVector
    get() {
        if (_cloudSlash != null) {
            return _cloudSlash!!
        }
        _cloudSlash = Builder(name = "CloudSlash", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.112f, 5.112f)
                arcToRelative(3.125f, 3.125f, 0.0f, false, false, -0.17f, 0.613f)
                curveTo(1.266f, 6.095f, 0.0f, 7.555f, 0.0f, 9.318f)
                curveTo(0.0f, 11.366f, 1.708f, 13.0f, 3.781f, 13.0f)
                lineTo(11.0f, 13.0f)
                lineTo(3.112f, 5.112f)
                close()
                moveTo(14.484f, 12.484f)
                lineTo(4.937f, 2.937f)
                arcTo(5.512f, 5.512f, 0.0f, false, true, 8.0f, 2.0f)
                curveToRelative(2.69f, 0.0f, 4.923f, 2.0f, 5.166f, 4.579f)
                curveTo(14.758f, 6.804f, 16.0f, 8.137f, 16.0f, 9.773f)
                arcToRelative(3.2f, 3.2f, 0.0f, false, true, -1.516f, 2.711f)
                close()
                moveTo(13.646f, 14.354f)
                lineTo(1.646f, 2.354f)
                lineTo(2.354f, 1.646f)
                lineTo(14.354f, 13.646f)
                lineTo(13.647f, 14.353f)
                close()
            }
        }
        .build()
        return _cloudSlash!!
    }

private var _cloudSlash: ImageVector? = null
