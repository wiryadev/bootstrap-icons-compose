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

public val PieChart: ImageVector
    get() {
        if (_pieChart != null) {
            return _pieChart!!
        }
        _pieChart = Builder(name = "PieChart", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.985f, 8.5f)
                horizontalLineTo(8.207f)
                lineToRelative(-5.5f, 5.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.277f, -5.5f)
                close()
                moveTo(2.0f, 13.292f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 7.5f, 0.015f)
                verticalLineToRelative(7.778f)
                lineToRelative(-5.5f, 5.5f)
                close()
                moveTo(8.5f, 0.015f)
                verticalLineTo(7.5f)
                horizontalLineToRelative(7.485f)
                arcTo(8.001f, 8.001f, 0.0f, false, false, 8.5f, 0.015f)
                close()
            }
        }
        .build()
        return _pieChart!!
    }

private var _pieChart: ImageVector? = null
