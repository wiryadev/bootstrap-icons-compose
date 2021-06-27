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

public val FilledGroup.Bell: ImageVector
    get() {
        if (_bell != null) {
            return _bell!!
        }
        _bell = Builder(name = "Bell", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(6.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                close()
                moveTo(8.995f, 1.099f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.99f, 0.0f)
                arcTo(5.002f, 5.002f, 0.0f, false, false, 3.0f, 6.0f)
                curveToRelative(0.0f, 1.098f, -0.5f, 6.0f, -2.0f, 7.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(-1.5f, -1.0f, -2.0f, -5.902f, -2.0f, -7.0f)
                curveToRelative(0.0f, -2.42f, -1.72f, -4.44f, -4.005f, -4.901f)
                close()
            }
        }
        .build()
        return _bell!!
    }

private var _bell: ImageVector? = null
