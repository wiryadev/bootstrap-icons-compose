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

public val FilledGroup.Nut: ImageVector
    get() {
        if (_nut != null) {
            return _nut!!
        }
        _nut = Builder(name = "Nut", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth
                = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.58f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.868f, 0.504f)
                lineToRelative(-3.428f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 0.992f)
                lineToRelative(3.428f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 4.58f, 15.0f)
                horizontalLineToRelative(6.84f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.868f, -0.504f)
                lineToRelative(3.429f, -6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -0.992f)
                lineToRelative(-3.429f, -6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.42f, 1.0f)
                lineTo(4.58f, 1.0f)
                close()
                moveTo(9.598f, 10.696f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -3.0f, -5.196f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 5.196f)
                close()
            }
        }
        .build()
        return _nut!!
    }

private var _nut: ImageVector? = null
