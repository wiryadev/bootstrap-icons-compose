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

public val FilledGroup.VolumeDown: ImageVector
    get() {
        if (_volumeDown != null) {
            return _volumeDown!!
        }
        _volumeDown = Builder(name = "VolumeDown", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.812f, -0.39f)
                lineTo(5.825f, 5.5f)
                lineTo(3.5f, 5.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 3.0f, 6.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(2.325f)
                lineToRelative(2.363f, 1.89f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 9.0f, 12.0f)
                lineTo(9.0f, 4.0f)
                close()
                moveTo(12.025f, 8.0f)
                arcToRelative(4.486f, 4.486f, 0.0f, false, true, -1.318f, 3.182f)
                lineTo(10.0f, 10.475f)
                arcTo(3.489f, 3.489f, 0.0f, false, false, 11.025f, 8.0f)
                arcTo(3.49f, 3.49f, 0.0f, false, false, 10.0f, 5.525f)
                lineToRelative(0.707f, -0.707f)
                arcTo(4.486f, 4.486f, 0.0f, false, true, 12.025f, 8.0f)
                close()
            }
        }
        .build()
        return _volumeDown!!
    }

private var _volumeDown: ImageVector? = null
