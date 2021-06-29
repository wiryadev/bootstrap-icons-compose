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

public val NormalGroup.QuestionLg: ImageVector
    get() {
        if (_questionLg != null) {
            return _questionLg!!
        }
        _questionLg = Builder(name = "QuestionLg", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 4.075f)
                arcToRelative(0.423f, 0.423f, 0.0f, false, false, 0.43f, 0.44f)
                lineTo(4.9f, 4.515f)
                curveToRelative(0.247f, 0.0f, 0.442f, -0.2f, 0.475f, -0.445f)
                curveToRelative(0.159f, -1.17f, 0.962f, -2.022f, 2.393f, -2.022f)
                curveToRelative(1.222f, 0.0f, 2.342f, 0.611f, 2.342f, 2.082f)
                curveToRelative(0.0f, 1.132f, -0.668f, 1.652f, -1.72f, 2.444f)
                curveToRelative(-1.2f, 0.872f, -2.15f, 1.89f, -2.082f, 3.542f)
                lineToRelative(0.005f, 0.386f)
                curveToRelative(0.003f, 0.244f, 0.202f, 0.44f, 0.446f, 0.44f)
                horizontalLineToRelative(1.445f)
                curveToRelative(0.247f, 0.0f, 0.446f, -0.2f, 0.446f, -0.446f)
                verticalLineToRelative(-0.188f)
                curveToRelative(0.0f, -1.278f, 0.487f, -1.652f, 1.8f, -2.647f)
                curveToRelative(1.086f, -0.826f, 2.217f, -1.743f, 2.217f, -3.667f)
                curveTo(12.667f, 1.301f, 10.393f, 0.0f, 7.903f, 0.0f)
                curveTo(5.645f, 0.0f, 3.17f, 1.053f, 3.001f, 4.075f)
                close()
                moveTo(5.776f, 14.348f)
                curveToRelative(0.0f, 0.95f, 0.758f, 1.652f, 1.8f, 1.652f)
                curveToRelative(1.085f, 0.0f, 1.832f, -0.702f, 1.832f, -1.652f)
                curveToRelative(0.0f, -0.985f, -0.747f, -1.675f, -1.833f, -1.675f)
                curveToRelative(-1.04f, 0.0f, -1.799f, 0.69f, -1.799f, 1.675f)
                close()
            }
        }
        .build()
        return _questionLg!!
    }

private var _questionLg: ImageVector? = null
