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

public val NormalGroup.Screwdriver: ImageVector
    get() {
        if (_screwdriver != null) {
            return _screwdriver!!
        }
        _screwdriver = Builder(name = "Screwdriver", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 1.0f)
                lineToRelative(1.0f, -1.0f)
                lineToRelative(3.081f, 2.2f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.419f, 0.815f)
                verticalLineToRelative(0.07f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.293f, 0.708f)
                lineTo(10.5f, 9.5f)
                lineToRelative(0.914f, -0.305f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.023f, 0.242f)
                lineToRelative(3.356f, 3.356f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.414f)
                lineToRelative(-1.586f, 1.586f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, 0.0f)
                lineToRelative(-3.356f, -3.356f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.242f, -1.023f)
                lineTo(9.5f, 10.5f)
                lineTo(3.793f, 4.793f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.707f, -0.293f)
                horizontalLineToRelative(-0.071f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.814f, -0.419f)
                lineTo(0.0f, 1.0f)
                close()
                moveTo(11.354f, 10.646f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.708f, 0.708f)
                lineToRelative(3.0f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.708f, -0.708f)
                lineToRelative(-3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _screwdriver!!
    }

private var _screwdriver: ImageVector? = null
