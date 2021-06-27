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

public val NormalGroup.ImageAlt: ImageVector
    get() {
        if (_imageAlt != null) {
            return _imageAlt!!
        }
        _imageAlt = Builder(name = "ImageAlt", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 2.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 5.0f, 0.0f)
                close()
                moveTo(11.225f, 6.553f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.577f, 0.093f)
                lineToRelative(-3.71f, 4.71f)
                lineToRelative(-2.66f, -2.772f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.63f, 0.062f)
                lineTo(0.002f, 13.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-4.5f)
                lineToRelative(-4.777f, -3.947f)
                close()
            }
        }
        .build()
        return _imageAlt!!
    }

private var _imageAlt: ImageVector? = null
