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

public val NormalGroup.ArrowDownCircle: ImageVector
    get() {
        if (_arrowDownCircle != null) {
            return _arrowDownCircle!!
        }
        _arrowDownCircle = Builder(name = "ArrowDownCircle", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.0f, 8.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, false, 14.0f, 0.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 1.0f, 8.0f)
                close()
                moveTo(16.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 0.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(8.5f, 4.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.0f)
                verticalLineToRelative(5.793f)
                lineTo(5.354f, 8.146f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.708f, 0.708f)
                lineToRelative(3.0f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.708f, 0.0f)
                lineToRelative(3.0f, -3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.708f, -0.708f)
                lineTo(8.5f, 10.293f)
                lineTo(8.5f, 4.5f)
                close()
            }
        }
        .build()
        return _arrowDownCircle!!
    }

private var _arrowDownCircle: ImageVector? = null
