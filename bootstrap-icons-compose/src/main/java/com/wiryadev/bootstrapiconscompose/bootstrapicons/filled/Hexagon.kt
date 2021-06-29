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

public val FilledGroup.Hexagon: ImageVector
    get() {
        if (_hexagon != null) {
            return _hexagon!!
        }
        _hexagon = Builder(name = "Hexagon", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.5f, 0.134f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 0.0f)
                lineToRelative(-6.0f, 3.577f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.5f, 0.866f)
                verticalLineToRelative(6.846f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.5f, 0.866f)
                lineToRelative(6.0f, 3.577f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 0.0f)
                lineToRelative(6.0f, -3.577f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.5f, -0.866f)
                verticalLineTo(4.577f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.5f, -0.866f)
                lineTo(8.5f, 0.134f)
                close()
            }
        }
        .build()
        return _hexagon!!
    }

private var _hexagon: ImageVector? = null
