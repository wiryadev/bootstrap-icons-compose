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

public val SkipBackward: ImageVector
    get() {
        if (_skipBackward != null) {
            return _skipBackward!!
        }
        _skipBackward = Builder(name = "SkipBackward", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.5f, 3.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 0.0f, 4.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                verticalLineTo(8.753f)
                lineToRelative(6.267f, 3.636f)
                curveToRelative(0.54f, 0.313f, 1.233f, -0.066f, 1.233f, -0.697f)
                verticalLineToRelative(-2.94f)
                lineToRelative(6.267f, 3.636f)
                curveToRelative(0.54f, 0.314f, 1.233f, -0.065f, 1.233f, -0.696f)
                verticalLineTo(4.308f)
                curveToRelative(0.0f, -0.63f, -0.693f, -1.01f, -1.233f, -0.696f)
                lineTo(8.5f, 7.248f)
                verticalLineToRelative(-2.94f)
                curveToRelative(0.0f, -0.63f, -0.692f, -1.01f, -1.233f, -0.696f)
                lineTo(1.0f, 7.248f)
                verticalLineTo(4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                close()
            }
        }
        .build()
        return _skipBackward!!
    }

private var _skipBackward: ImageVector? = null
