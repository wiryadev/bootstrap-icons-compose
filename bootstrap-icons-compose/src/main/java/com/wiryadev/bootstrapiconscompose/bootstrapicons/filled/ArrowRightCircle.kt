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
import com.wiryadev.bootstrapiconscompose.bootstrapicons.FilledGroup

public val FilledGroup.ArrowRightCircle: ImageVector
    get() {
        if (_arrowRightCircle != null) {
            return _arrowRightCircle!!
        }
        _arrowRightCircle = Builder(name = "ArrowRightCircle", defaultWidth = 16.0.dp, defaultHeight
                = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 0.0f, 16.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
                moveTo(4.5f, 7.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 1.0f)
                horizontalLineToRelative(5.793f)
                lineToRelative(-2.147f, 2.146f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.708f, 0.708f)
                lineToRelative(3.0f, -3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -0.708f)
                lineToRelative(-3.0f, -3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.708f, 0.708f)
                lineTo(10.293f, 7.5f)
                horizontalLineTo(4.5f)
                close()
            }
        }
        .build()
        return _arrowRightCircle!!
    }

private var _arrowRightCircle: ImageVector? = null
