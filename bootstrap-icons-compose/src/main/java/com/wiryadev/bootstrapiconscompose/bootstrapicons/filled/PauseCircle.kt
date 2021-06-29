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

public val FilledGroup.PauseCircle: ImageVector
    get() {
        if (_pauseCircle != null) {
            return _pauseCircle!!
        }
        _pauseCircle = Builder(name = "PauseCircle", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 0.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(6.25f, 5.0f)
                curveTo(5.56f, 5.0f, 5.0f, 5.56f, 5.0f, 6.25f)
                verticalLineToRelative(3.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 2.5f, 0.0f)
                verticalLineToRelative(-3.5f)
                curveTo(7.5f, 5.56f, 6.94f, 5.0f, 6.25f, 5.0f)
                close()
                moveTo(9.75f, 5.0f)
                curveToRelative(-0.69f, 0.0f, -1.25f, 0.56f, -1.25f, 1.25f)
                verticalLineToRelative(3.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 2.5f, 0.0f)
                verticalLineToRelative(-3.5f)
                curveTo(11.0f, 5.56f, 10.44f, 5.0f, 9.75f, 5.0f)
                close()
            }
        }
        .build()
        return _pauseCircle!!
    }

private var _pauseCircle: ImageVector? = null
