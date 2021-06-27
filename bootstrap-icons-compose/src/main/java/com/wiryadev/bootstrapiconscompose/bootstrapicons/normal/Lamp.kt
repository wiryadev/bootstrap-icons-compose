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

public val NormalGroup.Lamp: ImageVector
    get() {
        if (_lamp != null) {
            return _lamp!!
        }
        _lamp = Builder(name = "Lamp", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 3.0f)
                verticalLineToRelative(4.0f)
                lineTo(3.0f, 7.0f)
                lineTo(3.0f, 3.0f)
                horizontalLineToRelative(10.0f)
                close()
                moveTo(3.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(14.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(3.0f, 2.0f)
                close()
                moveTo(7.5f, 1.0f)
                lineTo(7.776f, 0.447f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.448f, 0.0f)
                lineTo(8.5f, 1.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(7.488f, 10.0f)
                horizontalLineToRelative(1.024f)
                curveToRelative(0.337f, 0.646f, 0.677f, 1.33f, 0.95f, 1.949f)
                curveToRelative(0.176f, 0.396f, 0.318f, 0.75f, 0.413f, 1.042f)
                curveToRelative(0.048f, 0.146f, 0.081f, 0.266f, 0.102f, 0.36f)
                arcTo(1.347f, 1.347f, 0.0f, false, true, 10.0f, 13.5f)
                curveToRelative(0.0f, 0.665f, -0.717f, 1.5f, -2.0f, 1.5f)
                reflectiveCurveToRelative(-2.0f, -0.835f, -2.0f, -1.5f)
                curveToRelative(0.0f, 0.0f, 0.0f, -0.013f, 0.004f, -0.039f)
                curveToRelative(0.003f, -0.027f, 0.01f, -0.063f, 0.02f, -0.11f)
                curveToRelative(0.02f, -0.094f, 0.053f, -0.214f, 0.1f, -0.36f)
                curveToRelative(0.096f, -0.291f, 0.238f, -0.646f, 0.413f, -1.042f)
                curveToRelative(0.274f, -0.62f, 0.614f, -1.303f, 0.95f, -1.949f)
                close()
                moveTo(9.115f, 9.0f)
                horizontalLineToRelative(-2.23f)
                curveTo(6.032f, 10.595f, 5.0f, 12.69f, 5.0f, 13.5f)
                curveTo(5.0f, 14.88f, 6.343f, 16.0f, 8.0f, 16.0f)
                reflectiveCurveToRelative(3.0f, -1.12f, 3.0f, -2.5f)
                curveToRelative(0.0f, -0.81f, -1.032f, -2.905f, -1.885f, -4.5f)
                close()
            }
        }
        .build()
        return _lamp!!
    }

private var _lamp: ImageVector? = null
