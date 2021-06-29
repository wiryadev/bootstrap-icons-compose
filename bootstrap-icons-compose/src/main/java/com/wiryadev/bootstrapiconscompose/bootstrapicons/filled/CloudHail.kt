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

public val FilledGroup.CloudHail: ImageVector
    get() {
        if (_cloudHail != null) {
            return _cloudHail!!
        }
        _cloudHail = Builder(name = "CloudHail", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.75f, 15.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.5f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                close()
                moveTo(4.158f, 11.526f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.316f, 0.632f)
                lineToRelative(-0.5f, 1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.948f, -0.316f)
                lineToRelative(0.5f, -1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.632f, -0.316f)
                close()
                moveTo(7.75f, 15.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.5f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                close()
                moveTo(8.158f, 11.526f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.316f, 0.632f)
                lineToRelative(-0.5f, 1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.948f, -0.316f)
                lineToRelative(0.5f, -1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.632f, -0.316f)
                close()
                moveTo(11.75f, 15.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.5f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                close()
                moveTo(12.158f, 11.526f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.316f, 0.632f)
                lineToRelative(-0.5f, 1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.948f, -0.316f)
                lineToRelative(0.5f, -1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.632f, -0.316f)
                close()
                moveTo(13.405f, 4.527f)
                arcToRelative(5.001f, 5.001f, 0.0f, false, false, -9.499f, -1.004f)
                arcTo(3.5f, 3.5f, 0.0f, true, false, 3.5f, 10.5f)
                lineTo(13.0f, 10.5f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.405f, -5.973f)
                close()
            }
        }
        .build()
        return _cloudHail!!
    }

private var _cloudHail: ImageVector? = null
