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

public val NormalGroup.ExclamationOctagon: ImageVector
    get() {
        if (_exclamationOctagon != null) {
            return _exclamationOctagon!!
        }
        _exclamationOctagon = Builder(name = "ExclamationOctagon", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.54f, 0.146f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 4.893f, 0.0f)
                horizontalLineToRelative(6.214f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.353f, 0.146f)
                lineToRelative(4.394f, 4.394f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.146f, 0.353f)
                verticalLineToRelative(6.214f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.146f, 0.353f)
                lineToRelative(-4.394f, 4.394f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.353f, 0.146f)
                horizontalLineTo(4.893f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.353f, -0.146f)
                lineTo(0.146f, 11.46f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 0.0f, 11.107f)
                verticalLineTo(4.893f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.146f, -0.353f)
                lineTo(4.54f, 0.146f)
                close()
                moveTo(5.1f, 1.0f)
                lineTo(1.0f, 5.1f)
                verticalLineToRelative(5.8f)
                lineTo(5.1f, 15.0f)
                horizontalLineToRelative(5.8f)
                lineToRelative(4.1f, -4.1f)
                verticalLineTo(5.1f)
                lineTo(10.9f, 1.0f)
                horizontalLineTo(5.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.002f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                close()
                moveTo(7.1f, 4.995f)
                arcToRelative(0.905f, 0.905f, 0.0f, true, true, 1.8f, 0.0f)
                lineToRelative(-0.35f, 3.507f)
                arcToRelative(0.552f, 0.552f, 0.0f, false, true, -1.1f, 0.0f)
                lineTo(7.1f, 4.995f)
                close()
            }
        }
        .build()
        return _exclamationOctagon!!
    }

private var _exclamationOctagon: ImageVector? = null
