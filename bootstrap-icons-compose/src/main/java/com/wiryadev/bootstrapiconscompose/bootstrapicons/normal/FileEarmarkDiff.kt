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

public val NormalGroup.FileEarmarkDiff: ImageVector
    get() {
        if (_fileEarmarkDiff != null) {
            return _fileEarmarkDiff!!
        }
        _fileEarmarkDiff = Builder(name = "FileEarmarkDiff", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                lineTo(8.5f, 7.0f)
                lineTo(10.0f, 7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(8.5f, 8.0f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                lineTo(7.5f, 8.0f)
                lineTo(6.0f, 8.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                horizontalLineToRelative(1.5f)
                lineTo(7.5f, 5.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 8.0f, 5.0f)
                close()
                moveTo(5.5f, 11.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 6.0f, 11.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(6.0f, 12.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 14.0f)
                verticalLineTo(4.5f)
                lineTo(9.5f, 0.0f)
                horizontalLineTo(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                close()
                moveTo(9.5f, 3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 11.0f, 4.5f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineTo(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineTo(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _fileEarmarkDiff!!
    }

private var _fileEarmarkDiff: ImageVector? = null
