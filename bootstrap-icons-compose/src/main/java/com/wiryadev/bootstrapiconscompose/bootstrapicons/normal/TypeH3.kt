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

public val NormalGroup.TypeH3: ImageVector
    get() {
        if (_typeH3 != null) {
            return _typeH3!!
        }
        _typeH3 = Builder(name = "TypeH3", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.637f, 13.0f)
                lineTo(7.637f, 3.669f)
                lineTo(6.379f, 3.669f)
                lineTo(6.379f, 7.62f)
                lineTo(1.758f, 7.62f)
                lineTo(1.758f, 3.67f)
                lineTo(0.5f, 3.67f)
                lineTo(0.5f, 13.0f)
                horizontalLineToRelative(1.258f)
                lineTo(1.758f, 8.728f)
                horizontalLineToRelative(4.62f)
                lineTo(6.378f, 13.0f)
                horizontalLineToRelative(1.259f)
                close()
                moveTo(11.262f, 8.728f)
                horizontalLineToRelative(1.018f)
                curveToRelative(1.142f, 0.0f, 1.935f, 0.67f, 1.949f, 1.674f)
                curveToRelative(0.013f, 1.005f, -0.78f, 1.737f, -2.01f, 1.73f)
                curveToRelative(-1.08f, -0.007f, -1.853f, -0.588f, -1.935f, -1.32f)
                lineTo(9.108f, 10.812f)
                curveToRelative(0.069f, 1.327f, 1.224f, 2.386f, 3.083f, 2.386f)
                curveToRelative(1.935f, 0.0f, 3.343f, -1.155f, 3.309f, -2.789f)
                curveToRelative(-0.027f, -1.51f, -1.251f, -2.16f, -2.037f, -2.249f)
                verticalLineToRelative(-0.068f)
                curveToRelative(0.704f, -0.123f, 1.764f, -0.91f, 1.723f, -2.229f)
                curveToRelative(-0.035f, -1.353f, -1.176f, -2.4f, -2.954f, -2.385f)
                curveToRelative(-1.873f, 0.006f, -2.857f, 1.162f, -2.898f, 2.358f)
                horizontalLineToRelative(1.196f)
                curveToRelative(0.062f, -0.69f, 0.711f, -1.299f, 1.696f, -1.299f)
                curveToRelative(0.998f, 0.0f, 1.695f, 0.622f, 1.695f, 1.525f)
                curveToRelative(0.007f, 0.922f, -0.718f, 1.592f, -1.695f, 1.592f)
                horizontalLineToRelative(-0.964f)
                verticalLineToRelative(1.074f)
                close()
            }
        }
        .build()
        return _typeH3!!
    }

private var _typeH3: ImageVector? = null
