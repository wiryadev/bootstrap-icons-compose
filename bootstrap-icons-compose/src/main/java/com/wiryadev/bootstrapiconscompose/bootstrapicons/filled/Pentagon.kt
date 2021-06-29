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

public val FilledGroup.Pentagon: ImageVector
    get() {
        if (_pentagon != null) {
            return _pentagon!!
        }
        _pentagon = Builder(name = "Pentagon", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.0f, 0.0f)
                lineToRelative(8.0f, 6.5f)
                lineToRelative(-3.0f, 9.5f)
                horizontalLineTo(3.0f)
                lineTo(0.0f, 6.5f)
                lineTo(8.0f, 0.0f)
                close()
            }
        }
        .build()
        return _pentagon!!
    }

private var _pentagon: ImageVector? = null
