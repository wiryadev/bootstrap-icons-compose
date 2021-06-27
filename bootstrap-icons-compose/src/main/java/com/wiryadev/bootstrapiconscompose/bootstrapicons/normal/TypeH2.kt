package icons.bootstrapicons.normal

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.bootstrapicons.NormalGroup

public val NormalGroup.TypeH2: ImageVector
    get() {
        if (_typeH2 != null) {
            return _typeH2!!
        }
        _typeH2 = Builder(name = "TypeH2", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.638f, 13.0f)
                lineTo(7.638f, 3.669f)
                lineTo(6.38f, 3.669f)
                lineTo(6.38f, 7.62f)
                lineTo(1.759f, 7.62f)
                lineTo(1.759f, 3.67f)
                lineTo(0.5f, 3.67f)
                lineTo(0.5f, 13.0f)
                horizontalLineToRelative(1.258f)
                lineTo(1.758f, 8.728f)
                horizontalLineToRelative(4.62f)
                lineTo(6.378f, 13.0f)
                horizontalLineToRelative(1.259f)
                close()
                moveTo(10.66f, 6.267f)
                verticalLineToRelative(-0.048f)
                curveToRelative(0.0f, -0.889f, 0.63f, -1.668f, 1.716f, -1.668f)
                curveToRelative(0.957f, 0.0f, 1.675f, 0.608f, 1.675f, 1.572f)
                curveToRelative(0.0f, 0.855f, -0.554f, 1.504f, -1.067f, 2.085f)
                lineToRelative(-3.513f, 3.999f)
                lineTo(9.471f, 13.0f)
                lineTo(15.5f, 13.0f)
                verticalLineToRelative(-1.094f)
                horizontalLineToRelative(-4.245f)
                verticalLineToRelative(-0.075f)
                lineToRelative(2.481f, -2.844f)
                curveToRelative(0.875f, -0.998f, 1.586f, -1.784f, 1.586f, -2.953f)
                curveToRelative(0.0f, -1.463f, -1.155f, -2.556f, -2.919f, -2.556f)
                curveToRelative(-1.941f, 0.0f, -2.966f, 1.326f, -2.966f, 2.74f)
                verticalLineToRelative(0.049f)
                horizontalLineToRelative(1.223f)
                close()
            }
        }
        .build()
        return _typeH2!!
    }

private var _typeH2: ImageVector? = null
