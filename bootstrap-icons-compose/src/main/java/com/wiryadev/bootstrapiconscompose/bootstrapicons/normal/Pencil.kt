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

public val NormalGroup.Pencil: ImageVector
    get() {
        if (_pencil != null) {
            return _pencil!!
        }
        _pencil = Builder(name = "Pencil", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.146f, 0.146f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.708f, 0.0f)
                lineToRelative(3.0f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 0.708f)
                lineToRelative(-10.0f, 10.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.168f, 0.11f)
                lineToRelative(-5.0f, 2.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.65f, -0.65f)
                lineToRelative(2.0f, -5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.11f, -0.168f)
                lineToRelative(10.0f, -10.0f)
                close()
                moveTo(11.207f, 2.5f)
                lineTo(13.5f, 4.793f)
                lineTo(14.793f, 3.5f)
                lineTo(12.5f, 1.207f)
                lineTo(11.207f, 2.5f)
                close()
                moveTo(12.793f, 5.5f)
                lineTo(10.5f, 3.207f)
                lineTo(4.0f, 9.707f)
                lineTo(4.0f, 10.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(0.293f)
                lineToRelative(6.5f, -6.5f)
                close()
                moveTo(3.032f, 10.675f)
                lineTo(2.926f, 10.781f)
                lineTo(1.398f, 14.602f)
                lineTo(5.219f, 13.074f)
                lineTo(5.325f, 12.968f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 5.0f, 12.5f)
                lineTo(5.0f, 12.0f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                lineTo(4.0f, 11.0f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.468f, -0.325f)
                close()
            }
        }
        .build()
        return _pencil!!
    }

private var _pencil: ImageVector? = null
