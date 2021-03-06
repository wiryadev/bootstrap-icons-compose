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

public val FilledGroup.Grid: ImageVector
    get() {
        if (_grid != null) {
            return _grid!!
        }
        _grid = Builder(name = "Grid", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 2.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 2.5f, 1.0f)
                horizontalLineToRelative(3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.0f, 2.5f)
                verticalLineToRelative(3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.5f, 7.0f)
                horizontalLineToRelative(-3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 1.0f, 5.5f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(9.0f, 2.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 10.5f, 1.0f)
                horizontalLineToRelative(3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 15.0f, 2.5f)
                verticalLineToRelative(3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 13.5f, 7.0f)
                horizontalLineToRelative(-3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 9.0f, 5.5f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(1.0f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 2.5f, 9.0f)
                horizontalLineToRelative(3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.0f, 10.5f)
                verticalLineToRelative(3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.5f, 15.0f)
                horizontalLineToRelative(-3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 1.0f, 13.5f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(9.0f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 10.5f, 9.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, 1.5f)
                verticalLineToRelative(3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 9.0f, 13.5f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _grid!!
    }

private var _grid: ImageVector? = null
