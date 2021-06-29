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

public val NormalGroup.Sun: ImageVector
    get() {
        if (_sun != null) {
            return _sun!!
        }
        _sun = Builder(name = "Sun", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth
                = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 11.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 0.0f, -6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, 6.0f)
                close()
                moveTo(8.0f, 12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.0f, -8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                close()
                moveTo(8.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                verticalLineToRelative(-2.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 8.0f, 0.0f)
                close()
                moveTo(8.0f, 13.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                verticalLineToRelative(-2.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 8.0f, 13.0f)
                close()
                moveTo(16.0f, 8.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                close()
                moveTo(3.0f, 8.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 3.0f, 8.0f)
                close()
                moveTo(13.657f, 2.343f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 0.707f)
                lineToRelative(-1.414f, 1.415f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.707f, -0.708f)
                lineToRelative(1.414f, -1.414f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.707f, 0.0f)
                close()
                moveTo(4.464f, 11.536f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 0.707f)
                lineTo(3.05f, 13.657f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.707f, -0.707f)
                lineToRelative(1.414f, -1.414f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.707f, 0.0f)
                close()
                moveTo(13.657f, 13.657f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.707f, 0.0f)
                lineToRelative(-1.414f, -1.414f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.707f, -0.707f)
                lineToRelative(1.414f, 1.414f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 0.707f)
                close()
                moveTo(4.464f, 4.465f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.707f, 0.0f)
                lineTo(2.343f, 3.05f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.707f, -0.707f)
                lineToRelative(1.414f, 1.414f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 0.708f)
                close()
            }
        }
        .build()
        return _sun!!
    }

private var _sun: ImageVector? = null
