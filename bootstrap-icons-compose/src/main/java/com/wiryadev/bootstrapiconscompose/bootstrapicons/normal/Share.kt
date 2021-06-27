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

public val NormalGroup.Share: ImageVector
    get() {
        if (_share != null) {
            return _share!!
        }
        _share = Builder(name = "Share", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                close()
                moveTo(11.0f, 2.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.603f, 1.628f)
                lineToRelative(-6.718f, 3.12f)
                arcToRelative(2.499f, 2.499f, 0.0f, false, true, 0.0f, 1.504f)
                lineToRelative(6.718f, 3.12f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -0.488f, 0.876f)
                lineToRelative(-6.718f, -3.12f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.0f, -3.256f)
                lineToRelative(6.718f, -3.12f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 11.0f, 2.5f)
                close()
                moveTo(2.5f, 6.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                close()
                moveTo(13.5f, 12.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                close()
            }
        }
        .build()
        return _share!!
    }

private var _share: ImageVector? = null
