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

public val FilledGroup.BagCheck: ImageVector
    get() {
        if (_bagCheck != null) {
            return _bagCheck!!
        }
        _bagCheck = Builder(name = "BagCheck", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.5f, 3.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -5.0f, 0.0f)
                lineTo(5.5f, 4.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-0.5f)
                close()
                moveTo(11.5f, 3.5f)
                lineTo(11.5f, 4.0f)
                lineTo(15.0f, 4.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(3.0f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(1.0f, 4.0f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-0.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 7.0f, 0.0f)
                close()
                moveTo(10.854f, 8.854f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.708f, -0.708f)
                lineTo(7.5f, 10.793f)
                lineTo(6.354f, 9.646f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.708f, 0.708f)
                lineToRelative(1.5f, 1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.708f, 0.0f)
                lineToRelative(3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _bagCheck!!
    }

private var _bagCheck: ImageVector? = null
