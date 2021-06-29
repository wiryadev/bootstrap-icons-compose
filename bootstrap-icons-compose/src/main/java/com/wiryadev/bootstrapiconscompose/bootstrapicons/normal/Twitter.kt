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

public val NormalGroup.Twitter: ImageVector
    get() {
        if (_twitter != null) {
            return _twitter!!
        }
        _twitter = Builder(name = "Twitter", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.026f, 15.0f)
                curveToRelative(6.038f, 0.0f, 9.341f, -5.003f, 9.341f, -9.334f)
                curveToRelative(0.0f, -0.14f, 0.0f, -0.282f, -0.006f, -0.422f)
                arcTo(6.685f, 6.685f, 0.0f, false, false, 16.0f, 3.542f)
                arcToRelative(6.658f, 6.658f, 0.0f, false, true, -1.889f, 0.518f)
                arcToRelative(3.301f, 3.301f, 0.0f, false, false, 1.447f, -1.817f)
                arcToRelative(6.533f, 6.533f, 0.0f, false, true, -2.087f, 0.793f)
                arcTo(3.286f, 3.286f, 0.0f, false, false, 7.875f, 6.03f)
                arcToRelative(9.325f, 9.325f, 0.0f, false, true, -6.767f, -3.429f)
                arcToRelative(3.289f, 3.289f, 0.0f, false, false, 1.018f, 4.382f)
                arcTo(3.323f, 3.323f, 0.0f, false, true, 0.64f, 6.575f)
                verticalLineToRelative(0.045f)
                arcToRelative(3.288f, 3.288f, 0.0f, false, false, 2.632f, 3.218f)
                arcToRelative(3.203f, 3.203f, 0.0f, false, true, -0.865f, 0.115f)
                arcToRelative(3.23f, 3.23f, 0.0f, false, true, -0.614f, -0.057f)
                arcToRelative(3.283f, 3.283f, 0.0f, false, false, 3.067f, 2.277f)
                arcTo(6.588f, 6.588f, 0.0f, false, true, 0.78f, 13.58f)
                arcToRelative(6.32f, 6.32f, 0.0f, false, true, -0.78f, -0.045f)
                arcTo(9.344f, 9.344f, 0.0f, false, false, 5.026f, 15.0f)
                close()
            }
        }
        .build()
        return _twitter!!
    }

private var _twitter: ImageVector? = null
