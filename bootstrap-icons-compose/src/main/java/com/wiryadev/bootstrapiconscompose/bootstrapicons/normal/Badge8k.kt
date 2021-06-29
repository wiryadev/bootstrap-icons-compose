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

public val NormalGroup.Badge8k: ImageVector
    get() {
        if (_badge8k != null) {
            return _badge8k!!
        }
        _badge8k = Builder(name = "Badge8k", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.837f, 11.114f)
                curveToRelative(1.406f, 0.0f, 2.333f, -0.725f, 2.333f, -1.766f)
                curveToRelative(0.0f, -0.945f, -0.712f, -1.38f, -1.256f, -1.49f)
                verticalLineToRelative(-0.053f)
                curveToRelative(0.496f, -0.15f, 1.02f, -0.55f, 1.02f, -1.331f)
                curveToRelative(0.0f, -0.914f, -0.831f, -1.587f, -2.084f, -1.587f)
                curveToRelative(-1.257f, 0.0f, -2.087f, 0.673f, -2.087f, 1.587f)
                curveToRelative(0.0f, 0.773f, 0.51f, 1.177f, 1.02f, 1.331f)
                verticalLineToRelative(0.053f)
                curveToRelative(-0.546f, 0.11f, -1.258f, 0.54f, -1.258f, 1.494f)
                curveToRelative(0.0f, 1.042f, 0.906f, 1.762f, 2.312f, 1.762f)
                close()
                moveTo(4.85f, 7.471f)
                curveToRelative(-0.545f, 0.0f, -0.95f, -0.356f, -0.95f, -0.866f)
                reflectiveCurveToRelative(0.405f, -0.852f, 0.95f, -0.852f)
                curveToRelative(0.545f, 0.0f, 0.945f, 0.343f, 0.945f, 0.852f)
                curveToRelative(0.0f, 0.51f, -0.4f, 0.866f, -0.945f, 0.866f)
                close()
                moveTo(4.85f, 10.257f)
                curveToRelative(-0.65f, 0.0f, -1.142f, -0.395f, -1.142f, -0.984f)
                reflectiveCurveTo(4.2f, 8.28f, 4.85f, 8.28f)
                curveToRelative(0.646f, 0.0f, 1.143f, 0.404f, 1.143f, 0.993f)
                reflectiveCurveToRelative(-0.497f, 0.984f, -1.143f, 0.984f)
                close()
                moveTo(13.408f, 5.0f)
                horizontalLineToRelative(-1.306f)
                lineTo(9.835f, 7.685f)
                horizontalLineToRelative(-0.057f)
                lineTo(9.778f, 5.0f)
                lineTo(8.59f, 5.0f)
                verticalLineToRelative(5.998f)
                horizontalLineToRelative(1.187f)
                lineTo(9.777f, 9.075f)
                lineToRelative(0.615f, -0.699f)
                lineToRelative(1.679f, 2.623f)
                lineTo(13.5f, 10.999f)
                lineToRelative(-2.232f, -3.414f)
                lineTo(13.408f, 5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineTo(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineTo(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(2.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineTo(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                horizontalLineTo(2.0f)
                close()
            }
        }
        .build()
        return _badge8k!!
    }

private var _badge8k: ImageVector? = null
