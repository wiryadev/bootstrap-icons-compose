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

public val NormalGroup.Display: ImageVector
    get() {
        if (_display != null) {
            return _display!!
        }
        _display = Builder(name = "Display", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 4.0f)
                reflectiveCurveToRelative(0.0f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(12.0f)
                reflectiveCurveToRelative(2.0f, 0.0f, 2.0f, 2.0f)
                verticalLineToRelative(6.0f)
                reflectiveCurveToRelative(0.0f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(0.0f, 0.667f, 0.083f, 1.167f, 0.25f, 1.5f)
                lineTo(11.0f, 13.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(5.0f, 14.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                horizontalLineToRelative(0.75f)
                curveToRelative(0.167f, -0.333f, 0.25f, -0.833f, 0.25f, -1.5f)
                lineTo(2.0f, 12.0f)
                reflectiveCurveToRelative(-2.0f, 0.0f, -2.0f, -2.0f)
                lineTo(0.0f, 4.0f)
                close()
                moveTo(1.398f, 3.145f)
                arcToRelative(0.758f, 0.758f, 0.0f, false, false, -0.254f, 0.302f)
                arcTo(1.46f, 1.46f, 0.0f, false, false, 1.0f, 4.01f)
                lineTo(1.0f, 10.0f)
                curveToRelative(0.0f, 0.325f, 0.078f, 0.502f, 0.145f, 0.602f)
                curveToRelative(0.07f, 0.105f, 0.17f, 0.188f, 0.302f, 0.254f)
                arcToRelative(1.464f, 1.464f, 0.0f, false, false, 0.538f, 0.143f)
                lineTo(2.01f, 11.0f)
                lineTo(14.0f, 11.0f)
                curveToRelative(0.325f, 0.0f, 0.502f, -0.078f, 0.602f, -0.145f)
                arcToRelative(0.758f, 0.758f, 0.0f, false, false, 0.254f, -0.302f)
                arcToRelative(1.464f, 1.464f, 0.0f, false, false, 0.143f, -0.538f)
                lineTo(15.0f, 9.99f)
                lineTo(15.0f, 4.0f)
                curveToRelative(0.0f, -0.325f, -0.078f, -0.502f, -0.145f, -0.602f)
                arcToRelative(0.757f, 0.757f, 0.0f, false, false, -0.302f, -0.254f)
                arcTo(1.46f, 1.46f, 0.0f, false, false, 13.99f, 3.0f)
                lineTo(2.0f, 3.0f)
                curveToRelative(-0.325f, 0.0f, -0.502f, 0.078f, -0.602f, 0.145f)
                close()
            }
        }
        .build()
        return _display!!
    }

private var _display: ImageVector? = null
