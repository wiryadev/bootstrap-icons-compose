package com.wiryadev.bootstrapiconscompose.bootstrapicons.normal

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wiryadev.bootstrapiconscompose.bootstrapicons.NormalGroup

public val NormalGroup.Compass: ImageVector
    get() {
        if (_compass != null) {
            return _compass!!
        }
        _compass = Builder(name = "Compass", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 16.016f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, 1.962f, -14.74f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 0.0f)
                lineTo(7.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.962f, 1.276f)
                arcTo(7.5f, 7.5f, 0.0f, false, false, 8.0f, 16.016f)
                close()
                moveTo(14.5f, 8.516f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, true, -13.0f, 0.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 13.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.94f, 7.44f)
                lineToRelative(4.95f, -2.83f)
                lineToRelative(-2.83f, 4.95f)
                lineToRelative(-4.949f, 2.83f)
                lineToRelative(2.828f, -4.95f)
                close()
            }
        }
        .build()
        return _compass!!
    }

private var _compass: ImageVector? = null
