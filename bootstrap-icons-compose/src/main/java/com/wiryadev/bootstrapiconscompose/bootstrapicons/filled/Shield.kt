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

public val FilledGroup.Shield: ImageVector
    get() {
        if (_shield != null) {
            return _shield!!
        }
        _shield = Builder(name = "Shield", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.072f, 0.56f)
                curveTo(6.157f, 0.265f, 7.31f, 0.0f, 8.0f, 0.0f)
                reflectiveCurveToRelative(1.843f, 0.265f, 2.928f, 0.56f)
                curveToRelative(1.11f, 0.3f, 2.229f, 0.655f, 2.887f, 0.87f)
                arcToRelative(1.54f, 1.54f, 0.0f, false, true, 1.044f, 1.262f)
                curveToRelative(0.596f, 4.477f, -0.787f, 7.795f, -2.465f, 9.99f)
                arcToRelative(11.775f, 11.775f, 0.0f, false, true, -2.517f, 2.453f)
                arcToRelative(7.159f, 7.159f, 0.0f, false, true, -1.048f, 0.625f)
                curveToRelative(-0.28f, 0.132f, -0.581f, 0.24f, -0.829f, 0.24f)
                reflectiveCurveToRelative(-0.548f, -0.108f, -0.829f, -0.24f)
                arcToRelative(7.158f, 7.158f, 0.0f, false, true, -1.048f, -0.625f)
                arcToRelative(11.777f, 11.777f, 0.0f, false, true, -2.517f, -2.453f)
                curveTo(1.928f, 10.487f, 0.545f, 7.169f, 1.141f, 2.692f)
                arcTo(1.54f, 1.54f, 0.0f, false, true, 2.185f, 1.43f)
                arcTo(62.456f, 62.456f, 0.0f, false, true, 5.072f, 0.56f)
                close()
            }
        }
        .build()
        return _shield!!
    }

private var _shield: ImageVector? = null
