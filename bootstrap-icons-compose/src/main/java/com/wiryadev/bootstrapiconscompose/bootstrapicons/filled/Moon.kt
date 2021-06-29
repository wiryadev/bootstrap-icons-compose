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
import com.wiryadev.bootstrapiconscompose.bootstrapicons.FilledGroup

public val FilledGroup.Moon: ImageVector
    get() {
        if (_moon != null) {
            return _moon!!
        }
        _moon = Builder(name = "Moon", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 0.278f)
                arcToRelative(0.768f, 0.768f, 0.0f, false, true, 0.08f, 0.858f)
                arcToRelative(7.208f, 7.208f, 0.0f, false, false, -0.878f, 3.46f)
                curveToRelative(0.0f, 4.021f, 3.278f, 7.277f, 7.318f, 7.277f)
                curveToRelative(0.527f, 0.0f, 1.04f, -0.055f, 1.533f, -0.16f)
                arcToRelative(0.787f, 0.787f, 0.0f, false, true, 0.81f, 0.316f)
                arcToRelative(0.733f, 0.733f, 0.0f, false, true, -0.031f, 0.893f)
                arcTo(8.349f, 8.349f, 0.0f, false, true, 8.344f, 16.0f)
                curveTo(3.734f, 16.0f, 0.0f, 12.286f, 0.0f, 7.71f)
                curveTo(0.0f, 4.266f, 2.114f, 1.312f, 5.124f, 0.06f)
                arcTo(0.752f, 0.752f, 0.0f, false, true, 6.0f, 0.278f)
                close()
            }
        }
        .build()
        return _moon!!
    }

private var _moon: ImageVector? = null
