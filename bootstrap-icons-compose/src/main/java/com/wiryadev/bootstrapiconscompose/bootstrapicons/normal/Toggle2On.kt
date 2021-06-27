package icons.bootstrapicons.normal

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
import icons.bootstrapicons.NormalGroup

public val NormalGroup.Toggle2On: ImageVector
    get() {
        if (_toggle2On != null) {
            return _toggle2On!!
        }
        _toggle2On = Builder(name = "Toggle2On", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 5.0f)
                horizontalLineTo(3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, 6.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(4.995f, 4.995f, 0.0f, false, true, -0.584f, -1.0f)
                horizontalLineTo(3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.0f, -4.0f)
                horizontalLineToRelative(3.416f)
                curveToRelative(0.156f, -0.357f, 0.352f, -0.692f, 0.584f, -1.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 8.0f)
                arcTo(5.0f, 5.0f, 0.0f, true, true, 6.0f, 8.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 10.0f, 0.0f)
                close()
            }
        }
        .build()
        return _toggle2On!!
    }

private var _toggle2On: ImageVector? = null
