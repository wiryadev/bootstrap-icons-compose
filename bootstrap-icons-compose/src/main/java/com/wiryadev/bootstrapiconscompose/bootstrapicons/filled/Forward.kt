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

public val FilledGroup.Forward: ImageVector
    get() {
        if (_forward != null) {
            return _forward!!
        }
        _forward = Builder(name = "Forward", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.77f, 12.11f)
                lineToRelative(4.012f, -2.953f)
                arcToRelative(0.647f, 0.647f, 0.0f, false, false, 0.0f, -1.114f)
                lineTo(9.771f, 5.09f)
                arcToRelative(0.644f, 0.644f, 0.0f, false, false, -0.971f, 0.557f)
                verticalLineTo(6.65f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(3.9f)
                horizontalLineToRelative(6.8f)
                verticalLineToRelative(1.003f)
                curveToRelative(0.0f, 0.505f, 0.545f, 0.808f, 0.97f, 0.557f)
                close()
            }
        }
        .build()
        return _forward!!
    }

private var _forward: ImageVector? = null
