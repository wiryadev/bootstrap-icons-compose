package icons.bootstrapicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wiryadev.bootstrapiconscompose.bootstrapicons.FilledGroup

public val FilledGroup.Layers: ImageVector
    get() {
        if (_layers != null) {
            return _layers!!
        }
        _layers = Builder(name = "Layers", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.765f, 1.559f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.47f, 0.0f)
                lineToRelative(7.5f, 4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 0.882f)
                lineToRelative(-7.5f, 4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.47f, 0.0f)
                lineToRelative(-7.5f, -4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -0.882f)
                lineToRelative(7.5f, -4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.125f, 8.567f)
                lineToRelative(-1.86f, 0.992f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 0.882f)
                lineToRelative(7.5f, 4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.47f, 0.0f)
                lineToRelative(7.5f, -4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -0.882f)
                lineToRelative(-1.86f, -0.992f)
                lineToRelative(-5.17f, 2.756f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.41f, 0.0f)
                lineToRelative(-5.17f, -2.756f)
                close()
            }
        }
        .build()
        return _layers!!
    }

private var _layers: ImageVector? = null
