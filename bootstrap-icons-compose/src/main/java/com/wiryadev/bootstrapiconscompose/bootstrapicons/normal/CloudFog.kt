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

public val NormalGroup.CloudFog: ImageVector
    get() {
        if (_cloudFog != null) {
            return _cloudFog!!
        }
        _cloudFog = Builder(name = "CloudFog", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 13.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineToRelative(-9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                close()
                moveTo(3.0f, 15.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                horizontalLineToRelative(-9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                close()
                moveTo(13.405f, 6.027f)
                arcToRelative(5.001f, 5.001f, 0.0f, false, false, -9.499f, -1.004f)
                arcTo(3.5f, 3.5f, 0.0f, true, false, 3.5f, 12.0f)
                lineTo(13.0f, 12.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.405f, -5.973f)
                close()
                moveTo(8.5f, 3.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.976f, 3.555f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.445f)
                lineTo(13.0f, 7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 4.0f)
                lineTo(3.5f, 11.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.605f, -4.926f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.596f, -0.329f)
                arcTo(4.002f, 4.002f, 0.0f, false, true, 8.5f, 3.0f)
                close()
            }
        }
        .build()
        return _cloudFog!!
    }

private var _cloudFog: ImageVector? = null
