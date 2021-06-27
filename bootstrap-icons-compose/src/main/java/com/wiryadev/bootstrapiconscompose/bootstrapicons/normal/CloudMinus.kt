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

public val NormalGroup.CloudMinus: ImageVector
    get() {
        if (_cloudMinus != null) {
            return _cloudMinus!!
        }
        _cloudMinus = Builder(name = "CloudMinus", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.406f, 3.342f)
                arcTo(5.53f, 5.53f, 0.0f, false, true, 8.0f, 2.0f)
                curveToRelative(2.69f, 0.0f, 4.923f, 2.0f, 5.166f, 4.579f)
                curveTo(14.758f, 6.804f, 16.0f, 8.137f, 16.0f, 9.773f)
                curveTo(16.0f, 11.569f, 14.502f, 13.0f, 12.687f, 13.0f)
                lineTo(3.781f, 13.0f)
                curveTo(1.708f, 13.0f, 0.0f, 11.366f, 0.0f, 9.318f)
                curveToRelative(0.0f, -1.763f, 1.266f, -3.223f, 2.942f, -3.593f)
                curveToRelative(0.143f, -0.863f, 0.698f, -1.723f, 1.464f, -2.383f)
                close()
                moveTo(5.059f, 4.099f)
                curveToRelative(-0.757f, 0.653f, -1.153f, 1.44f, -1.153f, 2.056f)
                verticalLineToRelative(0.448f)
                lineToRelative(-0.445f, 0.049f)
                curveTo(2.064f, 6.805f, 1.0f, 7.952f, 1.0f, 9.318f)
                curveTo(1.0f, 10.785f, 2.23f, 12.0f, 3.781f, 12.0f)
                horizontalLineToRelative(8.906f)
                curveTo(13.98f, 12.0f, 15.0f, 10.988f, 15.0f, 9.773f)
                curveToRelative(0.0f, -1.216f, -1.02f, -2.228f, -2.313f, -2.228f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-0.5f)
                curveTo(12.188f, 4.825f, 10.328f, 3.0f, 8.0f, 3.0f)
                arcToRelative(4.53f, 4.53f, 0.0f, false, false, -2.941f, 1.1f)
                close()
            }
        }
        .build()
        return _cloudMinus!!
    }

private var _cloudMinus: ImageVector? = null