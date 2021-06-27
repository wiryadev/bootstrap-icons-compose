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

public val FilledGroup.CloudRain: ImageVector
    get() {
        if (_cloudRain != null) {
            return _cloudRain!!
        }
        _cloudRain = Builder(name = "CloudRain", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.158f, 12.025f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.316f, 0.633f)
                lineToRelative(-0.5f, 1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.948f, -0.316f)
                lineToRelative(0.5f, -1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.632f, -0.317f)
                close()
                moveTo(7.158f, 12.025f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.316f, 0.633f)
                lineToRelative(-1.0f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.948f, -0.316f)
                lineToRelative(1.0f, -3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.632f, -0.317f)
                close()
                moveTo(10.158f, 12.025f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.316f, 0.633f)
                lineToRelative(-0.5f, 1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.948f, -0.316f)
                lineToRelative(0.5f, -1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.632f, -0.317f)
                close()
                moveTo(13.158f, 12.025f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.316f, 0.633f)
                lineToRelative(-1.0f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.948f, -0.316f)
                lineToRelative(1.0f, -3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.632f, -0.317f)
                close()
                moveTo(13.405f, 5.027f)
                arcToRelative(5.001f, 5.001f, 0.0f, false, false, -9.499f, -1.004f)
                arcTo(3.5f, 3.5f, 0.0f, true, false, 3.5f, 11.0f)
                lineTo(13.0f, 11.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.405f, -5.973f)
                close()
            }
        }
        .build()
        return _cloudRain!!
    }

private var _cloudRain: ImageVector? = null
