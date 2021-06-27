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

public val FilledGroup.GeoAlt: ImageVector
    get() {
        if (_geoAlt != null) {
            return _geoAlt!!
        }
        _geoAlt = Builder(name = "GeoAlt", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 16.0f)
                reflectiveCurveToRelative(6.0f, -5.686f, 6.0f, -10.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 2.0f, 6.0f)
                curveToRelative(0.0f, 4.314f, 6.0f, 10.0f, 6.0f, 10.0f)
                close()
                moveTo(8.0f, 9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 0.0f, -6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, 6.0f)
                close()
            }
        }
        .build()
        return _geoAlt!!
    }

private var _geoAlt: ImageVector? = null
