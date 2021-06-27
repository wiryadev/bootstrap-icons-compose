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

public val NormalGroup.Bookshelf: ImageVector
    get() {
        if (_bookshelf != null) {
            return _bookshelf!!
        }
        _bookshelf = Builder(name = "Bookshelf", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.5f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                lineTo(3.0f, 2.0f)
                horizontalLineToRelative(10.0f)
                lineTo(13.0f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                verticalLineToRelative(15.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                lineTo(13.0f, 15.0f)
                lineTo(3.0f, 15.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                lineTo(2.0f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                close()
                moveTo(3.0f, 14.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-3.0f)
                lineTo(3.0f, 11.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(3.0f, 10.0f)
                horizontalLineToRelative(10.0f)
                lineTo(13.0f, 7.0f)
                lineTo(3.0f, 7.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(3.0f, 6.0f)
                horizontalLineToRelative(10.0f)
                lineTo(13.0f, 3.0f)
                lineTo(3.0f, 3.0f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _bookshelf!!
    }

private var _bookshelf: ImageVector? = null
