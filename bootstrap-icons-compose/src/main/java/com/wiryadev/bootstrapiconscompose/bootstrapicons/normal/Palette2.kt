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

public val NormalGroup.Palette2: ImageVector
    get() {
        if (_palette2 != null) {
            return _palette2!!
        }
        _palette2 = Builder(name = "Palette2", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(5.277f)
                lineToRelative(4.147f, -4.131f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.707f, 0.0f)
                lineToRelative(3.535f, 3.536f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 0.708f)
                lineTo(10.261f, 10.0f)
                horizontalLineTo(15.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                horizontalLineTo(3.0f)
                arcToRelative(2.99f, 2.99f, 0.0f, false, true, -2.121f, -0.879f)
                arcTo(2.99f, 2.99f, 0.0f, false, true, 0.0f, 13.044f)
                moveToRelative(6.0f, -0.21f)
                lineToRelative(7.328f, -7.3f)
                lineToRelative(-2.829f, -2.828f)
                lineTo(6.0f, 7.188f)
                verticalLineToRelative(5.647f)
                close()
                moveTo(4.5f, 13.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                close()
                moveTo(15.0f, 15.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineTo(9.258f)
                lineToRelative(-4.015f, 4.0f)
                horizontalLineTo(15.0f)
                close()
                moveTo(0.0f, 0.5f)
                verticalLineToRelative(12.495f)
                verticalLineTo(0.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 12.995f)
                verticalLineTo(13.0f)
                arcToRelative(3.07f, 3.07f, 0.0f, false, false, 0.0f, -0.005f)
                close()
            }
        }
        .build()
        return _palette2!!
    }

private var _palette2: ImageVector? = null
