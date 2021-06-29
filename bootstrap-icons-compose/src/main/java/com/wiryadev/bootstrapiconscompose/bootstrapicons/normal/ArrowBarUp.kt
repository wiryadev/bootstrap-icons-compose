package com.wiryadev.bootstrapiconscompose.bootstrapicons.normal

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wiryadev.bootstrapiconscompose.bootstrapicons.NormalGroup

public val NormalGroup.ArrowBarUp: ImageVector
    get() {
        if (_arrowBarUp != null) {
            return _arrowBarUp!!
        }
        _arrowBarUp = Builder(name = "ArrowBarUp", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.0f, 10.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                lineTo(8.5f, 3.707f)
                lineToRelative(2.146f, 2.147f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.708f, -0.708f)
                lineToRelative(-3.0f, -3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.708f, 0.0f)
                lineToRelative(-3.0f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.708f, 0.708f)
                lineTo(7.5f, 3.707f)
                lineTo(7.5f, 9.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                close()
                moveTo(1.0f, 12.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(13.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineToRelative(-13.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                close()
            }
        }
        .build()
        return _arrowBarUp!!
    }

private var _arrowBarUp: ImageVector? = null
