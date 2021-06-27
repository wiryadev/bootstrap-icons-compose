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

public val NormalGroup.Gem: ImageVector
    get() {
        if (_gem != null) {
            return _gem!!
        }
        _gem = Builder(name = "Gem", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth
                = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.1f, 0.7f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.4f, -0.2f)
                horizontalLineToRelative(9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.4f, 0.2f)
                lineToRelative(2.976f, 3.974f)
                curveToRelative(0.149f, 0.185f, 0.156f, 0.45f, 0.01f, 0.644f)
                lineTo(8.4f, 15.3f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.8f, 0.0f)
                lineTo(0.1f, 5.3f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -0.6f)
                lineToRelative(3.0f, -4.0f)
                close()
                moveTo(14.486f, 4.485f)
                lineTo(12.68f, 2.075f)
                lineTo(11.904f, 4.488f)
                lineTo(14.486f, 4.485f)
                close()
                moveTo(10.853f, 4.489f)
                lineTo(11.814f, 1.5f)
                lineTo(4.186f, 1.5f)
                lineToRelative(0.963f, 2.995f)
                lineToRelative(5.704f, -0.006f)
                close()
                moveTo(5.47f, 5.495f)
                lineTo(8.0f, 13.366f)
                lineToRelative(2.532f, -7.876f)
                lineToRelative(-5.062f, 0.005f)
                close()
                moveTo(4.099f, 4.496f)
                lineTo(3.319f, 2.074f)
                lineTo(1.501f, 4.499f)
                lineTo(4.099f, 4.496f)
                close()
                moveTo(1.499f, 5.5f)
                lineToRelative(5.113f, 6.817f)
                lineToRelative(-2.192f, -6.82f)
                lineTo(1.5f, 5.5f)
                close()
                moveTo(9.388f, 12.317f)
                lineTo(14.511f, 5.487f)
                lineTo(11.583f, 5.489f)
                lineTo(9.388f, 12.317f)
                close()
            }
        }
        .build()
        return _gem!!
    }

private var _gem: ImageVector? = null
