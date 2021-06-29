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

public val NormalGroup.PentagonHalf: ImageVector
    get() {
        if (_pentagonHalf != null) {
            return _pentagonHalf!!
        }
        _pentagonHalf = Builder(name = "PentagonHalf", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 1.288f)
                lineToRelative(6.842f, 5.56f)
                lineTo(12.267f, 15.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(1.288f)
                close()
                moveTo(16.0f, 6.5f)
                lineTo(8.0f, 0.0f)
                lineTo(0.0f, 6.5f)
                lineTo(3.0f, 16.0f)
                horizontalLineToRelative(10.0f)
                lineToRelative(3.0f, -9.5f)
                close()
            }
        }
        .build()
        return _pentagonHalf!!
    }

private var _pentagonHalf: ImageVector? = null
