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

public val ExclamationOctagon: ImageVector
    get() {
        if (_exclamationOctagon != null) {
            return _exclamationOctagon!!
        }
        _exclamationOctagon = Builder(name = "ExclamationOctagon", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.46f, 0.146f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 11.107f, 0.0f)
                lineTo(4.893f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.353f, 0.146f)
                lineTo(0.146f, 4.54f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 0.0f, 4.893f)
                verticalLineToRelative(6.214f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.146f, 0.353f)
                lineToRelative(4.394f, 4.394f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.353f, 0.146f)
                horizontalLineToRelative(6.214f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.353f, -0.146f)
                lineToRelative(4.394f, -4.394f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.146f, -0.353f)
                lineTo(16.0f, 4.893f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.146f, -0.353f)
                lineTo(11.46f, 0.146f)
                close()
                moveTo(8.0f, 4.0f)
                curveToRelative(0.535f, 0.0f, 0.954f, 0.462f, 0.9f, 0.995f)
                lineToRelative(-0.35f, 3.507f)
                arcToRelative(0.552f, 0.552f, 0.0f, false, true, -1.1f, 0.0f)
                lineTo(7.1f, 4.995f)
                arcTo(0.905f, 0.905f, 0.0f, false, true, 8.0f, 4.0f)
                close()
                moveTo(8.002f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                close()
            }
        }
        .build()
        return _exclamationOctagon!!
    }

private var _exclamationOctagon: ImageVector? = null
