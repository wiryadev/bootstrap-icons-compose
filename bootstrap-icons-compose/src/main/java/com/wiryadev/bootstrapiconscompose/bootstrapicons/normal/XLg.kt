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

public val NormalGroup.XLg: ImageVector
    get() {
        if (_xLg != null) {
            return _xLg!!
        }
        _xLg = Builder(name = "XLg", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth
                = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.293f, 1.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, 0.0f)
                lineTo(8.0f, 6.586f)
                lineToRelative(5.293f, -5.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.414f, 1.414f)
                lineTo(9.414f, 8.0f)
                lineToRelative(5.293f, 5.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, 1.414f)
                lineTo(8.0f, 9.414f)
                lineToRelative(-5.293f, 5.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, -1.414f)
                lineTo(6.586f, 8.0f)
                lineTo(1.293f, 2.707f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.414f)
                close()
            }
        }
        .build()
        return _xLg!!
    }

private var _xLg: ImageVector? = null
