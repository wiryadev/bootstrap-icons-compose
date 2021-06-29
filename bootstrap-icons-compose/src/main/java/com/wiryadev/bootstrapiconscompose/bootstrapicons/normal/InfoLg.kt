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
import com.wiryadev.bootstrapiconscompose.bootstrapicons.NormalGroup

public val NormalGroup.InfoLg: ImageVector
    get() {
        if (_infoLg != null) {
            return _infoLg!!
        }
        _infoLg = Builder(name = "InfoLg", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.277f, 5.433f)
                lineToRelative(-4.031f, 0.505f)
                lineToRelative(-0.145f, 0.67f)
                lineToRelative(0.794f, 0.145f)
                curveToRelative(0.516f, 0.123f, 0.619f, 0.309f, 0.505f, 0.824f)
                lineTo(6.101f, 13.68f)
                curveToRelative(-0.34f, 1.578f, 0.186f, 2.32f, 1.423f, 2.32f)
                curveToRelative(0.959f, 0.0f, 2.072f, -0.443f, 2.577f, -1.052f)
                lineToRelative(0.155f, -0.732f)
                curveToRelative(-0.35f, 0.31f, -0.866f, 0.434f, -1.206f, 0.434f)
                curveToRelative(-0.485f, 0.0f, -0.66f, -0.34f, -0.536f, -0.939f)
                lineToRelative(1.763f, -8.278f)
                close()
                moveTo(10.399f, 1.76f)
                arcToRelative(1.76f, 1.76f, 0.0f, true, true, -3.52f, 0.0f)
                arcToRelative(1.76f, 1.76f, 0.0f, false, true, 3.52f, 0.0f)
                close()
            }
        }
        .build()
        return _infoLg!!
    }

private var _infoLg: ImageVector? = null
