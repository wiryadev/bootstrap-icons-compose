package com.wiryadev.bootstrapiconscompose.bootstrapicons.normal

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wiryadev.bootstrapiconscompose.bootstrapicons.NormalGroup

public val NormalGroup.CheckAll: ImageVector
    get() {
        if (_checkAll != null) {
            return _checkAll!!
        }
        _checkAll = Builder(name = "CheckAll", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.97f, 4.97f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.07f, 1.05f)
                lineToRelative(-3.99f, 4.99f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.08f, 0.02f)
                lineTo(2.324f, 8.384f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.06f, -1.06f)
                lineToRelative(2.094f, 2.093f)
                lineTo(8.95f, 4.992f)
                arcToRelative(0.252f, 0.252f, 0.0f, false, true, 0.02f, -0.022f)
                close()
                moveTo(8.05f, 10.11f)
                lineTo(8.97f, 11.03f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.079f, -0.02f)
                lineToRelative(3.992f, -4.99f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.091f, -1.028f)
                lineTo(9.477f, 9.417f)
                lineToRelative(-0.485f, -0.486f)
                lineToRelative(-0.943f, 1.179f)
                close()
            }
        }
        .build()
        return _checkAll!!
    }

private var _checkAll: ImageVector? = null
