package com.wiryadev.bootstrapiconscompose.bootstrapicons.normal

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val NormalGroup.Bezier: ImageVector
    get() {
        if (_bezier != null) {
            return _bezier!!
        }
        _bezier = Builder(name = "Bezier", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(0.0f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 1.5f, 9.0f)
                horizontalLineToRelative(1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.0f, 10.5f)
                verticalLineToRelative(1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 2.5f, 13.0f)
                horizontalLineToRelative(-1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 0.0f, 11.5f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(1.5f, 10.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(12.0f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 13.5f, 9.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, 1.5f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, -1.5f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(13.5f, 10.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(6.0f, 4.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.5f, 3.0f)
                horizontalLineToRelative(1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 10.0f, 4.5f)
                verticalLineToRelative(1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 8.5f, 7.0f)
                horizontalLineToRelative(-1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.0f, 5.5f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(7.5f, 4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-1.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 4.5f)
                lineTo(1.866f, 4.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 1.0f)
                horizontalLineToRelative(2.668f)
                arcTo(6.517f, 6.517f, 0.0f, false, false, 1.814f, 9.0f)
                lineTo(2.5f, 9.0f)
                curveToRelative(0.123f, 0.0f, 0.244f, 0.015f, 0.358f, 0.043f)
                arcToRelative(5.517f, 5.517f, 0.0f, false, true, 3.185f, -3.185f)
                arcTo(1.503f, 1.503f, 0.0f, false, true, 6.0f, 5.5f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(9.957f, 5.858f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 10.0f, 5.5f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.134f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 1.0f)
                horizontalLineToRelative(-2.668f)
                arcToRelative(6.517f, 6.517f, 0.0f, false, true, 2.72f, 3.5f)
                lineTo(13.5f, 9.0f)
                curveToRelative(-0.123f, 0.0f, -0.243f, 0.015f, -0.358f, 0.043f)
                arcToRelative(5.517f, 5.517f, 0.0f, false, false, -3.185f, -3.185f)
                close()
            }
        }
        .build()
        return _bezier!!
    }

private var _bezier: ImageVector? = null
