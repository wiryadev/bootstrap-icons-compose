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

public val NormalGroup.Envelope: ImageVector
    get() {
        if (_envelope != null) {
            return _envelope!!
        }
        _envelope = Builder(name = "Envelope", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(2.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(0.0f, 4.0f)
                close()
                moveTo(2.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(0.217f)
                lineToRelative(7.0f, 4.2f)
                lineToRelative(7.0f, -4.2f)
                lineTo(15.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(2.0f, 3.0f)
                close()
                moveTo(15.0f, 5.383f)
                lineTo(10.242f, 8.238f)
                lineTo(15.0f, 11.114f)
                verticalLineToRelative(-5.73f)
                close()
                moveTo(14.966f, 12.261f)
                lineTo(9.271f, 8.82f)
                lineTo(8.0f, 9.583f)
                lineTo(6.728f, 8.82f)
                lineToRelative(-5.694f, 3.44f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 2.0f, 13.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.966f, -0.739f)
                close()
                moveTo(1.0f, 11.114f)
                lineToRelative(4.758f, -2.876f)
                lineTo(1.0f, 5.383f)
                verticalLineToRelative(5.73f)
                close()
            }
        }
        .build()
        return _envelope!!
    }

private var _envelope: ImageVector? = null
