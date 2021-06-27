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

public val NormalGroup.Cart3: ImageVector
    get() {
        if (_cart3 != null) {
            return _cart3!!
        }
        _cart3 = Builder(name = "Cart3", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 1.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 0.5f, 1.0f)
                lineTo(2.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.485f, 0.379f)
                lineTo(2.89f, 3.0f)
                lineTo(14.5f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.49f, 0.598f)
                lineToRelative(-1.0f, 5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.465f, 0.401f)
                lineToRelative(-9.397f, 0.472f)
                lineTo(4.415f, 11.0f)
                lineTo(13.0f, 11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(4.0f, 12.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.491f, -0.408f)
                lineTo(2.01f, 3.607f)
                lineTo(1.61f, 2.0f)
                lineTo(0.5f, 2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                close()
                moveTo(3.102f, 4.0f)
                lineToRelative(0.84f, 4.479f)
                lineToRelative(9.144f, -0.459f)
                lineTo(13.89f, 4.0f)
                lineTo(3.102f, 4.0f)
                close()
                moveTo(5.0f, 12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f)
                close()
                moveTo(12.0f, 12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f)
                close()
                moveTo(5.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                close()
                moveTo(12.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                close()
            }
        }
        .build()
        return _cart3!!
    }

private var _cart3: ImageVector? = null
