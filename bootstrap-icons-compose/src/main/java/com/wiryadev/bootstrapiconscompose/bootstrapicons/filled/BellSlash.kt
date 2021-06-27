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

public val FilledGroup.BellSlash: ImageVector
    get() {
        if (_bellSlash != null) {
            return _bellSlash!!
        }
        _bellSlash = Builder(name = "BellSlash", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.164f, 14.0f)
                lineTo(15.0f, 14.0f)
                curveToRelative(-1.5f, -1.0f, -2.0f, -5.902f, -2.0f, -7.0f)
                curveToRelative(0.0f, -0.264f, -0.02f, -0.523f, -0.06f, -0.776f)
                lineTo(5.164f, 14.0f)
                close()
                moveTo(11.452f, 3.383f)
                arcTo(4.988f, 4.988f, 0.0f, false, false, 8.995f, 2.1f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.99f, 0.0f)
                arcTo(5.002f, 5.002f, 0.0f, false, false, 3.0f, 7.0f)
                curveToRelative(0.0f, 0.898f, -0.335f, 4.342f, -1.278f, 6.113f)
                lineToRelative(9.73f, -9.73f)
                close()
                moveTo(10.0f, 15.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(0.625f, 15.625f)
                arcToRelative(0.53f, 0.53f, 0.0f, false, false, 0.75f, 0.75f)
                lineToRelative(14.75f, -14.75f)
                arcToRelative(0.53f, 0.53f, 0.0f, false, false, -0.75f, -0.75f)
                lineTo(0.625f, 15.625f)
                close()
            }
        }
        .build()
        return _bellSlash!!
    }

private var _bellSlash: ImageVector? = null
