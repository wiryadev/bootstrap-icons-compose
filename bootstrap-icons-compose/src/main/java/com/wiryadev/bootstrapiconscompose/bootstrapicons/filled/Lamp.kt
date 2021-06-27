package icons.bootstrapicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.bootstrapicons.FilledGroup

public val FilledGroup.Lamp: ImageVector
    get() {
        if (_lamp != null) {
            return _lamp!!
        }
        _lamp = Builder(name = "Lamp", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(3.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(2.0f, 3.0f)
                close()
                moveTo(7.5f, 1.0f)
                lineTo(7.776f, 0.447f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.448f, 0.0f)
                lineTo(8.5f, 1.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(6.885f, 9.0f)
                horizontalLineToRelative(2.23f)
                curveTo(9.968f, 10.595f, 11.0f, 12.69f, 11.0f, 13.5f)
                curveToRelative(0.0f, 1.38f, -1.343f, 2.5f, -3.0f, 2.5f)
                reflectiveCurveToRelative(-3.0f, -1.12f, -3.0f, -2.5f)
                curveToRelative(0.0f, -0.81f, 1.032f, -2.905f, 1.885f, -4.5f)
                close()
            }
        }
        .build()
        return _lamp!!
    }

private var _lamp: ImageVector? = null
