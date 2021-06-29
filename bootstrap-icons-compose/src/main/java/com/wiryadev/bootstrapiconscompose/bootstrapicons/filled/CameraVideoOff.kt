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

public val FilledGroup.CameraVideoOff: ImageVector
    get() {
        if (_cameraVideoOff != null) {
            return _cameraVideoOff!!
        }
        _cameraVideoOff = Builder(name = "CameraVideoOff", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.961f, 12.365f)
                arcToRelative(1.99f, 1.99f, 0.0f, false, false, 0.522f, -1.103f)
                lineToRelative(3.11f, 1.382f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.0f, 11.731f)
                lineTo(16.0f, 4.269f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.406f, -0.913f)
                lineToRelative(-3.111f, 1.382f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 9.5f, 3.0f)
                lineTo(4.272f, 3.0f)
                lineToRelative(6.69f, 9.365f)
                close()
                moveTo(0.847f, 3.365f)
                arcTo(2.001f, 2.001f, 0.0f, false, false, 0.0f, 5.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(5.728f)
                lineTo(0.847f, 3.366f)
                close()
                moveTo(10.593f, 15.29f)
                lineTo(0.593f, 1.29f)
                lineTo(1.407f, 0.71f)
                lineTo(11.407f, 14.71f)
                lineTo(10.593f, 15.29f)
                close()
            }
        }
        .build()
        return _cameraVideoOff!!
    }

private var _cameraVideoOff: ImageVector? = null
