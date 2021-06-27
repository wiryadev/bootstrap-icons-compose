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

public val NormalGroup.Megaphone: ImageVector
    get() {
        if (_megaphone != null) {
            return _megaphone!!
        }
        _megaphone = Builder(name = "Megaphone", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 2.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                verticalLineToRelative(11.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                verticalLineToRelative(-0.214f)
                curveToRelative(-2.162f, -1.241f, -4.49f, -1.843f, -6.912f, -2.083f)
                lineToRelative(0.405f, 2.712f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.51f, 15.1f)
                horizontalLineToRelative(-0.548f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.916f, -0.599f)
                lineToRelative(-1.85f, -3.49f)
                arcToRelative(68.14f, 68.14f, 0.0f, false, false, -0.202f, -0.003f)
                arcTo(2.014f, 2.014f, 0.0f, false, true, 0.0f, 9.0f)
                lineTo(0.0f, 7.0f)
                arcToRelative(2.02f, 2.02f, 0.0f, false, true, 1.992f, -2.013f)
                arcToRelative(74.663f, 74.663f, 0.0f, false, false, 2.483f, -0.075f)
                curveToRelative(3.043f, -0.154f, 6.148f, -0.849f, 8.525f, -2.199f)
                lineTo(13.0f, 2.5f)
                close()
                moveTo(14.0f, 2.5f)
                verticalLineToRelative(11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                verticalLineToRelative(-11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.0f)
                close()
                moveTo(13.0f, 3.85f)
                curveToRelative(-2.344f, 1.205f, -5.209f, 1.842f, -8.0f, 2.033f)
                verticalLineToRelative(4.233f)
                curveToRelative(0.18f, 0.01f, 0.359f, 0.022f, 0.537f, 0.036f)
                curveToRelative(2.568f, 0.189f, 5.093f, 0.744f, 7.463f, 1.993f)
                lineTo(13.0f, 3.85f)
                close()
                moveTo(4.0f, 10.065f)
                verticalLineToRelative(-4.13f)
                arcToRelative(95.09f, 95.09f, 0.0f, false, true, -1.992f, 0.052f)
                arcTo(1.02f, 1.02f, 0.0f, false, false, 1.0f, 7.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.55f, 0.448f, 1.002f, 1.006f, 1.009f)
                arcTo(60.49f, 60.49f, 0.0f, false, true, 4.0f, 10.065f)
                close()
                moveTo(3.343f, 11.04f)
                lineTo(4.952f, 14.077f)
                lineTo(4.962f, 14.101f)
                horizontalLineToRelative(0.548f)
                lineToRelative(-0.002f, -0.014f)
                lineToRelative(-0.443f, -2.966f)
                arcToRelative(68.019f, 68.019f, 0.0f, false, false, -1.722f, -0.082f)
                close()
            }
        }
        .build()
        return _megaphone!!
    }

private var _megaphone: ImageVector? = null
