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

public val NormalGroup.Tags: ImageVector
    get() {
        if (_tags != null) {
            return _tags!!
        }
        _tags = Builder(name = "Tags", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 2.0f)
                verticalLineToRelative(4.586f)
                lineToRelative(7.0f, 7.0f)
                lineTo(14.586f, 9.0f)
                lineToRelative(-7.0f, -7.0f)
                horizontalLineTo(3.0f)
                close()
                moveTo(2.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(4.586f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.707f, 0.293f)
                lineToRelative(7.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.414f)
                lineToRelative(-4.586f, 4.586f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, 0.0f)
                lineToRelative(-7.0f, -7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 2.0f, 6.586f)
                verticalLineTo(2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5f, 5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.0f, -1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                close()
                moveTo(5.5f, 6.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                close()
                moveTo(1.0f, 7.086f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.293f, 0.707f)
                lineTo(8.75f, 15.25f)
                lineToRelative(-0.043f, 0.043f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, 0.0f)
                lineToRelative(-7.0f, -7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 0.0f, 7.586f)
                lineTo(0.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                verticalLineToRelative(5.086f)
                close()
            }
        }
        .build()
        return _tags!!
    }

private var _tags: ImageVector? = null
