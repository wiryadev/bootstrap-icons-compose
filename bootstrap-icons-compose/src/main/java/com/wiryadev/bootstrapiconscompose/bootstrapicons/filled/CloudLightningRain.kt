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

public val FilledGroup.CloudLightningRain: ImageVector
    get() {
        if (_cloudLightningRain != null) {
            return _cloudLightningRain!!
        }
        _cloudLightningRain = Builder(name = "CloudLightningRain", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.658f, 11.026f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.316f, 0.632f)
                lineToRelative(-0.5f, 1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.948f, -0.316f)
                lineToRelative(0.5f, -1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.632f, -0.316f)
                close()
                moveTo(12.158f, 11.026f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.316f, 0.632f)
                lineToRelative(-0.5f, 1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.948f, -0.316f)
                lineToRelative(0.5f, -1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.632f, -0.316f)
                close()
                moveTo(4.658f, 12.526f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.316f, 0.632f)
                lineToRelative(-0.5f, 1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.948f, -0.316f)
                lineToRelative(0.5f, -1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.632f, -0.316f)
                close()
                moveTo(14.158f, 12.526f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.316f, 0.632f)
                lineToRelative(-0.5f, 1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.948f, -0.316f)
                lineToRelative(0.5f, -1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.632f, -0.316f)
                close()
                moveTo(7.053f, 11.276f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 7.5f, 11.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.474f, 0.658f)
                lineToRelative(-0.28f, 0.842f)
                lineTo(9.5f, 12.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.39f, 0.812f)
                lineToRelative(-2.0f, 2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.875f, -0.433f)
                lineTo(7.36f, 14.0f)
                lineTo(6.5f, 14.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.447f, -0.724f)
                lineToRelative(1.0f, -2.0f)
                close()
                moveTo(13.405f, 4.027f)
                arcToRelative(5.001f, 5.001f, 0.0f, false, false, -9.499f, -1.004f)
                arcTo(3.5f, 3.5f, 0.0f, true, false, 3.5f, 10.0f)
                lineTo(13.0f, 10.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.405f, -5.973f)
                close()
            }
        }
        .build()
        return _cloudLightningRain!!
    }

private var _cloudLightningRain: ImageVector? = null
