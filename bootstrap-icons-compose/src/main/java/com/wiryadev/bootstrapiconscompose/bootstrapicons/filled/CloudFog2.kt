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

public val FilledGroup.CloudFog2: ImageVector
    get() {
        if (_cloudFog2 != null) {
            return _cloudFog2!!
        }
        _cloudFog2 = Builder(name = "CloudFog2", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 3.0f)
                arcToRelative(5.001f, 5.001f, 0.0f, false, true, 4.905f, 4.027f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 13.0f, 13.0f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                horizontalLineTo(1.05f)
                arcToRelative(3.51f, 3.51f, 0.0f, false, true, -0.713f, -1.0f)
                horizontalLineTo(9.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                horizontalLineTo(0.035f)
                arcToRelative(3.53f, 3.53f, 0.0f, false, true, 0.0f, -1.0f)
                horizontalLineTo(7.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                horizontalLineTo(0.337f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.57f, -1.977f)
                arcTo(5.001f, 5.001f, 0.0f, false, true, 8.5f, 3.0f)
                close()
            }
        }
        .build()
        return _cloudFog2!!
    }

private var _cloudFog2: ImageVector? = null
